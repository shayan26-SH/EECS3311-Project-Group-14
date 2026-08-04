package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.AccountType;
import model.PaymentUser;

public class PaymentUserTest {

    private AccountType student = new AccountType("Student", 20f, true);

    @Test
    void constructorTest() {
        PaymentUser user = new PaymentUser("teststudent@my.yorku.ca", "Test Name", student);
        assertEquals("teststudent@my.yorku.ca", user.getEmail());
        assertEquals("Test Name", user.getName());
        assertSame(student, user.getAccountType());
    }

    @Test
    void nullEmailValidation() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentUser(null, "Name", student));
    }

    @Test
    void emptyEmailValidation() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentUser("   ", "Name", student));
    }

    @Test
    void nullNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentUser("teststudent@my.yorku.ca", null, student));
    }

    @Test
    void emptyNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentUser("teststudent@my.yorku.ca", "  ", student));
    }

    @Test
    void nullAccTypeTest() {
        assertThrows(IllegalArgumentException.class, () -> new PaymentUser("teststudent@my.yorku.ca", "Name", null));
    }

    @Test
    void accRefTest() {
        PaymentUser user = new PaymentUser("teststudent@my.yorku.ca", "Name", student);
        assertSame(student, user.getAccountType());
    }

    @Test
    void usersReferencesCheck() {
        AccountType facultyAccount = new AccountType("Faculty", 30.0f, false);
        PaymentUser u1 = new PaymentUser("teststudent@my.yorku.ca", "StudentName", student);
        PaymentUser u2 = new PaymentUser("testfaculty@my.yorku.ca", "FacultyMemberName", facultyAccount);
        assertNotSame(u1, u2);
    }
    
    @Test
    void accountsReferencesCheck1() {
        AccountType facultyAccount = new AccountType("Faculty", 30.0f, false);
        PaymentUser u1 = new PaymentUser("teststudent@my.yorku.ca", "StudentName", student);
        PaymentUser u2 = new PaymentUser("testfaculty@my.yorku.ca", "FacultyMemberName", facultyAccount);
        assertNotSame(u1.getAccountType(), u2.getAccountType());
    }
    
    @Test
    void accountsReferencesCheck2() {
        PaymentUser u1 = new PaymentUser("teststudent@my.yorku.ca", "StudentName", student);
        PaymentUser u2 = new PaymentUser("testfaculty@my.yorku.ca", "FacultyMemberName", student);
        assertSame(u1.getAccountType(), u2.getAccountType());
    }

    @Test
    void userAccTypeTest1() {
    	PaymentUser u1 = new PaymentUser("teststudent@my.yorku.ca", "StudentName", student);
        assertEquals(true, u1.getAccountType().isRequiresVerification());
    }

    @Test
    void userAccTypeTest2() {
    	PaymentUser u1 = new PaymentUser("teststudent@my.yorku.ca", "StudentName", student);
        assertEquals("Student", u1.getAccountType().getName());
    }

}