package Chief_event_coordinator.Observer;

/**
 * StubPayment
 *
 * Minimal placeholder implementation of Payment, used only so the
 * Observer pattern can be demoed end-to-end before Shayan's Factory
 * Method (CreditCardPayment / DebitCardPayment / InstitutionalBillingPayment)
 * is wired in. Delete once real Payment classes implement the
 * Payment interface.
 */
public class StubPayment implements Payment {

    @Override
    public boolean charge(double amount) {
        System.out.println("[StubPayment] Charged $" + amount);
        return true;
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("[StubPayment] Refunded $" + amount);
        return true;
    }
}
