package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;

/**
 * AbstractBookingState
 *
 * Convenience base for the concrete states. By default every action is
 * illegal and throws {@link IllegalBookingTransitionException}; each concrete
 * state overrides ONLY the actions that are legal from that state. This keeps
 * the concrete states tiny and makes the state machine's legal transitions
 * obvious at a glance - a state that does not override checkIn(), for example,
 * simply cannot be checked in.
 */
public abstract class AbstractBookingState implements BookingState {

    @Override
    public void confirmDeposit(Booking booking) {
        reject("confirm deposit");
    }

    @Override
    public void checkIn(Booking booking) {
        reject("check in");
    }

    @Override
    public void markNoShow(Booking booking) {
        reject("mark no-show");
    }

    @Override
    public void cancel(Booking booking) {
        reject("cancel");
    }

    @Override
    public void extend(Booking booking) {
        reject("extend");
    }

    /** Helper that builds a clear message naming the state and the rejected action. */
    protected void reject(String action) {
        throw new IllegalBookingTransitionException(
                "Cannot " + action + " a booking in state " + getStatus() + ".");
    }
}
