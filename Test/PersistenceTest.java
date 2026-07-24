package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

class PersistenceTest {

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

  
}