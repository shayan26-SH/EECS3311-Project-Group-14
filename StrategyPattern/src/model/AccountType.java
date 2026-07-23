package model;

public class AccountType {
    private final String name;
    private final float hourlyRate;
    private final boolean requiresVerification;

    public AccountType(String name, float hourlyRate, boolean requiresVerification) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Account type name is required.");
        }
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }

        this.name = name;
        this.hourlyRate = hourlyRate;
        this.requiresVerification = requiresVerification;
    }

    public String getName() {
        return name;
    }

    public float getHourlyRate() {
        return hourlyRate;
    }

    public boolean isRequiresVerification() {
        return requiresVerification;
    }
}
