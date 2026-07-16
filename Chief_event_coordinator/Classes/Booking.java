package Chief_event_coordinator.Classes;

import User.RegisteredUser;

public class Booking {

  private String bookingid;
  private RegisteredUser registeredUser;
  private Room roomName;
  private String status;

  // Existing two-argument constructor
  public Booking(String bookingid, Room roomName) {
    this.bookingid = bookingid;
    this.roomName = roomName;
    this.status = "Active";
  }

  // Missing three-argument constructor
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

  // Edit the booking's room
  public void edit(Room newRoom) {
    if (newRoom == null) {
      System.out.println("The new room cannot be null.");
      return;
    }

    this.roomName = newRoom;
    System.out.println("Booking " + bookingid + " was edited.");
  }

  // No-argument edit method, only include this if RegisteredUser calls edit()
  public void edit() {
    System.out.println("Editing booking " + bookingid);
  }

  // Cancel the booking
  public boolean cancel() {
    if ("Cancelled".equals(status)) {
      return false;
    }

    status = "Cancelled";
    System.out.println("Booking " + bookingid + " was cancelled.");
    return true;
  }

  // Extend the booking
  public boolean extend() {
    if ("Cancelled".equals(status)) {
      System.out.println("A cancelled booking cannot be extended.");
      return false;
    }

    System.out.println("Booking " + bookingid + " was extended.");
    return true;
  }

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

  public String getStatus() {
    return status;
  }
}
