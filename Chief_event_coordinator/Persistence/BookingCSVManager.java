package Chief_event_coordinator.Persistence;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * BookingCSVManager
 *
 * Loads/saves Booking records to a CSV file to simulate the database.
 * Columns: bookingid,roomid,status
 *
 * Booking now holds a Room object (not a raw int), so load() needs a
 * map of already-loaded rooms (roomid -> Room) to attach the correct
 * reference. Load rooms first with RoomCSVManager, build the map, then
 * pass it in here.
 */
public class BookingCSVManager {
    public List<Booking> load(String path, Map<Integer, Room> roomsById) throws Exception {
        List<Booking> bookings = new ArrayList<Booking>();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            String bookingid = reader.get("bookingid");
            int roomid = Integer.parseInt(reader.get("roomid"));
            BookingStatus status = BookingStatus.valueOf(reader.get("status"));

            Room room = roomsById.get(roomid);
    
            if (room == null)
                throw new IllegalStateException("Booking " + bookingid + " references unknown room " + roomid);

            Booking booking = new Booking(bookingid, room);
            booking.setStatus(status); // fires notifyObservers with no observers attached yet - harmless
            bookings.add(booking);
        }

        reader.close();

        return bookings;
    }

    public void save(String path, List<Booking> bookings) throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');
        writer.write("bookingid");
        writer.write("roomid");
        writer.write("status");
        writer.endRecord();

        for (Booking b : bookings) {
            writer.write(b.getBookingid());
            writer.write(String.valueOf(b.getRoomName().getRoomid()));
            writer.write(b.getStatus().name());
            writer.endRecord();
        }

        writer.close();
    }
}