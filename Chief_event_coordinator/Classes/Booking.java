package Chief_event_coordinator.Classes;

import User.RegisteredUser;

public class Booking {

    // Booking ID
    private String bookingid;

    // User who made the booking
    private RegisteredUser registeredUser;

    // Room assigned to the booking
    private Room roomName;

    // Current booking status
    private String status;

    // Existing two-argument constructor
    public Booking(String bookingid, Room roomName) {
        this.bookingid = bookingid;
        this.roomName = roomName;
        this.status = "Active";
    }

    // Existing three-argument constructor
    public Booking(
            String bookingid,
            RegisteredUser registeredUser,
            Room roomName
    ) {
        this.bookingid = bookingid;
        this.registeredUser = registeredUser;
        this.roomName = roomName;
        this.status = "Active";
    }

    // Edit the room for this booking
    public boolean edit(Room newRoom) {

        // Cannot edit a cancelled booking
        if ("Cancelled".equalsIgnoreCase(status)) {
            System.out.println("A cancelled booking cannot be edited.");
            return false;
        }

        // Ensure the new room is valid
        if (newRoom == null) {
            System.out.println("The new room cannot be null.");
            return false;
        }

        // Update the room
        roomName = newRoom;

        System.out.println("Booking " + bookingid + " was edited.");

        return true;
    }

    // Edit booking information
    public void edit() {

        // Check booking status
        if ("Cancelled".equalsIgnoreCase(status)) {
            System.out.println("A cancelled booking cannot be edited.");
            return;
        }

        System.out.println("Editing booking " + bookingid + ".");
    }

    // Cancel the booking
    public boolean cancel() {

        // Check if already cancelled
        if ("Cancelled".equalsIgnoreCase(status)) {
            System.out.println("Booking " + bookingid + " is already cancelled.");
            return false;
        }

        // Change booking status
        status = "Cancelled";

        System.out.println("Booking " + bookingid + " was cancelled.");

        return true;
    }

    // Extend the booking
    public boolean extend() {

        // Cannot extend a cancelled booking
        if ("Cancelled".equalsIgnoreCase(status)) {
            System.out.println("A cancelled booking cannot be extended.");
            return false;
        }

        System.out.println("Booking " + bookingid + " was extended.");

        return true;
    }

    // Returns the booking ID
    public String getBookingid() {
        return bookingid;
    }

    // Updates the booking ID
    public void setBookingid(String bookingid) {
        this.bookingid = bookingid;
    }

    // Returns the registered user
    public RegisteredUser getRegisteredUser() {
        return registeredUser;
    }

    // Updates the registered user
    public void setRegisteredUser(RegisteredUser registeredUser) {
        this.registeredUser = registeredUser;
    }

    // Returns the booked room
    public Room getRoomName() {
        return roomName;
    }

    // Updates the booked room
    public void setRoomName(Room roomName) {
        this.roomName = roomName;
    }

    // Returns the booking status
    public String getStatus() {
        return status;
    }
}
