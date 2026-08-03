package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Manual JUnit 5 test suite for {@link Administrator} (Tazwar's assigned scope:
 * Administrator actor / room-management responsibilities).
 *
 * Covers every public method on Administrator, including constructor validation,
 * accessor/mutator behavior, and each room-management action (add, close, enable,
 * disable, view status, view bookings) across both happy-path and edge-case
 * inputs, per the D3 rubric requirement of >=10 test cases per class.
 */
class AdministratorTest {

  private Administrator admin;
  private Room room;

  @BeforeEach
  void setUp() {
    admin = new Administrator("Alice Chen", "alice.chen@yorku.ca");
    room = new Room(601, 10, "Vari Hall", "101");
  }

  @Test
  void constructorStoresNameAndEmail() {
    assertEquals("Alice Chen", admin.getName());
    assertEquals("alice.chen@yorku.ca", admin.getEmail());
  }

  @Test
  void setNameUpdatesName() {
    admin.setName("Bob Nguyen");
    assertEquals("Bob Nguyen", admin.getName());
  }

  @Test
  void setEmailUpdatesEmail() {
    admin.setEmail("bob.nguyen@yorku.ca");
    assertEquals("bob.nguyen@yorku.ca", admin.getEmail());
  }

  @Test
  void addRoomPrintsConfirmationForGivenRoom() {
    String output = captureOutput(() -> admin.addRoom(room));
    assertTrue(output.contains("Room " + room.getRoomid() + " added"));
  }

  @Test
  void addRoomHandlesMultipleDistinctRooms() {
    Room secondRoom = new Room(602, 6, "Ross Building", "205");
    String output = captureOutput(() -> {
      admin.addRoom(room);
      admin.addRoom(secondRoom);
    });
    assertTrue(output.contains("Room 601 added"));
    assertTrue(output.contains("Room 602 added"));
  }

  @Test
  void closeRoomWithDefaultReasonSetsMaintenanceStatus() {
    admin.closeRoom(room);
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    assertEquals("Maintenance", room.getClosureReason());
  }

  @Test
  void closeRoomWithCustomReasonSetsMaintenanceStatusAndReason() {
    admin.closeRoom(room, "Water damage on 3rd floor");
    assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    assertEquals("Water damage on 3rd floor", room.getClosureReason());
  }

  @Test
  void closeRoomPrintsConfirmationMessage() {
    String output = captureOutput(() -> admin.closeRoom(room, "Pest control"));
    assertTrue(output.contains("Room " + room.getRoomid() + " closed for maintenance"));
  }

  @Test
  void closeRoomRejectsNullReason() {
    IllegalArgumentException ex = assertThrows(
      IllegalArgumentException.class,
      () -> admin.closeRoom(room, null)
    );
    assertTrue(ex.getMessage().contains("closure reason is required"));
    // Room state must be untouched when validation fails.
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
  }

  @Test
  void closeRoomRejectsBlankReason() {
    assertThrows(
      IllegalArgumentException.class,
      () -> admin.closeRoom(room, "   ")
    );
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
  }

  @Test
  void enableRoomSetsAvailableStatusAndClearsClosureReason() {
    admin.closeRoom(room, "Renovation");
    admin.enableRoom(room);
    assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    assertNull(room.getClosureReason());
  }

  @Test
  void enableRoomPrintsConfirmationMessage() {
    String output = captureOutput(() -> admin.enableRoom(room));
    assertTrue(output.contains("Room " + room.getRoomid() + " enabled"));
  }

  @Test
  void disableRoomSetsDisabledStatusAndClearsClosureReason() {
    admin.closeRoom(room, "Flooding");
    admin.disableRoom(room);
    assertEquals(RoomStatus.DISABLED, room.getStatus());
    assertNull(room.getClosureReason());
  }

  @Test
  void disableRoomPrintsConfirmationMessage() {
    String output = captureOutput(() -> admin.disableRoom(room));
    assertTrue(output.contains("Room " + room.getRoomid() + " disabled"));
  }

  @Test
  void viewRoomStatusPrintsRoomIdAndCurrentStatus() {
    admin.closeRoom(room, "Elevator repair");
    String output = captureOutput(() -> admin.viewRoomStatus(room));
    assertTrue(output.contains("Room: " + room.getRoomid()));
    assertTrue(output.contains("Status: " + RoomStatus.MAINTENANCE));
  }

  @Test
  void viewBookingsReturnsEmptyMapAndPrintsHeader() {
    ByteArrayOutputStream captured = new ByteArrayOutputStream();
    HashMap<Integer, Booking> bookings;
    PrintStream original = System.out;
    try {
      System.setOut(new PrintStream(captured));
      bookings = admin.viewBookings();
    } finally {
      System.setOut(original);
    }
    assertNotNull(bookings);
    assertTrue(bookings.isEmpty());
    assertTrue(captured.toString().contains("Viewing all bookings"));
  }

  @Test
  void adminStateIsIndependentAcrossMultipleAdministrators() {
    Administrator second = new Administrator("Carla Diaz", "carla.diaz@yorku.ca");
    admin.setName("Renamed Admin");
    assertFalse(second.getName().equals(admin.getName()));
    assertEquals("Carla Diaz", second.getName());
  }

  /** Redirects System.out for the duration of {@code action} and returns what was printed. */
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