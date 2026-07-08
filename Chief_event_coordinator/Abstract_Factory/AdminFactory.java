public interface AdminFactory {
  public Administrator createAdministrator(String name, String email);

  public AdminPermssion createPermission();

  public AdminDisplay createDisplay();
}
