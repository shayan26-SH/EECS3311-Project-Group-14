package AI_TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Persistence.BookingCSVManager;
import Chief_event_coordinator.Persistence.RoomCSVManager;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class PersistenceTest {

  @TempDir
  Path temporaryDirectory;

  @Test
  void roomCsvManagerSavesAndLoadsRooms() throws Exception {
    Room first = new Room(601);
    Room second = new Room(602);
    second.setStatus(RoomStatus.MAINTENANCE);
    Path file = temporaryDirectory.resolve("rooms.csv");
    RoomCSVManager manager = new RoomCSVManager();

    manager.save(file.toString(), Arrays.asList(first, second));
    List<Room> loaded = manager.load(file.toString());

    assertEquals(2, loaded.size());
    assertEquals(601, loaded.get(0).getRoomid());
    assertEquals(RoomStatus.AVAILABLE, loaded.get(0).getStatus());
    assertEquals(RoomStatus.MAINTENANCE, loaded.get(1).getStatus());
  }

  @Test
  void bookingCsvManagerSavesAndLoadsBookings() throws Exception {
    Room firstRoom = new Room(603);
    Room secondRoom = new Room(604);
    Map<Integer, Room> roomsById = new HashMap<Integer, Room>();
    roomsById.put(firstRoom.getRoomid(), firstRoom);
    roomsById.put(secondRoom.getRoomid(), secondRoom);

    Booking firstBooking = new Booking("BOOKING,603", firstRoom);
    firstBooking.setStatus(BookingStatus.CONFIRMED);
    Booking secondBooking = new Booking("BOOKING-604", secondRoom);
    secondBooking.setStatus(BookingStatus.CANCELLED);

    Path file = temporaryDirectory.resolve("bookings.csv");
    BookingCSVManager manager = new BookingCSVManager();
    manager.save(
      file.toString(),
      Arrays.asList(firstBooking, secondBooking)
    );

    List<Booking> loaded = manager.load(file.toString(), roomsById);

    assertEquals(2, loaded.size());
    assertEquals("BOOKING,603", loaded.get(0).getBookingid());
    assertEquals(BookingStatus.CONFIRMED, loaded.get(0).getStatus());
    assertSame(firstRoom, loaded.get(0).getRoomName());
    assertEquals("BOOKING-604", loaded.get(1).getBookingid());
    assertEquals(BookingStatus.CANCELLED, loaded.get(1).getStatus());
    assertSame(secondRoom, loaded.get(1).getRoomName());
  }



  @Test
  void roomCsvManagerOverwritesInsteadOfAppending() throws Exception {
    Path file = temporaryDirectory.resolve("overwritten-rooms.csv");
    RoomCSVManager manager = new RoomCSVManager();
    manager.save(file.toString(), Arrays.asList(new Room(606), new Room(607)));

    Room replacement = new Room(608);
    replacement.setStatus(RoomStatus.DISABLED);
    manager.save(file.toString(), List.of(replacement));

    List<Room> loaded = manager.load(file.toString());
    assertEquals(1, loaded.size());
    assertEquals(608, loaded.get(0).getRoomid());
    assertEquals(RoomStatus.DISABLED, loaded.get(0).getStatus());
  }
}
