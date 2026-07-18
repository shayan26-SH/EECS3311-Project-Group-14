package Chief_event_coordinator.Classes;

public class OccupancySensor {
    private final int roomid;
    private int occupantCount;

    public OccupancySensor(int roomid) {
        this.roomid = roomid;
    }

    public int detectOccupancy(int occupantCount) {
        if (occupantCount < 0) {
            throw new IllegalArgumentException("Occupant count cannot be negative.");
        }

        this.occupantCount = occupantCount;
        return occupantCount;
    }

    public int getRoomid() {
        return roomid;
    }

    public int getOccupantCount() {
        return occupantCount;
    }
}
