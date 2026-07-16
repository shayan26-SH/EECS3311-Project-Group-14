package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Room;
import SystemUser.RegisteredUser;

public class BookRoomCommand implements Command {

    private RegisteredUser user;
    private Room room;

    public BookRoomCommand(RegisteredUser user, Room room) {
        this.user = user;
        this.room = room;
    }

    @Override
    public void execute() {
        user.bookRoom(room);
    }
}