package model;

public class CreditCardStrategy implements PaymentStrategy {
    private int cardNum;
    private int expiryDate;
    private int cvv;
    private boolean overduePayment;

    public CreditCardStrategy(int cardNum, int expiryDate, int cvv) {
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