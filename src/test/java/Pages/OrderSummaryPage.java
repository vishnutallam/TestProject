package Pages;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderSummaryPage extends BaseClass {
    static By finish= By.id("finish");
    static By text=By.xpath("//h2[@class='complete-header']");
    public static void completeOrder(){
        driver.findElement(finish).click();
        String text1=driver.findElement(text).getText();
        Assert.assertEquals(text1,"THANK YOU FOR YOUR ORDER");
    }

}
