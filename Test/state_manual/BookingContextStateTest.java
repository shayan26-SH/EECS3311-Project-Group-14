package Test.state_manual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.PendingState;

// Drives the states through Booking (the way the rest of the app uses them),
// and checks that transitions also notify the observers.
public class BookingContextStateTest {

    // small observer that just records the status changes it receives
    private static class RecordingObserver implements BookingObserver {
        final List<BookingStatus> oldStatuses = new ArrayList<>();
        final List<BookingStatus> newStatuses = new ArrayList<>();

        @Override
        public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus,
                                           BookingStatus newStatus) {
            oldStatuses.add(oldStatus);
            newStatuses.add(newStatus);
        }
    }

    private Booking newBooking() {
        return new Booking("b1", new Room(1));
    }

    @Test
    public void fullHappyPath() {
        Booking b = newBooking();
        assertTrue(b.getState() instanceof PendingState);
        b.confirmDeposit();
        assertTrue(b.getState() instanceof ConfirmedState);
        b.checkIn();
        assertTrue(b.getState() instanceof CheckedInState);
        b.extend();
        assertTrue(b.getState() instanceof ExtendedState);
    }

    @Test
    public void getStatusMatchesCurrentState() {
        Booking b = newBooking();
        assertEquals(b.getState().getStatus(), b.getStatus());
        b.confirmDeposit();
        assertEquals(b.getState().getStatus(), b.getStatus());
    }

    @Test
    public void transitionNotifiesObserver() {
        Booking b = newBooking();
        RecordingObserver obs = new RecordingObserver();
        b.addObserver(obs);

        b.confirmDeposit();

        assertEquals(1, obs.newStatuses.size());
        assertEquals(BookingStatus.PENDING, obs.oldStatuses.get(0));
        assertEquals(BookingStatus.CONFIRMED, obs.newStatuses.get(0));
    }

    @Test
    public void removedObserverGetsNothing() {
        Booking b = newBooking();
        RecordingObserver obs = new RecordingObserver();
        b.addObserver(obs);
        b.removeObserver(obs);
        b.confirmDeposit();
        assertTrue(obs.newStatuses.isEmpty());
    }

    @Test
    public void observerSeesEveryStepInAChain() {
        Booking b = newBooking();
        RecordingObserver obs = new RecordingObserver();
        b.addObserver(obs);

        b.confirmDeposit();
        b.checkIn();
        b.extend();

        assertEquals(List.of(BookingStatus.CONFIRMED, BookingStatus.CHECKED_IN,
                BookingStatus.EXTENDED), obs.newStatuses);
    }

    @Test
    public void setStatusRebuildsTheState() {
        Booking b = newBooking();
        b.setStatus(BookingStatus.CHECKED_IN);
        assertTrue(b.getState() instanceof CheckedInState);
        assertEquals(BookingStatus.CHECKED_IN, b.getStatus());
    }

    @Test
    public void setStatusNotifiesObserver() {
        Booking b = newBooking();
        RecordingObserver obs = new RecordingObserver();
        b.addObserver(obs);
        b.setStatus(BookingStatus.CONFIRMED);
        assertEquals(BookingStatus.CONFIRMED, obs.newStatuses.get(0));
    }

    @Test
    public void changeStateRejectsNull() {
        assertThrows(IllegalArgumentException.class, () -> newBooking().changeState(null));
    }

    @Test
    public void illegalActionBubblesUpFromBooking() {
        assertThrows(IllegalBookingTransitionException.class, () -> newBooking().checkIn());
    }

    @Test
    public void cancelFromPendingWorks() {
        Booking b = newBooking();
        assertTrue(b.cancel());
        assertEquals(BookingStatus.CANCELLED, b.getStatus());
    }

    @Test
    public void extendWithHoursWorksWhenActive() {
        Booking b = newBooking();
        b.confirmDeposit();
        b.checkIn();
        assertTrue(b.extend(1.5f));
        assertEquals(BookingStatus.EXTENDED, b.getStatus());
    }

    @Test
    public void extendWithZeroHoursIsRejected() {
        Booking b = newBooking();
        b.confirmDeposit();
        b.checkIn();
        assertThrows(IllegalArgumentException.class, () -> b.extend(0f));
        assertEquals(BookingStatus.CHECKED_IN, b.getStatus());
    }
}
