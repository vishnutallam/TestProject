package SmokeTest;

import Pages.*;
import Utility.BaseClass;
import Utility.ExcelHelper;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;
@Listeners(Utility.ListenerTest.class)
public class Smoketests {


    //@Test(dataProvider = "getLoginData")
    @Test
    @Parameters({ "username","password" })

    public static void testLogin(String UserName,String Password) throws InterruptedException {
        BaseClass.openApplication();
        Reporter.log("Application Opened");
        LoginPage.login(UserName,Password);
        HomePage.addToCart();
        CartPage.cart();
        AddressPage.enterAddress();
        OrderSummaryPage.completeOrder();
        BaseClass.closeApplication();
            }
//            @BeforeTest
//            public static void launchAndLogin() throws InterruptedException {
//
//            }
//@DataProvider
//public Object[][] getLoginData() throws IOException {
//    Object data[][] = ExcelHelper.getExcelData("Sheet1");
//    return data;
//}


        }




