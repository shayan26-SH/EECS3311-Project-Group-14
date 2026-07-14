package Chief_event_coordinator.Observer;

/**
 * Payment
 *
 * INTEGRATION NOTE FOR THE TEAM:
 * Shayan owns the Factory Method pattern (CreditCardPayment,
 * DebitCardPayment, InstitutionalBillingPayment created via a
 * PaymentFactory). Observer does not create Payment objects - it only
 * needs *a* Payment to call charge()/refund() on when a booking is
 * confirmed or cancelled. This minimal interface is a placeholder so
 * PaymentNotificationObserver can compile and be demoed independently.
 * Once Shayan's factory-produced Payment classes exist, either:
 *   (a) make them implement this interface, or
 *   (b) delete this file and have PaymentNotificationObserver depend
 *       directly on Shayan's real Payment interface/class.
 * This is a low-risk, easily-swappable seam - flagged here rather than
 * unilaterally edited into Shayan's package.
 */
public interface Payment {
    boolean charge(double amount);
    boolean refund(double amount);
}
