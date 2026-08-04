package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

public class ExtendedStateTest {

    private final ExtendedState state = new ExtendedState();

    private Booking extended() {
        Booking b = new Booking("b1", new Room(1));
        b.confirmDeposit();
        b.checkIn();
        b.extend();
        return b;
    }

    @Test
    public void statusIsExtended() {
        assertEquals(BookingStatus.EXTENDED, state.getStatus());
    }

    @Test
    public void extendingAgainStaysExtended() {
        Booking b = extended();
        b.extend();
        assertTrue(b.getState() instanceof ExtendedState);
        assertEquals(BookingStatus.EXTENDED, b.getStatus());
    }

    @Test
    public void extendingAgainSwapsTheStateObject() {
        Booking b = extended();
        Object before = b.getState();
        b.extend();
        assertTrue(b.getState() instanceof ExtendedState);
        assertNotSame(before, b.getState()); // still extended, but a new transition fired
    }

    @Test
    public void extendDirectlyOnState() {
        Booking b = extended();
        state.extend(b);
        assertTrue(b.getState() instanceof ExtendedState);
    }

    @Test
    public void cannotConfirmDeposit() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotCheckIn() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.checkIn(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotMarkNoShow() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.markNoShow(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotCancel() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.cancel(new Booking("b1", new Room(1))));
    }

    @Test
    public void confirmDepositErrorMessage() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(new Booking("b1", new Room(1))));
        assertEquals("Cannot confirm deposit a booking in state EXTENDED.", e.getMessage());
    }

    @Test
    public void canExtendManyTimes() {
        Booking b = extended();
        for (int i = 0; i < 5; i++) {
            b.extend();
        }
        assertEquals(BookingStatus.EXTENDED, b.getStatus());
    }
}
