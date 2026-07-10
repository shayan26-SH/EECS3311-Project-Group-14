package Chief_event_coordinator.Persistence;

import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * RoomCSVManager
 *
 * Loads/saves Room records to a CSV file to simulate the database.
 * Columns: roomid,status
 */
public class RoomCSVManager {

    public List<Room> load(String path) throws Exception {
        List<Room> rooms = new ArrayList<>();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            int roomid = Integer.parseInt(reader.get("roomid"));
            RoomStatus status = RoomStatus.valueOf(reader.get("status"));
            rooms.add(new Room(roomid, status));
        }
        reader.close();
        return rooms;
    }

    public void save(String path, List<Room> rooms) throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');
        writer.write("roomid");
        writer.write("status");
        writer.endRecord();

        for (Room r : rooms) {
            writer.write(String.valueOf(r.getRoomid()));
            writer.write(r.getStatus().name());
            writer.endRecord();
        }
        writer.close();
    }
}
