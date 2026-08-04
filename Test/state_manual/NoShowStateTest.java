package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.NoShowState;

public class NoShowStateTest {

    private final NoShowState state = new NoShowState();

    private Booking noShow() {
        Booking b = new Booking("b1", new Room(1));
        b.confirmDeposit();
        b.markNoShow();
        return b;
    }

    @Test
    public void statusIsNoShow() {
        assertEquals(BookingStatus.NO_SHOW, state.getStatus());
    }

    @Test
    public void bookingEndsUpNoShow() {
        Booking b = noShow();
        assertTrue(b.getState() instanceof NoShowState);
        assertEquals(BookingStatus.NO_SHOW, b.getStatus());
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
    public void cannotMarkNoShowAgain() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.markNoShow(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotCancel() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.cancel(new Booking("b1", new Room(1))));
    }

    @Test
    public void cannotExtend() {
        assertThrows(IllegalBookingTransitionException.class,
                () -> state.extend(new Booking("b1", new Room(1))));
    }

    @Test
    public void errorMessageMentionsNoShow() {
        IllegalBookingTransitionException e = assertThrows(
                IllegalBookingTransitionException.class,
                () -> state.checkIn(new Booking("b1", new Room(1))));
        assertEquals("Cannot check in a booking in state NO_SHOW.", e.getMessage());
    }

    @Test
    public void nothingWorksAfterNoShow() {
        Booking b = noShow();
        assertThrows(IllegalBookingTransitionException.class, () -> b.checkIn());
        assertThrows(IllegalBookingTransitionException.class, () -> b.extend());
        assertEquals(BookingStatus.NO_SHOW, b.getStatus());
    }

    @Test
    public void twoInstancesHaveSameStatus() {
        assertEquals(new NoShowState().getStatus(), new NoShowState().getStatus());
    }
}
