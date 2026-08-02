package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.AbstractBookingState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

public class AbstractBookingStateTest {

    /*
     * Test-only concrete implementation because AbstractBookingState
     * cannot be instantiated directly.
     */
    private static class TestBookingState extends AbstractBookingState {

        @Override
        public BookingStatus getStatus() {
            return BookingStatus.CANCELLED;
        }
    }

    private final TestBookingState state = new TestBookingState();

    @Test
    public void testConfirmDepositIsRejectedByDefault() {

        IllegalBookingTransitionException exception = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.confirmDeposit(null));

        assertEquals(
                "Cannot confirm deposit a booking in state CANCELLED.",
                exception.getMessage());
    }

    @Test
    public void testCheckInIsRejectedByDefault() {

        IllegalBookingTransitionException exception = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.checkIn(null));

        assertEquals(
                "Cannot check in a booking in state CANCELLED.",
                exception.getMessage());
    }

    @Test
    public void testMarkNoShowIsRejectedByDefault() {

        IllegalBookingTransitionException exception = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.markNoShow(null));

        assertEquals(
                "Cannot mark no-show a booking in state CANCELLED.",
                exception.getMessage());
    }

    @Test
    public void testCancelIsRejectedByDefault() {

        IllegalBookingTransitionException exception = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.cancel(null));

        assertEquals(
                "Cannot cancel a booking in state CANCELLED.",
                exception.getMessage());
    }

    @Test
    public void testExtendIsRejectedByDefault() {

        IllegalBookingTransitionException exception = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.extend(null));

        assertEquals(
                "Cannot extend a booking in state CANCELLED.",
                exception.getMessage());
    }
}