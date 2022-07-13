package Pages;

import Utility.BaseClass;
import org.openqa.selenium.By;

public class AddressPage extends BaseClass {
    static By firstName=By.id("first-name");
    static  By lastName=By.id("last-name");
    static By zipCode=By.id("postal-code");

    static By continu=By.id("continue");
    public static void enterAddress(){

        driver.findElement(firstName).sendKeys("vishnu");
        driver.findElement(lastName).sendKeys("Tallam");
        driver.findElement(zipCode).sendKeys("132424");
        driver.findElement(continu).click();
    }

}
