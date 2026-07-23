package Test;

import AccountType.AccountType;
import Chief_event_coordinator.Classes.*;
import Chief_event_coordinator.Command.*;
import User.RegisteredUser;

public class CommandPatternTest {
    public static void main(String[] args) {
        // ==========================================================
        // Administrator Commands
        // ==========================================================

        Administrator admin = new Administrator(
                "John Admin",
                "admin@yorku.ca");

        Room room = new Room(101);

        CommandInvoker invoker = new CommandInvoker();

        System.out.println("===== ADMINISTRATOR COMMANDS =====");

        // Add Room
        invoker.setCommand(new AddRoomCommand(admin, room));
        invoker.executeCommand();

        // Disable Room
        invoker.setCommand(new DisableRoomCommand(admin, room));
        invoker.executeCommand();

        // Enable Room
        invoker.setCommand(new EnableRoomCommand(admin, room));
        invoker.executeCommand();

        // Close Room
        invoker.setCommand(new CloseRoomCommand(admin, room));
        invoker.executeCommand();

        System.out.println("--------------------------------");
        System.out.println("Final Room Status: " + room.getStatus());

        // ==========================================================
        // Registered User Commands
        // ==========================================================

        System.out.println("\n===== REGISTERED USER COMMANDS =====");

        AccountType student =
                new AccountType("Student", 20.0f, true);

        RegisteredUser user =
                new RegisteredUser(
                        "Alice",
                        "alice@yorku.ca",
                        "Password123!",
                        student,
                        12345);

        Room bookingRoom = new Room(102);

        // Book Room
        invoker.setCommand(new BookRoomCommand(user, bookingRoom));
        invoker.executeCommand();

        // Get the created booking
        Booking booking = user.viewBookings().get(0);

        // Modify Booking
        invoker.setCommand(new ModifyBookingCommand(user, booking));
        invoker.executeCommand();

        booking.confirmDeposit();
        booking.checkIn();

        // Extend Booking
        invoker.setCommand(new ExtendBookingCommand(user, booking, 2.0f));
        invoker.executeCommand();

        Room cancellationRoom = new Room(103);
        invoker.setCommand(new BookRoomCommand(user, cancellationRoom));
        invoker.executeCommand();
        Booking bookingToCancel = user.viewBookings().get(1);

        // Cancel Booking before it starts
        invoker.setCommand(new CancelBookingCommand(user, bookingToCancel));
        invoker.executeCommand();

        System.out.println("--------------------------------");
        System.out.println("Extended Booking Status: " + booking.getStatus());
        System.out.println("Cancelled Booking Status: " + bookingToCancel.getStatus());
    }
}
