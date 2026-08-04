package model;

public class DebitCardStrategy implements PaymentStrategy {
    private long cardNum;
    private int expiryDate;
    private int cvv;

    public DebitCardStrategy(long cardNum, int expiryDate, int cvv) {
    	if (String.valueOf(cardNum).length() < 14) {
    	    throw new IllegalArgumentException("Card number must contain at least 14 digits.");
    	}
    	if (String.valueOf(expiryDate).length() != 4) {
    	    throw new IllegalArgumentException("Expiry Date must have 4 digits.");
    	}
    	if (String.valueOf(cvv).length() != 3) {
    	    throw new IllegalArgumentException("CVV must have 3 digits.");
    	}
        this.cardNum = cardNum;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean pay(float amount) {
        System.out.println("Debiting $" + amount + " from card ending in " + lastFourDigits());
        return true;
    }

    @Override
    public boolean refund(float amount) {
        System.out.println("Crediting $" + amount + " back to card ending in " + lastFourDigits());
        return true;
    }

    @Override
    public String getConfirmation() {
        return "Debit card ending in " + lastFourDigits();
    }

    private String lastFourDigits() {
        String num = String.valueOf(cardNum);
        return num.substring(num.length() - 4);
    }
}