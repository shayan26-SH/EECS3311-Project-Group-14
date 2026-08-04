package model;

public class InstitutionalBillingStrategy implements PaymentStrategy {
    private String institutionName;
    private long accountNumber;
    private String accountEmail;

    public InstitutionalBillingStrategy(String institutionName, long accountNumber, String accountEmail) {
    	if (String.valueOf(accountNumber).length() < 7) {
    	    throw new IllegalArgumentException("Account number must contain at least 7 digits.");
    	}
    	if (institutionName == null || institutionName.trim().isEmpty()) {
            throw new IllegalArgumentException("Inst. name is required.");
        }
    	if (accountEmail == null || accountEmail.trim().isEmpty()) {
            throw new IllegalArgumentException("Account Email is required.");
        }
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