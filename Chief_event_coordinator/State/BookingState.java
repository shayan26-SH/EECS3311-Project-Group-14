package Chief_event_coordinator.State;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Observer.BookingStatus;

/**
 * BookingState  --  the "State" role of the State design pattern.
 *
 * OWNER: Jasveer (State pattern, booking lifecycle - Req3, Req4, Req8, Req9).
 *
 * A Booking behaves differently depending on where it is in its lifecycle
 * (just requested, deposit paid, checked-in, cancelled, ...). Instead of
 * scattering "if (status == CONFIRMED) ... else if (status == PENDING) ..."
 * checks all over Booking, each lifecycle stage is represented by its own
 * class that knows which actions are legal from that stage and what the next
 * stage is. Booking (the Context) simply delegates every action to its current
 * state object.
 *
 * INTEGRATION WITH OBSERVER (Taz):
 * Each state maps to exactly one value of the shared {@link BookingStatus}
 * enum via {@link #getStatus()}. That enum stays the single source of truth
 * for "what did the booking change to", so Observer and Persistence keep
 * working unchanged - they still read a BookingStatus, they just no longer
 * care that a State object produced it.
 *
 * Transition actions (confirmDeposit, checkIn, ...) take the Booking so the
 * state can drive the transition by calling booking.changeState(nextState).
 */
public interface BookingState {

    /** Req4: the one-hour deposit is paid up front -> booking is CONFIRMED. */
    void confirmDeposit(Booking booking);

    /** Req4/Req5: user checks in (within 30 min of start) -> CHECKED_IN. */
    void checkIn(Booking booking);

    /** Req4: 30-minute check-in window elapsed with no check-in -> NO_SHOW (deposit lost). */
    void markNoShow(Booking booking);

    /** Req8: user cancels before the start time -> CANCELLED. */
    void cancel(Booking booking);

    /** Req9: user extends the booking before expiry (room must be free) -> EXTENDED. */
    void extend(Booking booking);

    /** The BookingStatus enum value this state corresponds to (Observer's vocabulary). */
    BookingStatus getStatus();
}
