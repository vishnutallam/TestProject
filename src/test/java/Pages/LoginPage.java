package Pages;

import Utility.BaseClass;
import Utility.ExcelHelper;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {
 static By username=By.id("user-name");
static By password=By.id("password");
static By login=By.id("login-button");

    @Test(dataProvider = "getLoginData")
    public static void login(String UserName,String Password) throws InterruptedException {
driver.findElement(username).sendKeys(UserName);
driver.findElement(password).sendKeys(Password);
driver.findElement(login).click();
    }
}
