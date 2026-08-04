import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        float float9 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass14 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("hi!", paymentUser9, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        boolean boolean17 = accountType15.isRequiresVerification();
        java.lang.Class<?> wildcardClass18 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass15 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("hi!", paymentUser8, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getName();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType15);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        java.lang.String str14 = paymentUser10.getName();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.String str17 = accountType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        java.lang.String str10 = accountType6.getName();
        float float11 = accountType6.getHourlyRate();
        java.lang.String str12 = accountType6.getName();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType14 = paymentUser13.getAccountType();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser13, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        java.lang.String str14 = paymentUser11.getName();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType16);
        java.lang.String str18 = paymentUser17.getName();
        java.lang.String str19 = paymentUser17.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser17, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        float float11 = accountType10.getHourlyRate();
        java.lang.String str12 = accountType10.getName();
        java.lang.Class<?> wildcardClass13 = accountType10.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        float float22 = accountType20.getHourlyRate();
        java.lang.Class<?> wildcardClass23 = accountType20.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass11 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        float float10 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str12 = paymentUser11.getName();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str16 = accountType14.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "hi!", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass16 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        // The following exception was thrown during execution in test generation
        try {
            model.AccountType accountType3 = new model.AccountType("", (float) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        boolean boolean17 = accountType15.isRequiresVerification();
        boolean boolean18 = accountType15.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        boolean boolean12 = accountType3.isRequiresVerification();
        boolean boolean13 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        boolean boolean20 = accountType19.isRequiresVerification();
        float float21 = accountType19.getHourlyRate();
        java.lang.String str22 = accountType19.getName();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType19);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getEmail();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str19 = paymentUser18.getName();
        java.lang.Class<?> wildcardClass20 = paymentUser18.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 0L, true);
        float float7 = accountType6.getHourlyRate();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking11 = new model.Booking("", paymentUser9, timeSlot10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getEmail();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str17 = paymentUser16.getEmail();
        java.lang.String str18 = paymentUser16.getName();
        java.lang.String str19 = paymentUser16.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        java.lang.String str15 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', false);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 1, false);
        float float4 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser15, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        float float20 = accountType18.getHourlyRate();
        boolean boolean21 = accountType18.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        float float15 = accountType14.getHourlyRate();
        boolean boolean16 = accountType14.isRequiresVerification();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser17, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 100, true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = accountType15.getName();
        java.lang.String str17 = accountType15.getName();
        java.lang.String str18 = accountType15.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        java.lang.String str18 = accountType16.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = paymentUser13.getEmail();
        model.AccountType accountType15 = paymentUser13.getAccountType();
        java.lang.String str16 = paymentUser13.getName();
        java.lang.String str17 = paymentUser13.getEmail();
        model.AccountType accountType18 = paymentUser13.getAccountType();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser8, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = accountType12.getName();
        boolean boolean14 = accountType12.isRequiresVerification();
        boolean boolean15 = accountType12.isRequiresVerification();
        java.lang.Class<?> wildcardClass16 = accountType12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        boolean boolean12 = accountType5.isRequiresVerification();
        boolean boolean13 = accountType5.isRequiresVerification();
        float float14 = accountType5.getHourlyRate();
        float float15 = accountType5.getHourlyRate();
        java.lang.String str16 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        java.lang.String str9 = accountType3.getName();
        java.lang.String str10 = accountType3.getName();
        float float11 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        float float16 = accountType14.getHourlyRate();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.Class<?> wildcardClass18 = paymentUser17.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getName();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        java.lang.String str17 = accountType16.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        model.AccountType accountType5 = new model.AccountType("hi!", 0.0f, true);
        boolean boolean6 = accountType5.isRequiresVerification();
        float float7 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser8 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = accountType5.getName();
        java.lang.Class<?> wildcardClass8 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = accountType18.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean12 = accountType5.isRequiresVerification();
        java.lang.String str13 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        java.lang.String str9 = accountType7.getName();
        float float10 = accountType7.getHourlyRate();
        java.lang.String str11 = accountType7.getName();
        float float12 = accountType7.getHourlyRate();
        java.lang.String str13 = accountType7.getName();
        boolean boolean14 = accountType7.isRequiresVerification();
        float float15 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str18 = paymentUser17.getName();
        java.lang.String str19 = paymentUser17.getEmail();
        model.AccountType accountType20 = paymentUser17.getAccountType();
        java.lang.Class<?> wildcardClass21 = accountType20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass20 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str15 = paymentUser14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        float float11 = accountType3.getHourlyRate();
        java.lang.String str12 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        // The following exception was thrown during execution in test generation
        try {
            model.InstitutionalBillingStrategy institutionalBillingStrategy3 = new model.InstitutionalBillingStrategy("hi!", (long) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account number must contain at least 7 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser8, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getName();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        java.lang.Class<?> wildcardClass21 = paymentUser20.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getEmail();
        java.lang.String str14 = paymentUser11.getEmail();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        float float16 = accountType15.getHourlyRate();
        java.lang.String str17 = accountType15.getName();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType15);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser18, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getName();
        java.lang.String str20 = paymentUser9.getName();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("hi!", paymentUser9, timeSlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        java.lang.String str11 = accountType9.getName();
        float float12 = accountType9.getHourlyRate();
        java.lang.String str13 = accountType9.getName();
        float float14 = accountType9.getHourlyRate();
        java.lang.String str15 = accountType9.getName();
        boolean boolean16 = accountType9.isRequiresVerification();
        float float17 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getEmail();
        model.AccountType accountType22 = paymentUser19.getAccountType();
        java.lang.String str23 = accountType22.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser24 = new model.PaymentUser("", "hi!", accountType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = accountType19.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        java.lang.String str17 = paymentUser9.getName();
        java.lang.String str18 = paymentUser9.getEmail();
        java.lang.String str19 = paymentUser9.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        float float9 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        model.AccountType accountType6 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str7 = accountType6.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking10 = new model.Booking("hi!", paymentUser8, timeSlot9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass13 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        float float20 = accountType19.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser9, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 0L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        java.lang.Class<?> wildcardClass8 = paymentUser6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        float float10 = accountType6.getHourlyRate();
        float float11 = accountType6.getHourlyRate();
        boolean boolean12 = accountType6.isRequiresVerification();
        boolean boolean13 = accountType6.isRequiresVerification();
        boolean boolean14 = accountType6.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str16 = paymentUser15.getEmail();
        java.lang.String str17 = paymentUser15.getName();
        java.lang.String str18 = paymentUser15.getName();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser15, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) -1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        java.lang.String str19 = paymentUser10.getEmail();
        model.AccountType accountType20 = paymentUser10.getAccountType();
        model.AccountType accountType21 = paymentUser10.getAccountType();
        java.lang.String str22 = paymentUser10.getName();
        model.AccountType accountType23 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser24 = new model.PaymentUser("hi!", "hi!", accountType23);
        model.AccountType accountType25 = paymentUser24.getAccountType();
        float float26 = accountType25.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType25);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        float float16 = accountType15.getHourlyRate();
        java.lang.String str17 = accountType15.getName();
        boolean boolean18 = accountType15.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = accountType14.getName();
        java.lang.String str16 = accountType14.getName();
        java.lang.String str17 = accountType14.getName();
        float float18 = accountType14.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass13 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        java.lang.String str14 = paymentUser11.getName();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        java.lang.String str16 = accountType15.getName();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType15);
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser17, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser8, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        model.TimeSlot timeSlot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking11 = new model.Booking("", paymentUser7, timeSlot10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '4', true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        boolean boolean14 = accountType5.isRequiresVerification();
        boolean boolean15 = accountType5.isRequiresVerification();
        java.lang.String str16 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        java.lang.String str16 = paymentUser10.getEmail();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        boolean boolean15 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass16 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        float float12 = accountType11.getHourlyRate();
        java.lang.String str13 = accountType11.getName();
        java.lang.String str14 = accountType11.getName();
        float float15 = accountType11.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '#', true);
        float float4 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        java.lang.String str14 = accountType5.getName();
        java.lang.String str15 = accountType5.getName();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str17 = paymentUser16.getName();
        java.lang.String str18 = paymentUser16.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1, true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str19 = paymentUser18.getName();
        java.lang.String str20 = paymentUser18.getEmail();
        java.lang.String str21 = paymentUser18.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str17 = paymentUser16.getName();
        java.lang.String str18 = paymentUser16.getName();
        java.lang.String str19 = paymentUser16.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser16, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.Class<?> wildcardClass12 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        float float15 = accountType13.getHourlyRate();
        boolean boolean16 = accountType13.isRequiresVerification();
        boolean boolean17 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass18 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        float float18 = accountType17.getHourlyRate();
        java.lang.String str19 = accountType17.getName();
        float float20 = accountType17.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        float float13 = accountType11.getHourlyRate();
        java.lang.String str14 = accountType11.getName();
        java.lang.Class<?> wildcardClass15 = accountType11.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        boolean boolean12 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass12 = accountType5.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        float float10 = accountType3.getHourlyRate();
        java.lang.String str11 = accountType3.getName();
        java.lang.Class<?> wildcardClass12 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 'a', false);
        java.lang.Class<?> wildcardClass4 = accountType3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        boolean boolean8 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = accountType16.getName();
        java.lang.Class<?> wildcardClass18 = accountType16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        java.lang.String str9 = accountType7.getName();
        float float10 = accountType7.getHourlyRate();
        float float11 = accountType7.getHourlyRate();
        float float12 = accountType7.getHourlyRate();
        float float13 = accountType7.getHourlyRate();
        boolean boolean14 = accountType7.isRequiresVerification();
        float float15 = accountType7.getHourlyRate();
        java.lang.String str16 = accountType7.getName();
        java.lang.String str17 = accountType7.getName();
        float float18 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', false);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 1, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        float float20 = accountType18.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
        model.AccountType accountType19 = paymentUser9.getAccountType();
        model.AccountType accountType20 = paymentUser9.getAccountType();
        java.lang.String str21 = paymentUser9.getName();
        java.lang.String str22 = paymentUser9.getEmail();
        java.lang.String str23 = paymentUser9.getName();
        model.TimeSlot timeSlot24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking25 = new model.Booking("hi!", paymentUser9, timeSlot24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        float float18 = accountType17.getHourlyRate();
        boolean boolean19 = accountType17.isRequiresVerification();
        java.lang.String str20 = accountType17.getName();
        float float21 = accountType17.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float14 = accountType5.getHourlyRate();
        java.lang.String str15 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        model.AccountType accountType3 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getEmail();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass19 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', false);
        java.lang.String str6 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        float float12 = accountType11.getHourlyRate();
        java.lang.String str13 = accountType11.getName();
        java.lang.Class<?> wildcardClass14 = accountType11.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        float float18 = accountType17.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "", accountType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        float float10 = accountType9.getHourlyRate();
        float float11 = accountType9.getHourlyRate();
        java.lang.String str12 = accountType9.getName();
        java.lang.Class<?> wildcardClass13 = accountType9.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser8, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        model.AccountType accountType6 = new model.AccountType("hi!", 100.0f, false);
        float float7 = accountType6.getHourlyRate();
        float float8 = accountType6.getHourlyRate();
        boolean boolean9 = accountType6.isRequiresVerification();
        float float10 = accountType6.getHourlyRate();
        float float11 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str13 = paymentUser12.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser12, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        java.lang.Class<?> wildcardClass12 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser15, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 0L, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getEmail();
        model.TimeSlot timeSlot9 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking10 = new model.Booking("hi!", paymentUser7, timeSlot9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 100, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass11 = accountType10.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser12.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 'a', false);
        float float9 = accountType8.getHourlyRate();
        float float10 = accountType8.getHourlyRate();
        java.lang.String str11 = accountType8.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str14 = paymentUser13.getName();
        java.lang.String str15 = paymentUser13.getName();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser13, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        java.lang.String str14 = paymentUser12.getName();
        java.lang.String str15 = paymentUser12.getEmail();
        java.lang.Class<?> wildcardClass16 = paymentUser12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        float float7 = accountType6.getHourlyRate();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str11 = paymentUser10.getEmail();
        model.TimeSlot timeSlot12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking13 = new model.Booking("hi!", paymentUser10, timeSlot12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.AccountType accountType19 = paymentUser9.getAccountType();
        java.lang.String str20 = paymentUser9.getName();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser9, timeSlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = accountType10.getName();
        boolean boolean12 = accountType10.isRequiresVerification();
        java.lang.Class<?> wildcardClass13 = accountType10.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("", "", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getName();
        java.lang.String str17 = paymentUser9.getEmail();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser8, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        float float17 = accountType16.getHourlyRate();
        float float18 = accountType16.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = accountType16.getName();
        boolean boolean18 = accountType16.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        float float19 = accountType18.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        java.lang.Class<?> wildcardClass11 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getEmail();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        boolean boolean16 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = accountType14.getName();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str17 = accountType14.getName();
        float float18 = accountType14.getHourlyRate();
        boolean boolean19 = accountType14.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("", "", accountType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("hi!", paymentUser8, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        model.AccountType accountType15 = paymentUser12.getAccountType();
        java.lang.String str16 = paymentUser12.getEmail();
        java.lang.String str17 = paymentUser12.getName();
        java.lang.String str18 = paymentUser12.getName();
        model.AccountType accountType19 = paymentUser12.getAccountType();
        java.lang.String str20 = accountType19.getName();
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType19);
        model.AccountType accountType22 = paymentUser21.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getEmail();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser14, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
        java.lang.Class<?> wildcardClass15 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass19 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str13 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        boolean boolean12 = accountType3.isRequiresVerification();
        boolean boolean13 = accountType3.isRequiresVerification();
        float float14 = accountType3.getHourlyRate();
        boolean boolean15 = accountType3.isRequiresVerification();
        float float16 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        java.lang.String str9 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser8, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getEmail();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.String str17 = accountType15.getName();
        java.lang.Class<?> wildcardClass18 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        float float12 = accountType3.getHourlyRate();
        boolean boolean13 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = accountType12.getName();
        float float14 = accountType12.getHourlyRate();
        float float15 = accountType12.getHourlyRate();
        boolean boolean16 = accountType12.isRequiresVerification();
        float float17 = accountType12.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        float float10 = accountType6.getHourlyRate();
        float float11 = accountType6.getHourlyRate();
        float float12 = accountType6.getHourlyRate();
        boolean boolean13 = accountType6.isRequiresVerification();
        float float14 = accountType6.getHourlyRate();
        java.lang.String str15 = accountType6.getName();
        java.lang.String str16 = accountType6.getName();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str18 = paymentUser17.getName();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser17, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0L, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 1, false);
        float float6 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        boolean boolean12 = accountType5.isRequiresVerification();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str15 = paymentUser14.getName();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        java.lang.Class<?> wildcardClass17 = accountType16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 100, false);
        float float4 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser9, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        float float16 = accountType15.getHourlyRate();
        float float17 = accountType15.getHourlyRate();
        java.lang.String str18 = accountType15.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        java.lang.String str14 = accountType5.getName();
        java.lang.String str15 = accountType5.getName();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType17 = paymentUser16.getAccountType();
        model.AccountType accountType18 = paymentUser16.getAccountType();
        java.lang.Class<?> wildcardClass19 = paymentUser16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        float float20 = accountType19.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        java.lang.String str17 = paymentUser9.getEmail();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser8, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        float float16 = accountType15.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        model.AccountType accountType14 = paymentUser13.getAccountType();
        java.lang.Class<?> wildcardClass15 = paymentUser13.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser8, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        java.lang.Class<?> wildcardClass13 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        model.AccountType accountType20 = paymentUser18.getAccountType();
        java.lang.String str21 = accountType20.getName();
        float float22 = accountType20.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        model.AccountType accountType20 = paymentUser18.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass11 = paymentUser7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        model.AccountType accountType6 = new model.AccountType("hi!", 100.0f, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.TimeSlot timeSlot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking11 = new model.Booking("", paymentUser8, timeSlot10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        float float17 = accountType16.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
        java.lang.String str19 = paymentUser9.getEmail();
        model.AccountType accountType20 = paymentUser9.getAccountType();
        java.lang.String str21 = paymentUser9.getName();
        model.AccountType accountType22 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("", paymentUser9, timeSlot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        java.lang.String str11 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        boolean boolean17 = accountType15.isRequiresVerification();
        float float18 = accountType15.getHourlyRate();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType15);
        model.AccountType accountType20 = paymentUser19.getAccountType();
        java.lang.String str21 = accountType20.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        float float12 = accountType11.getHourlyRate();
        boolean boolean13 = accountType11.isRequiresVerification();
        java.lang.String str14 = accountType11.getName();
        java.lang.Class<?> wildcardClass15 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        java.lang.Class<?> wildcardClass16 = accountType14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        boolean boolean14 = accountType12.isRequiresVerification();
        boolean boolean15 = accountType12.isRequiresVerification();
        boolean boolean16 = accountType12.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        java.lang.String str20 = paymentUser10.getEmail();
        model.AccountType accountType21 = paymentUser10.getAccountType();
        java.lang.String str22 = accountType21.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        java.lang.String str16 = paymentUser10.getEmail();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getEmail();
        java.lang.String str18 = paymentUser9.getEmail();
        model.AccountType accountType19 = paymentUser9.getAccountType();
        model.AccountType accountType20 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser9, timeSlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = accountType14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean16 = accountType5.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str12 = paymentUser11.getName();
        java.lang.String str13 = paymentUser11.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser11.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getName();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.Class<?> wildcardClass20 = paymentUser19.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getEmail();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) -1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        float float12 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        model.AccountType accountType6 = new model.AccountType("hi!", 100.0f, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getEmail();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("", paymentUser8, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "hi!", accountType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass13 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        boolean boolean11 = accountType3.isRequiresVerification();
        boolean boolean12 = accountType3.isRequiresVerification();
        float float13 = accountType3.getHourlyRate();
        boolean boolean14 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.String str17 = accountType15.getName();
        boolean boolean18 = accountType15.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        java.lang.String str17 = accountType16.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 10, true);
        boolean boolean6 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getEmail();
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.String str22 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser9, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean9 = accountType7.isRequiresVerification();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        java.lang.String str17 = paymentUser9.getName();
        java.lang.String str18 = paymentUser9.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass16 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        boolean boolean16 = accountType14.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser9, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        float float10 = accountType6.getHourlyRate();
        float float11 = accountType6.getHourlyRate();
        boolean boolean12 = accountType6.isRequiresVerification();
        java.lang.String str13 = accountType6.getName();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("hi!", paymentUser14, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        java.lang.String str10 = accountType6.getName();
        float float11 = accountType6.getHourlyRate();
        boolean boolean12 = accountType6.isRequiresVerification();
        java.lang.String str13 = accountType6.getName();
        boolean boolean14 = accountType6.isRequiresVerification();
        boolean boolean15 = accountType6.isRequiresVerification();
        float float16 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str18 = paymentUser17.getName();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser17, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str16 = paymentUser15.getName();
        java.lang.String str17 = paymentUser15.getName();
        java.lang.String str18 = paymentUser15.getName();
        model.AccountType accountType19 = paymentUser15.getAccountType();
        java.lang.Class<?> wildcardClass20 = accountType19.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getName();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "hi!", accountType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        java.lang.String str8 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
        java.lang.String str19 = paymentUser9.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser9, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        java.lang.String str12 = accountType5.getName();
        java.lang.String str13 = accountType5.getName();
        float float14 = accountType5.getHourlyRate();
        boolean boolean15 = accountType5.isRequiresVerification();
        boolean boolean16 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        java.lang.String str16 = paymentUser10.getEmail();
        java.lang.String str17 = paymentUser10.getEmail();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        float float20 = accountType19.getHourlyRate();
        boolean boolean21 = accountType19.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("", "", accountType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = accountType14.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) -1, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        model.AccountType accountType20 = paymentUser9.getAccountType();
        model.AccountType accountType21 = paymentUser9.getAccountType();
        model.AccountType accountType22 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("", paymentUser9, timeSlot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = paymentUser9.getName();
        java.lang.String str18 = paymentUser9.getName();
        model.AccountType accountType19 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser9, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("hi!", paymentUser9, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        java.lang.String str10 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        // The following exception was thrown during execution in test generation
        try {
            model.AccountType accountType3 = new model.AccountType("", (float) (short) 1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass16 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        boolean boolean16 = accountType14.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        boolean boolean18 = accountType17.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        boolean boolean13 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 0, true);
        float float6 = accountType5.getHourlyRate();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = accountType10.getName();
        boolean boolean12 = accountType10.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "", accountType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getEmail();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("hi!", paymentUser14, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getName();
        java.lang.String str22 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        java.lang.String str8 = accountType3.getName();
        java.lang.Class<?> wildcardClass9 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        model.AccountType accountType7 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "", accountType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        java.lang.String str17 = accountType16.getName();
        boolean boolean18 = accountType16.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "", accountType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getName();
        java.lang.String str17 = paymentUser9.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getName();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        float float16 = accountType15.getHourlyRate();
        boolean boolean17 = accountType15.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        java.lang.String str13 = accountType11.getName();
        java.lang.Class<?> wildcardClass14 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = accountType14.getName();
        java.lang.String str16 = accountType14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getEmail();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser9, timeSlot16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getName();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser9, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("", paymentUser8, timeSlot14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        java.lang.String str14 = paymentUser11.getName();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        java.lang.String str16 = accountType15.getName();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType15);
        model.AccountType accountType18 = paymentUser17.getAccountType();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser17, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        float float11 = accountType3.getHourlyRate();
        boolean boolean12 = accountType3.isRequiresVerification();
        java.lang.String str13 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        java.lang.String str11 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        float float13 = accountType11.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 97.0f + "'", float13 == 97.0f);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        java.lang.String str13 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }
}

