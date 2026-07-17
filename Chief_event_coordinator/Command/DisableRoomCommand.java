package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Room;

public class DisableRoomCommand implements Command {

    private Administrator administrator;
    private Room room;

    public DisableRoomCommand(Administrator administrator, Room room) {
        this.administrator = administrator;
        this.room = room;
    }

    @Override
    public void execute() {
        administrator.disableRoom(room);
    }
}