package Chief_event_coordinator.Classes;

import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.BookingSubject;

import java.util.ArrayList;
import java.util.List;

/**
 * Booking
 *
 * The original main-branch Booking.java was an empty placeholder.
 * This fills it in as the "Subject" in the Observer pattern: it holds
 * a list of BookingObserver instances and notifies them whenever its
 * status changes (Req3, Req4, Req8, Req9, Req10 all revolve around
 * booking state changes that other parts of the system must react to).
 */
public class Booking implements BookingSubject {

    private final int bookingId;
    private final int roomId;
    private final String userEmail;
    private BookingStatus status;

    private final List<BookingObserver> observers = new ArrayList<>();

    public Booking(int bookingId, int roomId, String userEmail) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.userEmail = userEmail;
        this.status = BookingStatus.PENDING;
    }

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
        for (BookingObserver observer : observers)
            observer.onBookingStatusChanged(this, oldStatus, newStatus);
    }

    // --- Status transition ---

    /**
     * Changes the booking's status and notifies all registered
     * observers of the transition. This is the single entry point
     * for status changes so no caller can silently mutate status
     * without observers finding out.
     */
    public void setStatus(BookingStatus newStatus) {
        BookingStatus oldStatus = this.status;
        this.status = newStatus;
        notifyObservers(oldStatus, newStatus);
    }

    public BookingStatus getStatus() {
        return status;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getUserEmail() {
        return userEmail;
    }
}
