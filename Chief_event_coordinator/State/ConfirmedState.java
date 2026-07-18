package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;

/**
 * ConfirmedState (BookingStatus.CONFIRMED)
 *
 * The deposit has been paid up front (Req4). The booking is now waiting for
 * the user to arrive. Legal actions:
 *   - checkIn    -> CheckedInState  (Req4/Req5: user checks in within 30 min)
 *   - markNoShow -> NoShowState     (Req4: 30-min window elapsed, deposit lost)
 *   - cancel     -> CancelledState  (Req8: cancel before start time)
 */
public class ConfirmedState extends AbstractBookingState {

    @Override
    public void checkIn(Booking booking) {
        booking.changeState(new CheckedInState());
    }

    @Override
    public void markNoShow(Booking booking) {
        booking.changeState(new NoShowState());
    }

    @Override
    public void cancel(Booking booking) {
        booking.changeState(new CancelledState());
    }

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.CONFIRMED;
    }
}
