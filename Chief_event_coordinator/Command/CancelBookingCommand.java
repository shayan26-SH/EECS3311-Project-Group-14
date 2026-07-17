package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Booking;
import User.RegisteredUser;

public class CancelBookingCommand implements Command {
    private RegisteredUser user;
    private Booking booking;

    public CancelBookingCommand(RegisteredUser user, Booking booking) {
        this.user = user;
        this.booking = booking;
    }

    @Override
    public void execute() {
        user.cancelBooking(booking);
    }
}