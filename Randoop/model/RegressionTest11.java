import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

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
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getName();
        java.lang.String str17 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
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
        model.AccountType accountType20 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        float float12 = accountType11.getHourlyRate();
        float float13 = accountType11.getHourlyRate();
        float float14 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
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
        float float18 = accountType17.getHourlyRate();
        java.lang.String str19 = accountType17.getName();
        java.lang.String str20 = accountType17.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        float float15 = accountType13.getHourlyRate();
        java.lang.String str16 = accountType13.getName();
        float float17 = accountType13.getHourlyRate();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType13);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass9 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        boolean boolean19 = accountType17.isRequiresVerification();
        java.lang.String str20 = accountType17.getName();
        float float21 = accountType17.getHourlyRate();
        boolean boolean22 = accountType17.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass16 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        java.lang.Class<?> wildcardClass18 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
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
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        java.lang.String str17 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
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
        boolean boolean17 = accountType14.isRequiresVerification();
        java.lang.String str18 = accountType14.getName();
        boolean boolean19 = accountType14.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType14);
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
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
        boolean boolean27 = accountType26.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str14 = accountType5.getName();
        java.lang.Class<?> wildcardClass15 = accountType5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
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
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = accountType15.getName();
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        boolean boolean11 = accountType5.isRequiresVerification();
        float float12 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
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
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getEmail();
        model.AccountType accountType21 = paymentUser8.getAccountType();
        model.AccountType accountType22 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        float float15 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
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
        float float22 = accountType19.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        java.lang.String str18 = accountType16.getName();
        java.lang.String str19 = accountType16.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
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
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass18 = accountType17.getClass();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
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
        java.lang.String str19 = accountType18.getName();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass15 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
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
        java.lang.String str15 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        java.lang.String str16 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
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
        java.lang.String str16 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getName();
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getEmail();
        java.lang.String str18 = paymentUser7.getEmail();
        java.lang.String str19 = paymentUser7.getEmail();
        model.AccountType accountType20 = paymentUser7.getAccountType();
        java.lang.String str21 = accountType20.getName();
        float float22 = accountType20.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
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
        java.lang.Class<?> wildcardClass15 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getEmail();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        float float17 = accountType16.getHourlyRate();
        boolean boolean18 = accountType16.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser19 = new model.PaymentUser("", "", accountType16);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
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
        model.AccountType accountType22 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
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
        java.lang.String str22 = paymentUser8.getName();
        model.AccountType accountType23 = paymentUser8.getAccountType();
        model.AccountType accountType24 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
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
        float float17 = accountType16.getHourlyRate();
        float float18 = accountType16.getHourlyRate();
        java.lang.String str19 = accountType16.getName();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 0L, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float10 = accountType7.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
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
        java.lang.String str15 = paymentUser8.getName();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        java.lang.String str14 = paymentUser12.getEmail();
        java.lang.String str15 = paymentUser12.getEmail();
        model.AccountType accountType16 = paymentUser12.getAccountType();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        model.AccountType accountType20 = paymentUser18.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "", accountType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '4', true);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 52.0f + "'", float6 == 52.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertNotNull(accountType9);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = accountType10.getName();
        boolean boolean12 = accountType10.isRequiresVerification();
        float float13 = accountType10.getHourlyRate();
        float float14 = accountType10.getHourlyRate();
        float float15 = accountType10.getHourlyRate();
        java.lang.String str16 = accountType10.getName();
        java.lang.Class<?> wildcardClass17 = accountType10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 'a', false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        boolean boolean10 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 97.0f + "'", float4 == 97.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 97.0f + "'", float5 == 97.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
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
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.String str22 = paymentUser8.getEmail();
        java.lang.String str23 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
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
        float float19 = accountType18.getHourlyRate();
        boolean boolean20 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
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
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getName();
        java.lang.String str22 = paymentUser19.getName();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("hi!", paymentUser19, timeSlot23);
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
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str13 = paymentUser12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
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
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str20 = paymentUser19.getEmail();
        java.lang.String str21 = paymentUser19.getEmail();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
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
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getName();
        java.lang.Class<?> wildcardClass22 = paymentUser19.getClass();
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
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
        java.lang.String str19 = paymentUser12.getName();
        model.AccountType accountType20 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType20);
        float float22 = accountType20.getHourlyRate();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType20);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
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
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        model.AccountType accountType5 = new model.AccountType("hi!", 10.0f, true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
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
        java.lang.String str21 = paymentUser8.getName();
        model.AccountType accountType22 = paymentUser8.getAccountType();
        java.lang.String str23 = paymentUser8.getName();
        java.lang.String str24 = paymentUser8.getName();
        java.lang.String str25 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float11 = accountType5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
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
        java.lang.String str15 = accountType12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        model.AccountType accountType15 = paymentUser12.getAccountType();
        java.lang.String str16 = paymentUser12.getEmail();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        java.lang.String str18 = paymentUser12.getName();
        java.lang.String str19 = paymentUser12.getEmail();
        model.AccountType accountType20 = paymentUser12.getAccountType();
        java.lang.String str21 = paymentUser12.getEmail();
        model.AccountType accountType22 = paymentUser12.getAccountType();
        model.AccountType accountType23 = paymentUser12.getAccountType();
        boolean boolean24 = accountType23.isRequiresVerification();
        boolean boolean25 = accountType23.isRequiresVerification();
        boolean boolean26 = accountType23.isRequiresVerification();
        model.PaymentUser paymentUser27 = new model.PaymentUser("hi!", "hi!", accountType23);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser28 = new model.PaymentUser("", "", accountType23);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
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
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
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
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        float float20 = accountType18.getHourlyRate();
        float float21 = accountType18.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
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
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = accountType16.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
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
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0L, true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
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
        java.lang.String str17 = paymentUser7.getEmail();
        java.lang.String str18 = paymentUser7.getName();
        java.lang.String str19 = paymentUser7.getEmail();
        model.AccountType accountType20 = paymentUser7.getAccountType();
        java.lang.String str21 = paymentUser7.getName();
        java.lang.String str22 = paymentUser7.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
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
        java.lang.String str16 = accountType15.getName();
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
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = accountType10.getName();
        float float12 = accountType10.getHourlyRate();
        float float13 = accountType10.getHourlyRate();
        java.lang.String str14 = accountType10.getName();
        float float15 = accountType10.getHourlyRate();
        boolean boolean16 = accountType10.isRequiresVerification();
        float float17 = accountType10.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
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
        java.lang.String str18 = paymentUser8.getName();
        java.lang.String str19 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
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
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getEmail();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        java.lang.String str16 = accountType15.getName();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str12 = paymentUser11.getName();
        java.lang.String str13 = paymentUser11.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
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
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1L, true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
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
        java.lang.Class<?> wildcardClass24 = paymentUser18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        java.lang.String str16 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
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
        java.lang.String str21 = paymentUser10.getEmail();
        java.lang.String str22 = paymentUser10.getName();
        java.lang.String str23 = paymentUser10.getEmail();
        model.AccountType accountType24 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser25 = new model.PaymentUser("", "", accountType24);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
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
        java.lang.String str19 = paymentUser16.getName();
        model.AccountType accountType20 = paymentUser16.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
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
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
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
        java.lang.String str15 = accountType11.getName();
        java.lang.String str16 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), (int) (byte) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
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
        model.AccountType accountType18 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        java.lang.String str15 = paymentUser12.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
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
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.String str20 = paymentUser8.getEmail();
        java.lang.String str21 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass22 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 10, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
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
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 'a', false);
        float float9 = accountType8.getHourlyRate();
        float float10 = accountType8.getHourlyRate();
        java.lang.String str11 = accountType8.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str14 = paymentUser13.getName();
        java.lang.String str15 = paymentUser13.getEmail();
        java.lang.String str16 = paymentUser13.getEmail();
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser13, timeSlot17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getName();
        java.lang.String str13 = paymentUser11.getName();
        java.lang.String str14 = paymentUser11.getName();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        java.lang.String str16 = paymentUser11.getEmail();
        java.lang.String str17 = paymentUser11.getName();
        java.lang.String str18 = paymentUser11.getName();
        model.AccountType accountType19 = paymentUser11.getAccountType();
        model.AccountType accountType20 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType20);
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("hi!", paymentUser21, timeSlot22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        model.AccountType accountType5 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
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
        model.TimeSlot timeSlot17 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking18 = new model.Booking("hi!", paymentUser8, timeSlot17);
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
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        boolean boolean14 = accountType5.isRequiresVerification();
        float float15 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str17 = paymentUser16.getName();
        java.lang.String str18 = paymentUser16.getEmail();
        model.AccountType accountType19 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
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
        float float19 = accountType18.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = accountType18.getClass();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = accountType11.getName();
        java.lang.String str13 = accountType11.getName();
        float float14 = accountType11.getHourlyRate();
        float float15 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
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
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
        java.lang.String str20 = paymentUser10.getEmail();
        java.lang.String str21 = paymentUser10.getName();
        model.AccountType accountType22 = paymentUser10.getAccountType();
        java.lang.String str23 = accountType22.getName();
        model.PaymentUser paymentUser24 = new model.PaymentUser("hi!", "hi!", accountType22);
        java.lang.String str25 = accountType22.getName();
        float float26 = accountType22.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
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
        java.lang.String str14 = accountType3.getName();
        float float15 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = accountType3.getClass();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getName();
        java.lang.String str16 = paymentUser14.getName();
        java.lang.String str17 = paymentUser14.getEmail();
        java.lang.String str18 = paymentUser14.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        java.lang.String str14 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
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
        boolean boolean17 = accountType15.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
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
        float float18 = accountType15.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
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
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser9, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
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
        float float22 = accountType19.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        float float22 = accountType14.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        java.lang.String str15 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean6 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean8 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getName();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
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
        java.lang.String str16 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
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
        java.lang.String str15 = paymentUser8.getName();
        java.lang.String str16 = paymentUser8.getEmail();
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
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        boolean boolean6 = accountType5.isRequiresVerification();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float10 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getEmail();
        java.lang.String str9 = paymentUser6.getName();
        model.AccountType accountType10 = paymentUser6.getAccountType();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        java.lang.String str15 = accountType13.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = accountType10.getName();
        float float12 = accountType10.getHourlyRate();
        boolean boolean13 = accountType10.isRequiresVerification();
        float float14 = accountType10.getHourlyRate();
        java.lang.String str15 = accountType10.getName();
        boolean boolean16 = accountType10.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getName();
        java.lang.String str21 = paymentUser8.getEmail();
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
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
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
        model.AccountType accountType20 = paymentUser7.getAccountType();
        float float21 = accountType20.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        java.lang.String str15 = paymentUser12.getName();
        java.lang.String str16 = paymentUser12.getEmail();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        java.lang.String str18 = paymentUser12.getEmail();
        model.AccountType accountType19 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        float float21 = accountType19.getHourlyRate();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType19);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        java.lang.String str11 = accountType5.getName();
        float float12 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str14 = paymentUser13.getEmail();
        model.AccountType accountType15 = paymentUser13.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
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
        java.lang.String str16 = paymentUser14.getName();
        java.lang.String str17 = paymentUser14.getEmail();
        model.AccountType accountType18 = paymentUser14.getAccountType();
        java.lang.String str19 = paymentUser14.getName();
        java.lang.String str20 = paymentUser14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str14 = paymentUser13.getEmail();
        java.lang.String str15 = paymentUser13.getName();
        model.AccountType accountType16 = paymentUser13.getAccountType();
        java.lang.String str17 = accountType16.getName();
        java.lang.String str18 = accountType16.getName();
        boolean boolean19 = accountType16.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        float float9 = accountType3.getHourlyRate();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        java.lang.String str12 = accountType3.getName();
        float float13 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
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
        java.lang.String str18 = accountType17.getName();
        java.lang.String str19 = accountType17.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("", "hi!", accountType17);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = accountType12.getName();
        float float14 = accountType12.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = accountType12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
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
        model.AccountType accountType19 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass20 = accountType19.getClass();
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
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
        model.AccountType accountType15 = paymentUser7.getAccountType();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 100L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean7 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
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
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType19 = paymentUser18.getAccountType();
        model.AccountType accountType20 = paymentUser18.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "", accountType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
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
        java.lang.String str16 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        boolean boolean12 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser13 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str14 = paymentUser13.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
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
        model.AccountType accountType20 = paymentUser10.getAccountType();
        boolean boolean21 = accountType20.isRequiresVerification();
        float float22 = accountType20.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("", "", accountType20);
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
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
        float float13 = accountType3.getHourlyRate();
        java.lang.String str14 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str10 = paymentUser9.getEmail();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
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
        float float15 = accountType5.getHourlyRate();
        boolean boolean16 = accountType5.isRequiresVerification();
        boolean boolean17 = accountType5.isRequiresVerification();
        boolean boolean18 = accountType5.isRequiresVerification();
        java.lang.String str19 = accountType5.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
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
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        java.lang.String str14 = paymentUser12.getName();
        model.AccountType accountType15 = paymentUser12.getAccountType();
        model.AccountType accountType16 = paymentUser12.getAccountType();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        model.AccountType accountType18 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("", "", accountType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        java.lang.String str16 = paymentUser14.getEmail();
        model.AccountType accountType17 = paymentUser14.getAccountType();
        model.AccountType accountType18 = paymentUser14.getAccountType();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
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
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
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
        model.AccountType accountType21 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getName();
        model.AccountType accountType17 = paymentUser7.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
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
        java.lang.Class<?> wildcardClass19 = accountType18.getClass();
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
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = paymentUser14.getName();
        java.lang.String str16 = paymentUser14.getName();
        model.AccountType accountType17 = paymentUser14.getAccountType();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        java.lang.String str13 = paymentUser9.getEmail();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        boolean boolean9 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        float float15 = accountType14.getHourlyRate();
        java.lang.String str16 = accountType14.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
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
        java.lang.String str17 = paymentUser14.getName();
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
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        float float10 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getEmail();
        java.lang.String str14 = paymentUser11.getEmail();
        java.lang.String str15 = paymentUser11.getEmail();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        java.lang.String str17 = paymentUser11.getName();
        java.lang.String str18 = paymentUser11.getEmail();
        java.lang.String str19 = paymentUser11.getName();
        java.lang.String str20 = paymentUser11.getEmail();
        java.lang.String str21 = paymentUser11.getEmail();
        model.AccountType accountType22 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "hi!", accountType22);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser24 = new model.PaymentUser("hi!", "", accountType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0L, true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
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
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getName();
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
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 1, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
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
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        java.lang.String str15 = paymentUser7.getEmail();
        java.lang.String str16 = paymentUser7.getEmail();
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
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
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
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
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
        model.AccountType accountType23 = paymentUser19.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
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
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
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
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
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
        java.lang.String str22 = paymentUser8.getName();
        java.lang.String str23 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        java.lang.String str9 = accountType3.getName();
        boolean boolean10 = accountType3.isRequiresVerification();
        float float11 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
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
        boolean boolean22 = accountType19.isRequiresVerification();
        java.lang.String str23 = accountType19.getName();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        model.AccountType accountType15 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
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
        java.lang.String str21 = accountType18.getName();
        boolean boolean22 = accountType18.isRequiresVerification();
        boolean boolean23 = accountType18.isRequiresVerification();
        boolean boolean24 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 0, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getEmail();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType15);
        java.lang.String str17 = paymentUser16.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
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
        java.lang.String str19 = paymentUser8.getEmail();
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
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        boolean boolean16 = accountType15.isRequiresVerification();
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
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
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        model.AccountType accountType7 = new model.AccountType("hi!", 1.0f, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str9 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
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
        java.lang.String str22 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str16 = paymentUser15.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
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
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getName();
        java.lang.String str14 = paymentUser11.getName();
        java.lang.String str15 = paymentUser11.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
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
        java.lang.String str18 = accountType17.getName();
        java.lang.String str19 = accountType17.getName();
        java.lang.String str20 = accountType17.getName();
        float float21 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
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
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.Class<?> wildcardClass22 = accountType18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
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
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0L, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.Class<?> wildcardClass5 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 1, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
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
        model.AccountType accountType15 = paymentUser7.getAccountType();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getName();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        boolean boolean13 = accountType11.isRequiresVerification();
        java.lang.Class<?> wildcardClass14 = accountType11.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        model.AccountType accountType5 = new model.AccountType("hi!", 0.0f, true);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float9 = accountType5.getHourlyRate();
        boolean boolean10 = accountType5.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
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
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getEmail();
        java.lang.String str22 = paymentUser19.getEmail();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 1L, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = accountType12.getName();
        java.lang.String str14 = accountType12.getName();
        java.lang.Class<?> wildcardClass15 = accountType12.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
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
        java.lang.String str19 = accountType16.getName();
        java.lang.Class<?> wildcardClass20 = accountType16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        float float15 = accountType13.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
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
        java.lang.String str15 = paymentUser14.getEmail();
        java.lang.String str16 = paymentUser14.getName();
        java.lang.String str17 = paymentUser14.getEmail();
        java.lang.String str18 = paymentUser14.getName();
        java.lang.String str19 = paymentUser14.getName();
        java.lang.String str20 = paymentUser14.getName();
        model.AccountType accountType21 = paymentUser14.getAccountType();
        java.lang.String str22 = paymentUser14.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 0, true);
        float float6 = accountType5.getHourlyRate();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser10 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        boolean boolean9 = accountType8.isRequiresVerification();
        java.lang.Class<?> wildcardClass10 = accountType8.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
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
        float float20 = accountType19.getHourlyRate();
        java.lang.String str21 = accountType19.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("", "hi!", accountType19);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
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
        model.AccountType accountType24 = paymentUser18.getAccountType();
        java.lang.String str25 = accountType24.getName();
        float float26 = accountType24.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
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
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        float float19 = accountType18.getHourlyRate();
        java.lang.String str20 = accountType18.getName();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 0, true);
        java.lang.Class<?> wildcardClass4 = accountType3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, false);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        boolean boolean9 = accountType3.isRequiresVerification();
        boolean boolean10 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
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
        java.lang.String str20 = accountType18.getName();
        java.lang.Class<?> wildcardClass21 = accountType18.getClass();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        java.lang.String str12 = accountType11.getName();
        boolean boolean13 = accountType11.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 100, false);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getName();
        java.lang.String str8 = paymentUser6.getEmail();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        java.lang.String str12 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getName();
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = paymentUser9.getEmail();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        model.AccountType accountType3 = new model.AccountType("hi!", 10.0f, true);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        float float11 = accountType3.getHourlyRate();
        java.lang.String str12 = accountType3.getName();
        float float13 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 32.0f + "'", float13 == 32.0f);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass13 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
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
        boolean boolean17 = accountType14.isRequiresVerification();
        float float18 = accountType14.getHourlyRate();
        boolean boolean19 = accountType14.isRequiresVerification();
        float float20 = accountType14.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = paymentUser7.getName();
        java.lang.String str14 = paymentUser7.getName();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType11 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType11);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        java.lang.String str14 = paymentUser12.getEmail();
        java.lang.String str15 = paymentUser12.getEmail();
        model.AccountType accountType16 = paymentUser12.getAccountType();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str19 = paymentUser18.getEmail();
        java.lang.String str20 = paymentUser18.getEmail();
        model.AccountType accountType21 = paymentUser18.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser22 = new model.PaymentUser("", "", accountType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(1L, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
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
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
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
        boolean boolean13 = accountType3.isRequiresVerification();
        boolean boolean14 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass15 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
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
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = accountType11.getName();
        java.lang.String str13 = accountType11.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        model.AccountType accountType7 = new model.AccountType("hi!", 100.0f, false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "hi!", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10L, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.String str7 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
        java.lang.String str16 = paymentUser8.getEmail();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        float float18 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        model.AccountType accountType5 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        java.lang.String str9 = accountType5.getName();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean11 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        float float12 = accountType11.getHourlyRate();
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        boolean boolean15 = accountType11.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
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
        java.lang.String str21 = accountType18.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        java.lang.String str13 = paymentUser12.getEmail();
        java.lang.String str14 = paymentUser12.getName();
        model.AccountType accountType15 = paymentUser12.getAccountType();
        java.lang.String str16 = paymentUser12.getEmail();
        model.AccountType accountType17 = paymentUser12.getAccountType();
        boolean boolean18 = accountType17.isRequiresVerification();
        boolean boolean19 = accountType17.isRequiresVerification();
        float float20 = accountType17.getHourlyRate();
        model.PaymentUser paymentUser21 = new model.PaymentUser("hi!", "hi!", accountType17);
        java.lang.String str22 = paymentUser21.getEmail();
        model.AccountType accountType23 = paymentUser21.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser24 = new model.PaymentUser("", "hi!", accountType23);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
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
        java.lang.String str16 = paymentUser8.getEmail();
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
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        boolean boolean16 = accountType15.isRequiresVerification();
        float float17 = accountType15.getHourlyRate();
        java.lang.String str18 = accountType15.getName();
        boolean boolean19 = accountType15.isRequiresVerification();
        java.lang.String str20 = accountType15.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "", accountType15);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass13 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass14 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
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
        model.AccountType accountType19 = paymentUser10.getAccountType();
        java.lang.String str20 = paymentUser10.getName();
        java.lang.String str21 = paymentUser10.getName();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str15 = paymentUser14.getName();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
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
        boolean boolean22 = accountType21.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        java.lang.String str15 = paymentUser7.getName();
        java.lang.Class<?> wildcardClass16 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser15 = new model.PaymentUser("", "hi!", accountType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
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
        boolean boolean23 = accountType22.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser24 = new model.PaymentUser("hi!", "", accountType22);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
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
        model.AccountType accountType17 = paymentUser10.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
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
        boolean boolean13 = accountType3.isRequiresVerification();
        boolean boolean14 = accountType3.isRequiresVerification();
        java.lang.String str15 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
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
        java.lang.String str18 = paymentUser8.getEmail();
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
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
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
        java.lang.String str15 = paymentUser7.getName();
        java.lang.String str16 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        float float9 = accountType6.getHourlyRate();
        java.lang.String str10 = accountType6.getName();
        float float11 = accountType6.getHourlyRate();
        boolean boolean12 = accountType6.isRequiresVerification();
        java.lang.String str13 = accountType6.getName();
        boolean boolean14 = accountType6.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
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
        model.AccountType accountType17 = paymentUser13.getAccountType();
        model.AccountType accountType18 = paymentUser13.getAccountType();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
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
        java.lang.String str15 = paymentUser14.getEmail();
        java.lang.String str16 = paymentUser14.getName();
        java.lang.String str17 = paymentUser14.getEmail();
        model.AccountType accountType18 = paymentUser14.getAccountType();
        model.AccountType accountType19 = paymentUser14.getAccountType();
        java.lang.String str20 = accountType19.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
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
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
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
        float float21 = accountType20.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
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
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = accountType20.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 0, true);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
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
        float float18 = accountType17.getHourlyRate();
        float float19 = accountType17.getHourlyRate();
        float float20 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        float float12 = accountType5.getHourlyRate();
        float float13 = accountType5.getHourlyRate();
        float float14 = accountType5.getHourlyRate();
        java.lang.String str15 = accountType5.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getEmail();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getEmail();
        java.lang.String str17 = paymentUser9.getName();
        java.lang.String str18 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        float float15 = accountType11.getHourlyRate();
        float float16 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '4', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str6 = accountType5.getName();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
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
        java.lang.String str17 = paymentUser16.getEmail();
        model.AccountType accountType18 = paymentUser16.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
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
        java.lang.String str19 = paymentUser8.getEmail();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
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
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = accountType17.getName();
        float float19 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        java.lang.String str9 = accountType5.getName();
        boolean boolean10 = accountType5.isRequiresVerification();
        boolean boolean11 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 32.0f + "'", float14 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean9 = accountType7.isRequiresVerification();
        java.lang.String str10 = accountType7.getName();
        boolean boolean11 = accountType7.isRequiresVerification();
        float float12 = accountType7.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser13 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 97.0f + "'", float12 == 97.0f);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
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
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass17 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
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
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = accountType16.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
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
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser17 = new model.PaymentUser("", "", accountType15);
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
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = accountType12.getName();
        float float14 = accountType12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        boolean boolean12 = accountType5.isRequiresVerification();
        float float13 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float15 = accountType5.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        model.AccountType accountType16 = paymentUser10.getAccountType();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 10, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
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
        java.lang.String str16 = paymentUser7.getEmail();
        model.AccountType accountType17 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((-1L), (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 1, false);
        boolean boolean7 = accountType6.isRequiresVerification();
        boolean boolean8 = accountType6.isRequiresVerification();
        boolean boolean9 = accountType6.isRequiresVerification();
        float float10 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getName();
        java.lang.String str14 = paymentUser11.getName();
        model.TimeSlot timeSlot15 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking16 = new model.Booking("", paymentUser11, timeSlot15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
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
        java.lang.String str19 = paymentUser8.getName();
        model.AccountType accountType20 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = accountType15.getName();
        java.lang.Class<?> wildcardClass17 = accountType15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
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
        java.lang.String str17 = paymentUser7.getName();
        model.AccountType accountType18 = paymentUser7.getAccountType();
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
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
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
        java.lang.String str20 = paymentUser18.getEmail();
        java.lang.String str21 = paymentUser18.getName();
        java.lang.String str22 = paymentUser18.getName();
        java.lang.String str23 = paymentUser18.getName();
        java.lang.String str24 = paymentUser18.getName();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
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
            model.Booking booking15 = new model.Booking("", paymentUser9, timeSlot14);
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
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = accountType10.getName();
        java.lang.String str12 = accountType10.getName();
        float float13 = accountType10.getHourlyRate();
        java.lang.String str14 = accountType10.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
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
        boolean boolean18 = accountType16.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
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
        model.AccountType accountType27 = paymentUser24.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType27);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
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
        java.lang.String str23 = paymentUser18.getEmail();
        model.AccountType accountType24 = paymentUser18.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType24);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 0, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        boolean boolean20 = accountType19.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) ' ', true);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        boolean boolean12 = accountType7.isRequiresVerification();
        boolean boolean13 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str15 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        model.AccountType accountType3 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        java.lang.String str8 = accountType3.getName();
        boolean boolean9 = accountType3.isRequiresVerification();
        java.lang.String str10 = accountType3.getName();
        float float11 = accountType3.getHourlyRate();
        float float12 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 32.0f + "'", float12 == 32.0f);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
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
        boolean boolean13 = accountType3.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
        model.AccountType accountType15 = paymentUser10.getAccountType();
        float float16 = accountType15.getHourlyRate();
        float float17 = accountType15.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("", "", accountType15);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        java.lang.String str12 = accountType5.getName();
        java.lang.String str13 = accountType5.getName();
        java.lang.String str14 = accountType5.getName();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        java.lang.String str17 = paymentUser15.getName();
        model.AccountType accountType18 = paymentUser15.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
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
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getName();
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.String str22 = paymentUser8.getEmail();
        java.lang.String str23 = paymentUser8.getName();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        float float10 = accountType9.getHourlyRate();
        java.lang.String str11 = accountType9.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.Class<?> wildcardClass10 = paymentUser7.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getName();
        java.lang.String str15 = paymentUser8.getEmail();
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getName();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getName();
        java.lang.String str20 = paymentUser8.getEmail();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser8, timeSlot21);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        model.AccountType accountType16 = paymentUser14.getAccountType();
        boolean boolean17 = accountType16.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
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
        java.lang.String str19 = paymentUser17.getName();
        java.lang.String str20 = paymentUser17.getName();
        model.TimeSlot timeSlot21 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking22 = new model.Booking("", paymentUser17, timeSlot21);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.String str12 = accountType5.getName();
        boolean boolean13 = accountType5.isRequiresVerification();
        boolean boolean14 = accountType5.isRequiresVerification();
        float float15 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str17 = paymentUser16.getName();
        model.AccountType accountType18 = paymentUser16.getAccountType();
        java.lang.String str19 = paymentUser16.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        model.AccountType accountType12 = paymentUser10.getAccountType();
        java.lang.String str13 = paymentUser10.getName();
        model.AccountType accountType14 = paymentUser10.getAccountType();
        boolean boolean15 = accountType14.isRequiresVerification();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType14);
        model.AccountType accountType17 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
        java.lang.String str16 = paymentUser8.getEmail();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 100, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
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
        float float18 = accountType17.getHourlyRate();
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
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((-1L), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        float float14 = accountType13.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getEmail();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        java.lang.String str14 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getName();
        java.lang.String str14 = paymentUser11.getEmail();
        java.lang.String str15 = paymentUser11.getEmail();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getEmail();
        java.lang.String str22 = paymentUser19.getEmail();
        model.TimeSlot timeSlot23 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking24 = new model.Booking("hi!", paymentUser19, timeSlot23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
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
        java.lang.String str19 = paymentUser16.getName();
        java.lang.Class<?> wildcardClass20 = paymentUser16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '4', true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        model.AccountType accountType12 = paymentUser11.getAccountType();
        java.lang.String str13 = paymentUser11.getName();
        java.lang.String str14 = paymentUser11.getEmail();
        java.lang.String str15 = paymentUser11.getEmail();
        model.AccountType accountType16 = paymentUser11.getAccountType();
        java.lang.String str17 = paymentUser11.getName();
        model.AccountType accountType18 = paymentUser11.getAccountType();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType18);
        java.lang.String str20 = paymentUser19.getName();
        java.lang.String str21 = paymentUser19.getEmail();
        java.lang.String str22 = paymentUser19.getEmail();
        model.AccountType accountType23 = paymentUser19.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str15 = accountType13.getName();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType13);
        java.lang.String str17 = accountType13.getName();
        boolean boolean18 = accountType13.isRequiresVerification();
        java.lang.Class<?> wildcardClass19 = accountType13.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        java.lang.String str16 = paymentUser14.getEmail();
        model.AccountType accountType17 = paymentUser14.getAccountType();
        java.lang.String str18 = accountType17.getName();
        float float19 = accountType17.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
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
        java.lang.String str16 = paymentUser14.getName();
        java.lang.Class<?> wildcardClass17 = paymentUser14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        java.lang.String str12 = accountType5.getName();
        float float13 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        float float10 = accountType9.getHourlyRate();
        java.lang.String str11 = accountType9.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        float float13 = accountType12.getHourlyRate();
        boolean boolean14 = accountType12.isRequiresVerification();
        float float15 = accountType12.getHourlyRate();
        float float16 = accountType12.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
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
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
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
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
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
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        java.lang.String str16 = paymentUser8.getName();
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass19 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        java.lang.String str10 = paymentUser8.getName();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getName();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        float float14 = accountType13.getHourlyRate();
        boolean boolean15 = accountType13.isRequiresVerification();
        boolean boolean16 = accountType13.isRequiresVerification();
        boolean boolean17 = accountType13.isRequiresVerification();
        boolean boolean18 = accountType13.isRequiresVerification();
        boolean boolean19 = accountType13.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
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
        java.lang.String str15 = paymentUser8.getEmail();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
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
        model.AccountType accountType17 = paymentUser16.getAccountType();
        java.lang.String str18 = paymentUser16.getEmail();
        model.AccountType accountType19 = paymentUser16.getAccountType();
        model.AccountType accountType20 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
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
        float float21 = accountType20.getHourlyRate();
        boolean boolean22 = accountType20.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = accountType10.getName();
        boolean boolean12 = accountType10.isRequiresVerification();
        boolean boolean13 = accountType10.isRequiresVerification();
        float float14 = accountType10.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
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
        model.AccountType accountType17 = paymentUser10.getAccountType();
        java.lang.String str18 = paymentUser10.getName();
        model.AccountType accountType19 = paymentUser10.getAccountType();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        java.lang.Class<?> wildcardClass21 = accountType19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        java.lang.String str11 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
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
        java.lang.String str19 = paymentUser8.getEmail();
        java.lang.String str20 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
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
        java.lang.String str17 = paymentUser7.getName();
        model.AccountType accountType18 = paymentUser7.getAccountType();
        boolean boolean19 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
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
        java.lang.String str26 = paymentUser18.getEmail();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
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
        boolean boolean18 = accountType17.isRequiresVerification();
        float float19 = accountType17.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        java.lang.String str6 = accountType3.getName();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        float float9 = accountType3.getHourlyRate();
        float float10 = accountType3.getHourlyRate();
        float float11 = accountType3.getHourlyRate();
        boolean boolean12 = accountType3.isRequiresVerification();
        java.lang.String str13 = accountType3.getName();
        boolean boolean14 = accountType3.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        java.lang.String str15 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
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
        float float15 = accountType14.getHourlyRate();
        float float16 = accountType14.getHourlyRate();
        float float17 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
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
        float float19 = accountType18.getHourlyRate();
        java.lang.Class<?> wildcardClass20 = accountType18.getClass();
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        java.lang.String str16 = paymentUser14.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
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
        java.lang.String str15 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        boolean boolean7 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        model.AccountType accountType5 = new model.AccountType("hi!", 0.0f, true);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float10 = accountType5.getHourlyRate();
        float float11 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 97.0f + "'", float10 == 97.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 97.0f + "'", float11 == 97.0f);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        float float10 = accountType5.getHourlyRate();
        boolean boolean11 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str13 = paymentUser12.getEmail();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        model.AccountType accountType11 = paymentUser6.getAccountType();
        java.lang.String str12 = paymentUser6.getEmail();
        model.AccountType accountType13 = paymentUser6.getAccountType();
        java.lang.String str14 = paymentUser6.getEmail();
        java.lang.String str15 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
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
        java.lang.String str19 = paymentUser17.getName();
        java.lang.String str20 = paymentUser17.getName();
        java.lang.String str21 = paymentUser17.getEmail();
        model.TimeSlot timeSlot22 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = new model.Booking("", paymentUser17, timeSlot22);
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
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
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
        java.lang.String str21 = paymentUser20.getEmail();
        java.lang.String str22 = paymentUser20.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 0L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        java.lang.String str8 = paymentUser6.getName();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getEmail();
        java.lang.String str11 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
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
        java.lang.String str18 = paymentUser10.getEmail();
        java.lang.String str19 = paymentUser10.getEmail();
        java.lang.String str20 = paymentUser10.getEmail();
        java.lang.String str21 = paymentUser10.getEmail();
        model.AccountType accountType22 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType22);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
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
        java.lang.String str16 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        java.lang.String str13 = accountType12.getName();
        java.lang.Class<?> wildcardClass14 = accountType12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        model.AccountType accountType6 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str8 = paymentUser7.getEmail();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser7, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        java.lang.String str14 = paymentUser8.getEmail();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        model.AccountType accountType16 = paymentUser8.getAccountType();
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getName();
        model.AccountType accountType14 = paymentUser7.getAccountType();
        float float15 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
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
        model.AccountType accountType17 = paymentUser7.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        boolean boolean10 = accountType7.isRequiresVerification();
        float float11 = accountType7.getHourlyRate();
        java.lang.String str12 = accountType7.getName();
        float float13 = accountType7.getHourlyRate();
        boolean boolean14 = accountType7.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser16 = new model.PaymentUser("", "hi!", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        model.AccountType accountType9 = paymentUser6.getAccountType();
        model.AccountType accountType10 = paymentUser6.getAccountType();
        java.lang.String str11 = paymentUser6.getEmail();
        java.lang.String str12 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str8 = accountType7.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser14 = new model.PaymentUser("", "hi!", accountType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        model.AccountType accountType8 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str9 = accountType8.getName();
        float float10 = accountType8.getHourlyRate();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType8);
        java.lang.String str12 = paymentUser11.getEmail();
        model.AccountType accountType13 = paymentUser11.getAccountType();
        java.lang.String str14 = paymentUser11.getName();
        model.AccountType accountType15 = paymentUser11.getAccountType();
        java.lang.String str16 = accountType15.getName();
        float float17 = accountType15.getHourlyRate();
        float float18 = accountType15.getHourlyRate();
        model.PaymentUser paymentUser19 = new model.PaymentUser("hi!", "hi!", accountType15);
        model.TimeSlot timeSlot20 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = new model.Booking("", paymentUser19, timeSlot20);
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        float float17 = accountType16.getHourlyRate();
        model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "hi!", accountType16);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
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
        java.lang.String str16 = accountType15.getName();
        java.lang.String str17 = accountType15.getName();
        float float18 = accountType15.getHourlyRate();
        java.lang.String str19 = accountType15.getName();
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 0, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = accountType10.getName();
        boolean boolean12 = accountType10.isRequiresVerification();
        boolean boolean13 = accountType10.isRequiresVerification();
        java.lang.Class<?> wildcardClass14 = accountType10.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

