package Chief_event_coordinator.Classes;

import Chief_event_coordinator.Command.AddRoomCommand;
import Chief_event_coordinator.Command.CloseRoomCommand;
import Chief_event_coordinator.Command.Command;
import Chief_event_coordinator.Command.CommandInvoker;
import Chief_event_coordinator.Command.DisableRoomCommand;
import Chief_event_coordinator.Command.EnableRoomCommand;

import java.util.HashMap;

public class BookingFacade {
    private final Administrator administrator;
    private final HashMap<Integer, Room> rooms;
    private final BadgeVerificationSystem badgeVerificationSystem;
    private final CommandInvoker commandInvoker;

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
        this.rooms = new HashMap<Integer, Room>();
        this.commandInvoker = new CommandInvoker();
    }

    public void addRoom(Room room) {
        if (room == null) {
            throw new IllegalArgumentException("Room is required.");
        }
        if (rooms.containsKey(room.getRoomid())) {
            throw new IllegalArgumentException("Room id already exists.");
        }

        execute(new AddRoomCommand(administrator, room));
        rooms.put(room.getRoomid(), room);
    }

    public void enableRoom(int roomid) {
        execute(new EnableRoomCommand(administrator, getRoom(roomid)));
    }

    public void disableRoom(int roomid) {
        execute(new DisableRoomCommand(administrator, getRoom(roomid)));
    }

    public void closeRoom(int roomid) {
        execute(new CloseRoomCommand(administrator, getRoom(roomid)));
    }

    public void closeRoomForMaintenance(int roomid, String reason) {
        execute(new CloseRoomCommand(administrator, getRoom(roomid), reason));
    }

    public void authorizeBadge(String badgeId) {
        badgeVerificationSystem.authorizeBadge(badgeId);
    }

    public void revokeBadge(String badgeId) {
        badgeVerificationSystem.revokeBadge(badgeId);
    }

    public int receiveOccupancyData(int roomid, int occupantCount) {
        return getRoom(roomid).getOccupancySensor().detectOccupancy(occupantCount);
    }

    public boolean receiveBadgeScanData(int roomid, String badgeId) {
        return getRoom(roomid).getIdBadgeScanner().scanBadge(badgeId, badgeVerificationSystem);
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

    private void execute(Command command) {
        commandInvoker.setCommand(command);
        commandInvoker.executeCommand();
    }

    private Room getRoom(int roomid) {
        Room room = rooms.get(roomid);
        if (room == null) {
            throw new IllegalArgumentException("Room " + roomid + " does not exist.");
        }
        return room;
    }
}
