package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.AbstractBookingState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

public class AbstractBookingStateTest {

    // dummy state that doesn't override anything, so every action falls back
    // to the abstract class's default (which rejects)
    private static class DummyState extends AbstractBookingState {
        @Override
        public BookingStatus getStatus() {
            return BookingStatus.ACTIVE;
        }
    }

    private final DummyState state = new DummyState();

    @Test
    public void getStatusUsesSubclassValue() {
        assertEquals(BookingStatus.ACTIVE, state.getStatus());
    }

    @Test
    public void confirmDepositRejected() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.confirmDeposit(null));
        assertEquals("Cannot confirm deposit a booking in state ACTIVE.", e.getMessage());
    }

    @Test
    public void checkInRejected() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.checkIn(null));
        assertEquals("Cannot check in a booking in state ACTIVE.", e.getMessage());
    }

    @Test
    public void markNoShowRejected() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.markNoShow(null));
        assertEquals("Cannot mark no-show a booking in state ACTIVE.", e.getMessage());
    }

    @Test
    public void cancelRejected() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.cancel(null));
        assertEquals("Cannot cancel a booking in state ACTIVE.", e.getMessage());
    }

    @Test
    public void extendRejected() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> state.extend(null));
        assertEquals("Cannot extend a booking in state ACTIVE.", e.getMessage());
    }

    @Test
    public void messageChangesWithStatus() {
        AbstractBookingState confirmedLike = new AbstractBookingState() {
            @Override
            public BookingStatus getStatus() {
                return BookingStatus.CONFIRMED;
            }
        };
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class, () -> confirmedLike.cancel(null));
        assertEquals("Cannot cancel a booking in state CONFIRMED.", e.getMessage());
    }

    @Test
    public void allActionsThrowSameType() {
        assertThrows(IllegalBookingTransitionException.class, () -> state.confirmDeposit(null));
        assertThrows(IllegalBookingTransitionException.class, () -> state.checkIn(null));
        assertThrows(IllegalBookingTransitionException.class, () -> state.markNoShow(null));
        assertThrows(IllegalBookingTransitionException.class, () -> state.cancel(null));
        assertThrows(IllegalBookingTransitionException.class, () -> state.extend(null));
    }

    @Test
    public void nullBookingStillThrowsTransitionError() {
        // passing null doesn't cause an NPE, it rejects before touching the booking
        assertThrows(IllegalBookingTransitionException.class, () -> state.extend(null));
    }

    @Test
    public void differentActionsGiveDifferentMessages() {
        String checkIn = assertThrows(IllegalBookingTransitionException.class,
                () -> state.checkIn(null)).getMessage();
        String extend = assertThrows(IllegalBookingTransitionException.class,
                () -> state.extend(null)).getMessage();
        assertFalse(checkIn.equals(extend));
    }
}
