package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

// Cancelled is a dead end - nothing else is allowed after this.
public class CancelledStateTest {

    private final CancelledState state = new CancelledState();

    private Booking cancelled() {
        Booking b = new Booking("b1", new Room(1));
        b.cancel();
        return b;
    }

    @Test
    public void statusIsCancelled() {
        assertEquals(BookingStatus.CANCELLED, state.getStatus());
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
    public void cannotCancelAgain() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.cancel(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotExtend() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.extend(new Booking("b1", new Room(1))));
    }

    @Test
    public void errorMessageMentionsCancelled() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.extend(new Booking("b1", new Room(1))));
        assertEquals("Cannot extend a booking in state CANCELLED.", e.getMessage());
    }

    @Test
    public void bookingEndsUpCancelled() {
        assertEquals(BookingStatus.CANCELLED, cancelled().getStatus());
    }

    @Test
    public void cancellingTwiceReturnsFalse() {
        Booking b = cancelled();
        assertFalse(b.cancel());
        assertEquals(BookingStatus.CANCELLED, b.getStatus());
    }

    @Test
    public void cannotEditACancelledBooking() {
        assertFalse(cancelled().edit(new Room(2)));
    }
}
