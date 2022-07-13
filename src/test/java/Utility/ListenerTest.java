package Utility;


import SmokeTest.Smoketests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;

import static Utility.BaseClass.driver;

public class ListenerTest implements ITestListener
{

    @Override
    public void onFinish(ITestContext Result)
    {

    }

    @Override
    public void onStart(ITestContext Result)
    {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
    {

    }

    // When Test case get failed, this method is called.
    @Override
    public void onTestFailure(ITestResult Result)
    {
        Reporter.log("The name of the testcase failed is :"+Result.getName());
        File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(f1,new File("C:\\API Workspace\\TestResults.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reporter.log("<br><img src='"+"C:\\API Workspace\\TestResults.png"+"' height='400' width='400' /><br>");

    }

    // When Test case get Skipped, this method is called.
    @Override
    public void onTestSkipped(ITestResult Result)
    {
        Reporter.log("The name of the testcase Skipped is :"+Result.getName());
    }

    // When Test case get Started, this method is called.
    @Override
    public void onTestStart(ITestResult Result)
    {

        Reporter.log(Result.getName()+" test case started");
    }

    // When Test case get passed, this method is called.
    @Override
    public void onTestSuccess(ITestResult Result)
    {
        Reporter.log("The name of the testcase passed is :"+Result.getName());
    }

}