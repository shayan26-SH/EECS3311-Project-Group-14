package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Observer.AdminDashboardObserver;
import Chief_event_coordinator.Observer.BookingObserver;
import Chief_event_coordinator.Observer.BookingStatus;
import Chief_event_coordinator.Observer.Payment;
import Chief_event_coordinator.Observer.PaymentNotificationObserver;
import Chief_event_coordinator.Observer.RoomAvailabilityObserver;
import Chief_event_coordinator.Observer.StubPayment;
import Chief_event_coordinator.Observer.UserNotificationObserver;
import Chief_event_coordinator.State.BookingState;
import Chief_event_coordinator.State.BookingStateFactory;
import Chief_event_coordinator.State.CancelledState;
import Chief_event_coordinator.State.CheckedInState;
import Chief_event_coordinator.State.ConfirmedState;
import Chief_event_coordinator.State.ExtendedState;
import Chief_event_coordinator.State.IllegalBookingTransitionException;
import Chief_event_coordinator.State.NoShowState;
import Chief_event_coordinator.State.PendingState;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BookingStateObserverTest {

    @Test
    void bookingConstructorsObserversAndAccessorsWork() {
        Room firstRoom = new Room(501);
        assertThrows(
                IllegalArgumentException.class,
                () -> new Booking(null, firstRoom));
        assertThrows(
                IllegalArgumentException.class,
                () -> new Booking(" ", firstRoom));
        assertThrows(
                IllegalArgumentException.class,
                () -> new Booking("B1", (Room) null));

        Booking booking = new Booking("B1", firstRoom);
        assertNull(booking.getRegisteredUser());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
        assertInstanceOf(PendingState.class, booking.getState());

        RecordingObserver observer = new RecordingObserver();
        booking.addObserver(observer);
        booking.notifyObservers(null, BookingStatus.PENDING);
        assertEquals("null->PENDING", observer.transitions.get(0));
        booking.removeObserver(observer);
        booking.confirmDeposit();
        assertEquals(1, observer.transitions.size());

        booking.setBookingid("B1-UPDATED");
        booking.setRegisteredUser(null);
        Room secondRoom = new Room(502);
        booking.setRoomName(secondRoom);
        assertEquals("B1-UPDATED", booking.getBookingid());
        assertNull(booking.getRegisteredUser());
        assertSame(secondRoom, booking.getRoomName());
        assertThrows(IllegalArgumentException.class, () -> booking.changeState(null));
    }

    @Test
    void legalStateTransitionsAndRepeatedExtensionNotifyObservers() {
        Booking booking = new Booking("STATE-1", new Room(503));
        RecordingObserver observer = new RecordingObserver();
        booking.addObserver(observer);

        booking.confirmDeposit();
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        booking.checkIn();
        assertEquals(BookingStatus.CHECKED_IN, booking.getStatus());
        booking.extend();
        assertEquals(BookingStatus.EXTENDED, booking.getStatus());
        assertTrue(booking.extend(2.0f));
        assertEquals(BookingStatus.EXTENDED, booking.getStatus());
        assertEquals(4, observer.transitions.size());

        assertThrows(IllegalBookingTransitionException.class, booking::cancel);

        Booking noShow = new Booking("STATE-2", new Room(504));
        noShow.confirmDeposit();
        noShow.markNoShow();
        assertEquals(BookingStatus.NO_SHOW, noShow.getStatus());
    }

    @Test
    void editCancelAndDurationValidationCoverAlternativeBookingPaths() {
        Booking booking = new Booking("EDIT-1", new Room(505));
        assertFalse(booking.edit(null));
        Room replacement = new Room(506);
        assertTrue(booking.edit(replacement));
        assertSame(replacement, booking.getRoomName());
        assertTrue(captureOutput(booking::edit).contains("Editing booking"));
        assertThrows(IllegalArgumentException.class, () -> booking.extend(0));

        assertTrue(booking.cancel());
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
        assertFalse(booking.cancel());
        assertFalse(booking.edit(new Room(507)));
        assertTrue(captureOutput(booking::edit).contains("cannot be edited"));
        assertFalse(booking.extend(1.0f));
    }

    @Test
    void stateFactoryMapsEveryPersistedStatusAndTerminalStateRejectsActions() {
        assertInstanceOf(
                PendingState.class,
                BookingStateFactory.fromStatus(BookingStatus.ACTIVE));
        assertInstanceOf(
                PendingState.class,
                BookingStateFactory.fromStatus(BookingStatus.PENDING));
        assertInstanceOf(
                ConfirmedState.class,
                BookingStateFactory.fromStatus(BookingStatus.CONFIRMED));
        assertInstanceOf(
                CheckedInState.class,
                BookingStateFactory.fromStatus(BookingStatus.CHECKED_IN));
        assertInstanceOf(
                ExtendedState.class,
                BookingStateFactory.fromStatus(BookingStatus.EXTENDED));
        assertInstanceOf(
                CancelledState.class,
                BookingStateFactory.fromStatus(BookingStatus.CANCELLED));
        assertInstanceOf(
                NoShowState.class,
                BookingStateFactory.fromStatus(BookingStatus.NO_SHOW));

        Booking booking = new Booking("TERMINAL", new Room(508));
        BookingState terminal = new CancelledState();
        assertThrows(
                IllegalBookingTransitionException.class,
                () -> terminal.confirmDeposit(booking));
        assertThrows(
                IllegalBookingTransitionException.class,
                () -> terminal.checkIn(booking));
        assertThrows(
                IllegalBookingTransitionException.class,
                () -> terminal.markNoShow(booking));
        assertThrows(
                IllegalBookingTransitionException.class,
                () -> terminal.cancel(booking));
        IllegalBookingTransitionException error = assertThrows(
                IllegalBookingTransitionException.class,
                () -> terminal.extend(booking));
        assertTrue(error.getMessage().contains("CANCELLED"));
    }

    @Test
    void roomAndDashboardObserversReactOnlyToRelevantTransitions() {
        Room room = new Room(509);
        Booking booking = new Booking("OBS-1", room);
        RoomAvailabilityObserver roomObserver = new RoomAvailabilityObserver(room);
        AdminDashboardObserver dashboard = new AdminDashboardObserver(
                new Administrator("Admin", "admin@yorku.ca"));
        booking.addObserver(roomObserver);
        booking.addObserver(dashboard);

        dashboard.onBookingStatusChanged(booking, null, BookingStatus.PENDING);
        assertTrue(dashboard.getActivityLog().get(0).contains("created"));

        booking.confirmDeposit();
        assertEquals(RoomStatus.OCCUPIED, room.getStatus());
        booking.checkIn();
        assertEquals(RoomStatus.OCCUPIED, room.getStatus());
        booking.setStatus(BookingStatus.CANCELLED);
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());

        room.setStatus(RoomStatus.MAINTENANCE);
        booking.setStatus(BookingStatus.CONFIRMED);
        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
        booking.setStatus(BookingStatus.NO_SHOW);
        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());

        Booking otherRoomBooking = new Booking("OBS-OTHER", new Room(510));
        room.setStatus(RoomStatus.AVAILABLE);
        roomObserver.onBookingStatusChanged(
                otherRoomBooking,
                BookingStatus.PENDING,
                BookingStatus.CONFIRMED);
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
        assertTrue(dashboard.getActivityLog().size() >= 6);
    }

    @Test
    void paymentAndUserObserversHandleEveryStatusBranch() {
        Booking booking = new Booking("OBS-2", new Room(511));
        RecordingPayment successful = new RecordingPayment(true, true);
        PaymentNotificationObserver paymentObserver = new PaymentNotificationObserver(
                successful);
        paymentObserver.onBookingStatusChanged(
                booking,
                BookingStatus.PENDING,
                BookingStatus.CONFIRMED);
        paymentObserver.onBookingStatusChanged(
                booking,
                BookingStatus.CONFIRMED,
                BookingStatus.CANCELLED);
        paymentObserver.onBookingStatusChanged(
                booking,
                BookingStatus.CONFIRMED,
                BookingStatus.NO_SHOW);
        paymentObserver.onBookingStatusChanged(
                booking,
                BookingStatus.CHECKED_IN,
                BookingStatus.EXTENDED);
        assertEquals(1, successful.chargeCalls);
        assertEquals(1, successful.refundCalls);

        RecordingPayment failing = new RecordingPayment(false, false);
        PaymentNotificationObserver failingObserver = new PaymentNotificationObserver(
                failing);
        failingObserver.onBookingStatusChanged(
                booking,
                BookingStatus.PENDING,
                BookingStatus.CONFIRMED);
        failingObserver.onBookingStatusChanged(
                booking,
                BookingStatus.CONFIRMED,
                BookingStatus.CANCELLED);
        assertEquals(1, failing.chargeCalls);
        assertEquals(1, failing.refundCalls);

        StubPayment stub = new StubPayment();
        assertTrue(stub.charge(4.0));
        assertTrue(stub.refund(4.0));

        UserNotificationObserver userObserver = new UserNotificationObserver(
                "alice@yorku.ca");
        String output = captureOutput(() -> {
            for (BookingStatus status : new BookingStatus[] {
                    BookingStatus.CONFIRMED,
                    BookingStatus.CANCELLED,
                    BookingStatus.EXTENDED,
                    BookingStatus.CHECKED_IN,
                    BookingStatus.NO_SHOW,
                    BookingStatus.PENDING,
            }) {
                userObserver.onBookingStatusChanged(
                        booking,
                        BookingStatus.PENDING,
                        status);
            }
        });
        assertTrue(output.contains("is confirmed"));
        assertTrue(output.contains("has been cancelled"));
        assertTrue(output.contains("has been extended"));
        assertTrue(output.contains("checked in"));
        assertTrue(output.contains("no-show"));
        assertTrue(output.contains("status changed to PENDING"));
    }

    private static String captureOutput(Runnable action) {
        PrintStream original = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(output));
            action.run();
            return output.toString();
        } finally {
            System.setOut(original);
        }
    }

    private static final class RecordingObserver implements BookingObserver {

        private final List<String> transitions = new ArrayList<String>();

        @Override
        public void onBookingStatusChanged(
                Booking booking,
                BookingStatus oldStatus,
                BookingStatus newStatus) {
            transitions.add(String.valueOf(oldStatus) + "->" + newStatus);
        }
    }

    private static final class RecordingPayment implements Payment {

        private final boolean chargeResult;
        private final boolean refundResult;
        private int chargeCalls;
        private int refundCalls;

        private RecordingPayment(boolean chargeResult, boolean refundResult) {
            this.chargeResult = chargeResult;
            this.refundResult = refundResult;
        }

        @Override
        public boolean charge(double amount) {
            chargeCalls++;
            return chargeResult;
        }

        @Override
        public boolean refund(double amount) {
            refundCalls++;
            return refundResult;
        }
    }
}