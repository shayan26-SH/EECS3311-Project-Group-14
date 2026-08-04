package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

import model.AccountType;
import model.Booking;
import model.PaymentUser;
import model.TimeSlot;

public class BookingTest {

    private AccountType account = new AccountType("Student", 20f, true);
    private PaymentUser user = new PaymentUser("student@my.yorku.ca", "Test Student", account);
    private LocalDateTime start = LocalDateTime.of(2026, 7, 29, 11, 0);
    private TimeSlot slot = new TimeSlot(start, start.plusHours(2));

    @Test
    void constructorTest() {
        Booking booking = new Booking("B1", user, slot);
        assertEquals("B1", booking.getBookingId());
        assertSame(user, booking.getUser());
        assertSame(slot, booking.getTime());
    }

    @Test
    void nullIDValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Booking(null, user, slot));
    }

    @Test
    void emptyIDValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Booking("   ", user, slot));
    }

    @Test
    void nullUserValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Booking("B2", null, slot));
    }

    @Test
    void nullTimeSlotValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Booking("B2", user, null));
    }

    @Test
    void duplicateIDCheck() {
        assertThrows(IllegalArgumentException.class, () -> new Booking("B1", user, null));
    }

    @Test
    void usersReferencesValidation() {
        Booking booking = new Booking("B2", user, slot);
        assertSame(user, booking.getUser());
    }

    @Test
    void timeSlotReferencesValidation() {
        Booking booking = new Booking("B3", user, slot);
        assertSame(slot, booking.getTime());
    }

    @Test
    void bookingsReferencesValidation() {
        Booking b1 = new Booking("B4", user, slot);
        Booking b2 = new Booking("B5", user, slot);
        assertNotSame(b1, b2);
    }

    @Test
    void usersReferencesValidation2() {
        Booking b1 = new Booking("B6", user, slot);
        Booking b2 = new Booking("B7", user, slot);
        assertSame(b1.getUser(), b2.getUser());
        assertSame(b1.getTime(), b2.getTime());
    }
}