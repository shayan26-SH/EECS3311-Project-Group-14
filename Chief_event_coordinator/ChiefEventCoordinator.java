package Chief_event_coordinator;

import Chief_event_coordinator.Abstract_Factory.*;
import Chief_event_coordinator.Classes.*;

public class ChiefEventCoordinator {
	private AdminFactory factory;

	/**
	 * Constructor for the ChiefEventCoordinator
	 * 
	 * @param factory
	 */
	public ChiefEventCoordinator(AdminFactory factory) {
		// super();
		this.factory = factory;
	}

	/**
	 * @return the factory
	 */
	public AdminFactory getFactory() {
		return factory;
	}

	/**
	 * @param factory the factory to set
	 */
	public void setFactory(AdminFactory factory) {
		this.factory = factory;
	}

	public Administrator generateAdminAccount(String name, String email) {
		Administrator admin = factory.createAdministrator(name, email);// to create the admin
		AdminPermssion permission = factory.createPermission(); // to create the permission
		permission.showPermission(); // here we called the showpermission to display the permission
		System.out.println("Admin account created successfully");
		return admin;
		
	}

}
