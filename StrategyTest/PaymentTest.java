package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import model.AccountType;
import model.Booking;
import model.CreditCardStrategy;
import model.DebitCardStrategy;
import model.InstitutionalBillingStrategy;
import model.Payment;
import model.PaymentStatus;
import model.PaymentStrategy;
import model.PaymentUser;
import model.TimeSlot;

public class PaymentTest {

	private static int nextId = 1000;

    private static AccountType studentAccount;
    private static PaymentUser studentUser;
    private static Booking booking;
    private PaymentStrategy creditCard;
    private PaymentStrategy debitCard;
    private PaymentStrategy institutionalBilling;

    @BeforeAll
    static void setUpSharedBooking() {
        studentAccount = new AccountType("Student", 20.0f, true);
        studentUser = new PaymentUser("student@yorku.ca", "Jane Student", studentAccount);
        LocalDateTime start = LocalDateTime.of(2026, 3, 1, 9, 0);
        TimeSlot slot = new TimeSlot(start, start.plusHours(2));
        booking = new Booking("B22", studentUser, slot);
    }

    @BeforeEach
    void setUp() {
        creditCard = new CreditCardStrategy(12345678912345l, 1228, 123);
        debitCard = new DebitCardStrategy(12345678912345l, 1626, 456);
        institutionalBilling = new InstitutionalBillingStrategy("York Grad Studies", 12345678912345l, "billing@yorku.ca");
    }

    @Test
    void totalAmountTest1() {
        Payment payment = new Payment(nextId++, booking, creditCard);
        assertEquals(40.0f, payment.getTotalAmount()); // 2 hours * $20/h
    }

    @Test
    void duplicateIDCheck1() {
        int reusedId = nextId++;
        Payment p = new Payment(reusedId, booking, debitCard);
        assertThrows(IllegalArgumentException.class,
                () -> new Payment(reusedId, booking, debitCard)); 
    }
    
    @Test
    void duplicateIDCheck2() {
        int reusedId2 = nextId++;
        Payment p = new Payment(reusedId2, booking, debitCard);
        assertThrows(IllegalArgumentException.class,
                () -> new Payment(reusedId2, booking, creditCard)); 
    }

    @Test
    void totalAmountTest2() {
        Payment payment = new Payment(nextId++, booking, debitCard);
        assertEquals(40.0f, payment.getTotalAmount()); // 2 hours * $20/h
    }

    @Test
    void creditPayTest() {
        Payment payment = new Payment(nextId++, booking, creditCard);
        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID, payment.getStatus());
    }

    @Test
    void chargeDepositWithDebitCardSucceeds() {
        Payment payment = new Payment(nextId++, booking, debitCard);
        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID, payment.getStatus());
    }

    @Test
    void chargeDepositWithInstitutionalBillingSucceeds() {
        Payment payment = new Payment(nextId++, booking, institutionalBilling);
        assertTrue(payment.chargeDeposit());
        assertEquals(PaymentStatus.PAID, payment.getStatus());
    }

    @Test
    void chargeRemainingTest() {
        Payment payment = new Payment(nextId++, booking, creditCard);
        payment.chargeDeposit();
        assertTrue(payment.chargeTotalRemainingAmount());
    }

    @Test
    void refundTest() {
        Payment payment = new Payment(nextId++, booking, creditCard);
        assertTrue(payment.processRefund());
        assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
    }

    @Test
    void strategyTest1() {
        Payment credit = new Payment(nextId++, booking, creditCard);
        Payment debit = new Payment(nextId++, booking, debitCard);
        Payment inst = new Payment(nextId++, booking, institutionalBilling);

        assertEquals(credit.getTotalAmount(), debit.getTotalAmount());
        assertEquals(credit.getTotalAmount(), inst.getTotalAmount());
    }
}