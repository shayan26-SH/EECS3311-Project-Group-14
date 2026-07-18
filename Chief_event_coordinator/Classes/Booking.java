package Chief_event_coordinator.Classes;

import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.BookingSubject;
import Chief_event_coordinator.State.BookingState;
import Chief_event_coordinator.State.BookingStateFactory;
import Chief_event_coordinator.State.PendingState;
import User.RegisteredUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Booking
 *
 * Plays two design-pattern roles at once:
 *
 *   - Subject in the OBSERVER pattern (Taz): it notifies registered observers
 *     whenever its status changes.
 *
 *   - Context in the STATE pattern (Jasveer): its lifecycle behaviour is
 *     delegated to a BookingState object. Booking no longer decides which
 *     actions are legal; it forwards each action (confirmDeposit, checkIn,
 *     cancel, extend, markNoShow) to its current state, which either performs
 *     the transition or rejects it.
 *
 * The two patterns meet at changeState(): every state transition ends by
 * notifying observers with the old/new BookingStatus, so the Observer wiring
 * and the CSV persistence layer keep working unchanged - they still read a
 * BookingStatus, they just no longer care that a State object produced it.
 */
public class Booking implements BookingSubject {
    private String bookingid;
    private RegisteredUser registeredUser;
    private Room roomName;
    private BookingState state;
    private final List<BookingObserver> observers = new ArrayList<BookingObserver>();

    public Booking(String bookingid, Room roomName) {
        this(bookingid, null, roomName);
    }

    public Booking(String bookingid, RegisteredUser registeredUser, Room roomName) {
        if (bookingid == null || bookingid.trim().isEmpty()) {
            throw new IllegalArgumentException("Booking id is required.");
        }
        if (roomName == null) {
            throw new IllegalArgumentException("Room is required.");
        }

        this.bookingid = bookingid;
        this.registeredUser = registeredUser;
        this.roomName = roomName;
        this.state = new PendingState();
    }

    // ----- Observer role (unchanged contract) -----
    // --- BookingSubject ---

    @Override
    public void addObserver(BookingObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(BookingObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(BookingStatus oldStatus, BookingStatus newStatus) {
        for (BookingObserver o : observers)
            o.onBookingStatusChanged(this, oldStatus, newStatus);
    }

    // ----- State role: lifecycle actions delegate to the current state -----

    /** Req4: pay the one-hour deposit up front (PENDING -> CONFIRMED). */
    public void confirmDeposit() {
        state.confirmDeposit(this);
    }

    /** Req4/Req5: user checks in within 30 min (CONFIRMED -> CHECKED_IN). */
    public void checkIn() {
        state.checkIn(this);
    }

    /** Req4: check-in window elapsed, deposit lost (CONFIRMED -> NO_SHOW). */
    public void markNoShow() {
        state.markNoShow(this);
    }

    /** Req9: extend before expiry if room is free (CHECKED_IN/EXTENDED -> EXTENDED). */
    public void extend() {
        state.extend(this);
    }

    /**
     * Performs a state transition and notifies observers. Called by the
     * BookingState classes; this is the one place where State and Observer meet.
     */
    public void changeState(BookingState newState) {
        if (newState == null) {
            throw new IllegalArgumentException("Booking state is required.");
        }

        BookingStatus oldStatus = this.state.getStatus();
        this.state = newState;
        notifyObservers(oldStatus, newState.getStatus());
    }

    /** The current lifecycle stage as a BookingState object (State pattern view). */
    public BookingState getState() {
        return state;
    }

    /** The current status as a BookingStatus enum (Observer / Persistence view). */
    public BookingStatus getStatus() {
        return state.getStatus();
    }

    /**
     * Restores the booking to a given status. Kept for backward compatibility
     * with the Persistence layer (CSV load) and any code that stored a raw
     * status: it rebuilds the matching state object and notifies observers.
     * Prefer the semantic actions (confirmDeposit/checkIn/cancel/extend) for
     * real lifecycle changes, since those enforce the legal transitions.
     */
    public void setStatus(BookingStatus newStatus) {
        changeState(BookingStateFactory.fromStatus(newStatus));
    }

    // --- Business methods (Req8, Req9) ---

    public boolean edit(Room newRoom) {
        if (getStatus() == BookingStatus.CANCELLED) {
            System.out.println("A cancelled booking cannot be edited.");

            return false;
        }

        if (newRoom == null) {
            System.out.println("The new room cannot be null.");

            return false;
        }

        else {
            roomName = newRoom;
            System.out.println("Booking " + bookingid + " was edited.");

            return true;
        }
    }

    public void edit() {
        if (getStatus() == BookingStatus.CANCELLED)
            System.out.println("A cancelled booking cannot be edited.");

        else
            System.out.println("Editing booking " + bookingid + ".");
    }

    public boolean cancel() {
        if (getStatus() == BookingStatus.CANCELLED) {
            System.out.println("Booking " + bookingid + " is already cancelled.");

            return false;
        }

        else {
            state.cancel(this);
            System.out.println("Booking " + bookingid + " was cancelled.");

            return true;
        }
    }

    /**
     * Extends the booking by the given duration (hours). The duration is
     * currently not tracked on Booking itself (no duration field exists
     * yet) - accepted here so RegisteredUser.extendBooking() compiles.
     * Flagged for the team: if bookings need an actual stored duration,
     * add a field for it rather than discarding the parameter.
     */
    public boolean extend(float duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Extension duration must be positive.");
        }

        if (getStatus() == BookingStatus.CANCELLED) {
            System.out.println("A cancelled booking cannot be extended.");

            return false;
        }

        else {
            state.extend(this);
            System.out.println("Booking " + bookingid + " was extended by " + duration + " hour(s).");

            return true;
        }
    }

    // --- Getters/setters ---

    public String getBookingid() {
        return bookingid;
    }

    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }

    public Room getRoomName() {
        return roomName;
    }

    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }
}
