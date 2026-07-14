package Chief_event_coordinator.Observer;

/**
 * BookingStatus
 *
 * Shared status values for a Booking's lifecycle.
 *
 * INTEGRATION NOTE FOR THE TEAM:
 * Jasveer owns the State design pattern (Req3, Req8, Req9 - booking
 * lifecycle). If Jasveer implements BookingStatus as part of a
 * State-pattern hierarchy (e.g. a BookingState interface with
 * PendingState / ConfirmedState / CancelledState classes), this enum
 * should be treated as the single source of truth for status values
 * and reused by both patterns rather than duplicated. Observer does
 * not care *how* the state transition is implemented (enum vs. State
 * pattern classes) - it only needs a single well-known place to read
 * "what did the booking change to" from, so it can notify observers.
 */
public enum BookingStatus {
    PENDING,
    CONFIRMED,
    CANCELLED,
    NO_SHOW,
    CHECKED_IN,
    EXTENDED
}
