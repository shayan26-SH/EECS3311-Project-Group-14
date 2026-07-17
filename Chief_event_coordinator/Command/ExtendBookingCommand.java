package Chief_event_coordinator.Command;

import Chief_event_coordinator.Classes.Booking;
import User.RegisteredUser;

public class ExtendBookingCommand implements Command {
    private RegisteredUser user;
    private Booking booking;
    private float duration;

    public ExtendBookingCommand(RegisteredUser user, Booking booking, float duration) {
        this.user = user;
        this.booking = booking;
        this.duration = duration;
    }

    @Override
    public void execute() {
        user.extendBooking(booking, duration);
    }
}