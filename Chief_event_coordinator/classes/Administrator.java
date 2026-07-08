import java.util.*;

public class Administrator {

  private String name;
  private String email;

  public Administrator(String name, String email) {
    this.name = name;
    this.email = email;
  }

  /**
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return String return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }
  
  public void addRoom ( Room room){

  }

public void closeRoom ( Room room){

  }
public void enableRoom ( Room room){

  }

  public void disableRoom ( Room room){

  }

public void viewRoomStatus ( Room room){

  }
public HashMap<Integer, Booking> viewBookings (){
    System.out.println("Viewing all bookings");
    return new HashMap<>();

  }


}
