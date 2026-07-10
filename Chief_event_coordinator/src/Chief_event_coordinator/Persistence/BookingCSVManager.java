package Chief_event_coordinator.Persistence;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * BookingCSVManager
 *
 * Loads/saves Booking records to a CSV file to simulate the database,
 * following the same CsvReader/CsvWriter approach as the course's
 * csv-example (MaintainUser.java). Columns: bookingId,roomId,userEmail,status
 *
 * Note: load() reconstructs plain Booking objects at their saved
 * status (no observers re-attached automatically - the demo/GUI code
 * is responsible for calling addObserver(...) again after loading,
 * since observers are runtime wiring, not persisted state).
 */
public class BookingCSVManager {

    public List<Booking> load(String path) throws Exception {
        List<Booking> bookings = new ArrayList<>();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            int bookingId = Integer.parseInt(reader.get("bookingId"));
            int roomId = Integer.parseInt(reader.get("roomId"));
            String userEmail = reader.get("userEmail");
            BookingStatus status = BookingStatus.valueOf(reader.get("status"));

            Booking booking = new Booking(bookingId, roomId, userEmail);
            booking.setStatus(status); // will fire notifyObservers with no observers attached yet - harmless
            bookings.add(booking);
        }
        reader.close();
        return bookings;
    }

    public void save(String path, List<Booking> bookings) throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');
        writer.write("bookingId");
        writer.write("roomId");
        writer.write("userEmail");
        writer.write("status");
        writer.endRecord();

        for (Booking b : bookings) {
            writer.write(String.valueOf(b.getBookingId()));
            writer.write(String.valueOf(b.getRoomId()));
            writer.write(b.getUserEmail());
            writer.write(b.getStatus().name());
            writer.endRecord();
        }
        writer.close();
    }
}
