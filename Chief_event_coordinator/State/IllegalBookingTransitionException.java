package Chief_event_coordinator.State;

/**
 * Thrown when an action is attempted that is not legal from the booking's
 * current state (e.g. trying to check in a booking that was already cancelled).
 *
 * Making illegal transitions fail loudly is the whole point of the State
 * pattern here: the set of legal transitions lives in the state classes, not
 * in scattered validation code, so an impossible lifecycle move cannot pass
 * silently.
 */
public class IllegalBookingTransitionException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public IllegalBookingTransitionException(String message) {
        super(message);
    }
}
