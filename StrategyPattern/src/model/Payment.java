package model;

import java.time.Duration;

//Context class

public class Payment {
    private int id;
    private Booking booking;
    private float totalAmount;
    private PaymentStatus status;
    private PaymentStrategy strategy;  

    public Payment(int id, Booking booking, PaymentStrategy strategy) {
        this.id = id;
        this.booking = booking;
        this.strategy = strategy;
        this.totalAmount = calculateAmount();
        this.status = PaymentStatus.OVERDUE;
    }

    //hourly rate depends on the user's account type.
    private float calculateAmount() {
        float hourlyRate = booking.getUser().getAccountType().getHourlyRate();
        
        TimeSlot time = booking.getTime();
        Duration duration = Duration.between(time.getStart(), time.getEnd());
        float hours = duration.toMinutes() / 60f;

        return hourlyRate * hours;
    }

    // one hour's fee is charged upfront as a deposit.
    private float calculateDeposit() {
        return booking.getUser().getAccountType().getHourlyRate();
    }

    public boolean chargeDeposit() {
        float deposit = calculateDeposit();
        boolean success = strategy.pay(deposit);
        status = success ? PaymentStatus.PAID : PaymentStatus.FAILED;
        return success;
    }

    public boolean chargeTotalRemainingAmount() {
        float remaining = totalAmount - calculateDeposit();
        return strategy.pay(remaining);
    }

    public boolean processRefund() {
        boolean success = strategy.refund(totalAmount);
        if (success) {
            status = PaymentStatus.REFUNDED;
        }
        return success;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
