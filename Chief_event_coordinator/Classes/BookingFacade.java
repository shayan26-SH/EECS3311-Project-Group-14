package Chief_event_coordinator.Classes;

import java.util.HashMap;

public class BookingFacade {
    private Administrator administrator;
    private HashMap<Integer, Room> rooms;
    private HashMap<String, Booking> bookings;

    public BookingFacade(Administrator administrator) {
        if (administrator == null) {
            throw new IllegalArgumentException("Administrator is required.");
        }

        this.administrator = administrator;
        this.rooms = new HashMap<>();
        this.bookings = new HashMap<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room is required.");
        }

        rooms.put(room.getRoomid(), room);
        administrator.addRoom(room);
    }

    public Booking createBooking(String bookingid, int roomid) {
        if (bookingid == null || bookingid.isEmpty()) {
            throw new IllegalArgumentException("Booking id is required.");
        }
        if (bookings.containsKey(bookingid)) {
            throw new IllegalArgumentException("Booking id already exists.");
        }

        Room room = getRoom(roomid);
        if (!"Enabled".equals(room.getStatus())) {
            throw new IllegalStateException("Room " + roomid + " is not available.");
        }

        Booking booking = new Booking(bookingid, room);
        bookings.put(bookingid, booking);
        room.setStatus("Booked");
        System.out.println("Booking " + bookingid + " created for room " + roomid);
        return booking;
    }

    public boolean cancelBooking(String bookingid) {
        Booking booking = bookings.remove(bookingid);
        if (booking == null) {
            return false;
        }

        booking.getRoomName().setStatus("Enabled");
        System.out.println("Booking " + bookingid + " cancelled");
        return true;
    }

    public Booking getBooking(String bookingid) {
        return bookings.get(bookingid);
    }

    public HashMap<String, Booking> viewBookings() {
        return new HashMap<>(bookings);
    }

    public void enableRoom(int roomid) {
        administrator.enableRoom(getRoom(roomid));
    }

    public void disableRoom(int roomid) {
        administrator.disableRoom(getRoom(roomid));
    }

    public void closeRoom(int roomid) {
        administrator.closeRoom(getRoom(roomid));
    }

    public void viewRoomStatus(int roomid) {
        administrator.viewRoomStatus(getRoom(roomid));
    }

    private Room getRoom(int roomid) {
        Room room = rooms.get(roomid);
        if (room == null) {
            throw new IllegalArgumentException("Room " + roomid + " does not exist.");
        }
        return room;
    }
}
