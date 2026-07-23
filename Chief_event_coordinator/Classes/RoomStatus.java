package Chief_event_coordinator.Classes;

/**
 * RoomStatus
 *
 * Added to support Administrator use cases (Req6, Req7): Enable Room,
 * Disable Room, Close Room for Maintenance, View Room Availability.
 * The original Room.java (main branch) only had a roomid field with
 * no status - this enum fills that gap so RoomAvailabilityObserver
 * has something to update.
 */
public enum RoomStatus {
    AVAILABLE,
    OCCUPIED,
    DISABLED,
    MAINTENANCE
}
