package Chief_event_coordinator.Classes;

import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.BookingSubject;
import User.RegisteredUser;

import java.util.ArrayList;
import java.util.List;

public class Booking implements BookingSubject {
    private String bookingid;
    private RegisteredUser registeredUser;
    private Room roomName;
    private BookingStatus status;
    private final List<BookingObserver> observers = new ArrayList<BookingObserver>();

    public Booking(String bookingid, Room roomName) {
        this.bookingid = bookingid;
        this.roomName = roomName;
        this.status = BookingStatus.ACTIVE;
    }

    public Booking(String bookingid, RegisteredUser registeredUser, Room roomName) {
        this.bookingid = bookingid;
        this.registeredUser = registeredUser;
        this.roomName = roomName;
        this.status = BookingStatus.ACTIVE;
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

    // --- Business methods (Req8, Req9) ---

    public boolean edit(Room newRoom) {
        if (status == BookingStatus.CANCELLED) {
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
        if (status == BookingStatus.CANCELLED) {
            System.out.println("A cancelled booking cannot be edited.");
        }

        else {
            System.out.println("Editing booking " + bookingid + ".");
        }
    }

    public boolean cancel() {
        if (status == BookingStatus.CANCELLED) {
            System.out.println("Booking " + bookingid + " is already cancelled.");

            return false;
        }

        else {
            setStatus(BookingStatus.CANCELLED);
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
        if (status == BookingStatus.CANCELLED) {
            System.out.println("A cancelled booking cannot be extended.");

            return false;
        }

        else {
            setStatus(BookingStatus.EXTENDED);
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