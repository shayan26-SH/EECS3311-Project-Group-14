package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.PendingState;

// Tests for PendingState. From pending you can only pay the deposit or cancel.
public class PendingStateTest {

    private PendingState state;
    private Booking booking;

    @BeforeEach
    public void setUp() {
        state = new PendingState();
        booking = new Booking("b1", new Room(1));
    }

    @Test
    public void statusIsPending() {
        assertEquals(BookingStatus.PENDING, state.getStatus());
    }

    @Test
    public void newBookingIsPending() {
        assertTrue(booking.getState() instanceof PendingState);
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void confirmDepositGoesToConfirmed() {
        state.confirmDeposit(booking);
        assertTrue(booking.getState() instanceof ConfirmedState);
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    public void cancelGoesToCancelled() {
        state.cancel(booking);
        assertTrue(booking.getState() instanceof CancelledState);
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    public void cannotCheckIn() {
        assertThrows(IllegalBookingTransitionException.class, () -> state.checkIn(booking));
    }

    @Test
    public void cannotMarkNoShow() {
        assertThrows(IllegalBookingTransitionException.class, () -> state.markNoShow(booking));
    }

    @Test
    public void cannotExtend() {
        assertThrows(IllegalBookingTransitionException.class, () -> state.extend(booking));
    }

    @Test
    public void checkInErrorMessageMentionsPending() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.checkIn(booking));
        assertEquals("Cannot check in a booking in state PENDING.", e.getMessage());
    }

    @Test
    public void illegalActionLeavesBookingPending() {
        assertThrows(IllegalBookingTransitionException.class, () -> state.extend(booking));
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void bookingCancelReturnsTrue() {
        assertTrue(booking.cancel());
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }
}
