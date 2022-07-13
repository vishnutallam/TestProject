package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass {
    public static WebDriver driver;
    public static void openApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("test-type");
//        //options.addArgument("start-maximized");
//        options.addArguments("disable-web-security");
//        options.addArguments("allow-running-insecure-content");
//       // capabilities.setCapability("chrome.binary","./src//lib//chromedriver");
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//        driver = new ChromeDriver(options);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        System.out.println("Application Opened");
    }
    public static void closeApplication() {
        driver.close();
        System.out.println("Application closed");
    }

}
