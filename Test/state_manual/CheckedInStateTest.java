package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

public class CheckedInStateTest {

    private final CheckedInState state = new CheckedInState();

    private Booking checkedIn() {
        Booking b = new Booking("b1", new Room(1));
        b.confirmDeposit();
        b.checkIn();
        return b;
    }

    @Test
    public void statusIsCheckedIn() {
        assertEquals(BookingStatus.CHECKED_IN, state.getStatus());
    }

    @Test
    public void extendGoesToExtended() {
        Booking b = checkedIn();
        b.extend();
        assertTrue(b.getState() instanceof ExtendedState);
        assertEquals(BookingStatus.EXTENDED, b.getStatus());
    }

    @Test
    public void extendDirectlyOnState() {
        Booking b = checkedIn();
        state.extend(b);
        assertTrue(b.getState() instanceof ExtendedState);
    }

    @Test
    public void cannotConfirmDeposit() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotCheckInAgain() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.checkIn(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotMarkNoShow() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.markNoShow(new Booking("b1", new Room(1))));
    }

    // once you're checked in you can't cancel anymore
    @Test
    public void cannotCancelAfterCheckIn() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.cancel(new Booking("b1", new Room(1))));
    }

    @Test
    public void cancelErrorMessage() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.cancel(new Booking("b1", new Room(1))));
        assertEquals("Cannot cancel a booking in state CHECKED_IN.", e.getMessage());
    }

    @Test
    public void bookingCancelThrowsWhenCheckedIn() {
        Booking b = checkedIn();
        assertThrows(IllegalBookingTransitionException.class, () -> b.cancel());
        assertEquals(BookingStatus.CHECKED_IN, b.getStatus());
    }

    @Test
    public void canExtendMoreThanOnce() {
        Booking b = checkedIn();
        b.extend();
        b.extend();
        assertEquals(BookingStatus.EXTENDED, b.getStatus());
    }
}
