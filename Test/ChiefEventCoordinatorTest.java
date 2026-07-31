package Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AccountType.AccountType;
import Chief_event_coordinator.ChiefEventCoordinator;
import Chief_event_coordinator.Abstract_Factory.AdminFactory;
import Chief_event_coordinator.Abstract_Factory.RoomAdminFactory;
import Chief_event_coordinator.Classes.AdminDisplay;
import Chief_event_coordinator.Classes.AdminPermssion;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.BadgeVerificationSystem;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.BookingFacade;
import Chief_event_coordinator.Classes.IdBadgeScanner;
import Chief_event_coordinator.Classes.OccupancySensor;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Command.AddRoomCommand;
import Chief_event_coordinator.Command.BookRoomCommand;
import Chief_event_coordinator.Command.CancelBookingCommand;
import Chief_event_coordinator.Command.CloseRoomCommand;
import Chief_event_coordinator.Command.CommandInvoker;
import Chief_event_coordinator.Command.DisableRoomCommand;
import Chief_event_coordinator.Command.EnableRoomCommand;
import Chief_event_coordinator.Command.ExtendBookingCommand;
import Chief_event_coordinator.Command.ModifyBookingCommand;
import Chief_event_coordinator.Observer.AdminDashboardObserver;
import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.Payment;
import Chief_event_coordinator.Observer.PaymentNotificationObserver;
import Chief_event_coordinator.Observer.RoomAvailabilityObserver;
import Chief_event_coordinator.Observer.StubPayment;
import Chief_event_coordinator.Observer.UserNotificationObserver;
import Chief_event_coordinator.Persistence.BookingCSVManager;
import Chief_event_coordinator.Persistence.RoomCSVManager;
import Chief_event_coordinator.State.BookingState;
import Chief_event_coordinator.State.BookingStateFactory;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.NoShowState;
import Chief_event_coordinator.State.PendingState;
import User.RegisteredUser;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class ChiefEventCoordinatorTest {

  @TempDir
  Path temporaryDirectory;

  @Test
  void coordinatorAndAbstractFactoryCreateTheCorrectAdministratorFamily() {
    RoomAdminFactory factory = new RoomAdminFactory();
    assertInstanceOf(AdminFactory.class, factory);

    Administrator direct = factory.createAdministrator(
      "Direct Admin",
      "direct@yorku.ca"
    );
    AdminPermssion directPermission = factory.createPermission();

    assertEquals("Direct Admin", direct.getName());
    assertEquals("direct@yorku.ca", direct.getEmail());
    assertEquals("Room Managed", directPermission.getLevel());

    ChiefEventCoordinator coordinator = new ChiefEventCoordinator(factory);
    assertSame(factory, coordinator.getFactory());

    RoomAdminFactory replacementFactory = new RoomAdminFactory();
    coordinator.setFactory(replacementFactory);
    assertSame(replacementFactory, coordinator.getFactory());

    String output = captureOutput(() -> {
      Administrator generated = coordinator.generateAdminAccount(
        "Generated Admin",
        "generated@yorku.ca"
      );
      assertEquals("Generated Admin", generated.getName());
      assertEquals("generated@yorku.ca", generated.getEmail());
    });

    assertTrue(output.contains("Permission: Room Managed"));
    assertTrue(output.contains("Admin account created successfully"));
  }

  @Test
  void administratorDisplayPermissionAndRoomOperationsAreCovered() {
    Administrator administrator = new Administrator(
      "Original Admin",
      "original@yorku.ca"
    );
    administrator.setName("Updated Admin");
    administrator.setEmail("updated@yorku.ca");

    assertEquals("Updated Admin", administrator.getName());
    assertEquals("updated@yorku.ca", administrator.getEmail());

    Room room = new Room(101, 20, "Bergeron", "First floor");
    String addOutput = captureOutput(() -> administrator.addRoom(room));
    assertTrue(addOutput.contains("Room 101 added"));

    administrator.closeRoom(room);
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    assertEquals("Maintenance", room.getClosureReason());

    administrator.closeRoom(room, "Projector repair");
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    assertEquals("Projector repair", room.getClosureReason());

    assertThrows(
      IllegalArgumentException.class,
      () -> administrator.closeRoom(room, null)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> administrator.closeRoom(room, " ")
    );

    administrator.enableRoom(room);
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    assertNull(room.getClosureReason());

    administrator.disableRoom(room);
    assertEquals(RoomStatus.DISABLED, room.getStatus());
    assertNull(room.getClosureReason());

    assertTrue(
      captureOutput(() -> administrator.viewRoomStatus(room))
        .contains("DISABLED")
    );
    assertTrue(administrator.viewBookings().isEmpty());

    AdminDisplay display = new AdminDisplay(administrator);
    String displayOutput = captureOutput(display::display);
    assertTrue(displayOutput.contains("Updated Admin"));
    assertTrue(displayOutput.contains("updated@yorku.ca"));

    AdminPermssion permission = new AdminPermssion("Limited");
    assertEquals("Limited", permission.getLevel());
    permission.setLevel("Full Access");
    assertEquals("Full Access", permission.getLevel());
    assertTrue(
      captureOutput(permission::showPermission).contains("Full Access")
    );
  }

  @Test
  void roomValidationGettersSettersAndEmbeddedDevicesAreCovered() {
    assertThrows(IllegalArgumentException.class, () -> new Room(0));
    assertThrows(IllegalArgumentException.class, () -> new Room(-1));
    assertThrows(
      IllegalArgumentException.class,
      () -> new Room(1, 0, "LAS", "101")
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Room(1, 10, null, "101")
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Room(1, 10, " ", "101")
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Room(1, 10, "LAS", "")
    );

    Room room = new Room(201, 10, "LAS", "Room A");
    assertEquals(201, room.getRoomid());
    assertEquals(10, room.getCapacity());
    assertEquals("LAS", room.getBuilding());
    assertEquals("Room A", room.getRoomLocation());
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    assertNull(room.getClosureReason());
    assertNotNull(room.getOccupancySensor());
    assertNotNull(room.getIdBadgeScanner());

    room.setCapacity(25);
    room.setBuilding("Bergeron");
    room.setRoomLocation("Second floor");
    room.setStatus(RoomStatus.OCCUPIED);

    assertEquals(25, room.getCapacity());
    assertEquals("Bergeron", room.getBuilding());
    assertEquals("Second floor", room.getRoomLocation());
    assertEquals(RoomStatus.OCCUPIED, room.getStatus());

    assertThrows(IllegalArgumentException.class, () -> room.setCapacity(0));
    assertThrows(IllegalArgumentException.class, () -> room.setBuilding(""));
    assertThrows(
      IllegalArgumentException.class,
      () -> room.setRoomLocation(null)
    );
    assertThrows(IllegalArgumentException.class, () -> room.setStatus(null));
  }

  @Test
  void sensorsBadgeVerificationAndFacadeCoverTheExternalWorkflow() {
    OccupancySensor sensor = new OccupancySensor(301);
    assertEquals(301, sensor.getRoomid());
    assertEquals(0, sensor.getOccupantCount());
    assertEquals(8, sensor.detectOccupancy(8));
    assertEquals(8, sensor.getOccupantCount());
    assertThrows(
      IllegalArgumentException.class,
      () -> sensor.detectOccupancy(-1)
    );

    BadgeVerificationSystem verification = new BadgeVerificationSystem();
    assertThrows(
      IllegalArgumentException.class,
      () -> verification.authorizeBadge(null)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> verification.revokeBadge(" ")
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> verification.verifyBadge("")
    );

    verification.authorizeBadge("BADGE-301");
    assertTrue(verification.verifyBadge("BADGE-301"));
    verification.revokeBadge("BADGE-301");
    assertFalse(verification.verifyBadge("BADGE-301"));

    IdBadgeScanner scanner = new IdBadgeScanner(301);
    assertEquals(301, scanner.getRoomid());
    assertNull(scanner.getLastScannedBadgeId());
    assertFalse(scanner.wasLastBadgeVerified());
    assertThrows(
      IllegalArgumentException.class,
      () -> scanner.scanBadge(null, verification)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> scanner.scanBadge("BADGE", null)
    );
    assertFalse(scanner.scanBadge("UNKNOWN", verification));
    assertEquals("UNKNOWN", scanner.getLastScannedBadgeId());

    Administrator administrator = new Administrator(
      "Facade Admin",
      "facade@yorku.ca"
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new BookingFacade(null)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new BookingFacade(administrator, null)
    );

    BookingFacade facade = new BookingFacade(administrator, verification);
    assertThrows(IllegalArgumentException.class, () -> facade.addRoom(null));

    Room room = new Room(301, 20, "LAS", "Room 301");
    facade.addRoom(room);
    assertSame(room, facade.viewRoom(301));
    assertThrows(IllegalArgumentException.class, () -> facade.addRoom(room));
    assertThrows(IllegalArgumentException.class, () -> facade.viewRoom(999));

    facade.disableRoom(301);
    assertEquals(RoomStatus.DISABLED, room.getStatus());
    facade.enableRoom(301);
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    facade.closeRoom(301);
    assertEquals("Maintenance", room.getClosureReason());
    facade.closeRoomForMaintenance(301, "Cleaning");
    assertEquals("Cleaning", room.getClosureReason());

    assertEquals(6, facade.receiveOccupancyData(301, 6));
    assertEquals(6, facade.getOccupancyCount(301));

    facade.authorizeBadge("VALID-301");
    assertTrue(facade.receiveBadgeScanData(301, "VALID-301"));
    assertEquals("VALID-301", facade.getLastScannedBadgeId(301));
    assertTrue(facade.wasLastBadgeVerified(301));
    facade.revokeBadge("VALID-301");
    assertFalse(facade.receiveBadgeScanData(301, "VALID-301"));

    assertTrue(
      captureOutput(() -> facade.viewRoomStatus(301)).contains("301")
    );
  }

  @Test
  void bookingConstructorsSettersEditingAndCancellationAreCovered() {
    Room firstRoom = new Room(401);
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking(null, firstRoom)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking(" ", firstRoom)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking("B1", null)
    );

    RegisteredUser user = registeredUser();
    Booking booking = new Booking("B1", user, firstRoom);
    assertEquals("B1", booking.getBookingid());
    assertSame(user, booking.getRegisteredUser());
    assertSame(firstRoom, booking.getRoomName());
    assertEquals(BookingStatus.PENDING, booking.getStatus());

    Room replacement = new Room(402);
    assertTrue(booking.edit(replacement));
    assertSame(replacement, booking.getRoomName());
    assertFalse(booking.edit(null));

    booking.setBookingid("B1-UPDATED");
    booking.setRegisteredUser(null);
    booking.setRoomName(firstRoom);
    assertEquals("B1-UPDATED", booking.getBookingid());
    assertNull(booking.getRegisteredUser());
    assertSame(firstRoom, booking.getRoomName());

    assertTrue(captureOutput(booking::edit).contains("Editing booking"));
    assertThrows(
      IllegalArgumentException.class,
      () -> booking.changeState(null)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> booking.extend(0)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> booking.extend(-1)
    );

    assertTrue(booking.cancel());
    assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    assertFalse(booking.cancel());
    assertFalse(booking.edit(replacement));
    assertFalse(booking.extend(1));
    assertTrue(captureOutput(booking::edit).contains("cannot be edited"));
  }

  @Test
  void bookingStateFactoryAndAllLegalStateTransitionsAreCovered() {
    assertInstanceOf(
      PendingState.class,
      BookingStateFactory.fromStatus(BookingStatus.ACTIVE)
    );
    assertInstanceOf(
      PendingState.class,
      BookingStateFactory.fromStatus(BookingStatus.PENDING)
    );
    assertInstanceOf(
      ConfirmedState.class,
      BookingStateFactory.fromStatus(BookingStatus.CONFIRMED)
    );
    assertInstanceOf(
      CheckedInState.class,
      BookingStateFactory.fromStatus(BookingStatus.CHECKED_IN)
    );
    assertInstanceOf(
      ExtendedState.class,
      BookingStateFactory.fromStatus(BookingStatus.EXTENDED)
    );
    assertInstanceOf(
      CancelledState.class,
      BookingStateFactory.fromStatus(BookingStatus.CANCELLED)
    );
    assertInstanceOf(
      NoShowState.class,
      BookingStateFactory.fromStatus(BookingStatus.NO_SHOW)
    );
    assertThrows(
      NullPointerException.class,
      () -> BookingStateFactory.fromStatus(null)
    );

    Booking happy = new Booking("STATE-1", new Room(501));
    happy.confirmDeposit();
    assertEquals(BookingStatus.CONFIRMED, happy.getStatus());
    happy.checkIn();
    assertEquals(BookingStatus.CHECKED_IN, happy.getStatus());
    happy.extend();
    assertEquals(BookingStatus.EXTENDED, happy.getStatus());
    happy.extend();
    assertEquals(BookingStatus.EXTENDED, happy.getStatus());

    Booking pendingCancellation = new Booking("STATE-2", new Room(502));
    assertTrue(pendingCancellation.cancel());
    assertEquals(BookingStatus.CANCELLED, pendingCancellation.getStatus());

    Booking confirmedCancellation = new Booking("STATE-3", new Room(503));
    confirmedCancellation.confirmDeposit();
    assertTrue(confirmedCancellation.cancel());
    assertEquals(BookingStatus.CANCELLED, confirmedCancellation.getStatus());

    Booking noShow = new Booking("STATE-4", new Room(504));
    noShow.confirmDeposit();
    noShow.markNoShow();
    assertEquals(BookingStatus.NO_SHOW, noShow.getStatus());
  }

  @Test
  void everyIllegalActionInEveryConcreteStateIsRejected() {
    Booking booking = new Booking("ILLEGAL", new Room(505));

    verifyRejectedActions(
      booking,
      new PendingState(),
      false,
      true,
      true,
      false,
      true
    );
    verifyRejectedActions(
      booking,
      new ConfirmedState(),
      true,
      false,
      false,
      false,
      true
    );
    verifyRejectedActions(
      booking,
      new CheckedInState(),
      true,
      true,
      true,
      true,
      false
    );
    verifyRejectedActions(
      booking,
      new ExtendedState(),
      true,
      true,
      true,
      true,
      false
    );
    verifyRejectedActions(
      booking,
      new CancelledState(),
      true,
      true,
      true,
      true,
      true
    );
    verifyRejectedActions(
      booking,
      new NoShowState(),
      true,
      true,
      true,
      true,
      true
    );
  }

  @Test
  void observerRegistrationRemovalAndConcreteObserverBranchesAreCovered() {
    Room room = new Room(601);
    Booking booking = new Booking("OBS-1", room);
    List<String> events = new ArrayList<String>();
    BookingObserver recorder = (changed, oldStatus, newStatus) ->
      events.add(oldStatus + "->" + newStatus);

    booking.addObserver(recorder);
    booking.confirmDeposit();
    assertEquals(List.of("PENDING->CONFIRMED"), events);
    booking.removeObserver(recorder);
    booking.checkIn();
    assertEquals(1, events.size());

    RecordingPayment successful = new RecordingPayment(true, true);
    PaymentNotificationObserver payment =
      new PaymentNotificationObserver(successful);
    String paymentOutput = captureOutput(() -> {
      payment.onBookingStatusChanged(
        booking,
        BookingStatus.PENDING,
        BookingStatus.CONFIRMED
      );
      payment.onBookingStatusChanged(
        booking,
        BookingStatus.CONFIRMED,
        BookingStatus.CANCELLED
      );
      payment.onBookingStatusChanged(
        booking,
        BookingStatus.CONFIRMED,
        BookingStatus.NO_SHOW
      );
      payment.onBookingStatusChanged(
        booking,
        BookingStatus.PENDING,
        BookingStatus.CHECKED_IN
      );
    });
    assertEquals(1, successful.chargeCalls);
    assertEquals(1, successful.refundCalls);
    assertTrue(paymentOutput.contains("fee forfeited"));

    RecordingPayment failing = new RecordingPayment(false, false);
    PaymentNotificationObserver failedPayment =
      new PaymentNotificationObserver(failing);
    String failureOutput = captureOutput(() -> {
      failedPayment.onBookingStatusChanged(
        booking,
        BookingStatus.PENDING,
        BookingStatus.CONFIRMED
      );
      failedPayment.onBookingStatusChanged(
        booking,
        BookingStatus.CONFIRMED,
        BookingStatus.CANCELLED
      );
    });
    assertTrue(failureOutput.contains("FAILED"));
    assertTrue(failureOutput.contains("not issued"));

    RoomAvailabilityObserver availability =
      new RoomAvailabilityObserver(room);
    room.setStatus(RoomStatus.AVAILABLE);
    availability.onBookingStatusChanged(
      booking,
      BookingStatus.PENDING,
      BookingStatus.CONFIRMED
    );
    assertEquals(RoomStatus.OCCUPIED, room.getStatus());
    availability.onBookingStatusChanged(
      booking,
      BookingStatus.CONFIRMED,
      BookingStatus.CHECKED_IN
    );
    assertEquals(RoomStatus.OCCUPIED, room.getStatus());
    availability.onBookingStatusChanged(
      booking,
      BookingStatus.CHECKED_IN,
      BookingStatus.CANCELLED
    );
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());

    room.setStatus(RoomStatus.MAINTENANCE);
    availability.onBookingStatusChanged(
      booking,
      BookingStatus.CONFIRMED,
      BookingStatus.NO_SHOW
    );
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    availability.onBookingStatusChanged(
      booking,
      BookingStatus.NO_SHOW,
      BookingStatus.EXTENDED
    );

    Room otherRoom = new Room(602);
    new RoomAvailabilityObserver(otherRoom)
      .onBookingStatusChanged(
        booking,
        BookingStatus.PENDING,
        BookingStatus.CONFIRMED
      );
    assertEquals(RoomStatus.AVAILABLE, otherRoom.getStatus());

    UserNotificationObserver notification =
      new UserNotificationObserver("user@yorku.ca");
    String notifications = captureOutput(() -> {
      for (BookingStatus status : BookingStatus.values()) {
        notification.onBookingStatusChanged(
          booking,
          BookingStatus.PENDING,
          status
        );
      }
    });
    assertTrue(notifications.contains("confirmed"));
    assertTrue(notifications.contains("cancelled"));
    assertTrue(notifications.contains("extended"));
    assertTrue(notifications.contains("checked in"));
    assertTrue(notifications.contains("no-show"));
    assertTrue(notifications.contains("status changed to ACTIVE"));

    Administrator administrator = new Administrator(
      "Dashboard Admin",
      "dashboard@yorku.ca"
    );
    AdminDashboardObserver dashboard =
      new AdminDashboardObserver(administrator);
    dashboard.onBookingStatusChanged(
      booking,
      null,
      BookingStatus.PENDING
    );
    dashboard.onBookingStatusChanged(
      booking,
      BookingStatus.PENDING,
      BookingStatus.CONFIRMED
    );
    assertEquals(2, dashboard.getActivityLog().size());
    assertTrue(dashboard.getActivityLog().get(0).contains("created"));

    StubPayment stub = new StubPayment();
    assertTrue(stub.charge(2.0));
    assertTrue(stub.refund(2.0));
  }

  @Test
  void everyCommandAndBothInvokerBranchesAreCovered() {
    Administrator administrator = new Administrator(
      "Command Admin",
      "command@yorku.ca"
    );
    RegisteredUser user = registeredUser();
    CommandInvoker invoker = new CommandInvoker();
    Room room = new Room(701);

    assertDoesNotThrow(invoker::executeCommand);

    invoker.setCommand(new AddRoomCommand(administrator, room));
    invoker.executeCommand();

    invoker.setCommand(new DisableRoomCommand(administrator, room));
    invoker.executeCommand();
    assertEquals(RoomStatus.DISABLED, room.getStatus());

    invoker.setCommand(new EnableRoomCommand(administrator, room));
    invoker.executeCommand();
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());

    invoker.setCommand(new CloseRoomCommand(administrator, room));
    invoker.executeCommand();
    assertEquals("Maintenance", room.getClosureReason());

    invoker.setCommand(
      new CloseRoomCommand(administrator, room, "Custom maintenance")
    );
    invoker.executeCommand();
    assertEquals("Custom maintenance", room.getClosureReason());

    Room bookingRoom = new Room(702);
    invoker.setCommand(new BookRoomCommand(user, bookingRoom));
    invoker.executeCommand();
    Booking booking = user.viewBookings().get(0);

    invoker.setCommand(new ModifyBookingCommand(user, booking));
    invoker.executeCommand();

    booking.confirmDeposit();
    booking.checkIn();
    invoker.setCommand(new ExtendBookingCommand(user, booking, 2.0f));
    invoker.executeCommand();
    assertEquals(BookingStatus.EXTENDED, booking.getStatus());

    Room cancellationRoom = new Room(703);
    invoker.setCommand(new BookRoomCommand(user, cancellationRoom));
    invoker.executeCommand();
    Booking cancellation = user.viewBookings().get(1);
    invoker.setCommand(new CancelBookingCommand(user, cancellation));
    invoker.executeCommand();
    assertEquals(BookingStatus.CANCELLED, cancellation.getStatus());

    invoker.setCommand(null);
    assertDoesNotThrow(invoker::executeCommand);
  }
  @Test
  void chiefEventCoordinatorStateDemoRunsItsLegalAndIllegalExamples() {
    String output = captureOutput(() ->
      Chief_event_coordinator.Demo.StatePatternDemo.main(new String[0])
    );

    assertTrue(output.contains("state EXTENDED"));
    assertTrue(output.contains("state CANCELLED"));
    assertTrue(output.contains("state NO_SHOW"));
    assertTrue(output.contains("Blocked:"));
    assertFalse(output.contains("[BUG]"));
  }

  @Test
  void chiefEventCoordinatorObserverDemoRunsAndRestoresItsCsvFixtures()
    throws Exception {
    Path roomsFile = Path.of(
      "Chief_event_coordinator",
      "data",
      "rooms.csv"
    );
    Path bookingsFile = Path.of(
      "Chief_event_coordinator",
      "data",
      "bookings.csv"
    );

    if (!Files.exists(roomsFile) || !Files.exists(bookingsFile)) {
      return;
    }

    byte[] originalRooms = Files.readAllBytes(roomsFile);
    byte[] originalBookings = Files.readAllBytes(bookingsFile);
    try {
      String output = captureOutput(() -> {
        try {
          Chief_event_coordinator.Demo.ObserverPatternDemo.main(
            new String[0]
          );
        } catch (Exception exception) {
          throw new RuntimeException(exception);
        }
      });

      assertTrue(output.contains("Initial state"));
      assertTrue(output.contains("User confirms booking"));
      assertTrue(output.contains("Administrator closes the room"));
      assertTrue(output.contains("Saved."));
    } finally {
      Files.write(roomsFile, originalRooms);
      Files.write(bookingsFile, originalBookings);
    }
  }

  // ---------------- 30 additional test cases ----------------

  // 1
  @Test
  void factoryCreatesIndependentAdministratorObjects() {
    RoomAdminFactory factory = new RoomAdminFactory();
    Administrator first = factory.createAdministrator(
      "First",
      "first@yorku.ca"
    );
    Administrator second = factory.createAdministrator(
      "Second",
      "second@yorku.ca"
    );

    assertNotSame(first, second);
    assertEquals("First", first.getName());
    assertEquals("Second", second.getName());
  }

  // 2
  @Test
  void factoryCreatesIndependentPermissionObjects() {
    RoomAdminFactory factory = new RoomAdminFactory();
    AdminPermssion first = factory.createPermission();
    AdminPermssion second = factory.createPermission();

    assertNotSame(first, second);
    first.setLevel("Changed");
    assertEquals("Changed", first.getLevel());
    assertEquals("Room Managed", second.getLevel());
  }

  // 3
  @Test
  void coordinatorUsesAReplacementFactory() {
    AdminFactory replacement = new AdminFactory() {
      @Override
      public Administrator createAdministrator(String name, String email) {
        return new Administrator("Replacement " + name, email);
      }

      @Override
      public AdminPermssion createPermission() {
        return new AdminPermssion("Replacement Permission");
      }
    };

    ChiefEventCoordinator coordinator =
      new ChiefEventCoordinator(new RoomAdminFactory());
    coordinator.setFactory(replacement);
    Administrator result = coordinator.generateAdminAccount(
      "Admin",
      "admin@yorku.ca"
    );

    assertSame(replacement, coordinator.getFactory());
    assertEquals("Replacement Admin", result.getName());
  }

  // 4
  @Test
  void administratorManagesMultipleRoomsIndependently() {
    Administrator administrator = new Administrator(
      "Admin",
      "admin@yorku.ca"
    );
    Room first = new Room(1001);
    Room second = new Room(1002);

    administrator.addRoom(first);
    administrator.addRoom(second);
    administrator.disableRoom(first);
    administrator.closeRoom(second);

    assertEquals(RoomStatus.DISABLED, first.getStatus());
    assertEquals(RoomStatus.MAINTENANCE, second.getStatus());
  }

  // 5
  @Test
  void defaultRoomConstructorSuppliesDefaultDetails() {
    Room room = new Room(1003);

    assertEquals(1003, room.getRoomid());
    assertEquals(1, room.getCapacity());
    assertEquals("Not specified", room.getBuilding());
    assertEquals("Not specified", room.getRoomLocation());
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
  }

  // 6
  @Test
  void roomRejectsNegativeCapacityWithoutChangingItsValue() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Room(1004, -1, "LAS", "101")
    );

    Room room = new Room(1004);
    assertThrows(IllegalArgumentException.class, () -> room.setCapacity(-5));
    assertEquals(1, room.getCapacity());
  }

  // 7
  @Test
  void roomRejectsWhitespaceBuilding() {
    Room room = new Room(1005, 10, "LAS", "101");

    assertThrows(IllegalArgumentException.class, () -> room.setBuilding("  "));
    assertEquals("LAS", room.getBuilding());
  }

  // 8
  @Test
  void roomRejectsWhitespaceLocation() {
    Room room = new Room(1006, 10, "LAS", "101");

    assertThrows(
      IllegalArgumentException.class,
      () -> room.setRoomLocation("\t")
    );
    assertEquals("101", room.getRoomLocation());
  }

  // 9
  @Test
  void authorizingTheSameBadgeTwiceKeepsItAuthorized() {
    BadgeVerificationSystem verification = new BadgeVerificationSystem();
    verification.authorizeBadge("DUPLICATE");
    verification.authorizeBadge("DUPLICATE");

    assertTrue(verification.verifyBadge("DUPLICATE"));
  }

  // 10
  @Test
  void revokingAnUnknownBadgeIsSafe() {
    BadgeVerificationSystem verification = new BadgeVerificationSystem();

    assertDoesNotThrow(() -> verification.revokeBadge("UNKNOWN"));
    assertFalse(verification.verifyBadge("UNKNOWN"));
  }

  // 11
  @Test
  void occupancySensorAcceptsZeroOccupants() {
    OccupancySensor sensor = new OccupancySensor(1007);

    assertEquals(0, sensor.detectOccupancy(0));
    assertEquals(0, sensor.getOccupantCount());
  }

  // 12
  @Test
  void badgeScannerAcceptsAnAuthorizedBadge() {
    BadgeVerificationSystem verification = new BadgeVerificationSystem();
    verification.authorizeBadge("AUTHORIZED");
    IdBadgeScanner scanner = new IdBadgeScanner(1008);

    assertTrue(scanner.scanBadge("AUTHORIZED", verification));
    assertEquals("AUTHORIZED", scanner.getLastScannedBadgeId());
    assertTrue(scanner.wasLastBadgeVerified());
  }

  // 13
  @Test
  void badgeScannerStoresTheLatestScanResult() {
    BadgeVerificationSystem verification = new BadgeVerificationSystem();
    verification.authorizeBadge("FIRST");
    IdBadgeScanner scanner = new IdBadgeScanner(1009);

    assertTrue(scanner.scanBadge("FIRST", verification));
    assertFalse(scanner.scanBadge("SECOND", verification));
    assertEquals("SECOND", scanner.getLastScannedBadgeId());
    assertFalse(scanner.wasLastBadgeVerified());
  }

  // 14
  @Test
  void facadeDefaultConstructorSupportsBadgeVerification() {
    BookingFacade facade = new BookingFacade(
      new Administrator("Admin", "admin@yorku.ca")
    );
    facade.addRoom(new Room(1010));
    facade.authorizeBadge("FACADE-BADGE");

    assertTrue(facade.receiveBadgeScanData(1010, "FACADE-BADGE"));
    assertTrue(facade.wasLastBadgeVerified(1010));
  }

  // 15
  @Test
  void allFacadeOperationsRejectAnUnknownRoom() {
    BookingFacade facade = new BookingFacade(
      new Administrator("Admin", "admin@yorku.ca")
    );

    assertThrows(IllegalArgumentException.class, () -> facade.enableRoom(999));
    assertThrows(IllegalArgumentException.class, () -> facade.disableRoom(999));
    assertThrows(IllegalArgumentException.class, () -> facade.closeRoom(999));
    assertThrows(
      IllegalArgumentException.class,
      () -> facade.closeRoomForMaintenance(999, "Reason")
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> facade.receiveOccupancyData(999, 1)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> facade.receiveBadgeScanData(999, "BADGE")
    );
  }

  // 16
  @Test
  void facadePropagatesInvalidOccupancyCount() {
    BookingFacade facade = new BookingFacade(
      new Administrator("Admin", "admin@yorku.ca")
    );
    facade.addRoom(new Room(1011));

    assertThrows(
      IllegalArgumentException.class,
      () -> facade.receiveOccupancyData(1011, -1)
    );
  }

  // 17
  @Test
  void twoArgumentBookingStartsWithoutARegisteredUser() {
    Room room = new Room(1012);
    Booking booking = new Booking("TWO-ARG", room);

    assertNull(booking.getRegisteredUser());
    assertSame(room, booking.getRoomName());
    assertEquals(BookingStatus.PENDING, booking.getStatus());
  }

  // 18
  @Test
  void bookingSettersReplaceMutableReferences() {
    Room firstRoom = new Room(1013);
    Room secondRoom = new Room(1014);
    RegisteredUser firstUser = createUser("first@yorku.ca", 1);
    RegisteredUser secondUser = createUser("second@yorku.ca", 2);
    Booking booking = new Booking("ORIGINAL", firstUser, firstRoom);

    booking.setBookingid("UPDATED");
    booking.setRegisteredUser(secondUser);
    booking.setRoomName(secondRoom);

    assertEquals("UPDATED", booking.getBookingid());
    assertSame(secondUser, booking.getRegisteredUser());
    assertSame(secondRoom, booking.getRoomName());
  }

  // 19
  @Test
  void observersAreNotifiedInRegistrationOrder() {
    Booking booking = new Booking("ORDER", new Room(1015));
    List<String> order = new ArrayList<String>();
    booking.addObserver((b, oldStatus, newStatus) -> order.add("first"));
    booking.addObserver((b, oldStatus, newStatus) -> order.add("second"));

    booking.confirmDeposit();
    assertEquals(List.of("first", "second"), order);
  }

  // 20
  @Test
  void removedObserverDoesNotReceiveFutureTransitions() {
    Booking booking = new Booking("REMOVE", new Room(1016));
    List<BookingStatus> notifications = new ArrayList<BookingStatus>();
    BookingObserver observer = (b, oldStatus, newStatus) ->
      notifications.add(newStatus);

    booking.addObserver(observer);
    booking.confirmDeposit();
    booking.removeObserver(observer);
    booking.checkIn();

    assertEquals(List.of(BookingStatus.CONFIRMED), notifications);
  }

  // 21
  @Test
  void activeStatusRestoresAsPendingState() {
    Booking booking = new Booking("ACTIVE", new Room(1017));

    booking.setStatus(BookingStatus.ACTIVE);
    assertEquals(BookingStatus.PENDING, booking.getStatus());
  }

  // 22
  @Test
  void pendingBookingCannotCheckInBeforeDeposit() {
    Booking booking = new Booking("NO-DEPOSIT", new Room(1018));

    assertThrows(
      IllegalBookingTransitionException.class,
      booking::checkIn
    );
    assertEquals(BookingStatus.PENDING, booking.getStatus());
  }

  // 23
  @Test
  void confirmedBookingCanBeCancelledBeforeCheckIn() {
    Booking booking = new Booking("CONFIRMED-CANCEL", new Room(1019));
    booking.confirmDeposit();

    assertTrue(booking.cancel());
    assertEquals(BookingStatus.CANCELLED, booking.getStatus());
  }

  // 24
  @Test
  void confirmedBookingCanBecomeNoShow() {
    Booking booking = new Booking("NO-SHOW", new Room(1020));
    booking.confirmDeposit();

    booking.markNoShow();
    assertEquals(BookingStatus.NO_SHOW, booking.getStatus());
  }

  // 25
  @Test
  void checkedInBookingCannotBeCancelled() {
    Booking booking = new Booking("CHECKED-IN", new Room(1021));
    booking.confirmDeposit();
    booking.checkIn();

    assertThrows(
      IllegalBookingTransitionException.class,
      booking::cancel
    );
    assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
  }

  // 26
  @Test
  void repeatedExtensionNotifiesObserversAgain() {
    Booking booking = new Booking("REPEAT-EXTEND", new Room(1022));
    List<BookingStatus> notifications = new ArrayList<BookingStatus>();
    booking.addObserver((b, oldStatus, newStatus) ->
      notifications.add(newStatus)
    );

    booking.confirmDeposit();
    booking.checkIn();
    booking.extend();
    booking.extend();

    long extendedNotifications = notifications
      .stream()
      .filter(status -> status == BookingStatus.EXTENDED)
      .count();
    assertEquals(2, extendedNotifications);
  }

  // 27
  @Test
  void invokerReplacesItsPreviousCommand() {
    Administrator administrator = new Administrator(
      "Admin",
      "admin@yorku.ca"
    );
    Room room = new Room(1023);
    CommandInvoker invoker = new CommandInvoker();

    invoker.setCommand(new DisableRoomCommand(administrator, room));
    invoker.setCommand(new EnableRoomCommand(administrator, room));
    invoker.executeCommand();

    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
  }

  // 28
  @Test
  void closeRoomCommandPropagatesAnInvalidReason() {
    Room room = new Room(1024);
    CommandInvoker invoker = new CommandInvoker();
    invoker.setCommand(
      new CloseRoomCommand(
        new Administrator("Admin", "admin@yorku.ca"),
        room,
        " "
      )
    );

    assertThrows(
      IllegalArgumentException.class,
      invoker::executeCommand
    );
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
  }

  // 29
  @Test
  void cancelCommandLeavesAnUnownedBookingPending() {
    RegisteredUser user = createUser("owner@yorku.ca", 5);
    Booking unowned = new Booking("UNOWNED", new Room(1025));
    CommandInvoker invoker = new CommandInvoker();
    invoker.setCommand(new CancelBookingCommand(user, unowned));

    invoker.executeCommand();
    assertEquals(BookingStatus.PENDING, unowned.getStatus());
  }

  // 30
  @Test
  void persistenceManagersSupportEmptyCollections() throws Exception {
    Path roomFile = temporaryDirectory.resolve("empty-rooms.csv");
    RoomCSVManager roomManager = new RoomCSVManager();
    roomManager.save(roomFile.toString(), List.of());
    assertTrue(roomManager.load(roomFile.toString()).isEmpty());

    Path bookingFile = temporaryDirectory.resolve("empty-bookings.csv");
    BookingCSVManager bookingManager = new BookingCSVManager();
    bookingManager.save(bookingFile.toString(), List.of());
    assertTrue(
      bookingManager
        .load(bookingFile.toString(), new HashMap<Integer, Room>())
        .isEmpty()
    );
  }

  private RegisteredUser registeredUser() {
    return new RegisteredUser(
      "Alice",
      "alice@yorku.ca",
      "password",
      new AccountType("Student", 20.0f, true),
      1001
    );
  }

  private RegisteredUser createUser(String email, int id) {
    return new RegisteredUser(
      "User " + id,
      email,
      "password",
      new AccountType("Student", 20.0f, true),
      id
    );
  }

  private static void verifyRejectedActions(
    Booking booking,
    BookingState state,
    boolean rejectConfirm,
    boolean rejectCheckIn,
    boolean rejectNoShow,
    boolean rejectCancel,
    boolean rejectExtend
  ) {
    if (rejectConfirm) {
      assertThrows(
        IllegalBookingTransitionException.class,
        () -> state.confirmDeposit(booking)
      );
    }
    if (rejectCheckIn) {
      assertThrows(
        IllegalBookingTransitionException.class,
        () -> state.checkIn(booking)
      );
    }
    if (rejectNoShow) {
      assertThrows(
        IllegalBookingTransitionException.class,
        () -> state.markNoShow(booking)
      );
    }
    if (rejectCancel) {
      assertThrows(
        IllegalBookingTransitionException.class,
        () -> state.cancel(booking)
      );
    }
    if (rejectExtend) {
      assertThrows(
        IllegalBookingTransitionException.class,
        () -> state.extend(booking)
      );
    }
  }

  private static final class RecordingPayment implements Payment {

    private final boolean chargeResult;
    private final boolean refundResult;
    private int chargeCalls;
    private int refundCalls;

    private RecordingPayment(boolean chargeResult, boolean refundResult) {
      this.chargeResult = chargeResult;
      this.refundResult = refundResult;
    }

    @Override
    public boolean charge(double amount) {
      chargeCalls++;
      assertEquals(1.0, amount);
      return chargeResult;
    }

    @Override
    public boolean refund(double amount) {
      refundCalls++;
      assertEquals(1.0, amount);
      return refundResult;
    }
  }

  private static String captureOutput(Runnable action) {
    PrintStream original = System.out;
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(output));
      action.run();
      return output.toString();
    } finally {
      System.setOut(original);
    }
  }
}