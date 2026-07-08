// package Chief_event_coordinator.Abstract_Factory;

// import Chief_event_coordinator.Classes.AdminPermssion;
// import Chief_event_coordinator.Classes.Administrator;

public class RoomAdminFactory implements AdminFactory {

  @Override
  public Administrator createAdministrator(String name, String email) {
    // TODO Auto-generated method stub
    return new Administrator(name, email);
  }

  @Override
  public AdminPermssion createPermission() {
    // TODO Auto-generated method stub
    String s1 = "Room Managed";
    return new AdminPermssion(s1);
  }
}
