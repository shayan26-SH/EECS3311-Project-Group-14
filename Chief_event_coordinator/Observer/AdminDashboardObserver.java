package Chief_event_coordinator.Observer;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;

import java.util.ArrayList;
import java.util.List;

/**
 * AdminDashboardObserver
 *
 * Concrete Observer. Keeps a running, in-memory activity log of every
 * booking event so the Administrator's dashboard (viewBookings /
 * viewRoomStatus, Req6-Req7) always reflects the latest activity
 * without querying every Booking object directly.
 */
public class AdminDashboardObserver implements BookingObserver {
    private final Administrator administrator;
    private final List<String> activityLog = new ArrayList<>();

    public AdminDashboardObserver(Administrator administrator) {
        this.administrator = administrator;
    }

    @Override
    public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus) {
        String entry = "Booking " + booking.getBookingid() + " (Room " + booking.getRoomName().getRoomid() + "): "
                + (oldStatus == null ? "created" : oldStatus + " -> ") + newStatus;
        activityLog.add(entry);
        System.out.println("[AdminDashboard: " + administrator.getName() + "] " + entry);
    }

    public List<String> getActivityLog() {
        return activityLog;
    }
}