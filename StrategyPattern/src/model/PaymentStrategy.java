package model;

public interface PaymentStrategy {
	boolean pay(float amount);
    boolean refund(float amount);
    String getConfirmation();
}
