package Chief_event_coordinator.Classes;

/**
 * Room
 *
 * Extended from the original main-branch version (which only had
 * roomid) to add a status field. This is a low-risk additive change:
 * existing constructor/getRoomid/setRoomid signatures are unchanged,
 * so nothing that already depends on Room breaks.
 */
public class Room {
    private int roomid;
    private RoomStatus status;

    public Room(int roomid) {
        this.roomid = roomid;
        this.status = RoomStatus.AVAILABLE;
    }

    public Room(int roomid, RoomStatus status) {
        this.roomid = roomid;
        this.status = status;
    }

    public int getRoomid() {
        return roomid;
    }

    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }
}
