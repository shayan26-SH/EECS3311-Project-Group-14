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

        // Extend Booking
        invoker.setCommand(new ExtendBookingCommand(user, booking, 2.0f));
        invoker.executeCommand();

        // Cancel Booking
        invoker.setCommand(new CancelBookingCommand(user, booking));
        invoker.executeCommand();

        System.out.println("--------------------------------");
        System.out.println("Booking Status: " + booking.getStatus());
    }
}