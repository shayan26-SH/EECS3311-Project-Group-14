package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Room;

public class CloseRoomCommand implements Command {

    private Administrator administrator;
    private Room room;
    private String reason;

    public CloseRoomCommand(Administrator administrator, Room room) {
        this(administrator, room, null);
    }

    public CloseRoomCommand(Administrator administrator, Room room, String reason) {
        this.administrator = administrator;
        this.room = room;
        this.reason = reason;
    }

    @Override
    public void execute() {
        if (reason == null) {
            administrator.closeRoom(room);
        } else {
            administrator.closeRoom(room, reason);
        }
    }
}
