package Chief_event_coordinator.Classes;

public class Room {
    private final int roomid;
    private int capacity;
    private String building;
    private String roomLocation;
    private RoomStatus status;
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
        validateText(building, "Building is required.");
        validateText(roomLocation, "Room location is required.");

        this.roomid = roomid;
        this.capacity = capacity;
        this.building = building;
        this.roomLocation = roomLocation;
        this.status = RoomStatus.AVAILABLE;
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
        validateText(building, "Building is required.");
        this.building = building;
    }

    public String getRoomLocation() {
        return roomLocation;
    }

    public void setRoomLocation(String roomLocation) {
        validateText(roomLocation, "Room location is required.");
        this.roomLocation = roomLocation;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        if (status == null) {
            throw new IllegalArgumentException("Room status is required.");
        }
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

    private static void validateText(String value, String message) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(message);
        }
    }
}
