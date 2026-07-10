package Chief_event_coordinator.Classes;

import java.util.HashMap;
import java.util.Map;

/**
 * Administrator
 *
 * Original main-branch version had the constructor, name/email
 * accessors, and empty stub methods for room management. This fills
 * in those stubs (addRoom, enableRoom, disableRoom, closeRoom,
 * viewRoomStatus, viewBookings) so they actually do something,
 * without changing any existing method signature - the AdminFactory
 * / RoomAdminFactory / ChiefEventCoordinator classes that already
 * call `new Administrator(name, email)` are unaffected.
 *
 * Room management directly implements Req6/Req7 use cases:
 *   Add Room, Enable Room, Disable Room, Close Room for Maintenance,
 *   Update Room Details, View Room Availability.
 */
public class Administrator {
    private String name;
    private String email;

    private final Map<Integer, Room> rooms = new HashMap<>();
    private final Map<Integer, Booking> bookings = new HashMap<>();

    public Administrator(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /** Req6: Add Room */
    public void addRoom(Room room) {
        rooms.put(room.getRoomid(), room);
        System.out.println("[Administrator " + name + "] Added room " + room.getRoomid());
    }

    /** Req6: Enable Room */
    public void enableRoom(Room room) {
        Room managed = rooms.get(room.getRoomid());

        if (managed == null)
            System.out.println("[Administrator " + name + "] Room " + room.getRoomid() + " not found");

        else {
          managed.setStatus(RoomStatus.AVAILABLE);
          System.out.println("[Administrator " + name + "] Enabled room " + managed.getRoomid());
        }
    }

    /** Req6: Disable Room */
    public void disableRoom(Room room) {
        Room managed = rooms.get(room.getRoomid());

        if (managed == null)
            System.out.println("[Administrator " + name + "] Room " + room.getRoomid() + " not found");

        else {
          managed.setStatus(RoomStatus.DISABLED);
          System.out.println("[Administrator " + name + "] Disabled room " + managed.getRoomid());
        }
    }

    /** Req6: Close Room for Maintenance */
    public void closeRoom(Room room) {
        Room managed = rooms.get(room.getRoomid());

        if (managed == null)
            System.out.println("[Administrator " + name + "] Room " + room.getRoomid() + " not found");

        else {
          managed.setStatus(RoomStatus.MAINTENANCE);
          System.out.println("[Administrator " + name + "] Room " + managed.getRoomid() + " closed for maintenance");
        }
    }

    /** Req6/Req7: View Room Availability for a specific room */
    public void viewRoomStatus(Room room) {
        Room managed = rooms.get(room.getRoomid());
        RoomStatus status = (managed != null) ? managed.getStatus() : room.getStatus();
        System.out.println("[Administrator " + name + "] Room " + room.getRoomid() + " status: " + status);
    }

    /** Req7: Update Room Details (currently roomid/status; extend as more room fields are added) */
    public void updateRoomDetails(int roomId, RoomStatus newStatus) {
        Room managed = rooms.get(roomId);

        if (managed == null)
            System.out.println("[Administrator " + name + "] Room " + roomId + " not found");

        else {
          managed.setStatus(newStatus);
          System.out.println("[Administrator " + name + "] Updated room " + roomId + " -> " + newStatus);
        }
    }

    public void trackBooking(Booking booking) {
        bookings.put(booking.getBookingId(), booking);
    }

    public HashMap<Integer, Booking> viewBookings() {
        System.out.println("[Administrator " + name + "] Viewing all bookings (" + bookings.size() + ")");
        return new HashMap<Integer, Booking>(bookings);
    }

    public Map<Integer, Room> getManagedRooms() {
        return rooms;
    }
}
