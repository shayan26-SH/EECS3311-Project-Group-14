package Chief_event_coordinator.Observer;

import Chief_event_coordinator.Classes.Booking;

/**
 * BookingObserver
 *
 * The "Observer" role in the Observer design pattern.
 * Any component that needs to react when a Booking changes
 * (payment, room availability, admin dashboard, user notification)
 * implements this interface and registers itself with a Booking.
 */
public interface BookingObserver {

    /**
     * Called by the subject (Booking) whenever its status changes.
     *
     * @param booking    the booking that changed
     * @param oldStatus  the status before the change (nullable, e.g. on creation)
     * @param newStatus  the status after the change
     */
    void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus);
}
