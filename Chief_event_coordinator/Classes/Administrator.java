package Chief_event_coordinator.Classes;

import java.util.HashMap;

public class Administrator {
    private String name;
    private String email;
    private HashMap<Integer, Room> rooms = new HashMap<Integer, Room>();

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

    public void addRoom(Room room) {
        rooms.put(room.getRoomid(), room);
        System.out.println("Room " + room.getRoomid() + " added");
    }

    public void closeRoom(Room room) {
        room.setStatus(RoomStatus.MAINTENANCE);
        System.out.println("Room " + room.getRoomid() + " closed for maintenance");
    }

    public void enableRoom(Room room) {
        room.setStatus(RoomStatus.AVAILABLE);
        System.out.println("Room " + room.getRoomid() + " enabled");
    }

    public void disableRoom(Room room) {
        room.setStatus(RoomStatus.DISABLED);
        System.out.println("Room " + room.getRoomid() + " disabled");
    }

    public void viewRoomStatus(Room room) {
        System.out.println("Room: " + room.getRoomid() + " Status: " + room.getStatus());
    }

    public HashMap<Integer, Booking> viewBookings() {
        System.out.println("Viewing all bookings");

        return new HashMap<Integer, Booking>();
    }
}