package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Chief_event_coordinator.ChiefEventCoordinator;
import Chief_event_coordinator.Abstract_Factory.AdminFactory;
import Chief_event_coordinator.Abstract_Factory.RoomAdminFactory;
import Chief_event_coordinator.Classes.Administrator;
import Chief_event_coordinator.Classes.AdminPermssion;

public class AbstractFactoryTest {

	// TEST 1
	@Test
	void roomAdminFactoryShouldBeAnAdminFactory() {

		RoomAdminFactory factory = new RoomAdminFactory();

		assertTrue(factory instanceof AdminFactory);
	}

	// TEST 2
	@Test
	void factoryShouldCreateAdministrator() {

		RoomAdminFactory factory = new RoomAdminFactory();

		Administrator admin = factory.createAdministrator("Martin", "martin@yorku.ca");

		assertNotNull(admin);
	}

	// TEST 3
	@Test
	void factoryShouldCreateAdministratorWithCorrectName() {

		RoomAdminFactory factory = new RoomAdminFactory();

		Administrator admin = factory.createAdministrator("Martin", "martin@yorku.ca");

		assertEquals("Martin", admin.getName());
	}

	// TEST 4
	@Test
	void factoryShouldCreateAdministratorWithCorrectEmail() {

		RoomAdminFactory factory = new RoomAdminFactory();

		Administrator admin = factory.createAdministrator("Martin", "martin@yorku.ca");

		assertEquals("martin@yorku.ca", admin.getEmail());
	}

	// TEST 5
	@Test
	void factoryShouldCreatePermission() {

		RoomAdminFactory factory = new RoomAdminFactory();

		AdminPermssion permission = factory.createPermission();

		assertNotNull(permission);
	}

	// TEST 6
	@Test
	void factoryShouldCreateCorrectPermissionLevel() {

		RoomAdminFactory factory = new RoomAdminFactory();

		AdminPermssion permission = factory.createPermission();

		assertEquals("Room Managed", permission.getLevel());
	}

	// TEST 7
	@Test
	void factoryShouldCreateDifferentAdministratorObjects() {

		RoomAdminFactory factory = new RoomAdminFactory();

		Administrator admin1 = factory.createAdministrator("Admin 1", "admin1@yorku.ca");

		Administrator admin2 = factory.createAdministrator("Admin 2", "admin2@yorku.ca");

		assertNotSame(admin1, admin2);
	}

	// TEST 8
	@Test
	void factoryShouldCreateDifferentPermissionObjects() {

		RoomAdminFactory factory = new RoomAdminFactory();

		AdminPermssion permission1 = factory.createPermission();

		AdminPermssion permission2 = factory.createPermission();

		assertNotSame(permission1, permission2);
	}

	// TEST 9
	@Test
	void changingOneAdministratorShouldNotChangeAnother() {

		RoomAdminFactory factory = new RoomAdminFactory();

		Administrator admin1 = factory.createAdministrator("Admin 1", "admin1@yorku.ca");

		Administrator admin2 = factory.createAdministrator("Admin 2", "admin2@yorku.ca");

		admin1.setName("Changed");

		assertEquals("Changed", admin1.getName());

		assertEquals("Admin 2", admin2.getName());
	}

	// TEST 10
	@Test
	void changingOnePermissionShouldNotChangeAnother() {

		RoomAdminFactory factory = new RoomAdminFactory();

		AdminPermssion permission1 = factory.createPermission();

		AdminPermssion permission2 = factory.createPermission();

		permission1.setLevel("Full Access");

		assertEquals("Full Access", permission1.getLevel());

		assertEquals("Room Managed", permission2.getLevel());
	}

	// TEST 11
	@Test
	void coordinatorShouldStoreProvidedFactory() {

		RoomAdminFactory factory = new RoomAdminFactory();

		ChiefEventCoordinator coordinator = new ChiefEventCoordinator(factory);

		assertSame(factory, coordinator.getFactory());
	}

	// TEST 12
	@Test
	void coordinatorShouldAllowFactoryToBeChanged() {

		RoomAdminFactory factory1 = new RoomAdminFactory();

		RoomAdminFactory factory2 = new RoomAdminFactory();

		ChiefEventCoordinator coordinator = new ChiefEventCoordinator(factory1);

		coordinator.setFactory(factory2);

		assertSame(factory2, coordinator.getFactory());
	}

	// TEST 13
	@Test
	void coordinatorShouldGenerateAdministrator() {

		RoomAdminFactory factory = new RoomAdminFactory();

		ChiefEventCoordinator coordinator = new ChiefEventCoordinator(factory);

		Administrator admin = coordinator.generateAdminAccount("Generated Admin", "generated@yorku.ca");

		assertNotNull(admin);
	}

	// TEST 14
	@Test
	void generatedAdministratorShouldHaveCorrectName() {

		ChiefEventCoordinator coordinator = new ChiefEventCoordinator(new RoomAdminFactory());

		Administrator admin = coordinator.generateAdminAccount("New Admin", "newadmin@yorku.ca");

		assertEquals("New Admin", admin.getName());
	}

	// TEST 15
	@Test
	void generatedAdministratorShouldHaveCorrectEmail() {

		ChiefEventCoordinator coordinator = new ChiefEventCoordinator(new RoomAdminFactory());

		Administrator admin = coordinator.generateAdminAccount("New Admin", "newadmin@yorku.ca");

		assertEquals("newadmin@yorku.ca", admin.getEmail());
	}
}
