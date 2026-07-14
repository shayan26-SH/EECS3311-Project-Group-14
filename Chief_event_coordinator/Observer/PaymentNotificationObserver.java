package Chief_event_coordinator.Observer;

import Chief_event_coordinator.Classes.Booking;

/**
 * PaymentNotificationObserver
 *
 * Concrete Observer. Reacts to booking status changes that have a
 * financial consequence:
 *   - CONFIRMED  -> charge the one-hour upfront fee (Req4, Req10)
 *   - CANCELLED  -> refund if the booking had already been charged (Req8)
 *   - NO_SHOW    -> no refund (fee is forfeited)
 *
 * Decouples Booking from knowing anything about payment processing;
 * Booking just calls notifyObservers() and this class reacts.
 */
public class PaymentNotificationObserver implements BookingObserver {
    private final Payment payment;
    private static final double UPFRONT_FEE = 1.0; // placeholder: one-hour upfront fee unit

    public PaymentNotificationObserver(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void onBookingStatusChanged(Booking booking, BookingStatus oldStatus, BookingStatus newStatus) {
        switch (newStatus) {
            case CONFIRMED:
                boolean charged = payment.charge(UPFRONT_FEE);
                System.out.println("[Payment] Booking " + booking.getBookingid()
                        + " confirmed -> charge " + (charged ? "succeeded" : "FAILED"));
                break;
            case CANCELLED:
                boolean refunded = payment.refund(UPFRONT_FEE);
                System.out.println("[Payment] Booking " + booking.getBookingid()
                        + " cancelled -> refund " + (refunded ? "issued" : "not issued"));
                break;
            case NO_SHOW:
                System.out.println("[Payment] Booking " + booking.getBookingid()
                        + " no-show -> fee forfeited, no refund");
                break;
            default:
                // PENDING, CHECKED_IN, EXTENDED have no direct payment action here
                break;
        }
    }
}