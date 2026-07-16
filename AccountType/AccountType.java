package AccountType;

public class AccountType {
	private String name;
	private float HourlyRate;
	private boolean requiresVerification;

	public AccountType(String name, float hourlyRate, boolean requiresVerification) {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException();
		else
			this.name = name;
		
		HourlyRate = hourlyRate;
		this.requiresVerification = requiresVerification;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the hourlyRate
	 */
	public float getHourlyRate() {
		return HourlyRate;
	}

	/**
	 * @return the requiresVerification
	 */
	public boolean isRequiresVerification() {
		return requiresVerification;
	}

}
