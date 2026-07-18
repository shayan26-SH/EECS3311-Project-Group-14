package Chief_event_coordinator.State;

import Chief_event_coordinator.Observer.BookingStatus;

/**
 * BookingStateFactory
 *
 * Maps a persisted {@link BookingStatus} enum value back to the matching
 * {@link BookingState} object. Needed because the database (CSV) stores the
 * status as a plain enum string; when a Booking is loaded we must rebuild the
 * correct state object so the state machine resumes from where it left off.
 *
 * This is the single place that knows the enum <-> state correspondence, so
 * Observer/Persistence keep speaking in BookingStatus while the domain logic
 * runs on State objects.
 */
public final class BookingStateFactory {

    private BookingStateFactory() {
    }

    public static BookingState fromStatus(BookingStatus status) {
        switch (status) {
            case PENDING:
                return new PendingState();
            case CONFIRMED:
                return new ConfirmedState();
            case CHECKED_IN:
                return new CheckedInState();
            case EXTENDED:
                return new ExtendedState();
            case CANCELLED:
                return new CancelledState();
            case NO_SHOW:
                return new NoShowState();
            default:
                throw new IllegalArgumentException("No BookingState mapped for status " + status);
        }
    }
}
