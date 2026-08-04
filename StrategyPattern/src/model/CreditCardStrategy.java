package model;

public class CreditCardStrategy implements PaymentStrategy {
    private long cardNum;
    private int expiryDate;
    private int cvv;
    private boolean overduePayment;

    public CreditCardStrategy(long cardNum, int expiryDate, int cvv) {
    	if (String.valueOf(cardNum).length() < 14) {
    	    throw new IllegalArgumentException("Card number must contain at least 14 digits.");
    	}
    	if (String.valueOf(expiryDate).length() != 4) {
    	    throw new IllegalArgumentException("Expiry Date must have 4 digits.");
    	}
    	if (String.valueOf(expiryDate).length() != 4) {
    	    throw new IllegalArgumentException("CVV must have 3 digits.");
    	}
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.overduePayment = false;
    }

    @Override
    public boolean pay(float amount) {
        System.out.println("Charging $" + amount + " to credit card ending in " + lastFourDigits());
        overduePayment = false;
        return true;
    }

    @Override
    public boolean refund(float amount) {
        System.out.println("Refunding $" + amount + " to credit card ending in " + lastFourDigits());
        return true;
    }

    @Override
    public String getConfirmation() {
        return "Credit card ending in " + lastFourDigits();
    }

    private String lastFourDigits() {
        String num = String.valueOf(cardNum);
        return num.substring(num.length() - 4);
    }
}