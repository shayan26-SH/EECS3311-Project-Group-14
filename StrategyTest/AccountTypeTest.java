package StrategyTest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import model.AccountType;

public class AccountTypeTest {

    @Test
    void studentConstructorTest() {
        AccountType account = new AccountType("Student", 20.0f, true);
        assertEquals("Student", account.getName());
        assertEquals(20.0f, account.getHourlyRate());
        assertEquals(true, account.isRequiresVerification());
    }
    

    @Test
    void facultyConstructorTest() {
        AccountType account = new AccountType("Faculty", 30.0f, true);
        assertEquals("Faculty", account.getName());
        assertEquals(30.0f, account.getHourlyRate());
        assertEquals(true, account.isRequiresVerification());
    }
    
    @Test
    void notNullConstructorTest() {
        AccountType account = new AccountType("Staff", 40.0f, true);
        assertNotNull(account);
    }
    
    @Test
    void PartnerTest() {
        AccountType account = new AccountType("Partner", 50.0f, true);
        assertEquals("Partner", account.getName());
        assertEquals(50.0f, account.getHourlyRate());
        assertEquals(true, account.isRequiresVerification());
    }

    @Test
    void emptyNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new AccountType(null, 10.0f, true));
    }

    @Test
    void emptyStringNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new AccountType("", 10.0f, true));
    }

    @Test
    void blankNameValidation() {
        assertThrows(IllegalArgumentException.class, () -> new AccountType("   ", 10f, true));
    }

    @Test
    void hourlyRateValidation() {
        assertThrows(IllegalArgumentException.class, () -> new AccountType("Faculty", -40.0f, false));
    }

    @Test
    void zeroHourlyRate() {
        AccountType account = new AccountType("SpecialCase", 0.0f, false);
        assertEquals(0.0f, account.getHourlyRate());
    }

    @Test
    void referencesValidation() {
        AccountType a = new AccountType("Student", 20.0f, true);
        AccountType b = new AccountType("Student", 20.0f, true);
        assertEquals(a.getName(), b.getName());
        assertEquals(a.getHourlyRate(), b.getHourlyRate());
        assertNotSame(a, b);
    }
    
}