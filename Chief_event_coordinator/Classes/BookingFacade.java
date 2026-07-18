package Chief_event_coordinator.Classes;

import java.util.HashMap;

public class BookingFacade {
    private final Administrator administrator;
    private final HashMap<Integer, Room> rooms;
    private final HashMap<String, Booking> bookings;
    private final BadgeVerificationSystem badgeVerificationSystem;

    public BookingFacade(Administrator administrator) {
        this(administrator, new BadgeVerificationSystem());
    }

    public BookingFacade(Administrator administrator, BadgeVerificationSystem badgeVerificationSystem) {
        if (administrator == null) {
            throw new IllegalArgumentException("Administrator is required.");
        }
        if (badgeVerificationSystem == null) {
            throw new IllegalArgumentException("Badge verification system is required.");
        }

        this.administrator = administrator;
        this.badgeVerificationSystem = badgeVerificationSystem;
        this.rooms = new HashMap<>();
        this.bookings = new HashMap<>();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room is required.");
        }
        if (rooms.containsKey(room.getRoomid())) {
            throw new IllegalArgumentException("Room id already exists.");
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
        if (!Room.ENABLED.equals(room.getStatus())) {
            throw new IllegalStateException("Room " + roomid + " is not available.");
        }

        Booking booking = new Booking(bookingid, room);
        bookings.put(bookingid, booking);
        room.setStatus(Room.BOOKED);
        System.out.println("Booking " + bookingid + " created for room " + roomid);
        return booking;
    }

    public boolean cancelBooking(String bookingid) {
        Booking booking = bookings.remove(bookingid);
        if (booking == null) {
            return false;
        }

        if (Room.BOOKED.equals(booking.getRoomName().getStatus())) {
            booking.getRoomName().setStatus(Room.ENABLED);
        }
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

    public void closeRoomForMaintenance(int roomid, String reason) {
        administrator.closeRoom(getRoom(roomid), reason);
    }

    public void authorizeBadge(String badgeId) {
        badgeVerificationSystem.authorizeBadge(badgeId);
    }

    public void revokeBadge(String badgeId) {
        badgeVerificationSystem.revokeBadge(badgeId);
    }

    public int receiveOccupancyData(int roomid, int occupantCount) {
        Room room = getRoom(roomid);
        return room.getOccupancySensor().detectOccupancy(occupantCount);
    }

    public boolean receiveBadgeScanData(int roomid, String badgeId) {
        Room room = getRoom(roomid);
        return room.getIdBadgeScanner().scanBadge(badgeId, badgeVerificationSystem);
    }

    public int getOccupancyCount(int roomid) {
        return getRoom(roomid).getOccupancySensor().getOccupantCount();
    }

    public String getLastScannedBadgeId(int roomid) {
        return getRoom(roomid).getIdBadgeScanner().getLastScannedBadgeId();
    }

    public boolean wasLastBadgeVerified(int roomid) {
        return getRoom(roomid).getIdBadgeScanner().wasLastBadgeVerified();
    }

    public Room viewRoom(int roomid) {
        return getRoom(roomid);
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
