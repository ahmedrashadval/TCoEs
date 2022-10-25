package Listeners;

import Tests.Test_base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import ExtentReports.ExtentManager;


public class TestListener extends Test_base implements ITestListener {
    ExtentReports extent = ExtentManager.Setup();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub
        test= extent.createTest(result.getMethod().getMethodName());

    }

    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
        test.pass("Data: "+ Arrays.toString(result.getParameters()));
        test.pass("Browser name: "+driver);

    }

    public void onTestFailure(ITestResult result) {
        String SS= result.getTestClass().getName()+Arrays.toString(result.getParameters());
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File des =new File("ScreenShots/screenshot2"+SS+".png");
        try {
            FileUtils.copyFile(screenshotFile ,des);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.addScreenCaptureFromPath("..\\ScreenShots\\"+SS+".png");
    }

    public void onFinish(ITestContext context) {

        extent.flush();
    }

}
