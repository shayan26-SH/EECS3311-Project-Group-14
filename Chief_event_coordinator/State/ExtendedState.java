package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;

/**
 * ExtendedState (BookingStatus.EXTENDED)
 *
 * The booking was extended past its original end time (Req9). It is still an
 * active, in-use booking, so it may be extended again if the room stays free.
 * Legal actions:
 *   - extend -> ExtendedState  (Req9: repeatable extension)
 */
public class ExtendedState extends AbstractBookingState {

    @Override
    public void extend(Booking booking) {
        // Already extended; extending again keeps it in the EXTENDED state but
        // still fires a transition so observers (billing, room availability)
        // are notified of the additional hour.
        booking.changeState(new ExtendedState());
    }

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.EXTENDED;
    }
}
