import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("hi!", paymentUser8, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        java.lang.String str14 = paymentUser10.getName();
        java.lang.String str15 = paymentUser10.getName();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        float float17 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        boolean boolean11 = accountType10.isRequiresVerification();
        boolean boolean12 = accountType10.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
        model.AccountType accountType17 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        model.AccountType accountType21 = paymentUser20.getAccountType();
        model.AccountType accountType22 = paymentUser20.getAccountType();
        java.lang.String str23 = accountType22.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser24 = new model.PaymentUser("", "", accountType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser8, timeSlot17);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
        boolean boolean15 = accountType13.isRequiresVerification();
        boolean boolean16 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass17 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float13 = accountType7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        java.lang.String str16 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        boolean boolean11 = accountType10.isRequiresVerification();
        float float12 = accountType10.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getEmail();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        float float13 = accountType3.getHourlyRate();
        boolean boolean14 = accountType3.isRequiresVerification();
        boolean boolean15 = accountType3.isRequiresVerification();
        java.lang.String str16 = accountType3.getName();
        java.lang.String str17 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        java.lang.String str17 = paymentUser10.getName();
        java.lang.String str18 = paymentUser10.getEmail();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        java.lang.String str20 = paymentUser10.getName();
        model.AccountType accountType21 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "", accountType21);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        float float15 = accountType13.getHourlyRate();
        float float16 = accountType13.getHourlyRate();
        java.lang.String str17 = accountType13.getName();
        java.lang.Class<?> wildcardClass18 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getEmail();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.Class<?> wildcardClass10 = paymentUser6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            model.AccountType accountType3 = new model.AccountType("hi!", (float) (-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Hourly rate cannot be negative.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        java.lang.String str16 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType9);
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) ' ', true);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        boolean boolean12 = accountType7.isRequiresVerification();
        boolean boolean13 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        float float16 = accountType15.getHourlyRate();
        java.lang.String str17 = accountType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 32.0f + "'", float16 == 32.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
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
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser14, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        java.lang.String str16 = accountType14.getName();
        java.lang.String str17 = accountType14.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getName();
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.String str22 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        boolean boolean18 = accountType17.isRequiresVerification();
        java.lang.String str19 = accountType17.getName();
        float float20 = accountType17.getHourlyRate();
        boolean boolean21 = accountType17.isRequiresVerification();
        java.lang.String str22 = accountType17.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        boolean boolean9 = accountType8.isRequiresVerification();
        java.lang.String str10 = accountType8.getName();
        float float11 = accountType8.getHourlyRate();
        java.lang.String str12 = accountType8.getName();
        java.lang.String str13 = accountType8.getName();
        boolean boolean14 = accountType8.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getEmail();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        java.lang.String str17 = paymentUser14.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser14, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        java.lang.String str16 = paymentUser10.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
        boolean boolean19 = accountType17.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        java.lang.String str16 = paymentUser11.getName();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.String str20 = paymentUser19.getEmail();
        model.AccountType accountType21 = paymentUser19.getAccountType();
        model.AccountType accountType22 = paymentUser19.getAccountType();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("", paymentUser19, timeSlot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("", "hi!", accountType19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        java.lang.String str15 = accountType11.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        float float15 = accountType14.getHourlyRate();
        java.lang.String str16 = accountType14.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType14);
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1L, true);
        float float4 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        float float15 = accountType13.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        java.lang.String str17 = paymentUser16.getEmail();
        java.lang.String str18 = paymentUser16.getName();
        java.lang.String str19 = paymentUser16.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getEmail();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str16 = paymentUser15.getEmail();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser15, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass14 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass17 = accountType16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
        model.AccountType accountType17 = paymentUser7.getAccountType();
        float float18 = accountType17.getHourlyRate();
        boolean boolean19 = accountType17.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        java.lang.String str11 = accountType5.getName();
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
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = accountType14.getName();
        java.lang.Class<?> wildcardClass16 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
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
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        model.AccountType accountType18 = paymentUser17.getAccountType();
        model.AccountType accountType19 = paymentUser17.getAccountType();
        model.AccountType accountType20 = paymentUser17.getAccountType();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("hi!", paymentUser17, timeSlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1, true);
        java.lang.Class<?> wildcardClass4 = accountType3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getName();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        java.lang.String str17 = paymentUser10.getEmail();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        java.lang.String str20 = accountType19.getName();
        float float21 = accountType19.getHourlyRate();
        float float22 = accountType19.getHourlyRate();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType19);
        model.AccountType accountType24 = paymentUser23.getAccountType();
        model.TimeSlot timeSlot25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking26 = new model.Booking("hi!", paymentUser23, timeSlot25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        java.lang.String str16 = paymentUser11.getName();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.String str20 = paymentUser19.getEmail();
        java.lang.String str21 = paymentUser19.getName();
        java.lang.String str22 = paymentUser19.getEmail();
        java.lang.String str23 = paymentUser19.getName();
        java.lang.String str24 = paymentUser19.getEmail();
        java.lang.String str25 = paymentUser19.getName();
        model.TimeSlot timeSlot26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking27 = new model.Booking("hi!", paymentUser19, timeSlot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "hi!", accountType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.String str17 = accountType15.getName();
        float float18 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        java.lang.String str20 = paymentUser9.getEmail();
        model.AccountType accountType21 = paymentUser9.getAccountType();
        java.lang.String str22 = paymentUser9.getName();
        model.AccountType accountType23 = paymentUser9.getAccountType();
        java.lang.String str24 = paymentUser9.getName();
        model.TimeSlot timeSlot25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking26 = new model.Booking("", paymentUser9, timeSlot25);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        java.lang.String str9 = accountType7.getName();
        float float10 = accountType7.getHourlyRate();
        java.lang.String str11 = accountType7.getName();
        float float12 = accountType7.getHourlyRate();
        boolean boolean13 = accountType7.isRequiresVerification();
        java.lang.String str14 = accountType7.getName();
        boolean boolean15 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType17 = paymentUser16.getAccountType();
        model.AccountType accountType18 = paymentUser16.getAccountType();
        java.lang.String str19 = accountType18.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("", "", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str13 = paymentUser12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        boolean boolean18 = accountType16.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.String str15 = accountType13.getName();
        boolean boolean16 = accountType13.isRequiresVerification();
        boolean boolean17 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser8, timeSlot19);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getName();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        java.lang.String str19 = paymentUser18.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser18, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        java.lang.String str16 = accountType13.getName();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str18 = accountType13.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        java.lang.String str21 = paymentUser9.getEmail();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("", paymentUser9, timeSlot22);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = accountType11.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        float float15 = accountType13.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 0L, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        float float15 = accountType14.getHourlyRate();
        java.lang.String str16 = accountType14.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        java.lang.String str10 = accountType6.getName();
        float float11 = accountType6.getHourlyRate();
        java.lang.String str12 = accountType6.getName();
        boolean boolean13 = accountType6.isRequiresVerification();
        float float14 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        model.AccountType accountType17 = paymentUser15.getAccountType();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser15, timeSlot18);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
        java.lang.String str18 = accountType17.getName();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
        java.lang.String str19 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.AccountType accountType20 = paymentUser10.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("", "", accountType20);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.lang.String str25 = accountType23.getName();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        float float17 = accountType16.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = accountType8.getName();
        java.lang.Class<?> wildcardClass10 = accountType8.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str15 = paymentUser14.getEmail();
        java.lang.String str16 = paymentUser14.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        java.lang.Class<?> wildcardClass11 = accountType5.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
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
        java.lang.String str22 = accountType20.getName();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.lang.String str17 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        java.lang.String str16 = paymentUser11.getName();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType20 = paymentUser19.getAccountType();
        model.AccountType accountType21 = paymentUser19.getAccountType();
        model.AccountType accountType22 = paymentUser19.getAccountType();
        java.lang.String str23 = paymentUser19.getName();
        java.lang.String str24 = paymentUser19.getEmail();
        model.TimeSlot timeSlot25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking26 = new model.Booking("", paymentUser19, timeSlot25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser8, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getName();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "", accountType16);
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
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        boolean boolean18 = accountType17.isRequiresVerification();
        java.lang.String str19 = accountType17.getName();
        float float20 = accountType17.getHourlyRate();
        boolean boolean21 = accountType17.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        model.AccountType accountType3 = new model.AccountType("hi!", 35.0f, true);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.TimeSlot timeSlot12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking13 = new model.Booking("hi!", paymentUser8, timeSlot12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 100L, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getName();
        model.TimeSlot timeSlot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking11 = new model.Booking("hi!", paymentUser7, timeSlot10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = accountType15.getName();
        float float17 = accountType15.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType15);
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getEmail();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass18 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        java.lang.String str13 = accountType5.getName();
        java.lang.String str14 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        float float19 = accountType18.getHourlyRate();
        float float20 = accountType18.getHourlyRate();
        float float21 = accountType18.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "", accountType18);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        java.lang.String str10 = accountType8.getName();
        float float11 = accountType8.getHourlyRate();
        java.lang.String str12 = accountType8.getName();
        float float13 = accountType8.getHourlyRate();
        java.lang.String str14 = accountType8.getName();
        boolean boolean15 = accountType8.isRequiresVerification();
        float float16 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str19 = paymentUser18.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser18, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        java.lang.String str9 = accountType3.getName();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        boolean boolean12 = accountType3.isRequiresVerification();
        boolean boolean13 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass14 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
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
        java.lang.String str19 = paymentUser18.getEmail();
        java.lang.String str20 = paymentUser18.getName();
        java.lang.String str21 = paymentUser18.getName();
        model.AccountType accountType22 = paymentUser18.getAccountType();
        java.lang.Class<?> wildcardClass23 = paymentUser18.getClass();
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
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass11 = paymentUser7.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
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
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType21);
        boolean boolean23 = accountType21.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = accountType5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        java.lang.Class<?> wildcardClass22 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        boolean boolean17 = accountType14.isRequiresVerification();
        java.lang.String str18 = accountType14.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass14 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        java.lang.String str10 = accountType8.getName();
        float float11 = accountType8.getHourlyRate();
        java.lang.String str12 = accountType8.getName();
        float float13 = accountType8.getHourlyRate();
        java.lang.String str14 = accountType8.getName();
        boolean boolean15 = accountType8.isRequiresVerification();
        float float16 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str19 = paymentUser18.getName();
        java.lang.String str20 = paymentUser18.getEmail();
        model.AccountType accountType21 = paymentUser18.getAccountType();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("", paymentUser18, timeSlot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 100, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        boolean boolean8 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.String str19 = paymentUser18.getEmail();
        java.lang.String str20 = paymentUser18.getName();
        java.lang.String str21 = paymentUser18.getEmail();
        java.lang.String str22 = paymentUser18.getName();
        java.lang.String str23 = paymentUser18.getEmail();
        java.lang.Class<?> wildcardClass24 = paymentUser18.getClass();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass16 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        float float17 = accountType16.getHourlyRate();
        float float18 = accountType16.getHourlyRate();
        float float19 = accountType16.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        float float10 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser8 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        model.AccountType accountType18 = paymentUser10.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        float float20 = accountType18.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "hi!", accountType18);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        float float18 = accountType17.getHourlyRate();
        boolean boolean19 = accountType17.isRequiresVerification();
        float float20 = accountType17.getHourlyRate();
        float float21 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '#', false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getName();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        float float16 = accountType15.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        java.lang.String str16 = accountType14.getName();
        java.lang.Class<?> wildcardClass17 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean12 = accountType5.isRequiresVerification();
        boolean boolean13 = accountType5.isRequiresVerification();
        java.lang.String str14 = accountType5.getName();
        java.lang.Class<?> wildcardClass15 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        java.lang.String str15 = paymentUser7.getEmail();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 100, false);
        float float6 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 0L, false);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str14 = paymentUser13.getName();
        java.lang.String str15 = paymentUser13.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        boolean boolean20 = accountType19.isRequiresVerification();
        boolean boolean21 = accountType19.isRequiresVerification();
        float float22 = accountType19.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        java.lang.String str16 = paymentUser11.getName();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType20 = paymentUser19.getAccountType();
        model.AccountType accountType21 = paymentUser19.getAccountType();
        java.lang.String str22 = paymentUser19.getEmail();
        model.AccountType accountType23 = paymentUser19.getAccountType();
        model.AccountType accountType24 = paymentUser19.getAccountType();
        model.AccountType accountType25 = paymentUser19.getAccountType();
        model.TimeSlot timeSlot26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking27 = new model.Booking("hi!", paymentUser19, timeSlot26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType24);
        org.junit.Assert.assertNotNull(accountType25);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        java.lang.String str17 = paymentUser9.getEmail();
        java.lang.String str18 = paymentUser9.getName();
        java.lang.String str19 = paymentUser9.getName();
        java.lang.String str20 = paymentUser9.getName();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        float float17 = accountType14.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
            model.Booking booking20 = new model.Booking("", paymentUser9, timeSlot19);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = accountType8.getName();
        boolean boolean10 = accountType8.isRequiresVerification();
        boolean boolean11 = accountType8.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass14 = paymentUser13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = paymentUser13.getEmail();
        java.lang.String str15 = paymentUser13.getEmail();
        java.lang.String str16 = paymentUser13.getName();
        java.lang.String str17 = paymentUser13.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        float float12 = accountType3.getHourlyRate();
        java.lang.String str13 = accountType3.getName();
        float float14 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        model.AccountType accountType14 = paymentUser13.getAccountType();
        java.lang.String str15 = paymentUser13.getName();
        model.AccountType accountType16 = paymentUser13.getAccountType();
        java.lang.String str17 = paymentUser13.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        java.lang.Class<?> wildcardClass14 = accountType12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("hi!", paymentUser7, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        java.lang.String str18 = paymentUser8.getName();
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
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        float float12 = accountType3.getHourlyRate();
        float float13 = accountType3.getHourlyRate();
        java.lang.String str14 = accountType3.getName();
        java.lang.String str15 = accountType3.getName();
        boolean boolean16 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getEmail();
        model.AccountType accountType22 = paymentUser8.getAccountType();
        float float23 = accountType22.getHourlyRate();
        java.lang.String str24 = accountType22.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        float float20 = accountType19.getHourlyRate();
        java.lang.Class<?> wildcardClass21 = accountType19.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str17 = paymentUser16.getEmail();
        java.lang.String str18 = paymentUser16.getName();
        java.lang.String str19 = paymentUser16.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("", paymentUser7, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.String str14 = accountType12.getName();
        boolean boolean15 = accountType12.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "", accountType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        java.lang.String str24 = paymentUser9.getEmail();
        model.TimeSlot timeSlot25 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking26 = new model.Booking("hi!", paymentUser9, timeSlot25);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        float float17 = accountType15.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
            model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        float float18 = accountType17.getHourlyRate();
        java.lang.String str19 = accountType17.getName();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        float float18 = accountType17.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = accountType17.getClass();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        boolean boolean10 = accountType9.isRequiresVerification();
        java.lang.String str11 = accountType9.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
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
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        java.lang.String str9 = accountType3.getName();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        boolean boolean12 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        float float13 = accountType3.getHourlyRate();
        boolean boolean14 = accountType3.isRequiresVerification();
        boolean boolean15 = accountType3.isRequiresVerification();
        java.lang.String str16 = accountType3.getName();
        boolean boolean17 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        boolean boolean14 = accountType12.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getName();
        model.AccountType accountType21 = paymentUser8.getAccountType();
        float float22 = accountType21.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.String str15 = accountType13.getName();
        java.lang.Class<?> wildcardClass16 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        float float11 = accountType5.getHourlyRate();
        java.lang.String str12 = accountType5.getName();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser8, timeSlot19);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        java.lang.String str20 = accountType15.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("hi!", paymentUser9, timeSlot22);
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
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getEmail();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        float float17 = accountType16.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "", accountType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        boolean boolean18 = accountType17.isRequiresVerification();
        float float19 = accountType17.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        model.AccountType accountType21 = paymentUser18.getAccountType();
        java.lang.String str22 = accountType21.getName();
        float float23 = accountType21.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("hi!", paymentUser8, timeSlot19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        model.AccountType accountType18 = paymentUser8.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        java.lang.String str20 = accountType18.getName();
        float float21 = accountType18.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType7 = paymentUser6.getAccountType();
        org.junit.Assert.assertNotNull(accountType7);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        java.lang.String str9 = accountType7.getName();
        float float10 = accountType7.getHourlyRate();
        float float11 = accountType7.getHourlyRate();
        java.lang.String str12 = accountType7.getName();
        float float13 = accountType7.getHourlyRate();
        boolean boolean14 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float16 = accountType7.getHourlyRate();
        boolean boolean17 = accountType7.isRequiresVerification();
        float float18 = accountType7.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        model.AccountType accountType21 = paymentUser20.getAccountType();
        model.AccountType accountType22 = paymentUser20.getAccountType();
        model.AccountType accountType23 = paymentUser20.getAccountType();
        model.AccountType accountType24 = paymentUser20.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser25 = new model.PaymentUser("", "hi!", accountType24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
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
        float float16 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str18 = accountType5.getName();
        float float19 = accountType5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        model.AccountType accountType10 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str11 = accountType10.getName();
        float float12 = accountType10.getHourlyRate();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType10);
        model.AccountType accountType14 = paymentUser13.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str16 = accountType14.getName();
        java.lang.String str17 = accountType14.getName();
        float float18 = accountType14.getHourlyRate();
        boolean boolean19 = accountType14.isRequiresVerification();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("hi!", paymentUser20, timeSlot21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        model.AccountType accountType17 = paymentUser7.getAccountType();
        java.lang.String str18 = accountType17.getName();
        java.lang.Class<?> wildcardClass19 = accountType17.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass15 = paymentUser14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        boolean boolean10 = accountType6.isRequiresVerification();
        boolean boolean11 = accountType6.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("", paymentUser12, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        model.AccountType accountType17 = paymentUser7.getAccountType();
        float float18 = accountType17.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = accountType17.getClass();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        boolean boolean17 = accountType15.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        java.lang.String str15 = accountType13.getName();
        boolean boolean16 = accountType13.isRequiresVerification();
        float float17 = accountType13.getHourlyRate();
        float float18 = accountType13.getHourlyRate();
        float float19 = accountType13.getHourlyRate();
        float float20 = accountType13.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = accountType14.getName();
        float float16 = accountType14.getHourlyRate();
        float float17 = accountType14.getHourlyRate();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = paymentUser13.getEmail();
        java.lang.String str15 = paymentUser13.getName();
        java.lang.String str16 = paymentUser13.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass9 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        java.lang.Class<?> wildcardClass20 = accountType19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getEmail();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = paymentUser7.getEmail();
        model.AccountType accountType18 = paymentUser7.getAccountType();
        model.AccountType accountType19 = paymentUser7.getAccountType();
        java.lang.String str20 = paymentUser7.getName();
        model.AccountType accountType21 = paymentUser7.getAccountType();
        float float22 = accountType21.getHourlyRate();
        boolean boolean23 = accountType21.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
        model.AccountType accountType20 = paymentUser18.getAccountType();
        java.lang.String str21 = paymentUser18.getName();
        java.lang.String str22 = paymentUser18.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getEmail();
        java.lang.String str22 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("hi!", paymentUser9, timeSlot22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        float float17 = accountType15.getHourlyRate();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str19 = paymentUser18.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser18, timeSlot20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        float float12 = accountType11.getHourlyRate();
        boolean boolean13 = accountType11.isRequiresVerification();
        java.lang.String str14 = accountType11.getName();
        boolean boolean15 = accountType11.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        float float12 = accountType11.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getName();
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        model.AccountType accountType17 = paymentUser10.getAccountType();
        java.lang.String str18 = paymentUser10.getEmail();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        float float20 = accountType19.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "hi!", accountType19);
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        boolean boolean18 = accountType16.isRequiresVerification();
        float float19 = accountType16.getHourlyRate();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType16);
        java.lang.String str21 = paymentUser20.getEmail();
        model.AccountType accountType22 = paymentUser20.getAccountType();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("", paymentUser20, timeSlot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 100L, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking9 = new model.Booking("", paymentUser7, timeSlot8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str15 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        java.lang.String str16 = accountType13.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "hi!", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        float float18 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = accountType14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        float float8 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getName();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        java.lang.String str17 = paymentUser14.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
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
        java.lang.String str15 = accountType14.getName();
        java.lang.String str16 = accountType14.getName();
        java.lang.Class<?> wildcardClass17 = accountType14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        float float13 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        float float15 = accountType14.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = accountType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        boolean boolean10 = accountType6.isRequiresVerification();
        java.lang.String str11 = accountType6.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str13 = paymentUser12.getName();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser12, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        java.lang.String str16 = paymentUser15.getEmail();
        java.lang.Class<?> wildcardClass17 = paymentUser15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        java.lang.String str12 = accountType3.getName();
        java.lang.String str13 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        float float10 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str12 = paymentUser11.getName();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        boolean boolean16 = accountType14.isRequiresVerification();
        boolean boolean17 = accountType14.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        float float9 = accountType8.getHourlyRate();
        float float10 = accountType8.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getEmail();
        java.lang.String str9 = paymentUser7.getName();
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
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        java.lang.String str21 = accountType19.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        java.lang.String str23 = accountType20.getName();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        java.lang.String str20 = paymentUser18.getEmail();
        java.lang.String str21 = paymentUser18.getEmail();
        java.lang.String str22 = paymentUser18.getName();
        java.lang.String str23 = paymentUser18.getName();
        java.lang.String str24 = paymentUser18.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
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
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.lang.String str16 = paymentUser7.getName();
        java.lang.String str17 = paymentUser7.getName();
        model.AccountType accountType18 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 1, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        java.lang.String str8 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        boolean boolean22 = accountType20.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        boolean boolean17 = accountType7.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.lang.String str15 = accountType13.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        boolean boolean10 = accountType9.isRequiresVerification();
        java.lang.String str11 = accountType9.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        float float19 = accountType18.getHourlyRate();
        float float20 = accountType18.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        model.AccountType accountType20 = paymentUser9.getAccountType();
        java.lang.String str21 = paymentUser9.getEmail();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("hi!", paymentUser9, timeSlot22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        java.lang.String str12 = accountType3.getName();
        java.lang.Class<?> wildcardClass13 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        boolean boolean8 = accountType5.isRequiresVerification();
        boolean boolean9 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = accountType16.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.lang.String str19 = paymentUser8.getName();
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
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, false);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        float float11 = accountType5.getHourlyRate();
        java.lang.String str12 = accountType5.getName();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float14 = accountType5.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        model.AccountType accountType3 = new model.AccountType("hi!", 0.0f, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        boolean boolean18 = accountType17.isRequiresVerification();
        float float19 = accountType17.getHourlyRate();
        java.lang.String str20 = accountType17.getName();
        float float21 = accountType17.getHourlyRate();
        boolean boolean22 = accountType17.isRequiresVerification();
        java.lang.Class<?> wildcardClass23 = accountType17.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getName();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        float float21 = accountType19.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser8, timeSlot18);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("hi!", paymentUser8, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = accountType12.getName();
        java.lang.String str14 = accountType12.getName();
        boolean boolean15 = accountType12.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
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
        boolean boolean22 = accountType19.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("", "", accountType19);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.String str22 = accountType21.getName();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType17);
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
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        float float10 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str12 = paymentUser11.getName();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str16 = paymentUser15.getEmail();
        java.lang.String str17 = paymentUser15.getName();
        model.AccountType accountType18 = paymentUser15.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType20 = paymentUser19.getAccountType();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass20 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 100, true);
        boolean boolean6 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass14 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
            model.Booking booking19 = new model.Booking("hi!", paymentUser8, timeSlot18);
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getName();
        java.lang.String str16 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        java.lang.String str14 = accountType12.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("", "", accountType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser8, timeSlot18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass14 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        java.lang.String str12 = accountType3.getName();
        float float13 = accountType3.getHourlyRate();
        float float14 = accountType3.getHourlyRate();
        java.lang.String str15 = accountType3.getName();
        java.lang.String str16 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
        boolean boolean15 = accountType13.isRequiresVerification();
        float float16 = accountType13.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        float float17 = accountType15.getHourlyRate();
        java.lang.String str18 = accountType15.getName();
        float float19 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        java.lang.String str14 = paymentUser10.getName();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getName();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        float float8 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 10, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass16 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        boolean boolean11 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        model.AccountType accountType16 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass11 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        java.lang.String str15 = accountType13.getName();
        boolean boolean16 = accountType13.isRequiresVerification();
        float float17 = accountType13.getHourlyRate();
        float float18 = accountType13.getHourlyRate();
        float float19 = accountType13.getHourlyRate();
        boolean boolean20 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str7 = accountType6.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("", paymentUser8, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass21 = accountType20.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        float float10 = accountType6.getHourlyRate();
        java.lang.String str11 = accountType6.getName();
        float float12 = accountType6.getHourlyRate();
        java.lang.String str13 = accountType6.getName();
        java.lang.String str14 = accountType6.getName();
        float float15 = accountType6.getHourlyRate();
        float float16 = accountType6.getHourlyRate();
        boolean boolean17 = accountType6.isRequiresVerification();
        boolean boolean18 = accountType6.isRequiresVerification();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str20 = paymentUser19.getEmail();
        java.lang.String str21 = paymentUser19.getEmail();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("", paymentUser19, timeSlot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        java.lang.String str8 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        java.lang.String str17 = paymentUser15.getEmail();
        java.lang.String str18 = paymentUser15.getEmail();
        java.lang.String str19 = paymentUser15.getName();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser15, timeSlot20);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass13 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        // The following exception was thrown during execution in test generation
        try {
            model.AccountType accountType3 = new model.AccountType("", (float) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Account type name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        java.lang.String str12 = accountType3.getName();
        float float13 = accountType3.getHourlyRate();
        boolean boolean14 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        java.lang.String str13 = accountType5.getName();
        java.lang.String str14 = accountType5.getName();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getEmail();
        java.lang.String str14 = paymentUser11.getEmail();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType16);
        java.lang.String str18 = paymentUser17.getEmail();
        java.lang.String str19 = paymentUser17.getEmail();
        java.lang.String str20 = paymentUser17.getName();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("hi!", paymentUser17, timeSlot21);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getEmail();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        java.lang.String str18 = accountType16.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        java.lang.String str16 = accountType12.getName();
        float float17 = accountType12.getHourlyRate();
        java.lang.String str18 = accountType12.getName();
        java.lang.String str19 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        model.AccountType accountType11 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str12 = accountType11.getName();
        float float13 = accountType11.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str17 = accountType15.getName();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str19 = accountType15.getName();
        boolean boolean20 = accountType15.isRequiresVerification();
        boolean boolean21 = accountType15.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

