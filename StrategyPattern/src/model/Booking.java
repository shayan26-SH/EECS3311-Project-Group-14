package model;

public class Booking {
    private final String bookingId;
    private final PaymentUser user;
    private final TimeSlot time;

    public Booking(String bookingId, PaymentUser user, TimeSlot time) {
        if (bookingId == null || bookingId.trim().isEmpty()) {
            throw new IllegalArgumentException("Booking id is required.");
        }
        if (user == null) {
            throw new IllegalArgumentException("Booking user is required.");
        }
        if (time == null) {
            throw new IllegalArgumentException("Booking time is required.");
        }

        this.bookingId = bookingId;
        this.user = user;
        this.time = time;
    }

    public String getBookingId() {
        return bookingId;
    }

    public PaymentUser getUser() {
        return user;
    }

    public TimeSlot getTime() {
        return time;
    }
}
