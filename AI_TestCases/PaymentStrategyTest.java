package AI_TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
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
import org.junit.jupiter.api.Test;

class PaymentStrategyTest {

  @Test
  void strategyModelObjectsValidateAndExposeTheirData() {
    AccountType student = new AccountType("Student", 25.0f, true);
    assertEquals("Student", student.getName());
    assertEquals(25.0f, student.getHourlyRate());
    assertTrue(student.isRequiresVerification());
    assertThrows(
      IllegalArgumentException.class,
      () -> new AccountType(null, 1.0f, false)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new AccountType(" ", 1.0f, false)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new AccountType("Student", -1.0f, false)
    );

    PaymentUser user = new PaymentUser(
      "student@yorku.ca",
      "Student User",
      student
    );
    assertEquals("student@yorku.ca", user.getEmail());
    assertEquals("Student User", user.getName());
    assertSame(student, user.getAccountType());
    assertThrows(
      IllegalArgumentException.class,
      () -> new PaymentUser(null, "Name", student)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new PaymentUser("email", " ", student)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new PaymentUser("email", "Name", null)
    );

    LocalDateTime start = LocalDateTime.of(2026, 7, 22, 10, 0);
    LocalDateTime end = start.plusHours(2);
    TimeSlot slot = new TimeSlot(start, end);
    assertEquals(start, slot.getStart());
    assertEquals(end, slot.getEnd());
    assertThrows(IllegalArgumentException.class, () -> new TimeSlot(null, end));
    assertThrows(
      IllegalArgumentException.class,
      () -> new TimeSlot(start, null)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new TimeSlot(start, start)
    );

    Booking booking = new Booking("PAY-1", user, slot);
    assertEquals("PAY-1", booking.getBookingId());
    assertSame(user, booking.getUser());
    assertSame(slot, booking.getTime());
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking(" ", user, slot)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking("PAY", null, slot)
    );
    assertThrows(
      IllegalArgumentException.class,
      () -> new Booking("PAY", user, null)
    );
  }

  @Test
  void concretePaymentStrategiesPayRefundAndReturnConfirmations() {
    CreditCardStrategy credit = new CreditCardStrategy(12345678, 1228, 123);
    assertTrue(credit.pay(25.0f));
    assertTrue(credit.refund(10.0f));
    assertEquals("Credit card ending in 5678", credit.getConfirmation());

    DebitCardStrategy debit = new DebitCardStrategy(87654321, 1129, 321);
    assertTrue(debit.pay(30.0f));
    assertTrue(debit.refund(15.0f));
    assertEquals("Debit card ending in 4321", debit.getConfirmation());

    InstitutionalBillingStrategy institutional = new InstitutionalBillingStrategy(
      "York University",
      100200,
      "billing@yorku.ca"
    );
    assertTrue(institutional.pay(50.0f));
    assertTrue(institutional.refund(20.0f));
    assertEquals(
      "Billed to York University (account 100200)",
      institutional.getConfirmation()
    );
  }

  @Test
  void paymentContextCalculatesDepositRemainingAmountAndRefund() {
    AccountType type = new AccountType("Student", 25.0f, true);
    PaymentUser user = new PaymentUser("a@yorku.ca", "Alice", type);
    LocalDateTime start = LocalDateTime.of(2026, 7, 22, 9, 0);
    Booking booking = new Booking(
      "PAY-2",
      user,
      new TimeSlot(start, start.plusHours(2))
    );
    RecordingStrategy strategy = new RecordingStrategy(true, true);
    Payment payment = new Payment(1, booking, strategy);

    assertEquals(PaymentStatus.OVERDUE, payment.getStatus());
    assertTrue(payment.chargeDeposit());
    assertEquals(25.0f, strategy.lastPaidAmount);
    assertEquals(PaymentStatus.PAID, payment.getStatus());
    assertTrue(payment.chargeTotalRemainingAmount());
    assertEquals(25.0f, strategy.lastPaidAmount);
    assertTrue(payment.processRefund());
    assertEquals(50.0f, strategy.lastRefundedAmount);
    assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
    assertEquals("Recording strategy", strategy.getConfirmation());
  }

  @Test
  void failedPaymentAndRefundKeepTheFailureStatus() {
    AccountType type = new AccountType("Partner", 30.0f, false);
    PaymentUser user = new PaymentUser("p@yorku.ca", "Partner", type);
    LocalDateTime start = LocalDateTime.of(2026, 7, 22, 12, 0);
    Booking booking = new Booking(
      "PAY-3",
      user,
      new TimeSlot(start, start.plusMinutes(90))
    );
    RecordingStrategy strategy = new RecordingStrategy(false, false);
    Payment payment = new Payment(2, booking, strategy);

    assertFalse(payment.chargeDeposit());
    assertEquals(PaymentStatus.FAILED, payment.getStatus());
    assertFalse(payment.chargeTotalRemainingAmount());
    assertEquals(15.0f, strategy.lastPaidAmount);
    assertFalse(payment.processRefund());
    assertEquals(45.0f, strategy.lastRefundedAmount);
    assertEquals(PaymentStatus.FAILED, payment.getStatus());
    assertEquals(4, PaymentStatus.values().length);
  }

  private static final class RecordingStrategy implements PaymentStrategy {

    private final boolean paymentResult;
    private final boolean refundResult;
    private float lastPaidAmount;
    private float lastRefundedAmount;

    private RecordingStrategy(boolean paymentResult, boolean refundResult) {
      this.paymentResult = paymentResult;
      this.refundResult = refundResult;
    }

    @Override
    public boolean pay(float amount) {
      lastPaidAmount = amount;
      return paymentResult;
    }

    @Override
    public boolean refund(float amount) {
      lastRefundedAmount = amount;
      return refundResult;
    }

    @Override
    public String getConfirmation() {
      return "Recording strategy";
    }
  }
}