package Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import AccountType.AccountType;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.Classes.RoomStatus;
import Chief_event_coordinator.Command.AddRoomCommand;
import Chief_event_coordinator.Command.BookRoomCommand;
import Chief_event_coordinator.Command.CancelBookingCommand;
import Chief_event_coordinator.Command.CloseRoomCommand;
import Chief_event_coordinator.Command.CommandInvoker;
import Chief_event_coordinator.Command.DisableRoomCommand;
import Chief_event_coordinator.Command.EnableRoomCommand;
import Chief_event_coordinator.Command.ExtendBookingCommand;
import Chief_event_coordinator.Command.ModifyBookingCommand;
import Chief_event_coordinator.Observer.BookingStatus;
import User.RegisteredUser;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CommandPatternTest {

    private Administrator admin;
    private RegisteredUser user;
    private CommandInvoker invoker;

    @BeforeEach
    void setUp() {
        admin = new Administrator(
                "John Admin",
                "admin@yorku.ca"
        );

        AccountType student =
                new AccountType("Student", 20.0f, true);

        user = new RegisteredUser(
                "Alice",
                "alice@yorku.ca",
                "Password123!",
                student,
                12345
        );

        invoker = new CommandInvoker();
    }

    @Test
    void executeCommandDoesNothingWhenNoCommandIsAssigned() {
        assertDoesNotThrow(() -> invoker.executeCommand());
    }

    @Test
    void addRoomCommandAddsRoom() {
        Room room = new Room(101);

        invoker.setCommand(new AddRoomCommand(admin, room));
        invoker.executeCommand();

        // Administrator does not expose its room map, so verify
        // that the command executes without throwing an exception.
        assertDoesNotThrow(() -> admin.viewRoomStatus(room));
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    }

    @Test
    void disableRoomCommandDisablesRoom() {
        Room room = new Room(102);

        invoker.setCommand(new DisableRoomCommand(admin, room));
        invoker.executeCommand();

        assertEquals(RoomStatus.DISABLED, room.getStatus());
    }

    @Test
    void enableRoomCommandEnablesDisabledRoom() {
        Room room = new Room(103);
        admin.disableRoom(room);

        invoker.setCommand(new EnableRoomCommand(admin, room));
        invoker.executeCommand();

        assertEquals(RoomStatus.AVAILABLE, room.getStatus());
    }

    @Test
    void closeRoomCommandUsesDefaultMaintenanceReason() {
        Room room = new Room(104);

        invoker.setCommand(new CloseRoomCommand(admin, room));
        invoker.executeCommand();

        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
        assertEquals("Maintenance", room.getClosureReason());
    }

    @Test
    void closeRoomCommandUsesCustomMaintenanceReason() {
        Room room = new Room(105);

        invoker.setCommand(
                new CloseRoomCommand(
                        admin,
                        room,
                        "Projector repair"
                )
        );
        invoker.executeCommand();

        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
        assertEquals(
                "Projector repair",
                room.getClosureReason()
        );
    }

    @Test
    void bookRoomCommandCreatesBooking() {
        Room room = new Room(106);

        assertTrue(user.viewBookings().isEmpty());

        invoker.setCommand(new BookRoomCommand(user, room));
        invoker.executeCommand();

        assertEquals(1, user.viewBookings().size());

        Booking booking = user.viewBookings().get(0);

        assertEquals("B1", booking.getBookingid());
        assertEquals(room, booking.getRoomName());
        assertEquals(user, booking.getRegisteredUser());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    void modifyBookingCommandModifiesOwnedBooking() {
        Room room = new Room(107);
        Booking booking = user.bookRoom(room);

        invoker.setCommand(
                new ModifyBookingCommand(user, booking)
        );
        invoker.executeCommand();

        assertTrue(user.modifyBooking(booking));
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    void modifyBookingCommandDoesNotModifyUnownedBooking() {
        Booking unownedBooking =
                new Booking("OUTSIDE-1", new Room(108));

        invoker.setCommand(
                new ModifyBookingCommand(user, unownedBooking)
        );
        invoker.executeCommand();

        assertFalse(user.modifyBooking(unownedBooking));
        assertEquals(
                BookingStatus.PENDING,
                unownedBooking.getStatus()
        );
    }

    @Test
    void extendBookingCommandExtendsCheckedInBooking() {
        Booking booking = user.bookRoom(new Room(109));

        booking.confirmDeposit();
        booking.checkIn();

        invoker.setCommand(
                new ExtendBookingCommand(
                        user,
                        booking,
                        2.0f
                )
        );
        invoker.executeCommand();

        assertEquals(
                BookingStatus.EXTENDED,
                booking.getStatus()
        );
    }

    @Test
    void extendBookingCommandDoesNotExtendUnownedBooking() {
        Booking unownedBooking =
                new Booking("OUTSIDE-2", new Room(110));

        invoker.setCommand(
                new ExtendBookingCommand(
                        user,
                        unownedBooking,
                        2.0f
                )
        );
        invoker.executeCommand();

        assertEquals(
                BookingStatus.PENDING,
                unownedBooking.getStatus()
        );

        assertFalse(
                user.extendBooking(unownedBooking, 2.0f)
        );
    }

    @Test
    void cancelBookingCommandCancelsOwnedBooking() {
        Booking booking = user.bookRoom(new Room(111));

        invoker.setCommand(
                new CancelBookingCommand(user, booking)
        );
        invoker.executeCommand();

        assertEquals(
                BookingStatus.CANCELLED,
                booking.getStatus()
        );
    }

    @Test
    void cancelBookingCommandDoesNotCancelUnownedBooking() {
        Booking unownedBooking =
                new Booking("OUTSIDE-3", new Room(112));

        invoker.setCommand(
                new CancelBookingCommand(
                        user,
                        unownedBooking
                )
        );
        invoker.executeCommand();

        assertEquals(
                BookingStatus.PENDING,
                unownedBooking.getStatus()
        );
    }

    @Test
    void invokerCanExecuteSeveralDifferentCommands() {
        Room room = new Room(113);

        invoker.setCommand(new AddRoomCommand(admin, room));
        invoker.executeCommand();

        invoker.setCommand(
                new DisableRoomCommand(admin, room)
        );
        invoker.executeCommand();
        assertEquals(RoomStatus.DISABLED, room.getStatus());

        invoker.setCommand(
                new EnableRoomCommand(admin, room)
        );
        invoker.executeCommand();
        assertEquals(RoomStatus.AVAILABLE, room.getStatus());

        invoker.setCommand(
                new CloseRoomCommand(admin, room)
        );
        invoker.executeCommand();
        assertEquals(RoomStatus.MAINTENANCE, room.getStatus());
    }
}