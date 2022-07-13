package Pages;

import Utility.BaseClass;
import org.openqa.selenium.By;

public class CartPage extends BaseClass {
    static By cart= By.xpath("//a[@class='shopping_cart_link']");
    static By checkout=By.id("checkout");

    public static void cart(){
        driver.findElement(cart).click();
        driver.findElement(checkout).click();
    }
}
