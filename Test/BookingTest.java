package Test;

import static org.junit.Assert.*;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class BookingTest {
    private static class RecordingObserver implements BookingObserver {
        private final List<String> events = new ArrayList<String>();

        @Override
        public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus) {
            events.add(oldStatus + " -> " + newStatus + " for " + booking.getBookingid());
        }
    }

    @Test
    public void newBookingStartsPendingWithSelectedRoom() {
        Room selectedRoom = new Room(101);
        Booking booking = new Booking("B-101", selectedRoom);

        assertEquals("B-101", booking.getBookingid());
        assertEquals(selectedRoom, booking.getRoomName());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void bookingIdCannotBeOnlySpaces() {
        new Booking("   ", new Room(102));
    }

    @Test
    public void bookingIdSetterCanRenameExistingBooking() {
        Booking booking = new Booking("B-OLD", new Room(103));

        booking.setBookingid("B-RENAMED");

        assertEquals("B-RENAMED", booking.getBookingid());
    }

    @Test(expected = IllegalArgumentException.class)
    public void bookingMustHaveARoom() {
        new Booking("B-NULL-ROOM", null);
    }

    @Test
    public void bookingCanBeMovedToAnotherRoomBeforeCancellation() {
        Booking booking = new Booking("B-MOVE", new Room(201));
        Room replacementRoom = new Room(202);

        assertTrue(booking.edit(replacementRoom));

        assertEquals(replacementRoom, booking.getRoomName());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void directRoomSetterReplacesRoomReference() {
        Booking booking = new Booking("B-SET-ROOM", new Room(203));
        Room replacementRoom = new Room(204);

        booking.setRoomName(replacementRoom);

        assertEquals(replacementRoom, booking.getRoomName());
    }

    @Test
    public void editRejectsNullRoomAndKeepsCurrentRoom() {
        Room currentRoom = new Room(205);
        Booking booking = new Booking("B-NULL-EDIT", currentRoom);

        assertFalse(booking.edit(null));

        assertEquals(currentRoom, booking.getRoomName());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void cancelledBookingKeepsOriginalRoomWhenEditIsAttempted() {
        Room originalRoom = new Room(301);
        Booking booking = new Booking("B-CANCELLED-EDIT", originalRoom);
        booking.cancel();

        assertFalse(booking.edit(new Room(302)));

        assertEquals(originalRoom, booking.getRoomName());
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    public void cancelChangesPendingBookingToCancelled() {
        Booking booking = new Booking("B-CANCEL", new Room(401));

        assertTrue(booking.cancel());

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    public void cancellingAlreadyCancelledBookingReturnsFalse() {
        Booking booking = new Booking("B-DOUBLE-CANCEL", new Room(402));
        booking.cancel();

        assertFalse(booking.cancel());

        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test
    public void confirmedBookingCanStillCancelBeforeCheckIn() {
        Booking booking = new Booking("B-CONFIRMED-CANCEL", new Room(403));

        booking.confirmDeposit();

        assertTrue(booking.cancel());
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test(expected = IllegalBookingTransitionException.class)
    public void checkedInBookingCannotBeCancelled() {
        Booking booking = new Booking("B-CHECKED-IN-CANCEL", new Room(404));

        booking.confirmDeposit();
        booking.checkIn();
        booking.cancel();
    }

    @Test
    public void bookingCanFollowFullSuccessfulLifecycle() {
        Booking booking = new Booking("B-LIFECYCLE", new Room(501));

        booking.confirmDeposit();
        booking.checkIn();
        assertTrue(booking.extend(2.0f));

        assertEquals(BookingStatus.EXTENDED, booking.getStatus());
    }

    @Test
    public void extendedBookingCanBeExtendedAgain() {
        Booking booking = new Booking("B-REPEAT-EXTEND", new Room(504));

        booking.confirmDeposit();
        booking.checkIn();
        assertTrue(booking.extend(1.0f));
        assertTrue(booking.extend(0.5f));

        assertEquals(BookingStatus.EXTENDED, booking.getStatus());
    }

    @Test(expected = IllegalBookingTransitionException.class)
    public void pendingBookingCannotSkipStraightToExtension() {
        Booking booking = new Booking("B-SKIP", new Room(502));

        booking.extend(1.0f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void extensionDurationMustBePositive() {
        Booking booking = new Booking("B-BAD-DURATION", new Room(503));

        booking.extend(0.0f);
    }

    @Test
    public void observerReceivesExactStatusChangesInOrder() {
        Booking booking = new Booking("B-OBSERVE", new Room(601));
        RecordingObserver observer = new RecordingObserver();
        booking.addObserver(observer);

        booking.confirmDeposit();
        booking.checkIn();
        booking.extend();

        assertEquals(3, observer.events.size());
        assertEquals("PENDING -> CONFIRMED for B-OBSERVE", observer.events.get(0));
        assertEquals("CONFIRMED -> CHECKED_IN for B-OBSERVE", observer.events.get(1));
        assertEquals("CHECKED_IN -> EXTENDED for B-OBSERVE", observer.events.get(2));
    }

    @Test
    public void observerReceivesSetStatusTransitionFromPersistenceRestore() {
        Booking booking = new Booking("B-RESTORE-OBS", new Room(603));
        RecordingObserver observer = new RecordingObserver();
        booking.addObserver(observer);

        booking.setStatus(BookingStatus.CONFIRMED);

        assertEquals(1, observer.events.size());
        assertEquals("PENDING -> CONFIRMED for B-RESTORE-OBS", observer.events.get(0));
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
    }

    @Test
    public void twoObserversBothReceiveTheSameTransition() {
        Booking booking = new Booking("B-TWO-OBS", new Room(604));
        RecordingObserver firstObserver = new RecordingObserver();
        RecordingObserver secondObserver = new RecordingObserver();
        booking.addObserver(firstObserver);
        booking.addObserver(secondObserver);

        booking.confirmDeposit();

        assertEquals(firstObserver.events, secondObserver.events);
        assertEquals("PENDING -> CONFIRMED for B-TWO-OBS", firstObserver.events.get(0));
    }

    @Test
    public void removedObserverDoesNotSeeFutureChanges() {
        Booking booking = new Booking("B-REMOVE-OBS", new Room(602));
        RecordingObserver observer = new RecordingObserver();
        booking.addObserver(observer);

        booking.confirmDeposit();
        booking.removeObserver(observer);
        booking.checkIn();

        assertEquals(1, observer.events.size());
        assertEquals("PENDING -> CONFIRMED for B-REMOVE-OBS", observer.events.get(0));
        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
    }

    @Test
    public void noShowBookingCannotCheckInLater() {
        Booking booking = new Booking("B-NO-SHOW", new Room(701));

        booking.confirmDeposit();
        booking.markNoShow();

        try {
            booking.checkIn();
            fail("A no-show booking should not allow check-in later.");
        } catch (IllegalBookingTransitionException ex) {
            assertTrue(ex.getMessage().contains("NO_SHOW"));
        }
    }

    @Test(expected = IllegalBookingTransitionException.class)
    public void pendingBookingCannotBeMarkedNoShowBeforeConfirmation() {
        Booking booking = new Booking("B-EARLY-NOSHOW", new Room(702));

        booking.markNoShow();
    }

    @Test(expected = IllegalBookingTransitionException.class)
    public void cancelledBookingCannotBeConfirmedAgain() {
        Booking booking = new Booking("B-CANCELLED-CONFIRM", new Room(703));

        booking.cancel();
        booking.confirmDeposit();
    }

    @Test
    public void restoredCheckedInBookingCanStillBeExtended() {
        Booking booking = new Booking("B-RESTORED", new Room(801));
        booking.setStatus(BookingStatus.CHECKED_IN);

        assertTrue(booking.extend(1.5f));

        assertEquals(BookingStatus.EXTENDED, booking.getStatus());
    }

    @Test
    public void legacyActiveStatusRestoresAsPendingBooking() {
        Booking booking = new Booking("B-LEGACY-ACTIVE", new Room(802));

        booking.setStatus(BookingStatus.ACTIVE);

        assertEquals(BookingStatus.PENDING, booking.getStatus());
        assertTrue(booking.cancel());
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
    }

    @Test(expected = IllegalArgumentException.class)
    public void changeStateRejectsNullState() {
        Booking booking = new Booking("B-NULL-STATE", new Room(803));

        booking.changeState(null);
    }
}
