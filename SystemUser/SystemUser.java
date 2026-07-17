package User;

import AccountType.*;

public class SystemUser {
	private String email, password, name;
	private AccountType type;

	public SystemUser(String email, String password, String name, AccountType type) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.type = type;
	}

	public boolean verify() {
		return email != null && !email.isEmpty() && password != null && !password.isEmpty() && name != null
				&& !name.isEmpty() && type != null;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public AccountType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(AccountType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "SystemUser [email=" + email + ", password=" + password + ", name=" + name + ", type=" + type + "]";
	}
	  public void createAccount() {
	        if (verify()) {
	            System.out.println("Account created successfully!");
	        } else {
	            System.out.println("Unable to create account. Invalid information.");
	        }
	    }
}
