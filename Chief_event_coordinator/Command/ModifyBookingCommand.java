package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Booking;
import SystemUser.RegisteredUser;

public class ModifyBookingCommand implements Command {

    private RegisteredUser user;
    private Booking booking;

    public ModifyBookingCommand(RegisteredUser user, Booking booking) {
        this.user = user;
        this.booking = booking;
    }

    @Override
    public void execute() {
        user.modifyBooking(booking);
    }
}