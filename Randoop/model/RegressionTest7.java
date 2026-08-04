import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        java.lang.String str18 = paymentUser10.getEmail();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
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
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
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
        java.lang.String str16 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        float float13 = accountType11.getHourlyRate();
        float float14 = accountType11.getHourlyRate();
        java.lang.String str15 = accountType11.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        java.lang.String str14 = accountType5.getName();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        java.lang.String str17 = paymentUser15.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        model.AccountType accountType9 = paymentUser6.getAccountType();
        java.lang.String str10 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        java.lang.String str12 = accountType9.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = accountType13.getName();
        java.lang.String str15 = accountType13.getName();
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
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        float float20 = accountType17.getHourlyRate();
        java.lang.String str21 = accountType17.getName();
        boolean boolean22 = accountType17.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        float float18 = accountType15.getHourlyRate();
        boolean boolean19 = accountType15.isRequiresVerification();
        java.lang.String str20 = accountType15.getName();
        float float21 = accountType15.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
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
        float float16 = accountType14.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        boolean boolean10 = accountType6.isRequiresVerification();
        java.lang.String str11 = accountType6.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str13 = paymentUser12.getName();
        java.lang.String str14 = paymentUser12.getName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
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
        model.AccountType accountType26 = paymentUser24.getAccountType();
        java.lang.String str27 = accountType26.getName();
        java.lang.String str28 = accountType26.getName();
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
        org.junit.Assert.assertNotNull(accountType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        float float7 = accountType6.getHourlyRate();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType11 = paymentUser10.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType11);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = accountType9.getName();
        java.lang.Class<?> wildcardClass11 = accountType9.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = paymentUser10.getName();
        java.lang.String str17 = paymentUser10.getName();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "hi!", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = accountType16.getName();
        float float18 = accountType16.getHourlyRate();
        java.lang.Class<?> wildcardClass19 = accountType16.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
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
        boolean boolean26 = accountType25.isRequiresVerification();
        boolean boolean27 = accountType25.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass16 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        java.lang.String str9 = accountType6.getName();
        boolean boolean10 = accountType6.isRequiresVerification();
        java.lang.String str11 = accountType6.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str13 = paymentUser12.getName();
        java.lang.String str14 = paymentUser12.getName();
        java.lang.String str15 = paymentUser12.getName();
        model.TimeSlot timeSlot16 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = new model.Booking("", paymentUser12, timeSlot16);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        model.AccountType accountType7 = new model.AccountType("hi!", 100.0f, true);
        float float8 = accountType7.getHourlyRate();
        java.lang.String str9 = accountType7.getName();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = accountType11.getName();
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "", accountType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass12 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 100L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.Class<?> wildcardClass8 = paymentUser6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "hi!", accountType14);
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        java.lang.String str19 = paymentUser17.getEmail();
        java.lang.String str20 = paymentUser17.getEmail();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser17, timeSlot21);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass13 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 100, false);
        float float6 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str16 = paymentUser15.getName();
        java.lang.String str17 = paymentUser15.getName();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("", paymentUser15, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        java.lang.String str10 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.TimeSlot timeSlot14 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = new model.Booking("hi!", paymentUser9, timeSlot14);
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
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        java.lang.String str15 = paymentUser12.getName();
        java.lang.String str16 = paymentUser12.getEmail();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str19 = accountType17.getName();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.Class<?> wildcardClass21 = accountType17.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        float float15 = accountType14.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 'a', false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        java.lang.String str21 = paymentUser7.getEmail();
        java.lang.String str22 = paymentUser7.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
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
        java.lang.String str17 = paymentUser14.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        float float20 = accountType19.getHourlyRate();
        boolean boolean21 = accountType19.isRequiresVerification();
        java.lang.String str22 = accountType19.getName();
        java.lang.String str23 = accountType19.getName();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        float float18 = accountType15.getHourlyRate();
        boolean boolean19 = accountType15.isRequiresVerification();
        java.lang.String str20 = accountType15.getName();
        boolean boolean21 = accountType15.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        boolean boolean11 = accountType3.isRequiresVerification();
        float float12 = accountType3.getHourlyRate();
        java.lang.String str13 = accountType3.getName();
        float float14 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        java.lang.String str15 = paymentUser10.getEmail();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        java.lang.String str17 = paymentUser10.getName();
        model.AccountType accountType18 = paymentUser10.getAccountType();
        java.lang.String str19 = paymentUser10.getEmail();
        model.AccountType accountType20 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "", accountType20);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        float float22 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        float float10 = accountType3.getHourlyRate();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        float float13 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
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
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        java.lang.String str16 = paymentUser8.getEmail();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser8, timeSlot17);
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
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
        java.lang.String str15 = paymentUser7.getEmail();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        float float17 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType19);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        model.AccountType accountType6 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.TimeSlot timeSlot8 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking9 = new model.Booking("hi!", paymentUser7, timeSlot8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        float float11 = accountType10.getHourlyRate();
        float float12 = accountType10.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        java.lang.String str17 = accountType16.getName();
        float float18 = accountType16.getHourlyRate();
        float float19 = accountType16.getHourlyRate();
        float float20 = accountType16.getHourlyRate();
        java.lang.String str21 = accountType16.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getEmail();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str16 = paymentUser15.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser15, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
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
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        java.lang.String str19 = accountType18.getName();
        java.lang.String str20 = accountType18.getName();
        java.lang.String str21 = accountType18.getName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        java.lang.String str16 = paymentUser9.getEmail();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getEmail();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        java.lang.Class<?> wildcardClass12 = paymentUser6.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getEmail();
        model.AccountType accountType22 = paymentUser8.getAccountType();
        float float23 = accountType22.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 10.0f + "'", float23 == 10.0f);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass22 = paymentUser8.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '4', true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        float float13 = accountType11.getHourlyRate();
        boolean boolean14 = accountType11.isRequiresVerification();
        java.lang.String str15 = accountType11.getName();
        boolean boolean16 = accountType11.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        float float16 = accountType15.getHourlyRate();
        boolean boolean17 = accountType15.isRequiresVerification();
        float float18 = accountType15.getHourlyRate();
        float float19 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        java.lang.String str20 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = accountType18.getName();
        boolean boolean20 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
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
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getName();
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getEmail();
        java.lang.String str22 = paymentUser8.getName();
        java.lang.String str23 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        java.lang.String str17 = accountType15.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        java.lang.String str20 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass21 = paymentUser8.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 'a', false);
        float float9 = accountType8.getHourlyRate();
        float float10 = accountType8.getHourlyRate();
        java.lang.String str11 = accountType8.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str14 = paymentUser13.getEmail();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser13, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = accountType14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass17 = accountType16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str15 = paymentUser14.getName();
        java.lang.String str16 = paymentUser14.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        boolean boolean16 = accountType14.isRequiresVerification();
        java.lang.String str17 = accountType14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
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
        model.AccountType accountType15 = paymentUser12.getAccountType();
        java.lang.String str16 = paymentUser12.getEmail();
        java.lang.Class<?> wildcardClass17 = paymentUser12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        java.lang.Class<?> wildcardClass19 = accountType17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        model.AccountType accountType7 = new model.AccountType("hi!", 100.0f, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "hi!", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 100, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        float float15 = accountType14.getHourlyRate();
        java.lang.String str16 = accountType14.getName();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.AccountType accountType18 = paymentUser17.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass20 = paymentUser8.getClass();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        model.AccountType accountType5 = new model.AccountType("hi!", 0.0f, true);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        model.AccountType accountType18 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = accountType10.getName();
        float float12 = accountType10.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = accountType10.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        float float13 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        float float10 = accountType9.getHourlyRate();
        float float11 = accountType9.getHourlyRate();
        boolean boolean12 = accountType9.isRequiresVerification();
        boolean boolean13 = accountType9.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        model.AccountType accountType20 = paymentUser19.getAccountType();
        java.lang.Class<?> wildcardClass21 = accountType20.getClass();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        java.lang.String str17 = accountType16.getName();
        float float18 = accountType16.getHourlyRate();
        float float19 = accountType16.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = accountType16.getClass();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        model.AccountType accountType14 = paymentUser13.getAccountType();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser13, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        java.lang.String str18 = paymentUser8.getName();
        java.lang.String str19 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        boolean boolean11 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getEmail();
        java.lang.String str21 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        java.lang.String str19 = paymentUser9.getEmail();
        java.lang.String str20 = paymentUser9.getEmail();
        java.lang.String str21 = paymentUser9.getName();
        java.lang.String str22 = paymentUser9.getName();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("hi!", paymentUser9, timeSlot23);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser8 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = accountType12.getName();
        java.lang.String str15 = accountType12.getName();
        java.lang.String str16 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        java.lang.String str21 = paymentUser20.getName();
        model.AccountType accountType22 = paymentUser20.getAccountType();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType22);
        java.lang.String str24 = paymentUser23.getName();
        java.lang.Class<?> wildcardClass25 = paymentUser23.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        java.lang.String str13 = paymentUser11.getName();
        model.AccountType accountType14 = paymentUser11.getAccountType();
        java.lang.String str15 = paymentUser11.getEmail();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType16);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        java.lang.String str11 = accountType3.getName();
        java.lang.String str12 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
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
        boolean boolean18 = accountType15.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        java.lang.String str9 = accountType7.getName();
        float float10 = accountType7.getHourlyRate();
        float float11 = accountType7.getHourlyRate();
        float float12 = accountType7.getHourlyRate();
        boolean boolean13 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        java.lang.String str20 = paymentUser8.getName();
        model.AccountType accountType21 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
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
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = accountType14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getEmail();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.Class<?> wildcardClass14 = paymentUser10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) -1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        java.lang.String str14 = accountType3.getName();
        boolean boolean15 = accountType3.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        boolean boolean15 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        boolean boolean16 = accountType15.isRequiresVerification();
        float float17 = accountType15.getHourlyRate();
        java.lang.String str18 = accountType15.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        java.lang.Class<?> wildcardClass17 = accountType16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
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
        model.AccountType accountType21 = paymentUser20.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        java.lang.String str23 = accountType21.getName();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = accountType5.getName();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
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
        boolean boolean19 = accountType17.isRequiresVerification();
        boolean boolean20 = accountType17.isRequiresVerification();
        java.lang.String str21 = accountType17.getName();
        float float22 = accountType17.getHourlyRate();
        java.lang.Class<?> wildcardClass23 = accountType17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        model.TimeSlot timeSlot24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking25 = new model.Booking("hi!", paymentUser19, timeSlot24);
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
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
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
        model.AccountType accountType20 = paymentUser18.getAccountType();
        model.AccountType accountType21 = paymentUser18.getAccountType();
        model.AccountType accountType22 = paymentUser18.getAccountType();
        java.lang.String str23 = accountType22.getName();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
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
        java.lang.String str17 = paymentUser16.getName();
        java.lang.String str18 = paymentUser16.getName();
        java.lang.String str19 = paymentUser16.getName();
        java.lang.String str20 = paymentUser16.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        java.lang.String str19 = paymentUser8.getName();
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
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
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
        java.lang.String str13 = accountType3.getName();
        java.lang.String str14 = accountType3.getName();
        float float15 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
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
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        float float17 = accountType16.getHourlyRate();
        boolean boolean18 = accountType16.isRequiresVerification();
        float float19 = accountType16.getHourlyRate();
        boolean boolean20 = accountType16.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        java.lang.String str22 = paymentUser18.getName();
        model.AccountType accountType23 = paymentUser18.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType23);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        java.lang.String str21 = accountType19.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass15 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        model.AccountType accountType7 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean9 = accountType7.isRequiresVerification();
        float float10 = accountType7.getHourlyRate();
        boolean boolean11 = accountType7.isRequiresVerification();
        java.lang.String str12 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 52.0f + "'", float10 == 52.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = accountType7.getName();
        boolean boolean14 = accountType7.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
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
        java.lang.String str20 = paymentUser18.getName();
        java.lang.String str21 = paymentUser18.getName();
        java.lang.String str22 = paymentUser18.getName();
        java.lang.String str23 = paymentUser18.getEmail();
        java.lang.String str24 = paymentUser18.getEmail();
        java.lang.String str25 = paymentUser18.getName();
        model.AccountType accountType26 = paymentUser18.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(accountType26);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass11 = accountType10.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        java.lang.String str14 = paymentUser10.getEmail();
        java.lang.String str15 = paymentUser10.getEmail();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        boolean boolean11 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        java.lang.Class<?> wildcardClass15 = paymentUser12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        java.lang.String str21 = paymentUser18.getEmail();
        model.AccountType accountType22 = paymentUser18.getAccountType();
        model.AccountType accountType23 = paymentUser18.getAccountType();
        model.AccountType accountType24 = paymentUser18.getAccountType();
        java.lang.Class<?> wildcardClass25 = accountType24.getClass();
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
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '4', true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 52.0f + "'", float9 == 52.0f);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        model.AccountType accountType11 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str12 = accountType11.getName();
        float float13 = accountType11.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType11);
        java.lang.String str15 = paymentUser14.getEmail();
        java.lang.String str16 = paymentUser14.getName();
        java.lang.String str17 = paymentUser14.getName();
        java.lang.String str18 = paymentUser14.getEmail();
        model.AccountType accountType19 = paymentUser14.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        java.lang.String str21 = accountType19.getName();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType19);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("", "hi!", accountType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        java.lang.String str17 = paymentUser16.getName();
        java.lang.String str18 = paymentUser16.getEmail();
        model.AccountType accountType19 = paymentUser16.getAccountType();
        model.AccountType accountType20 = paymentUser16.getAccountType();
        model.AccountType accountType21 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
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
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 100, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        model.AccountType accountType14 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str9 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean7 = accountType5.isRequiresVerification();
        java.lang.String str8 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        float float10 = accountType6.getHourlyRate();
        java.lang.String str11 = accountType6.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str13 = paymentUser12.getName();
        java.lang.String str14 = paymentUser12.getName();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("hi!", paymentUser12, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = accountType10.getName();
        java.lang.Class<?> wildcardClass12 = accountType10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        float float14 = accountType13.getHourlyRate();
        java.lang.String str15 = accountType13.getName();
        float float16 = accountType13.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
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
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = paymentUser9.getEmail();
        java.lang.String str20 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean9 = accountType5.isRequiresVerification();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = paymentUser13.getEmail();
        model.AccountType accountType15 = paymentUser13.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        boolean boolean17 = accountType15.isRequiresVerification();
        java.lang.String str18 = accountType15.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        model.AccountType accountType3 = new model.AccountType("hi!", 32.0f, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        java.lang.String str13 = accountType5.getName();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        float float17 = accountType15.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
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
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass19 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
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
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        boolean boolean17 = accountType14.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        float float13 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.lang.String str22 = paymentUser18.getName();
        java.lang.String str23 = paymentUser18.getName();
        java.lang.String str24 = paymentUser18.getEmail();
        java.lang.Class<?> wildcardClass25 = paymentUser18.getClass();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        model.AccountType accountType15 = paymentUser12.getAccountType();
        java.lang.String str16 = paymentUser12.getEmail();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "", accountType17);
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
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        java.lang.String str20 = paymentUser10.getName();
        model.AccountType accountType21 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("", "", accountType21);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 100L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass7 = accountType5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getEmail();
        java.lang.String str9 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        float float11 = accountType5.getHourlyRate();
        float float12 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        boolean boolean7 = accountType5.isRequiresVerification();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        java.lang.String str11 = accountType5.getName();
        float float12 = accountType5.getHourlyRate();
        boolean boolean13 = accountType5.isRequiresVerification();
        boolean boolean14 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 32.0f + "'", float12 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        boolean boolean15 = accountType13.isRequiresVerification();
        boolean boolean16 = accountType13.isRequiresVerification();
        java.lang.String str17 = accountType13.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
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
        java.lang.String str19 = paymentUser16.getEmail();
        java.lang.String str20 = paymentUser16.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        java.lang.String str17 = paymentUser10.getEmail();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        java.lang.String str18 = paymentUser14.getEmail();
        model.TimeSlot timeSlot19 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking20 = new model.Booking("", paymentUser14, timeSlot19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        boolean boolean14 = accountType12.isRequiresVerification();
        float float15 = accountType12.getHourlyRate();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType12);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = accountType7.getName();
        java.lang.Class<?> wildcardClass14 = accountType7.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.String str14 = accountType12.getName();
        java.lang.String str15 = accountType12.getName();
        float float16 = accountType12.getHourlyRate();
        boolean boolean17 = accountType12.isRequiresVerification();
        java.lang.Class<?> wildcardClass18 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        float float12 = accountType11.getHourlyRate();
        float float13 = accountType11.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        model.AccountType accountType5 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.String str14 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 97.0f + "'", float13 == 97.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        float float16 = accountType15.getHourlyRate();
        java.lang.String str17 = accountType15.getName();
        java.lang.String str18 = accountType15.getName();
        boolean boolean19 = accountType15.isRequiresVerification();
        java.lang.Class<?> wildcardClass20 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 100, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        float float16 = accountType15.getHourlyRate();
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
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
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
        boolean boolean17 = accountType12.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        float float11 = accountType10.getHourlyRate();
        boolean boolean12 = accountType10.isRequiresVerification();
        boolean boolean13 = accountType10.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 10, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        java.lang.String str20 = paymentUser8.getEmail();
        java.lang.String str21 = paymentUser8.getEmail();
        java.lang.String str22 = paymentUser8.getName();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("", paymentUser8, timeSlot23);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 100, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType16);
        java.lang.String str19 = paymentUser18.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
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
        boolean boolean16 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        float float19 = accountType14.getHourlyRate();
        float float20 = accountType14.getHourlyRate();
        float float21 = accountType14.getHourlyRate();
        boolean boolean22 = accountType14.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass16 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
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
        java.lang.String str22 = accountType18.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType18);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
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
        java.lang.String str19 = paymentUser10.getName();
        java.lang.String str20 = paymentUser10.getEmail();
        java.lang.String str21 = paymentUser10.getEmail();
        model.AccountType accountType22 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("", "hi!", accountType22);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.String str15 = accountType13.getName();
        java.lang.String str16 = accountType13.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        java.lang.String str18 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        boolean boolean9 = accountType6.isRequiresVerification();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getEmail();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser10, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        boolean boolean15 = accountType13.isRequiresVerification();
        float float16 = accountType13.getHourlyRate();
        boolean boolean17 = accountType13.isRequiresVerification();
        float float18 = accountType13.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "hi!", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
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
        model.AccountType accountType18 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = accountType10.getName();
        float float12 = accountType10.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        java.lang.String str18 = accountType17.getName();
        java.lang.String str19 = accountType17.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        java.lang.String str18 = paymentUser16.getEmail();
        java.lang.String str19 = paymentUser16.getEmail();
        model.AccountType accountType20 = paymentUser16.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        java.lang.String str21 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        float float14 = accountType12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
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
        model.AccountType accountType15 = paymentUser7.getAccountType();
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass15 = accountType13.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        boolean boolean12 = accountType7.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = accountType18.getName();
        float float20 = accountType18.getHourlyRate();
        float float21 = accountType18.getHourlyRate();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType23 = paymentUser22.getAccountType();
        java.lang.Class<?> wildcardClass24 = paymentUser22.getClass();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        java.lang.Class<?> wildcardClass16 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        java.lang.String str13 = paymentUser12.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        float float15 = accountType14.getHourlyRate();
        boolean boolean16 = accountType14.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        model.AccountType accountType11 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str12 = accountType11.getName();
        float float13 = accountType11.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str17 = accountType15.getName();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType15);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "hi!", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "", accountType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(1L, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("hi!", paymentUser8, timeSlot20);
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) (byte) 0, true);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        java.lang.String str19 = accountType18.getName();
        java.lang.String str20 = accountType18.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "", accountType18);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = accountType14.getName();
        java.lang.Class<?> wildcardClass16 = accountType14.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        boolean boolean17 = accountType13.isRequiresVerification();
        float float18 = accountType13.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        model.AccountType accountType17 = paymentUser16.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        java.lang.String str17 = paymentUser10.getEmail();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.AccountType accountType20 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType20);
        java.lang.String str22 = paymentUser21.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        float float15 = accountType5.getHourlyRate();
        boolean boolean16 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser17 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.Class<?> wildcardClass18 = paymentUser17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        boolean boolean16 = accountType15.isRequiresVerification();
        float float17 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(accountType9);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
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
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getName();
        model.AccountType accountType18 = paymentUser7.getAccountType();
        float float19 = accountType18.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "hi!", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        model.AccountType accountType21 = paymentUser20.getAccountType();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("hi!", paymentUser20, timeSlot22);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
            model.Booking booking25 = new model.Booking("", paymentUser9, timeSlot24);
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        model.AccountType accountType6 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getEmail();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("", paymentUser7, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        float float15 = accountType13.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        float float15 = accountType14.getHourlyRate();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.AccountType accountType17 = paymentUser16.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
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
        boolean boolean18 = accountType13.isRequiresVerification();
        java.lang.String str19 = accountType13.getName();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 10, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
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
            model.PaymentUser paymentUser25 = new model.PaymentUser("hi!", "", accountType24);
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        model.AccountType accountType12 = paymentUser6.getAccountType();
        java.lang.String str13 = paymentUser6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        model.AccountType accountType18 = paymentUser9.getAccountType();
        java.lang.String str19 = accountType18.getName();
        float float20 = accountType18.getHourlyRate();
        float float21 = accountType18.getHourlyRate();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType23 = paymentUser22.getAccountType();
        float float24 = accountType23.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        model.AccountType accountType17 = paymentUser14.getAccountType();
        java.lang.Class<?> wildcardClass18 = paymentUser14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str12 = paymentUser11.getName();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        java.lang.String str14 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = accountType15.getName();
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
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getName();
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
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser8, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        java.lang.String str19 = accountType18.getName();
        float float20 = accountType18.getHourlyRate();
        boolean boolean21 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        float float16 = accountType15.getHourlyRate();
        boolean boolean17 = accountType15.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        model.AccountType accountType16 = paymentUser7.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
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
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        java.lang.String str19 = accountType18.getName();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser20, timeSlot21);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        java.lang.String str23 = paymentUser9.getEmail();
        model.TimeSlot timeSlot24 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking25 = new model.Booking("", paymentUser9, timeSlot24);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        boolean boolean15 = accountType11.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = accountType12.getName();
        java.lang.String str14 = accountType12.getName();
        boolean boolean15 = accountType12.isRequiresVerification();
        java.lang.String str16 = accountType12.getName();
        float float17 = accountType12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        float float9 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        java.lang.String str12 = paymentUser10.getEmail();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType14);
        java.lang.String str16 = paymentUser15.getName();
        model.AccountType accountType17 = paymentUser15.getAccountType();
        model.TimeSlot timeSlot18 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = new model.Booking("hi!", paymentUser15, timeSlot18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        java.lang.String str15 = paymentUser9.getName();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        java.lang.String str14 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        float float13 = accountType12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 100, true);
        float float6 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getName();
        model.AccountType accountType22 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("hi!", paymentUser8, timeSlot23);
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getName();
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
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
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
        java.lang.String str20 = accountType19.getName();
        boolean boolean21 = accountType19.isRequiresVerification();
        boolean boolean22 = accountType19.isRequiresVerification();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(10L, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
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
        java.lang.String str18 = paymentUser8.getEmail();
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
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
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
        java.lang.String str16 = accountType15.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str15 = accountType5.getName();
        boolean boolean16 = accountType5.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        java.lang.String str16 = paymentUser8.getEmail();
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
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        float float9 = accountType3.getHourlyRate();
        float float10 = accountType3.getHourlyRate();
        boolean boolean11 = accountType3.isRequiresVerification();
        boolean boolean12 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
        java.lang.String str23 = paymentUser20.getEmail();
        model.AccountType accountType24 = paymentUser20.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser25 = new model.PaymentUser("", "", accountType24);
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
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getName();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '#', false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = accountType13.getName();
        java.lang.String str16 = accountType13.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str15 = paymentUser14.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass5 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.Class<?> wildcardClass10 = accountType5.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        boolean boolean15 = accountType12.isRequiresVerification();
        java.lang.Class<?> wildcardClass16 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        boolean boolean15 = accountType14.isRequiresVerification();
        float float16 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        java.lang.String str18 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        java.lang.String str20 = paymentUser10.getEmail();
        model.AccountType accountType21 = paymentUser10.getAccountType();
        model.AccountType accountType22 = paymentUser10.getAccountType();
        model.AccountType accountType23 = paymentUser10.getAccountType();
        boolean boolean24 = accountType23.isRequiresVerification();
        boolean boolean25 = accountType23.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser26 = new model.PaymentUser("hi!", "", accountType23);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        model.AccountType accountType21 = paymentUser18.getAccountType();
        java.lang.Class<?> wildcardClass22 = paymentUser18.getClass();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("", paymentUser8, timeSlot17);
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
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
        java.lang.String str15 = paymentUser7.getName();
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
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        java.lang.Class<?> wildcardClass15 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 100, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        boolean boolean14 = accountType12.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getName();
        model.TimeSlot timeSlot12 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking13 = new model.Booking("hi!", paymentUser7, timeSlot12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getEmail();
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
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = paymentUser12.getName();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 97.0f + "'", float15 == 97.0f);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        java.lang.String str19 = paymentUser17.getEmail();
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser17, timeSlot20);
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.String str17 = accountType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        java.lang.String str21 = accountType20.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        model.AccountType accountType3 = new model.AccountType("hi!", 0.0f, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        boolean boolean7 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 'a', false);
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
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = accountType12.getName();
        java.lang.String str14 = accountType12.getName();
        java.lang.String str15 = accountType12.getName();
        float float16 = accountType12.getHourlyRate();
        float float17 = accountType12.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        java.lang.String str17 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass18 = paymentUser7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

