package Chief_event_coordinator.Observer;

import Chief_event_coordinator.Classes.Booking;

/**
 * UserNotificationObserver
 *
 * Concrete Observer. Sends the Registered User a message whenever
 * their booking changes: confirmation (Req3), edit/cancel (Req8),
 * or extension (Req9). Kept independent of email/SMS implementation
 * details - swap sendMessage() for a real mail client without
 * touching Booking or any other observer.
 */
public class UserNotificationObserver implements BookingObserver {

    private final String userEmail;

    public UserNotificationObserver(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus) {
        String message;
        switch (newStatus) {
            case CONFIRMED:
                message = "Your booking " + booking.getBookingId() + " is confirmed.";
                break;
            case CANCELLED:
                message = "Your booking " + booking.getBookingId() + " has been cancelled.";
                break;
            case EXTENDED:
                message = "Your booking " + booking.getBookingId() + " has been extended.";
                break;
            case CHECKED_IN:
                message = "You have been checked in for booking " + booking.getBookingId() + ".";
                break;
            case NO_SHOW:
                message = "Booking " + booking.getBookingId() + " was marked as a no-show.";
                break;
            default:
                message = "Your booking " + booking.getBookingId() + " status changed to " + newStatus + ".";
        }
        sendMessage(message);
    }

    private void sendMessage(String message) {
        System.out.println("[Notify -> " + userEmail + "] " + message);
    }
}
