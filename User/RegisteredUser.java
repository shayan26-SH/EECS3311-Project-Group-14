package User;

import AccountType.AccountType;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import java.util.ArrayList;

public class RegisteredUser extends SystemUser {
  private ArrayList<Booking> bookingsList;
  private int studentOrgID;
  private AccountType accountType;

  public RegisteredUser(String name, String email, String password, AccountType accountType, int studentOrgID) {
    super(email, password, name, accountType);
    this.studentOrgID = studentOrgID;
    this.accountType = accountType;
    this.bookingsList = new ArrayList<Booking>();
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
    String bookingId = "B" + (bookingsList.size() + 1);
    Booking booking = new Booking(bookingId, this, room);
    bookingsList.add(booking);

    return booking;
  }

  public boolean modifyBooking(Booking booking) {
    if (bookingsList.contains(booking)) {
      booking.edit();

      return true;
    }

    else
      return false;
  }

  public void cancelBooking(Booking booking) {
    if (bookingsList.contains(booking))
      booking.cancel();
  }

  public boolean extendBooking(Booking booking, float duration) {
    if (bookingsList.contains(booking))
      return booking.extend(duration);

    else
      return false;
  }

  public AccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountType accountType) {
    this.accountType = accountType;
    setType(accountType);
  }

  public void addBooking(Booking booking) {
    bookingsList.add(booking);
  }
}
