package Chief_event_coordinator.Demo;

import Chief_event_coordinator.Classes.Booking;
import Chief_event_coordinator.Classes.Room;
import Chief_event_coordinator.State.IllegalBookingTransitionException;

/**
 * StatePatternDemo
 *
 * Standalone demonstration of the STATE design pattern (Jasveer) driving the
 * booking lifecycle. No CSV or observers required - it just walks a Booking
 * (the Context) through legal transitions and shows that illegal transitions
 * are rejected by the current state.
 *
 * Run:  java Chief_event_coordinator.Demo.StatePatternDemo
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        System.out.println("================ STATE PATTERN: Booking lifecycle ================\n");

        // --- Happy path: request -> confirm -> check in -> extend (Req3,4,5,9) ---
        Room room101 = new Room(101);
        Booking b1 = new Booking("B-1001", room101);
        System.out.println("Created booking " + b1.getBookingid() + " -> state " + b1.getStatus());

        b1.confirmDeposit();
        System.out.println("Deposit paid (Req4)          -> state " + b1.getStatus());

        b1.checkIn();
        System.out.println("User checked in (Req4/Req5)  -> state " + b1.getStatus());

        b1.extend();
        System.out.println("Booking extended (Req9)      -> state " + b1.getStatus());

        b1.extend();
        System.out.println("Extended again (Req9)        -> state " + b1.getStatus());

        // --- Cancellation path (Req8) ---
        System.out.println();
        Booking b2 = new Booking("B-1002", new Room(102));
        System.out.println("Created booking " + b2.getBookingid() + " -> state " + b2.getStatus());
        b2.cancel();
        System.out.println("Cancelled before start (Req8)-> state " + b2.getStatus());

        // --- No-show path (Req4: deposit lost) ---
        System.out.println();
        Booking b3 = new Booking("B-1003", new Room(103));
        b3.confirmDeposit();
        System.out.println("Booking " + b3.getBookingid() + " confirmed  -> state " + b3.getStatus());
        b3.markNoShow();
        System.out.println("No check-in in 30 min (Req4) -> state " + b3.getStatus() + " (deposit lost)");

        // --- Illegal transitions are rejected by the current state ---
        System.out.println("\n---------------- Illegal transitions are blocked ----------------");
        tryIllegal("check in a CANCELLED booking", () -> b2.checkIn());
        tryIllegal("cancel a CHECKED_IN/EXTENDED booking (Req8: only before start)", () -> b1.cancel());
        tryIllegal("confirm a NO_SHOW booking", () -> b3.confirmDeposit());

        System.out.println("\nDone.");
    }

    /** Runs an action that is expected to be illegal and prints the rejection. */
    private static void tryIllegal(String description, Runnable action) {
        try {
            action.run();
            System.out.println("[BUG] Expected rejection but succeeded: " + description);
        } catch (IllegalBookingTransitionException e) {
            System.out.println("Blocked: " + description + "\n         -> " + e.getMessage());
        }
    }
}
