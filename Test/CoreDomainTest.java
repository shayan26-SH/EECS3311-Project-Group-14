package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AccountType.AccountType;
import Chief_event_coordinator.ChiefEventCoordinator;
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
import Chief_event_coordinator.Observer.BookingStatus;
import User.RegisteredUser;
import User.SystemUser;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

class CoreDomainTest {

    @Test
    void accountTypeAndSystemUserExposeAndValidateTheirData() {
        AccountType student = new AccountType("Student", 25.0f, true);

        assertEquals("Student", student.getName());
        assertEquals(25.0f, student.getHourlyRate());
        assertTrue(student.isRequiresVerification());
        assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType(null, 10.0f, false));
        assertThrows(
                IllegalArgumentException.class,
                () -> new AccountType("", 10.0f, false));

        SystemUser user = new SystemUser(
                "student@yorku.ca",
                "Password123!",
                "Student User",
                student);
        assertTrue(user.verify());
        assertEquals("student@yorku.ca", user.getEmail());
        assertEquals("Password123!", user.getPassword());
        assertEquals("Student User", user.getName());
        assertSame(student, user.getType());
        assertTrue(user.toString().contains("student@yorku.ca"));
        assertTrue(captureOutput(user::createAccount).contains("successfully"));

        user.setEmail("");
        assertFalse(user.verify());
        assertTrue(captureOutput(user::createAccount).contains("Unable"));
        user.setEmail("new@yorku.ca");
        user.setPassword("new-password");
        user.setName("New Name");
        user.setType(student);
        assertTrue(user.verify());
    }

    @Test
    void registeredUserBooksAndManagesOnlyOwnedBookings() {
        AccountType student = new AccountType("Student", 20.0f, true);
        RegisteredUser user = new RegisteredUser(
                "Alice",
                "alice@yorku.ca",
                "Password123!",
                student,
                1001);

        assertEquals(1001, user.getOrgID());
        user.setOrgID(2002);
        assertEquals(2002, user.getOrgID());
        assertEquals("Displaying available rooms...", user.viewAvailableRooms());

        Room room = new Room(101);
        Booking first = user.bookRoom(room);
        assertEquals("B1", first.getBookingid());
        assertSame(user, first.getRegisteredUser());
        assertEquals(1, user.viewBookings().size());
        assertTrue(user.modifyBooking(first));

        Booking notOwned = new Booking("OUTSIDE", new Room(102));
        assertFalse(user.modifyBooking(notOwned));
        user.cancelBooking(notOwned);
        assertEquals(BookingStatus.PENDING, notOwned.getStatus());
        assertFalse(user.extendBooking(notOwned, 1.0f));

        first.confirmDeposit();
        first.checkIn();
        assertTrue(user.extendBooking(first, 1.5f));
        assertEquals(BookingStatus.EXTENDED, first.getStatus());

        Booking second = user.bookRoom(new Room(103));
        user.cancelBooking(second);
        assertEquals(BookingStatus.CANCELLED, second.getStatus());
        assertFalse(user.extendBooking(second, 1.0f));

        Booking imported = new Booking("IMPORTED", new Room(104));
        user.addBooking(imported);
        assertTrue(user.viewBookings().contains(imported));

        AccountType staff = new AccountType("Staff", 15.0f, false);
        user.setAccountType(staff);
        assertSame(staff, user.getAccountType());
        assertSame(staff, user.getType());
    }

    @Test
    void roomsAdministratorsAndDisplayObjectsHandleRoomManagement() {
        assertThrows(IllegalArgumentException.class, () -> new Room(0));
        assertThrows(
                IllegalArgumentException.class,
                () -> new Room(1, 0, "LAS", "101"));
        assertThrows(
                IllegalArgumentException.class,
                () -> new Room(1, 10, " ", "101"));
        assertThrows(
                IllegalArgumentException.class,
                () -> new Room(1, 10, "LAS", null));

        Room room = new Room(201, 20, "Bergeron", "First floor");
        assertEquals(201, room.getRoomid());
        assertEquals(20, room.getCapacity());
        assertEquals("Bergeron", room.getBuilding());
        assertEquals("First floor", room.getRoomLocation());
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
        assertNotNull(room.getOccupancySensor());
        assertNotNull(room.getIdBadgeScanner());

        room.setCapacity(30);
        room.setBuilding("Lassonde");
        room.setRoomLocation("Second floor");
        room.setStatus(RoomStatus.OCCUPIED);
        assertEquals(30, room.getCapacity());
        assertEquals("Lassonde", room.getBuilding());
        assertEquals("Second floor", room.getRoomLocation());
        assertEquals(RoomStatus.OCCUPIED, room.getStatus());
        assertThrows(IllegalArgumentException.class, () -> room.setCapacity(-1));
        assertThrows(IllegalArgumentException.class, () -> room.setBuilding(""));
        assertThrows(
                IllegalArgumentException.class,
                () -> room.setRoomLocation(" "));
        assertThrows(IllegalArgumentException.class, () -> room.setStatus(null));

        Administrator admin = new Administrator("Initial", "initial@yorku.ca");
        admin.setName("Room Admin");
        admin.setEmail("admin@yorku.ca");
        assertEquals("Room Admin", admin.getName());
        assertEquals("admin@yorku.ca", admin.getEmail());

        admin.addRoom(room);
        admin.closeRoom(room);
        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
        assertEquals("Maintenance", room.getClosureReason());
        admin.closeRoom(room, "Projector repair");
        assertEquals("Projector repair", room.getClosureReason());
        assertThrows(
                IllegalArgumentException.class,
                () -> admin.closeRoom(room, " "));
        admin.enableRoom(room);
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
        assertNull(room.getClosureReason());
        admin.disableRoom(room);
        assertEquals(RoomStatus.DISABLED, room.getStatus());
        assertNull(room.getClosureReason());
        assertTrue(captureOutput(() -> admin.viewRoomStatus(room)).contains("DISABLED"));
        assertTrue(admin.viewBookings().isEmpty());

        AdminDisplay display = new AdminDisplay(admin);
        String displayText = captureOutput(display::display);
        assertTrue(displayText.contains("Room Admin"));
        assertTrue(displayText.contains("admin@yorku.ca"));

        AdminPermssion permission = new AdminPermssion("Room Managed");
        assertEquals("Room Managed", permission.getLevel());
        permission.setLevel("Full Access");
        assertEquals("Full Access", permission.getLevel());
        assertTrue(captureOutput(permission::showPermission).contains("Full Access"));
    }

    @Test
    void sensorsBadgesAndFacadeCoverTheExternalRoomWorkflow() {
        OccupancySensor sensor = new OccupancySensor(301);
        assertEquals(301, sensor.getRoomid());
        assertEquals(0, sensor.getOccupantCount());
        assertEquals(12, sensor.detectOccupancy(12));
        assertEquals(12, sensor.getOccupantCount());
        assertThrows(
                IllegalArgumentException.class,
                () -> sensor.detectOccupancy(-1));

        BadgeVerificationSystem verification = new BadgeVerificationSystem();
        assertThrows(
                IllegalArgumentException.class,
                () -> verification.authorizeBadge(null));
        assertThrows(
                IllegalArgumentException.class,
                () -> verification.revokeBadge(" "));
        assertThrows(
                IllegalArgumentException.class,
                () -> verification.verifyBadge(""));
        verification.authorizeBadge("BADGE-1");
        assertTrue(verification.verifyBadge("BADGE-1"));
        verification.revokeBadge("BADGE-1");
        assertFalse(verification.verifyBadge("BADGE-1"));

        IdBadgeScanner scanner = new IdBadgeScanner(301);
        assertEquals(301, scanner.getRoomid());
        assertThrows(
                IllegalArgumentException.class,
                () -> scanner.scanBadge(null, verification));
        assertThrows(
                IllegalArgumentException.class,
                () -> scanner.scanBadge("BADGE-1", null));
        assertFalse(scanner.scanBadge("UNKNOWN", verification));
        assertEquals("UNKNOWN", scanner.getLastScannedBadgeId());
        assertFalse(scanner.wasLastBadgeVerified());

        Administrator admin = new Administrator("Admin", "admin@yorku.ca");
        assertThrows(
                IllegalArgumentException.class,
                () -> new BookingFacade(null));
        assertThrows(
                IllegalArgumentException.class,
                () -> new BookingFacade(admin, null));

        BookingFacade facade = new BookingFacade(admin, verification);
        assertThrows(IllegalArgumentException.class, () -> facade.addRoom(null));
        Room room = new Room(301, 15, "LAS", "Room A");
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

        assertEquals(5, facade.receiveOccupancyData(301, 5));
        assertEquals(5, facade.getOccupancyCount(301));
        facade.authorizeBadge("BADGE-2");
        assertTrue(facade.receiveBadgeScanData(301, "BADGE-2"));
        assertEquals("BADGE-2", facade.getLastScannedBadgeId(301));
        assertTrue(facade.wasLastBadgeVerified(301));
        facade.revokeBadge("BADGE-2");
        assertFalse(facade.receiveBadgeScanData(301, "BADGE-2"));
        assertTrue(captureOutput(() -> facade.viewRoomStatus(301)).contains("301"));
    }

    @Test
    void abstractFactoryAndCoordinatorCreateAdministratorAccounts() {
        RoomAdminFactory factory = new RoomAdminFactory();
        Administrator direct = factory.createAdministrator(
                "Direct Admin",
                "direct@yorku.ca");
        assertEquals("Direct Admin", direct.getName());
        assertEquals("Room Managed", factory.createPermission().getLevel());

        ChiefEventCoordinator coordinator = new ChiefEventCoordinator(factory);
        assertSame(factory, coordinator.getFactory());
        coordinator.setFactory(factory);
        String output = captureOutput(() -> {
            Administrator created = coordinator.generateAdminAccount(
                    "Created Admin",
                    "created@yorku.ca");
            assertEquals("Created Admin", created.getName());
            assertEquals("created@yorku.ca", created.getEmail());
        });
        assertTrue(output.contains("Permission: Room Managed"));
        assertTrue(output.contains("created successfully"));
    }

    @Test
    void commandObjectsInvokeTheExpectedReceivers() {
        Administrator admin = new Administrator("Admin", "admin@yorku.ca");
        AccountType student = new AccountType("Student", 20.0f, true);
        RegisteredUser user = new RegisteredUser(
                "Alice",
                "alice@yorku.ca",
                "Password123!",
                student,
                12345);
        Room room = new Room(401);
        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand();
        invoker.setCommand(new AddRoomCommand(admin, room));
        invoker.executeCommand();
        invoker.setCommand(new DisableRoomCommand(admin, room));
        invoker.executeCommand();
        assertEquals(RoomStatus.DISABLED, room.getStatus());
        invoker.setCommand(new EnableRoomCommand(admin, room));
        invoker.executeCommand();
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
        invoker.setCommand(new CloseRoomCommand(admin, room));
        invoker.executeCommand();
        assertEquals("Maintenance", room.getClosureReason());
        invoker.setCommand(new CloseRoomCommand(admin, room, "Testing"));
        invoker.executeCommand();
        assertEquals("Testing", room.getClosureReason());

        invoker.setCommand(new BookRoomCommand(user, room));
        invoker.executeCommand();
        Booking booking = user.viewBookings().get(0);
        invoker.setCommand(new ModifyBookingCommand(user, booking));
        invoker.executeCommand();
        booking.confirmDeposit();
        booking.checkIn();
        invoker.setCommand(new ExtendBookingCommand(user, booking, 2.0f));
        invoker.executeCommand();
        assertEquals(BookingStatus.EXTENDED, booking.getStatus());

        Room secondRoom = new Room(402);
        invoker.setCommand(new BookRoomCommand(user, secondRoom));
        invoker.executeCommand();
        Booking toCancel = user.viewBookings().get(1);
        invoker.setCommand(new CancelBookingCommand(user, toCancel));
        invoker.executeCommand();
        assertEquals(BookingStatus.CANCELLED, toCancel.getStatus());
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
