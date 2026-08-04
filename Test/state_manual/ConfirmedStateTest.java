package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.NoShowState;

public class ConfirmedStateTest {

    private final ConfirmedState state = new ConfirmedState();

    // a booking that already paid its deposit
    private Booking confirmed() {
        Booking b = new Booking("b1", new Room(1));
        b.confirmDeposit();
        return b;
    }

    @Test
    public void statusIsConfirmed() {
        assertEquals(BookingStatus.CONFIRMED, state.getStatus());
    }

    @Test
    public void checkInGoesToCheckedIn() {
        Booking b = confirmed();
        b.checkIn();
        assertTrue(b.getState() instanceof CheckedInState);
        assertEquals(BookingStatus.CHECKED_IN, b.getStatus());
    }

    @Test
    public void markNoShowGoesToNoShow() {
        Booking b = confirmed();
        b.markNoShow();
        assertTrue(b.getState() instanceof NoShowState);
        assertEquals(BookingStatus.NO_SHOW, b.getStatus());
    }

    @Test
    public void cancelGoesToCancelled() {
        Booking b = confirmed();
        state.cancel(b);
        assertTrue(b.getState() instanceof CancelledState);
    }

    @Test
    public void cannotConfirmDepositTwice() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotExtendYet() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.extend(new Booking("b1", new Room(1))));
    }

    @Test
    public void confirmDepositErrorMessage() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(new Booking("b1", new Room(1))));
        assertEquals("Cannot confirm deposit a booking in state CONFIRMED.", e.getMessage());
    }

    @Test
    public void checkInDirectlyOnState() {
        Booking b = confirmed();
        state.checkIn(b);
        assertTrue(b.getState() instanceof CheckedInState);
    }

    @Test
    public void markNoShowDirectlyOnState() {
        Booking b = confirmed();
        state.markNoShow(b);
        assertTrue(b.getState() instanceof NoShowState);
    }

    @Test
    public void failedExtendKeepsItConfirmed() {
        Booking b = confirmed();
        assertThrows(IllegalBookingTransitionException.class, () -> state.extend(b));
        assertEquals(BookingStatus.CONFIRMED, b.getStatus());
    }
}
