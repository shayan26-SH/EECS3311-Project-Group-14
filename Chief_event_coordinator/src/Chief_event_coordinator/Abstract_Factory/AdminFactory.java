package Chief_event_coordinator.Abstract_Factory;
import Chief_event_coordinator.Classes.*;

public interface AdminFactory {
  public Administrator createAdministrator(String name, String email);

  public AdminPermssion createPermission();
}
