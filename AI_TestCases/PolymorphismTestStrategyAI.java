package AI_TestCases;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

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

class PolymorphismTestStrategyAI {

	@Test
	void testAllStrategiesCanBeUsedInterchangeably() {

	    PaymentStrategy[] strategies = {
	            new CreditCardStrategy(1234567812345678L, 1226, 123),
	            new DebitCardStrategy(1111222233334444L, 1226, 123),
	            new InstitutionalBillingStrategy(
	                    "York",
	                    1234567L,
	                    "finance@york.ca")
	    };

	    int id = 200;
	    Booking booking = new Booking("B280",new PaymentUser("student@my.yorku.ca", "Test Student", 
	    		new AccountType("Student", 20f, true)), new TimeSlot(LocalDateTime.of(2026, 7, 29, 11, 0), 
	    				LocalDateTime.of(2026, 7, 29, 11, 0).plusHours(2)));

	    for (PaymentStrategy strategy : strategies) {

			Payment payment =
	                new Payment(id++, booking, strategy);

	        assertTrue(payment.chargeDeposit());
	        assertEquals(PaymentStatus.PAID, payment.getStatus());

	        assertTrue(payment.processRefund());
	        assertEquals(PaymentStatus.REFUNDED, payment.getStatus());
	    }
	}

}
