//package Chief_event_coordinator.Classes;

public class AdminPermssion {

  private String level;

  public AdminPermssion(String level) {
    this.level = level;
  }

  /**
   * @return String return the level
   */
  public String getLevel() {
    return level;
  }

  /**
   * @param level the level to set
   */
  public void setLevel(String level) {
    this.level = level;
  }

  public void showPermission() {
    System.out.println("Permission: " + level);
  }
}
