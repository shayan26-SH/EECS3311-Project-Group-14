package Chief_event_coordinator.Demo;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.AdminDashboardObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.PaymentNotificationObserver;
import Chief_event_coordinator.Observer.RoomAvailabilityObserver;
import Chief_event_coordinator.Observer.StubPayment;
import Chief_event_coordinator.Observer.UserNotificationObserver;
import Chief_event_coordinator.Persistence.BookingCSVManager;
import Chief_event_coordinator.Persistence.RoomCSVManager;

import java.util.List;

/**
 * ObserverPatternDemo
 *
 * Demonstrates the Observer pattern end-to-end using CSV-backed data:
 *   1. Load rooms and bookings from CSV.
 *   2. Register observers (payment, room availability, user
 *      notification, admin dashboard) on a booking.
 *   3. Drive the booking through its lifecycle and show every
 *      observer reacting automatically.
 *
 * Run this class's main() directly to see console output suitable
 * for the demo video (Task 3).
 */
public class ObserverPatternDemo {

    public static void main(String[] args) throws Exception {
        String roomsPath = "data/rooms.csv";
        String bookingsPath = "data/bookings.csv";

        RoomCSVManager roomCSVManager = new RoomCSVManager();
        BookingCSVManager bookingCSVManager = new BookingCSVManager();

        List<Room> rooms = roomCSVManager.load(roomsPath);
        List<Booking> bookings = bookingCSVManager.load(bookingsPath);

        Administrator admin = new Administrator("Tazwar", "tazwar@yorku.ca");
        for (Room r : rooms) {
            admin.addRoom(r);
        }

        // Pick the booking for room 101 (bookingId 1) to drive through its lifecycle
        Booking booking = bookings.get(0);
        Room room101 = rooms.get(0);

        // --- Wire up observers (Subject/Observer registration) ---
        booking.addObserver(new PaymentNotificationObserver(new StubPayment()));
        booking.addObserver(new RoomAvailabilityObserver(room101));
        booking.addObserver(new UserNotificationObserver(booking.getUserEmail()));
        booking.addObserver(new AdminDashboardObserver(admin));
        admin.trackBooking(booking);

        System.out.println("=== Initial state ===");
        admin.viewRoomStatus(room101);

        System.out.println("\n=== User confirms booking (Req3, Req4, Req10) ===");
        booking.setStatus(BookingStatus.CONFIRMED);
        admin.viewRoomStatus(room101);

        System.out.println("\n=== User checks in (Req4, Req5) ===");
        booking.setStatus(BookingStatus.CHECKED_IN);

        System.out.println("\n=== User cancels booking (Req8) ===");
        booking.setStatus(BookingStatus.CANCELLED);
        admin.viewRoomStatus(room101);

        System.out.println("\n=== Administrator closes the room for maintenance (Req6) ===");
        admin.closeRoom(room101);
        admin.viewRoomStatus(room101);

        System.out.println("\n=== Administrator re-enables the room (Req6) ===");
        admin.enableRoom(room101);
        admin.viewRoomStatus(room101);

        System.out.println("\n=== Persist changes back to CSV ===");
        roomCSVManager.save(roomsPath, rooms);
        bookingCSVManager.save(bookingsPath, bookings);
        System.out.println("Saved.");
    }
}
