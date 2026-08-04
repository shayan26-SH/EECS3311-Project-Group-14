package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.BookingState;
import Chief_event_coordinator.State.BookingStateFactory;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.NoShowState;
import Chief_event_coordinator.State.PendingState;

// The factory rebuilds a state object from a saved status (used when loading from CSV).
public class BookingStateFactoryTest {

    @Test
    public void pendingMapsToPendingState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.PENDING) instanceof PendingState);
    }

    @Test
    public void activeAlsoMapsToPendingState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.ACTIVE) instanceof PendingState);
    }

    @Test
    public void confirmedMapsToConfirmedState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.CONFIRMED) instanceof ConfirmedState);
    }

    @Test
    public void checkedInMapsToCheckedInState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.CHECKED_IN) instanceof CheckedInState);
    }

    @Test
    public void extendedMapsToExtendedState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.EXTENDED) instanceof ExtendedState);
    }

    @Test
    public void cancelledMapsToCancelledState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.CANCELLED) instanceof CancelledState);
    }

    @Test
    public void noShowMapsToNoShowState() {
        assertTrue(BookingStateFactory.fromStatus(BookingStatus.NO_SHOW) instanceof NoShowState);
    }

    @Test
    public void statusSurvivesRoundTrip() {
        for (BookingStatus s : BookingStatus.values()) {
            BookingStatus back = BookingStateFactory.fromStatus(s).getStatus();
            // ACTIVE has no state of its own, it comes back as PENDING
            assertEquals(s == BookingStatus.ACTIVE ? BookingStatus.PENDING : s, back);
        }
    }

    @Test
    public void everyStatusGivesAState() {
        for (BookingStatus s : BookingStatus.values()) {
            assertNotNull(BookingStateFactory.fromStatus(s));
        }
    }

    @Test
    public void confirmedAndCheckedInAreDifferentTypes() {
        BookingState a = BookingStateFactory.fromStatus(BookingStatus.CONFIRMED);
        BookingState b = BookingStateFactory.fromStatus(BookingStatus.CHECKED_IN);
        assertFalse(a.getClass().equals(b.getClass()));
    }
}
