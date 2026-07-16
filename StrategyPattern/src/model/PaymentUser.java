package model;

public class PaymentUser {
    private String email;
    private String name;
    private AccountType accountType;

    public PaymentUser(String email, String name, AccountType accountType) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("User email is required.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("User name is required.");
        }
        if (accountType == null) {
            throw new IllegalArgumentException("Account type is required.");
        }

        this.email = email;
        this.name = name;
        this.accountType = accountType;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public AccountType getAccountType() {
        return accountType;
    }
}
