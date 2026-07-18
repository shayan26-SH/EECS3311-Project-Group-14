package Chief_event_coordinator.State;

import Chief_event_coordinator.Observer.BookingStatus;

/**
 * NoShowState (BookingStatus.NO_SHOW)
 *
 * Terminal state (Req4): the user did not check in within 30 minutes of the
 * start time, so the deposit is forfeited. No further action is legal - every
 * action inherited from AbstractBookingState rejects.
 */
public class NoShowState extends AbstractBookingState {

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.NO_SHOW;
    }
}
