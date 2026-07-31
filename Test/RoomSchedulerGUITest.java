package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import AccountType.AccountType;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Demo.RoomSchedulerGUI;
import User.RegisteredUser;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomSchedulerGUITest {

  private RoomSchedulerGUI gui;
  private Path temporaryDirectory;

  @BeforeEach
  void createWindow() throws Exception {
    assumeFalse(
      GraphicsEnvironment.isHeadless(),
      "Swing GUI tests require a graphical display."
    );

    temporaryDirectory = Files.createTempDirectory("room-scheduler-gui-test");
    onEdt(() -> gui = new RoomSchedulerGUI());

    setField(
      gui,
      "roomsPath",
      temporaryDirectory.resolve("rooms.csv").toString()
    );
    setField(
      gui,
      "bookingsPath",
      temporaryDirectory.resolve("bookings.csv").toString()
    );
  }

  @AfterEach
  void disposeWindow() throws Exception {
    if (gui != null) {
      onEdt(gui::dispose);
    }
  }

  @Test
  void constructorBuildsAllFourApplicationScreens() throws Exception {
    assertEquals("YorkU Conference Room Scheduler", gui.getTitle());
    assertEquals(1280, gui.getWidth());
    assertEquals(760, gui.getHeight());
    assertTrue(gui.getContentPane().getComponentCount() >= 3);

    JPanel cards = field(gui, "cards", JPanel.class);
    assertEquals(4, cards.getComponentCount());

    assertNotNull(field(gui, "admin", Administrator.class));
    assertNotNull(field(gui, "chiefEventCoordinator", Object.class));
    assertNotNull(field(gui, "userRoomList", JList.class));
    assertNotNull(field(gui, "userBookingList", JList.class));
    assertNotNull(field(gui, "adminRoomList", JList.class));
  }

  @Test
  void staticGuiHelpersCoverAllFormattingAndRateBranches() throws Exception {
    assertEquals(
      90,
      invokeStatic(
        "minutesBetween",
        new Class<?>[] { LocalTime.class, LocalTime.class },
        LocalTime.of(9, 15),
        LocalTime.of(10, 45)
      )
    );

    assertEquals(
      "student@yorku.ca",
      invokeStatic(
        "normalizeEmail",
        new Class<?>[] { String.class },
        " Student@YorkU.CA "
      )
    );
    assertEquals(
      "",
      invokeStatic(
        "normalizeEmail",
        new Class<?>[] { String.class },
        new Object[] { null }
      )
    );

    assertEquals(
      "room/101 line two end",
      invokeStatic(
        "safe",
        new Class<?>[] { String.class },
        "room|101\nline two\rend"
      )
    );
    assertEquals(
      "",
      invokeStatic("safe", new Class<?>[] { String.class }, new Object[] { null })
    );

    assertEquals(20.0f, hourlyRate("Faculty"));
    assertEquals(15.0f, hourlyRate("Staff"));
    assertEquals(35.0f, hourlyRate("Partner"));
    assertEquals(25.0f, hourlyRate("Student"));

    JPanel form = new JPanel();
    JTextField field = new JTextField();
    invokeStatic(
      "addField",
      new Class<?>[] { JPanel.class, String.class, JComponent.class },
      form,
      "Name",
      field
    );
    assertEquals(2, form.getComponentCount());

    JPanel joined = (JPanel) invokeStatic(
      "joinedPanel",
      new Class<?>[] { JComponent.class, JComponent.class },
      new JTextField(),
      new JTextField()
    );
    assertEquals(2, joined.getComponentCount());
  }

  @Test
  void registrationAndAllSuccessfulLoginTypesUpdateTheGui() throws Exception {
    JTextField name = field(gui, "authName", JTextField.class);
    JTextField email = field(gui, "authEmail", JTextField.class);
    JPasswordField password = field(
      gui,
      "authPassword",
      JPasswordField.class
    );
    JTextField orgId = field(gui, "authOrgId", JTextField.class);
    JComboBox<?> accountType = field(
      gui,
      "authAccountType",
      JComboBox.class
    );
    JLabel status = field(gui, "statusLabel", JLabel.class);

    onEdt(() -> {
      name.setText("New Student");
      email.setText("newstudent@yorku.ca");
      password.setText("new-password");
      orgId.setText("44001");
      accountType.setSelectedItem("Student");
      invokeUnchecked(gui, "onRegister", new Class<?>[] { ActionEvent.class }, null);
    });

    Map<?, ?> users = field(gui, "usersByEmail", Map.class);
    assertTrue(users.containsKey("newstudent@yorku.ca"));
    assertTrue(status.getText().contains("Account created"));

    onEdt(() -> {
      email.setText("admin@yorku.ca");
      password.setText("admin123");
      invokeUnchecked(gui, "onLogin", new Class<?>[] { ActionEvent.class }, null);
    });
    assertTrue(status.getText().contains("administrator"));

    onEdt(() -> {
      email.setText("coordinator@yorku.ca");
      password.setText("coordinator123");
      invokeUnchecked(gui, "onLogin", new Class<?>[] { ActionEvent.class }, null);
    });
    assertTrue(status.getText().contains("chief event coordinator"));

    onEdt(() -> {
      email.setText("newstudent@yorku.ca");
      password.setText("new-password");
      invokeUnchecked(gui, "onLogin", new Class<?>[] { ActionEvent.class }, null);
    });
    assertTrue(status.getText().contains("New Student"));
  }

  @Test
  void administratorCanAddUpdateAndChangeRoomStatus() throws Exception {
    rooms().clear();
    bookings().clear();
    field(gui, "roomProfiles", Map.class).clear();
    invoke(gui, "refreshLists", new Class<?>[0]);

    JTextField roomId = field(gui, "adminRoomId", JTextField.class);
    JTextField capacity = field(gui, "adminCapacity", JTextField.class);
    JTextField features = field(gui, "adminFeatures", JTextField.class);
    JList<?> adminRoomList = field(gui, "adminRoomList", JList.class);

    onEdt(() -> {
      roomId.setText("901");
      capacity.setText("25");
      features.setText("Projector");
      invokeUnchecked(gui, "onAddRoom", new Class<?>[] { ActionEvent.class }, null);
    });

    assertEquals(1, rooms().size());
    Room room = rooms().get(0);
    assertEquals(901, room.getRoomid());
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());

    onEdt(() -> {
      adminRoomList.setSelectedIndex(0);
      capacity.setText("30");
      features.setText("Projector, Whiteboard");
      invokeUnchecked(
        gui,
        "onUpdateRoom",
        new Class<?>[] { ActionEvent.class },
        null
      );
    });

    String formatted = (String) invoke(
      gui,
      "formatRoom",
      new Class<?>[] { Room.class },
      room
    );
    assertTrue(formatted.contains("capacity 30"));
    assertTrue(formatted.contains("Whiteboard"));

    onEdt(() -> {
      adminRoomList.setSelectedIndex(0);
      invokeUnchecked(
        gui,
        "changeRoomStatus",
        new Class<?>[] { RoomStatus.class },
        RoomStatus.DISABLED
      );
    });
    assertEquals(RoomStatus.DISABLED, room.getStatus());

    onEdt(() -> {
      adminRoomList.setSelectedIndex(0);
      invokeUnchecked(
        gui,
        "changeRoomStatus",
        new Class<?>[] { RoomStatus.class },
        RoomStatus.AVAILABLE
      );
    });
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());

    onEdt(() -> {
      adminRoomList.setSelectedIndex(0);
      invokeUnchecked(
        gui,
        "changeRoomStatus",
        new Class<?>[] { RoomStatus.class },
        RoomStatus.MAINTENANCE
      );
    });
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());

    assertTrue(Files.exists(temporaryDirectory.resolve("rooms.csv")));
  }

  @Test
  void validRoomSearchFiltersByCapacityFeatureAndAvailability()
    throws Exception {
    rooms().clear();
    bookings().clear();
    field(gui, "roomProfiles", Map.class).clear();

    Room projectorRoom = new Room(301);
    Room smallRoom = new Room(302);
    Room disabledRoom = new Room(303);
    disabledRoom.setStatus(RoomStatus.DISABLED);
    rooms().add(projectorRoom);
    rooms().add(smallRoom);
    rooms().add(disabledRoom);

    Object projectorProfile = invoke(
      gui,
      "profileFor",
      new Class<?>[] { Room.class },
      projectorRoom
    );
    setField(projectorProfile, "capacity", 30);
    setField(projectorProfile, "features", "Projector, Whiteboard");

    Object smallProfile = invoke(
      gui,
      "profileFor",
      new Class<?>[] { Room.class },
      smallRoom
    );
    setField(smallProfile, "capacity", 5);
    setField(smallProfile, "features", "Whiteboard");

    JTextField date = field(gui, "searchDate", JTextField.class);
    JTextField start = field(gui, "searchStart", JTextField.class);
    JTextField end = field(gui, "searchEnd", JTextField.class);
    JTextField capacity = field(gui, "searchCapacity", JTextField.class);
    JTextField features = field(gui, "searchFeatures", JTextField.class);
    DefaultListModel<?> results = field(
      gui,
      "userRoomModel",
      DefaultListModel.class
    );

    onEdt(() -> {
      date.setText("2026-08-10");
      start.setText("10:00");
      end.setText("12:00");
      capacity.setText("20");
      features.setText("projector");
      invokeUnchecked(
        gui,
        "onSearchRooms",
        new Class<?>[] { ActionEvent.class },
        null
      );
    });

    assertEquals(1, results.size());
    assertTrue(results.get(0).toString().contains("Room 301"));

    onEdt(() -> {
      capacity.setText("50");
      invokeUnchecked(
        gui,
        "onSearchRooms",
        new Class<?>[] { ActionEvent.class },
        null
      );
    });
    assertEquals(0, results.size());
  }

  @Test
  void selectionFormattingAndBookingIdHelpersCoverBothBranches()
    throws Exception {
    rooms().clear();
    bookings().clear();
    field(gui, "roomProfiles", Map.class).clear();
    field(gui, "bookingDetails", Map.class).clear();

    Room room = new Room(401);
    rooms().add(room);
    Booking numbered = new Booking("B7", room);
    Booking legacy = new Booking("LEGACY", room);
    bookings().add(numbered);
    bookings().add(legacy);

    invoke(gui, "refreshLists", new Class<?>[0]);
    assertEquals("B8", invoke(gui, "nextBookingId", new Class<?>[0]));
    assertSame(
      room,
      invoke(gui, "roomById", new Class<?>[] { int.class }, 401)
    );
    assertNull(invoke(gui, "roomById", new Class<?>[] { int.class }, 999));

    String legacyText = (String) invoke(
      gui,
      "formatBooking",
      new Class<?>[] {
        Booking.class,
        Class.forName("Demo.RoomSchedulerGUI$BookingDetails"),
      },
      numbered,
      null
    );
    assertTrue(legacyText.contains("legacy booking"));

    JList<?> adminRooms = field(gui, "adminRoomList", JList.class);
    onEdt(() -> adminRooms.setSelectedIndex(0));
    assertSame(
      room,
      invoke(gui, "selectedRoom", new Class<?>[] { JList.class }, adminRooms)
    );

    JList<?> adminBookings = field(gui, "adminBookingList", JList.class);
    onEdt(() -> adminBookings.setSelectedIndex(0));
    assertSame(
      numbered,
      invoke(
        gui,
        "bookingFromList",
        new Class<?>[] { JList.class },
        adminBookings
      )
    );

    onEdt(adminRooms::clearSelection);
    assertNull(
      invoke(gui, "selectedRoom", new Class<?>[] { JList.class }, adminRooms)
    );
  }

  @Test
  void timeAvailabilityDetectsConflictsAndIgnoredBookings() throws Exception {
    rooms().clear();
    bookings().clear();
    Map<String, Object> details = bookingDetails();
    details.clear();

    Room room = new Room(501);
    rooms().add(room);
    Booking booking = new Booking("B1", room);
    bookings().add(booking);

    LocalDate date = LocalDate.of(2026, 8, 12);
    Object bookingDetail = newBookingDetails(
      "alice@yorku.ca",
      date,
      LocalTime.of(10, 0),
      LocalTime.of(12, 0)
    );
    details.put("B1", bookingDetail);

    assertFalse(
      isTimeAvailable(
        room,
        date,
        LocalTime.of(11, 0),
        LocalTime.of(13, 0),
        null
      )
    );
    assertTrue(
      isTimeAvailable(
        room,
        date,
        LocalTime.of(12, 0),
        LocalTime.of(13, 0),
        null
      )
    );
    assertTrue(
      isTimeAvailable(
        room,
        date,
        LocalTime.of(11, 0),
        LocalTime.of(13, 0),
        "B1"
      )
    );

    booking.cancel();
    assertTrue(
      isTimeAvailable(
        room,
        date,
        LocalTime.of(11, 0),
        LocalTime.of(13, 0),
        null
      )
    );
  }


  @Test
  void sidecarFilesSaveAndLoadRoomsBookingsUsersAndAdministrators()
    throws Exception {
    rooms().clear();
    bookings().clear();
    Map<Integer, Object> profiles = roomProfiles();
    Map<String, Object> details = bookingDetails();
    Map<String, RegisteredUser> users = users();
    List<Administrator> administrators = createdAdministrators();
    Map<String, String> permissions = adminPermissions();
    Set<String> verified = field(gui, "verifiedEmails", Set.class);

    profiles.clear();
    details.clear();
    users.clear();
    administrators.clear();
    permissions.clear();
    verified.clear();

    Room room = new Room(701);
    rooms().add(room);
    Object profile = invoke(
      gui,
      "profileFor",
      new Class<?>[] { Room.class },
      room
    );
    setField(profile, "capacity", 40);
    setField(profile, "features", "Projector");

    RegisteredUser user = new RegisteredUser(
      "CSV User",
      "csvuser@yorku.ca",
      "password",
      new AccountType("Staff", 15.0f, true),
      7701
    );
    users.put("csvuser@yorku.ca", user);
    verified.add("csvuser@yorku.ca");

    Booking booking = new Booking("CSV-B1", user, room);
    bookings().add(booking);
    Object bookingDetail = newBookingDetails(
      "csvuser@yorku.ca",
      LocalDate.of(2026, 9, 1),
      LocalTime.of(14, 0),
      LocalTime.of(16, 0)
    );
    details.put("CSV-B1", bookingDetail);

    Administrator administrator = new Administrator(
      "CSV Admin",
      "csvadmin@yorku.ca"
    );
    administrators.add(administrator);
    permissions.put("csvadmin@yorku.ca", "Room Manager");

    invoke(gui, "saveData", new Class<?>[] { boolean.class }, false);
    assertTrue(Files.exists(temporaryDirectory.resolve("rooms.csv")));
    assertTrue(Files.exists(temporaryDirectory.resolve("bookings.csv")));
    assertTrue(Files.exists(temporaryDirectory.resolve("room-details.csv")));
    assertTrue(Files.exists(temporaryDirectory.resolve("booking-details.csv")));
    assertTrue(Files.exists(temporaryDirectory.resolve("users.csv")));
    assertTrue(Files.exists(temporaryDirectory.resolve("administrators.csv")));

    profiles.clear();
    details.clear();
    users.clear();
    administrators.clear();
    permissions.clear();
    verified.clear();

    invoke(gui, "loadRoomProfiles", new Class<?>[0]);
    invoke(gui, "loadBookingDetails", new Class<?>[0]);
    invoke(gui, "loadUsers", new Class<?>[0]);
    invoke(gui, "loadAdministrators", new Class<?>[0]);

    assertEquals(40, getField(profiles.get(701), "capacity"));
    assertTrue(details.containsKey("CSV-B1"));
    assertTrue(users.containsKey("csvuser@yorku.ca"));
    assertTrue(verified.contains("csvuser@yorku.ca"));
    assertEquals(1, administrators.size());
    assertEquals("Room Manager", permissions.get("csvadmin@yorku.ca"));
  }

  private boolean isTimeAvailable(
    Room room,
    LocalDate date,
    LocalTime start,
    LocalTime end,
    String ignoredBooking
  ) throws Exception {
    return (Boolean) invoke(
      gui,
      "isTimeAvailable",
      new Class<?>[] {
        Room.class,
        LocalDate.class,
        LocalTime.class,
        LocalTime.class,
        String.class,
      },
      room,
      date,
      start,
      end,
      ignoredBooking
    );
  }

  private RegisteredUser findUser(String email) throws Exception {
    return users().get(email);
  }

  private Object newBookingDetails(
    String email,
    LocalDate date,
    LocalTime start,
    LocalTime end
  ) throws Exception {
    Class<?> type = Class.forName("Demo.RoomSchedulerGUI$BookingDetails");
    Constructor<?> constructor = type.getDeclaredConstructor(
      String.class,
      LocalDate.class,
      LocalTime.class,
      LocalTime.class
    );
    constructor.setAccessible(true);
    return constructor.newInstance(email, date, start, end);
  }

  private static float hourlyRate(String type) throws Exception {
    return (Float) invokeStatic(
      "hourlyRateFor",
      new Class<?>[] { String.class },
      type
    );
  }

  private static Object invokeStatic(
    String name,
    Class<?>[] parameterTypes,
    Object... arguments
  ) throws Exception {
    return invoke(null, name, parameterTypes, arguments);
  }

  private static Object invoke(
    Object target,
    String name,
    Class<?>[] parameterTypes,
    Object... arguments
  ) throws Exception {
    Method method = RoomSchedulerGUI.class.getDeclaredMethod(
      name,
      parameterTypes
    );
    method.setAccessible(true);
    return method.invoke(target, arguments);
  }

  private static void invokeUnchecked(
    Object target,
    String name,
    Class<?>[] parameterTypes,
    Object argument
  ) {
    try {
      invoke(target, name, parameterTypes, argument);
    } catch (Exception exception) {
      throw new AssertionError(exception);
    }
  }

  private static Object getField(Object target, String name) throws Exception {
    Field field = target.getClass().getDeclaredField(name);
    field.setAccessible(true);
    return field.get(target);
  }

  private static void setField(Object target, String name, Object value)
    throws Exception {
    Field field = target.getClass().getDeclaredField(name);
    field.setAccessible(true);
    field.set(target, value);
  }

  private static <T> T field(Object target, String name, Class<T> type)
    throws Exception {
    return type.cast(getField(target, name));
  }

  @SuppressWarnings("unchecked")
  private List<Room> rooms() throws Exception {
    return (List<Room>) getField(gui, "rooms");
  }

  @SuppressWarnings("unchecked")
  private List<Booking> bookings() throws Exception {
    return (List<Booking>) getField(gui, "bookings");
  }

  @SuppressWarnings("unchecked")
  private Map<String, Object> bookingDetails() throws Exception {
    return (Map<String, Object>) getField(gui, "bookingDetails");
  }

  @SuppressWarnings("unchecked")
  private Map<Integer, Object> roomProfiles() throws Exception {
    return (Map<Integer, Object>) getField(gui, "roomProfiles");
  }

  @SuppressWarnings("unchecked")
  private Map<String, RegisteredUser> users() throws Exception {
    return (Map<String, RegisteredUser>) getField(gui, "usersByEmail");
  }

  @SuppressWarnings("unchecked")
  private List<Administrator> createdAdministrators() throws Exception {
    return (List<Administrator>) getField(gui, "createdAdmins");
  }

  @SuppressWarnings("unchecked")
  private Map<String, String> adminPermissions() throws Exception {
    return (Map<String, String>) getField(gui, "adminPermissions");
  }

  private interface ThrowingAction {
    void run() throws Exception;
  }

  private static void onEdt(ThrowingAction action) throws Exception {
    if (SwingUtilities.isEventDispatchThread()) {
      action.run();
      return;
    }

    Throwable[] failure = new Throwable[1];
    SwingUtilities.invokeAndWait(() -> {
      try {
        action.run();
      } catch (Throwable throwable) {
        failure[0] = throwable;
      }
    });

    if (failure[0] != null) {
      if (failure[0] instanceof Exception) {
        throw (Exception) failure[0];
      }
      throw new AssertionError(failure[0]);
    }
  }
}