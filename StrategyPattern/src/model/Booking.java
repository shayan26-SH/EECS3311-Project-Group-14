package model;

public class Booking {
    private String bookingId;
    private PaymentUser user;
    private TimeSlot time;

    public Booking(String bookingId, PaymentUser user, TimeSlot time) {
        if (bookingId == null || bookingId.isEmpty()) {
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
