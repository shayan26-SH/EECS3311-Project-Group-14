package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;

/**
 * PendingState (BookingStatus.PENDING)
 *
 * The booking has been requested (Req3) but the up-front deposit has not been
 * paid yet. Legal actions:
 *   - confirmDeposit -> ConfirmedState  (Req4: one hour's fee charged up front)
 *   - cancel         -> CancelledState  (Req8: cancel before start time)
 */
public class PendingState extends AbstractBookingState {

    @Override
    public void confirmDeposit(Booking booking) {
        booking.changeState(new ConfirmedState());
    }

    @Override
    public void cancel(Booking booking) {
        booking.changeState(new CancelledState());
    }

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.PENDING;
    }
}
