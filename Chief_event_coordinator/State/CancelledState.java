package Chief_event_coordinator.State;

import Chief_event_coordinator.Observer.BookingStatus;

/**
 * CancelledState (BookingStatus.CANCELLED)
 *
 * Terminal state (Req8): the booking was cancelled before its start time.
 * No further action is legal, so this class overrides nothing - every action
 * inherited from AbstractBookingState rejects with an
 * IllegalBookingTransitionException.
 */
public class CancelledState extends AbstractBookingState {

    @Override
    public BookingStatus getStatus() {
        return BookingStatus.CANCELLED;
    }
}
