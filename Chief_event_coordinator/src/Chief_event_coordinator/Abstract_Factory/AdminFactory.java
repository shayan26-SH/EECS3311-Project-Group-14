//package Chief_event_coordinator.Abstract_Factory;

public interface AdminFactory {
  public Administrator createAdministrator(String name, String email);

  public AdminPermssion createPermission();
}
