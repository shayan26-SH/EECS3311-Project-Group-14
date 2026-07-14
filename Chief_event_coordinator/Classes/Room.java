package Chief_event_coordinator.Classes;

public class Room {

    private int roomid;
    private String status;

    public Room(int roomid) {
        this.roomid = roomid;
        this.status = "Enabled";   // default status
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}