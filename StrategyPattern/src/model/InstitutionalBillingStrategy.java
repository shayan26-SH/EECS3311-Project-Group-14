package model;

public class InstitutionalBillingStrategy implements PaymentStrategy {
    private String institutionName;
    private int accountNumber;
    private String accountEmail;

    public InstitutionalBillingStrategy(String institutionName, int accountNumber, String accountEmail) {
        this.institutionName = institutionName;
        this.accountNumber = accountNumber;
        this.accountEmail = accountEmail;
    }

    @Override
    public boolean pay(float amount) {
        System.out.println("Invoicing $" + amount + " to " + institutionName
                + " account " + accountNumber + " (contact: " + accountEmail + ")");
        return true;
    }

    @Override
    public boolean refund(float amount) {
        System.out.println("Refunding $" + amount + " to " + institutionName
                + " account " + accountNumber);
        return true;
    }

    @Override
    public String getConfirmation() {
        return "Billed to " + institutionName + " (account " + accountNumber + ")";
    }
}