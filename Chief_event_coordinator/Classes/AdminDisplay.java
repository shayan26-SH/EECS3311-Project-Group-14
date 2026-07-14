package Chief_event_coordinator.Classes;

public class AdminDisplay {

  private Administrator administrator;

  public AdminDisplay(Administrator administrator) {
    this.administrator = administrator;
  }

  public void display() {
    System.out.println("Administrator Name: " + administrator.getName());
    System.out.println("Administrator Email: " + administrator.getEmail());
  }
}
