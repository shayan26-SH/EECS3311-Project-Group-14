package Chief_event_coordinator.Classes;

public class Room {

    public static final String ENABLED = "Enabled";
    public static final String DISABLED = "Disabled";
    public static final String CLOSED = "Closed";
    public static final String BOOKED = "Booked";

    private final int roomid;
    private int capacity;
    private String building;
    private String roomLocation;
    private String status;
    private String closureReason;
    private final OccupancySensor occupancySensor;
    private final IdBadgeScanner idBadgeScanner;

    public Room(int roomid) {
        this(roomid, 1, "Not specified", "Not specified");
    }

    public Room(int roomid, int capacity, String building, String roomLocation) {
        if (roomid <= 0) {
            throw new IllegalArgumentException("Room id must be positive.");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("Room capacity must be positive.");
        }
        if (building == null || building.trim().isEmpty()) {
            throw new IllegalArgumentException("Building is required.");
        }
        if (roomLocation == null || roomLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Room location is required.");
        }

        this.roomid = roomid;
        this.capacity = capacity;
        this.building = building;
        this.roomLocation = roomLocation;
        this.status = ENABLED;
        this.occupancySensor = new OccupancySensor(roomid);
        this.idBadgeScanner = new IdBadgeScanner(roomid);
    }

    public int getRoomid() {
        return roomid;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Room capacity must be positive.");
        }
        this.capacity = capacity;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        if (building == null || building.trim().isEmpty()) {
            throw new IllegalArgumentException("Building is required.");
        }
        this.building = building;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        if (roomLocation == null || roomLocation.trim().isEmpty()) {
            throw new IllegalArgumentException("Room location is required.");
        }
        this.roomLocation = roomLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getClosureReason() {
        return closureReason;
    }

    void setClosureReason(String closureReason) {
        this.closureReason = closureReason;
    }

    public OccupancySensor getOccupancySensor() {
        return occupancySensor;
    }

    public IdBadgeScanner getIdBadgeScanner() {
        return idBadgeScanner;
    }
}
