package Chief_event_coordinator.Observer;

/**
 * BookingSubject
 *
 * The "Subject" role in the Observer design pattern.
 * Declares the contract for attaching, detaching, and notifying
 * observers. Implemented by Booking.
 */
public interface BookingSubject {

    void addObserver(BookingObserver observer);

    void removeObserver(BookingObserver observer);

    void notifyObservers(BookingStatus oldStatus, BookingStatus newStatus);
}
