package Chief_event_coordinator.Classes;

import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.BookingSubject;

import java.util.ArrayList;
import java.util.List;

public class Booking implements BookingSubject {
    private String bookingid;
    private Room roomName;
    private BookingStatus status;
    private final List<BookingObserver> observers = new ArrayList<>();

    public Booking(String bookingid, Room roomName) {
        this.bookingid = bookingid;
        this.roomName = roomName;
        this.status = BookingStatus.PENDING;
    }

    public String getBookingid() {
        return bookingid;
    }
    
    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }
    
    public Room getRoomName() {
        return roomName;
    }
    
    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }

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

    public void setStatus(BookingStatus newStatus) {
        BookingStatus old = this.status;
        this.status = newStatus;
        notifyObservers(old, newStatus);
    }

    public BookingStatus getStatus() {
        return status;
    }
}