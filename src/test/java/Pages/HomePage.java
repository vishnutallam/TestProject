package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;

import static Utility.BaseClass.driver;

public class HomePage {
static By addToCart=By.id("add-to-cart-sauce-labs-backpack");

    public static void addToCart() throws InterruptedException {

driver.findElement(addToCart).click();


//        driver.findElement(search).sendKeys("shoes for men");
//        Thread.sleep(3000);
//driver.findElement(searching).click();
//Thread.sleep(5000);
//driver.findElement(product1).click();
////        WebDriverWait wait = new WebDriverWait(driver,30);
////        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCart));
//        ArrayList<String> windinfo=new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(windinfo.get(1));
//
//        driver.findElement(addToCart).click();
//        Thread.sleep(5000);
//
////        JavascriptExecutor executor=(JavascriptExecutor)driver;
////        executor.executeScript("arguments[0].click()",checkOut);
//        driver.findElement(checkOut).click();
//        driver.findElement(viewCart).click();
//driver.close();




    }
}
