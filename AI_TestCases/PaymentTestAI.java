package AI_TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class PaymentTestAI {

    private Booking booking;
    private static int nextBookingId = 0;
    private static int nextPaymentId = 0;

    @BeforeEach
    void setup() {

        AccountType account =
                new AccountType("Student", 20, false);

        PaymentUser user =
                new PaymentUser("user@email.com",
                        "Alice",
                        account);

        TimeSlot slot =
                new TimeSlot(
                        LocalDateTime.of(2026,1,1,10,0),
                        LocalDateTime.of(2026,1,1,12,0));

        nextBookingId++;
        booking = new Booking("B" + nextBookingId, user, slot);
    }

    @Test
    void testCreditCardStrategyPayment() {

        Payment payment = new Payment(
                1,
                booking,
                new CreditCardStrategy(
                        1234567812345678L,
                        1226,
                        123));

        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID,
                payment.getStatus());
    }

    @Test
    void testDebitCardStrategyPayment() {

        Payment payment = new Payment(
                2,
                booking,
                new DebitCardStrategy(
                        1111222233334444L,
                        1226,
                        123));

        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID,
                payment.getStatus());
    }

    @Test
    void testInstitutionBillingStrategyPayment() {

        Payment payment = new Payment(
                3,
                booking,
                new InstitutionalBillingStrategy(
                        "York",
                        1234567L,
                        "finance@york.ca"));

        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID,
                payment.getStatus());
    }

    @Test
    void testRefund() {

        Payment payment = new Payment(
                4,
                booking,
                new CreditCardStrategy(
                        1234567812345678L,
                        1226,
                        123));

        payment.processRefund();

        assertEquals(PaymentStatus.REFUNDED,
                payment.getStatus());
    }

    @Test
    void testCalculateTotalAmount() {

        Payment payment = new Payment(
                5,
                booking,
                new CreditCardStrategy(
                        1234567812345678L,
                        1226,
                        123));

        // 2 hours × $20/hour
        assertEquals(40f,
                payment.getTotalAmount());
    }

    @Test
    void testRemainingCharge() {

        Payment payment = new Payment(
                6,
                booking,
                new CreditCardStrategy(
                        1234567812345678L,
                        1226,
                        123));

        assertTrue(payment.chargeTotalRemainingAmount());
    }

    @Test
    void testDuplicatePaymentID() {

        new Payment(
                100,
                booking,
                new CreditCardStrategy(
                        1234567812345678L,
                        1226,
                        123));

        assertThrows(IllegalArgumentException.class,
                () -> new Payment(
                        100,
                        booking,
                        new CreditCardStrategy(
                                1111222233334444L,
                                1226,
                                123)));
    }
}
