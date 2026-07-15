package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;

/**
 * CheckedInState (BookingStatus.CHECKED_IN)
 *
 * The user has arrived and checked in (Req5). The deposit is applied to the
 * final cost (Req4). While in use, the booking may be extended. Legal actions:
 *   - extend -> ExtendedState  (Req9: extend before expiry if room is free)
 *
 * A booking can no longer be cancelled once the user has checked in - cancel()
 * is intentionally NOT overridden, so the AbstractBookingState default rejects
 * it (Req8 only allows cancellation before the start time).
 */
public class CheckedInState extends AbstractBookingState {

    @Override
    public void extend(Booking booking) {
        booking.changeState(new ExtendedState());
    }

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.CHECKED_IN;
    }
}
