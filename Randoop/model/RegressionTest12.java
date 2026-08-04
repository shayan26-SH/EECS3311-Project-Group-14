import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
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
        java.lang.String str17 = accountType15.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
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
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
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
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
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
        java.lang.String str16 = paymentUser8.getName();
        model.AccountType accountType17 = paymentUser8.getAccountType();
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
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getName();
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
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
        java.lang.Class<?> wildcardClass20 = paymentUser7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getName();
        java.lang.String str11 = paymentUser7.getEmail();
        java.lang.String str12 = paymentUser7.getName();
        java.lang.String str13 = paymentUser7.getEmail();
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
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        model.AccountType accountType6 = new model.AccountType("hi!", 97.0f, false);
        java.lang.String str7 = accountType6.getName();
        java.lang.String str8 = accountType6.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        model.TimeSlot timeSlot11 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking12 = new model.Booking("", paymentUser9, timeSlot11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking id is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
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
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = accountType16.getName();
        float float18 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        java.lang.String str22 = paymentUser18.getEmail();
        java.lang.String str23 = paymentUser18.getEmail();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
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
        model.AccountType accountType20 = paymentUser14.getAccountType();
        java.lang.String str21 = paymentUser14.getEmail();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
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
        model.AccountType accountType25 = paymentUser18.getAccountType();
        java.lang.String str26 = paymentUser18.getName();
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
        org.junit.Assert.assertNotNull(accountType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
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
        model.AccountType accountType17 = paymentUser14.getAccountType();
        java.lang.String str18 = accountType17.getName();
        float float19 = accountType17.getHourlyRate();
        boolean boolean20 = accountType17.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        java.lang.String str13 = paymentUser10.getName();
        java.lang.String str14 = paymentUser10.getName();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser18 = new model.PaymentUser("hi!", "", accountType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
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
        boolean boolean17 = accountType16.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (byte) 100, true);
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
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float7 = accountType5.getHourlyRate();
        boolean boolean8 = accountType5.isRequiresVerification();
        boolean boolean9 = accountType5.isRequiresVerification();
        java.lang.String str10 = accountType5.getName();
        boolean boolean11 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        java.lang.String str14 = accountType12.getName();
        java.lang.String str15 = accountType12.getName();
        model.PaymentUser paymentUser16 = new model.PaymentUser("hi!", "hi!", accountType12);
        java.lang.String str17 = accountType12.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 10, true);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
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
        float float15 = accountType12.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str10 = paymentUser9.getEmail();
        java.lang.String str11 = paymentUser9.getEmail();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.String str14 = accountType12.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
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
        boolean boolean17 = accountType16.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
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
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
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
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) '#', (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        boolean boolean12 = accountType11.isRequiresVerification();
        boolean boolean13 = accountType11.isRequiresVerification();
        float float14 = accountType11.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
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
        java.lang.String str16 = paymentUser7.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
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
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
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
        java.lang.String str16 = accountType15.getName();
        boolean boolean17 = accountType15.isRequiresVerification();
        float float18 = accountType15.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
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
        java.lang.Class<?> wildcardClass19 = paymentUser16.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = paymentUser8.getEmail();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
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
        java.lang.String str19 = paymentUser8.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.AccountType accountType13 = paymentUser8.getAccountType();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        java.lang.String str15 = accountType14.getName();
        boolean boolean16 = accountType14.isRequiresVerification();
        java.lang.String str17 = accountType14.getName();
        float float18 = accountType14.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) ' ', true);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        java.lang.String str9 = accountType5.getName();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str11 = paymentUser10.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 32.0f + "'", float8 == 32.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 10, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) ' ', true);
        float float4 = accountType3.getHourlyRate();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        boolean boolean8 = accountType3.isRequiresVerification();
        java.lang.String str9 = accountType3.getName();
        float float10 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 32.0f + "'", float4 == 32.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 32.0f + "'", float5 == 32.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 32.0f + "'", float7 == 32.0f);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        model.AccountType accountType12 = paymentUser9.getAccountType();
        float float13 = accountType12.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType12);
        model.AccountType accountType15 = paymentUser14.getAccountType();
        java.lang.String str16 = paymentUser14.getEmail();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) -1, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        model.AccountType accountType9 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str10 = accountType9.getName();
        float float11 = accountType9.getHourlyRate();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType9);
        model.AccountType accountType13 = paymentUser12.getAccountType();
        java.lang.String str14 = paymentUser12.getName();
        java.lang.String str15 = paymentUser12.getEmail();
        java.lang.String str16 = paymentUser12.getName();
        java.lang.String str17 = paymentUser12.getName();
        model.AccountType accountType18 = paymentUser12.getAccountType();
        float float19 = accountType18.getHourlyRate();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType18);
        boolean boolean21 = accountType18.isRequiresVerification();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType18);
        model.AccountType accountType23 = paymentUser22.getAccountType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 10.0f + "'", float19 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(accountType23);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        java.lang.String str7 = accountType5.getName();
        boolean boolean8 = accountType5.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
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
        boolean boolean15 = accountType14.isRequiresVerification();
        boolean boolean16 = accountType14.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
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
        java.lang.String str13 = accountType3.getName();
        java.lang.String str14 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        float float8 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
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
        boolean boolean16 = accountType15.isRequiresVerification();
        boolean boolean17 = accountType15.isRequiresVerification();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) '#', false);
        boolean boolean6 = accountType5.isRequiresVerification();
        boolean boolean7 = accountType5.isRequiresVerification();
        float float8 = accountType5.getHourlyRate();
        float float9 = accountType5.getHourlyRate();
        java.lang.String str10 = accountType5.getName();
        float float11 = accountType5.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 35.0f + "'", float9 == 35.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 35.0f + "'", float11 == 35.0f);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
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
        java.lang.String str17 = paymentUser8.getEmail();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        java.lang.String str19 = paymentUser8.getEmail();
        model.AccountType accountType20 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getName();
        model.AccountType accountType15 = paymentUser8.getAccountType();
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
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
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
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
        model.AccountType accountType22 = paymentUser10.getAccountType();
        boolean boolean23 = accountType22.isRequiresVerification();
        float float24 = accountType22.getHourlyRate();
        model.PaymentUser paymentUser25 = new model.PaymentUser("hi!", "hi!", accountType22);
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
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 100, false);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        java.lang.String str6 = accountType3.getName();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.Class<?> wildcardClass14 = paymentUser8.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        java.lang.String str16 = accountType15.getName();
        boolean boolean17 = accountType15.isRequiresVerification();
        float float18 = accountType15.getHourlyRate();
        java.lang.String str19 = accountType15.getName();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        model.AccountType accountType7 = new model.AccountType("hi!", 100.0f, true);
        boolean boolean8 = accountType7.isRequiresVerification();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(0L, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (byte) 0, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        java.lang.Class<?> wildcardClass20 = paymentUser18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '4', (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        float float8 = accountType5.getHourlyRate();
        boolean boolean9 = accountType5.isRequiresVerification();
        boolean boolean10 = accountType5.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser11 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        boolean boolean6 = accountType3.isRequiresVerification();
        boolean boolean7 = accountType3.isRequiresVerification();
        boolean boolean8 = accountType3.isRequiresVerification();
        boolean boolean9 = accountType3.isRequiresVerification();
        float float10 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        float float13 = accountType12.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = accountType12.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
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
        java.lang.String str18 = paymentUser8.getEmail();
        model.AccountType accountType19 = paymentUser8.getAccountType();
        float float20 = accountType19.getHourlyRate();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean13 = accountType7.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        java.lang.String str13 = paymentUser8.getEmail();
        java.lang.String str14 = paymentUser8.getEmail();
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
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
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
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        java.lang.String str21 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType13);
        float float15 = accountType13.getHourlyRate();
        java.lang.String str16 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        java.lang.String str16 = accountType14.getName();
        float float17 = accountType14.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) ' ', (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) '#', (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
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
        model.AccountType accountType17 = paymentUser9.getAccountType();
        java.lang.String str18 = accountType17.getName();
        boolean boolean19 = accountType17.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
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
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
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
        java.lang.String str17 = accountType13.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
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
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        boolean boolean13 = accountType12.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
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
        java.lang.String str18 = accountType17.getName();
        java.lang.String str19 = accountType17.getName();
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType17);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
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
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        float float7 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getName();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
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
        java.lang.String str21 = paymentUser20.getEmail();
        model.AccountType accountType22 = paymentUser20.getAccountType();
        java.lang.String str23 = paymentUser20.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getEmail();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        model.AccountType accountType11 = paymentUser8.getAccountType();
        java.lang.String str12 = accountType11.getName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) '#', false);
        float float4 = accountType3.getHourlyRate();
        boolean boolean5 = accountType3.isRequiresVerification();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
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
        float float17 = accountType16.getHourlyRate();
        float float18 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 10, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
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
        boolean boolean21 = accountType20.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        model.AccountType accountType5 = new model.AccountType("hi!", 10.0f, true);
        java.lang.String str6 = accountType5.getName();
        boolean boolean7 = accountType5.isRequiresVerification();
        java.lang.String str8 = accountType5.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser9 = new model.PaymentUser("", "hi!", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (byte) 100, false);
        boolean boolean4 = accountType3.isRequiresVerification();
        float float5 = accountType3.getHourlyRate();
        float float6 = accountType3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
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
        java.lang.Class<?> wildcardClass16 = accountType11.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 10, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
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
        boolean boolean19 = accountType18.isRequiresVerification();
        float float20 = accountType18.getHourlyRate();
        boolean boolean21 = accountType18.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        boolean boolean10 = accountType7.isRequiresVerification();
        java.lang.String str11 = accountType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "", accountType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
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
        model.AccountType accountType19 = paymentUser16.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        java.lang.String str10 = paymentUser7.getEmail();
        java.lang.String str11 = paymentUser7.getEmail();
        model.AccountType accountType12 = paymentUser7.getAccountType();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        float float15 = accountType13.getHourlyRate();
        java.lang.String str16 = accountType13.getName();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
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
        float float17 = accountType5.getHourlyRate();
        float float18 = accountType5.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
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
        boolean boolean14 = accountType3.isRequiresVerification();
        float float15 = accountType3.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
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
        java.lang.String str20 = paymentUser8.getEmail();
        model.AccountType accountType21 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
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
        model.PaymentUser paymentUser20 = new model.PaymentUser("hi!", "hi!", accountType19);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
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
        java.lang.String str20 = accountType19.getName();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser21 = new model.PaymentUser("", "hi!", accountType19);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean7 = accountType5.isRequiresVerification();
        boolean boolean8 = accountType5.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
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
        java.lang.String str19 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
        float float17 = accountType16.getHourlyRate();
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
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getEmail();
        java.lang.String str12 = paymentUser9.getEmail();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        model.PaymentUser paymentUser15 = new model.PaymentUser("hi!", "hi!", accountType13);
        model.AccountType accountType16 = paymentUser15.getAccountType();
        model.AccountType accountType17 = paymentUser15.getAccountType();
        java.lang.String str18 = paymentUser15.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        float float7 = accountType3.getHourlyRate();
        java.lang.String str8 = accountType3.getName();
        java.lang.String str9 = accountType3.getName();
        java.lang.String str10 = accountType3.getName();
        java.lang.String str11 = accountType3.getName();
        java.lang.String str12 = accountType3.getName();
        float float13 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
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
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getEmail();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getEmail();
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.Class<?> wildcardClass16 = accountType15.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
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
        float float16 = accountType3.getHourlyRate();
        float float17 = accountType3.getHourlyRate();
        boolean boolean18 = accountType3.isRequiresVerification();
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
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
        float float17 = accountType16.getHourlyRate();
        java.lang.String str18 = accountType16.getName();
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
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
        model.AccountType accountType19 = paymentUser8.getAccountType();
        float float20 = accountType19.getHourlyRate();
        java.lang.String str21 = accountType19.getName();
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
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) ' ', (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(10L, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
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
        java.lang.String str22 = paymentUser18.getEmail();
        java.lang.String str23 = paymentUser18.getName();
        java.lang.String str24 = paymentUser18.getEmail();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
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
        model.AccountType accountType15 = paymentUser7.getAccountType();
        java.lang.String str16 = paymentUser7.getName();
        model.AccountType accountType17 = paymentUser7.getAccountType();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(100L, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str8 = paymentUser7.getName();
        model.AccountType accountType9 = paymentUser7.getAccountType();
        model.AccountType accountType10 = paymentUser7.getAccountType();
        java.lang.String str11 = paymentUser7.getName();
        java.lang.String str12 = paymentUser7.getName();
        model.AccountType accountType13 = paymentUser7.getAccountType();
        boolean boolean14 = accountType13.isRequiresVerification();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) (short) 100, true);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser6 = new model.PaymentUser("", "", accountType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User email is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) 'a', (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        float float21 = accountType19.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        model.AccountType accountType10 = paymentUser9.getAccountType();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        java.lang.String str14 = paymentUser9.getName();
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
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 'a', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
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
        java.lang.String str19 = paymentUser16.getEmail();
        model.AccountType accountType20 = paymentUser16.getAccountType();
        java.lang.String str21 = paymentUser16.getEmail();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getName();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getEmail();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
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
        java.lang.String str19 = paymentUser9.getName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        java.lang.String str13 = accountType3.getName();
        float float14 = accountType3.getHourlyRate();
        java.lang.String str15 = accountType3.getName();
        java.lang.String str16 = accountType3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
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
        java.lang.Class<?> wildcardClass18 = paymentUser17.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        model.AccountType accountType5 = new model.AccountType("hi!", 52.0f, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        model.AccountType accountType8 = paymentUser6.getAccountType();
        model.AccountType accountType9 = paymentUser6.getAccountType();
        java.lang.String str10 = paymentUser6.getEmail();
        java.lang.String str11 = paymentUser6.getEmail();
        java.lang.String str12 = paymentUser6.getName();
        java.lang.String str13 = paymentUser6.getEmail();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) 1, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        java.lang.String str21 = paymentUser20.getEmail();
        model.AccountType accountType22 = paymentUser20.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str7 = accountType6.getName();
        float float8 = accountType6.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str10 = paymentUser9.getName();
        java.lang.String str11 = paymentUser9.getName();
        java.lang.String str12 = paymentUser9.getName();
        model.AccountType accountType13 = paymentUser9.getAccountType();
        model.AccountType accountType14 = paymentUser9.getAccountType();
        java.lang.String str15 = paymentUser9.getEmail();
        java.lang.String str16 = paymentUser9.getEmail();
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
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 0L, true);
        model.PaymentUser paymentUser6 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str7 = paymentUser6.getEmail();
        java.lang.String str8 = paymentUser6.getName();
        java.lang.String str9 = paymentUser6.getName();
        java.lang.String str10 = paymentUser6.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
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
        model.AccountType accountType19 = paymentUser18.getAccountType();
        java.lang.String str20 = accountType19.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (short) 1, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
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
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 0L, false);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        java.lang.String str6 = accountType3.getName();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        model.AccountType accountType20 = paymentUser17.getAccountType();
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
        org.junit.Assert.assertNotNull(accountType20);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
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
        float float16 = accountType15.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
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
        boolean boolean18 = accountType14.isRequiresVerification();
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
        org.junit.Assert.assertNotNull(accountType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        model.AccountType accountType11 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str12 = accountType11.getName();
        float float13 = accountType11.getHourlyRate();
        model.PaymentUser paymentUser14 = new model.PaymentUser("hi!", "hi!", accountType11);
        java.lang.String str15 = paymentUser14.getEmail();
        java.lang.String str16 = paymentUser14.getName();
        model.AccountType accountType17 = paymentUser14.getAccountType();
        java.lang.String str18 = paymentUser14.getEmail();
        java.lang.String str19 = paymentUser14.getName();
        java.lang.String str20 = paymentUser14.getName();
        model.AccountType accountType21 = paymentUser14.getAccountType();
        model.PaymentUser paymentUser22 = new model.PaymentUser("hi!", "hi!", accountType21);
        boolean boolean23 = accountType21.isRequiresVerification();
        boolean boolean24 = accountType21.isRequiresVerification();
        java.lang.String str25 = accountType21.getName();
        float float26 = accountType21.getHourlyRate();
        model.PaymentUser paymentUser27 = new model.PaymentUser("hi!", "hi!", accountType21);
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser28 = new model.PaymentUser("hi!", "", accountType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: User name is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(accountType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 10.0f + "'", float26 == 10.0f);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 1, true);
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType7);
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        java.lang.String str11 = accountType7.getName();
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = paymentUser12.getEmail();
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        model.AccountType accountType6 = new model.AccountType("hi!", (float) (short) 1, false);
        java.lang.String str7 = accountType6.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType6);
        java.lang.String str9 = paymentUser8.getName();
        model.AccountType accountType10 = paymentUser8.getAccountType();
        java.lang.String str11 = paymentUser8.getEmail();
        model.AccountType accountType12 = paymentUser8.getAccountType();
        model.TimeSlot timeSlot13 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking14 = new model.Booking("hi!", paymentUser8, timeSlot13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Booking time is required.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(accountType12);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType9 = paymentUser8.getAccountType();
        java.lang.String str10 = paymentUser8.getEmail();
        java.lang.String str11 = paymentUser8.getEmail();
        java.lang.String str12 = paymentUser8.getEmail();
        java.lang.String str13 = paymentUser8.getName();
        java.lang.String str14 = paymentUser8.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertNotNull(accountType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
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
        java.lang.Class<?> wildcardClass16 = paymentUser15.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
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
        model.AccountType accountType17 = paymentUser8.getAccountType();
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
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
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
        java.lang.String str18 = paymentUser17.getEmail();
        java.lang.String str19 = paymentUser17.getEmail();
        model.AccountType accountType20 = paymentUser17.getAccountType();
        java.lang.String str21 = paymentUser17.getEmail();
        model.AccountType accountType22 = paymentUser17.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(accountType22);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        java.lang.String str18 = paymentUser8.getEmail();
        java.lang.String str19 = paymentUser8.getEmail();
        model.AccountType accountType20 = paymentUser8.getAccountType();
        float float21 = accountType20.getHourlyRate();
        java.lang.String str22 = accountType20.getName();
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 'a', false);
        float float8 = accountType7.getHourlyRate();
        float float9 = accountType7.getHourlyRate();
        java.lang.String str10 = accountType7.getName();
        model.PaymentUser paymentUser11 = new model.PaymentUser("hi!", "hi!", accountType7);
        model.PaymentUser paymentUser12 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str13 = paymentUser12.getName();
        model.AccountType accountType14 = paymentUser12.getAccountType();
        java.lang.String str15 = paymentUser12.getEmail();
        java.lang.String str16 = paymentUser12.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 97.0f + "'", float8 == 97.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 97.0f + "'", float9 == 97.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        model.AccountType accountType3 = new model.AccountType("hi!", 100.0f, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        float float7 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
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
        java.lang.String str15 = accountType11.getName();
        java.lang.String str16 = accountType11.getName();
        float float17 = accountType11.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
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
        java.lang.String str18 = paymentUser8.getName();
        java.lang.Class<?> wildcardClass19 = paymentUser8.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
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
        java.lang.String str18 = paymentUser17.getName();
        model.AccountType accountType19 = paymentUser17.getAccountType();
        java.lang.String str20 = paymentUser17.getEmail();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 10.0f + "'", float14 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
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
        java.lang.String str25 = paymentUser9.getName();
        model.TimeSlot timeSlot26 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking27 = new model.Booking("hi!", paymentUser9, timeSlot26);
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
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(accountType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
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
        java.lang.String str17 = accountType16.getName();
        java.lang.String str18 = accountType16.getName();
        boolean boolean19 = accountType16.isRequiresVerification();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 'a', false);
        float float6 = accountType5.getHourlyRate();
        float float7 = accountType5.getHourlyRate();
        java.lang.String str8 = accountType5.getName();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType5);
        boolean boolean10 = accountType5.isRequiresVerification();
        boolean boolean11 = accountType5.isRequiresVerification();
        java.lang.Class<?> wildcardClass12 = accountType5.getClass();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 97.0f + "'", float6 == 97.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 97.0f + "'", float7 == 97.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) (short) 1, true);
        java.lang.String str4 = accountType3.getName();
        java.lang.String str5 = accountType3.getName();
        float float6 = accountType3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = accountType3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
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
        java.lang.String str15 = paymentUser7.getName();
        model.AccountType accountType16 = paymentUser7.getAccountType();
        java.lang.String str17 = paymentUser7.getEmail();
        java.lang.String str18 = paymentUser7.getEmail();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
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
        boolean boolean23 = accountType22.isRequiresVerification();
        float float24 = accountType22.getHourlyRate();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 10.0f + "'", float24 == 10.0f);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (byte) 100, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
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
        java.lang.String str17 = paymentUser8.getName();
        model.AccountType accountType18 = paymentUser8.getAccountType();
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertNotNull(accountType19);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str8 = accountType7.getName();
        float float9 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser10 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str11 = paymentUser10.getEmail();
        java.lang.String str12 = paymentUser10.getName();
        model.AccountType accountType13 = paymentUser10.getAccountType();
        java.lang.String str14 = paymentUser10.getName();
        java.lang.String str15 = paymentUser10.getName();
        java.lang.String str16 = paymentUser10.getName();
        model.AccountType accountType17 = paymentUser10.getAccountType();
        java.lang.String str18 = accountType17.getName();
        boolean boolean19 = accountType17.isRequiresVerification();
        boolean boolean20 = accountType17.isRequiresVerification();
        float float21 = accountType17.getHourlyRate();
        float float22 = accountType17.getHourlyRate();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser23 = new model.PaymentUser("hi!", "", accountType17);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 10.0f + "'", float21 == 10.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 10.0f + "'", float22 == 10.0f);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
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
        java.lang.String str17 = paymentUser8.getEmail();
        java.lang.String str18 = paymentUser8.getName();
        model.AccountType accountType19 = paymentUser8.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(accountType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
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
        model.AccountType accountType21 = paymentUser8.getAccountType();
        java.lang.Class<?> wildcardClass22 = paymentUser8.getClass();
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
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (short) -1, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy((long) (-1), (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        // The following exception was thrown during execution in test generation
        try {
            model.DebitCardStrategy debitCardStrategy3 = new model.DebitCardStrategy(0L, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        model.AccountType accountType5 = new model.AccountType("hi!", 100.0f, true);
        float float6 = accountType5.getHourlyRate();
        java.lang.String str7 = accountType5.getName();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        float float9 = accountType5.getHourlyRate();
        boolean boolean10 = accountType5.isRequiresVerification();
        float float11 = accountType5.getHourlyRate();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
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
        java.lang.String str16 = paymentUser7.getEmail();
        java.lang.String str17 = paymentUser7.getEmail();
        java.lang.String str18 = paymentUser7.getEmail();
        java.lang.String str19 = paymentUser7.getName();
        java.lang.String str20 = paymentUser7.getEmail();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
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
        java.lang.String str21 = accountType20.getName();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
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
        boolean boolean22 = accountType21.isRequiresVerification();
        boolean boolean23 = accountType21.isRequiresVerification();
        boolean boolean24 = accountType21.isRequiresVerification();
        // The following exception was thrown during execution in test generation
        try {
            model.PaymentUser paymentUser25 = new model.PaymentUser("hi!", "", accountType21);
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
        org.junit.Assert.assertNotNull(accountType20);
        org.junit.Assert.assertNotNull(accountType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy((long) (-1), (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        float float6 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser7 = new model.PaymentUser("hi!", "hi!", accountType5);
        model.AccountType accountType8 = paymentUser7.getAccountType();
        java.lang.String str9 = paymentUser7.getName();
        java.lang.String str10 = paymentUser7.getEmail();
        model.AccountType accountType11 = paymentUser7.getAccountType();
        java.lang.String str12 = paymentUser7.getEmail();
        java.lang.String str13 = paymentUser7.getEmail();
        java.lang.String str14 = paymentUser7.getName();
        java.lang.String str15 = paymentUser7.getEmail();
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
        org.junit.Assert.assertNotNull(accountType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
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
        java.lang.String str15 = accountType3.getName();
        float float16 = accountType3.getHourlyRate();
        boolean boolean17 = accountType3.isRequiresVerification();
        java.lang.Class<?> wildcardClass18 = accountType3.getClass();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        // The following exception was thrown during execution in test generation
        try {
            model.CreditCardStrategy creditCardStrategy3 = new model.CreditCardStrategy(100L, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Card number must contain at least 14 digits.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        model.AccountType accountType5 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str6 = accountType5.getName();
        float float7 = accountType5.getHourlyRate();
        model.PaymentUser paymentUser8 = new model.PaymentUser("hi!", "hi!", accountType5);
        java.lang.String str9 = paymentUser8.getName();
        java.lang.String str10 = paymentUser8.getName();
        java.lang.String str11 = paymentUser8.getName();
        java.lang.String str12 = paymentUser8.getName();
        java.lang.String str13 = paymentUser8.getName();
        model.AccountType accountType14 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
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
        model.AccountType accountType18 = paymentUser17.getAccountType();
        java.lang.String str19 = paymentUser17.getName();
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertNotNull(accountType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        java.lang.Class<?> wildcardClass20 = paymentUser14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        model.AccountType accountType3 = new model.AccountType("hi!", (float) 10, false);
        java.lang.String str4 = accountType3.getName();
        float float5 = accountType3.getHourlyRate();
        boolean boolean6 = accountType3.isRequiresVerification();
        java.lang.String str7 = accountType3.getName();
        float float8 = accountType3.getHourlyRate();
        boolean boolean9 = accountType3.isRequiresVerification();
        float float10 = accountType3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 10.0f + "'", float5 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
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
        model.AccountType accountType15 = paymentUser8.getAccountType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 10.0f + "'", float7 == 10.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(accountType10);
        org.junit.Assert.assertNotNull(accountType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(accountType13);
        org.junit.Assert.assertNotNull(accountType14);
        org.junit.Assert.assertNotNull(accountType15);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        model.AccountType accountType7 = new model.AccountType("hi!", (float) 10, false);
        float float8 = accountType7.getHourlyRate();
        model.PaymentUser paymentUser9 = new model.PaymentUser("hi!", "hi!", accountType7);
        java.lang.String str10 = paymentUser9.getName();
        model.AccountType accountType11 = paymentUser9.getAccountType();
        java.lang.String str12 = paymentUser9.getEmail();
        java.lang.String str13 = paymentUser9.getEmail();
        java.lang.String str14 = paymentUser9.getName();
        model.AccountType accountType15 = paymentUser9.getAccountType();
        model.AccountType accountType16 = paymentUser9.getAccountType();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(accountType15);
        org.junit.Assert.assertNotNull(accountType16);
        org.junit.Assert.assertNotNull(accountType17);
    }
}

