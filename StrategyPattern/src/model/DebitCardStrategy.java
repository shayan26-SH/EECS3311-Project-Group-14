package model;

public class DebitCardStrategy implements PaymentStrategy {
    private int cardNum;
    private int expiryDate;
    private int cvv;

    public DebitCardStrategy(int cardNum, int expiryDate, int cvv) {
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