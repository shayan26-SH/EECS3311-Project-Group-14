package SystemUser;

import AccountType.AccountType;
import java.util.ArrayList;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;

public class RegisteredUser extends SystemUser {

  private ArrayList<Booking> bookingsList;
  private int studentOrgID;
  private AccountType AccountType;

  public RegisteredUser(
    String name,
    String email,
    String password,
    AccountType accountType,
    int studentOrgID
  ) {
    super(name, email, password, accountType);
    this.studentOrgID = studentOrgID;
    this.bookingsList = new ArrayList<>();
  }

  public int getOrgID() {
    return studentOrgID;
  }

  public void setOrgID(int studentOrgID) {
    this.studentOrgID = studentOrgID;
  }

  public String viewAvailableRooms() {
    return "Displaying available rooms...";
  }

  public ArrayList<Booking> viewBookings() {
    return bookingsList;
  }

  public Booking bookRoom(Room room) {
    Booking booking = new Booking(String.valueOf(bookingsList.size() + 1), this, room);

    bookingsList.add(booking);

    return booking;
  }

  public boolean modifyBooking(Booking booking) {
    if (bookingsList.contains(booking)) {
      booking.edit();
      return true;
    }

    return false;
  }

  public void cancelBooking(Booking booking) {
    if (bookingsList.contains(booking)) {
      booking.cancel();
    }
  }

  public boolean extendBooking(Booking booking, float duration) {
    if (bookingsList.contains(booking)) {
      return booking.extend(duration);
    }

    return false;
  }

  public AccountType getAccountType() {
    return AccountType;
  }

  public void setAccountType(AccountType accountType) {
    AccountType = accountType;
  }

  public void addBooking(Booking booking) {
    bookingsList.add(booking);
  }
}
