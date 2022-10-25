package Helper;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITest;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

import static Tests.Test_base.driver;

public class Help_Func {
    public static  String  screenshot(WebDriver driver, String MethodName) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File des =new File("ScreenShots/screenshot2"+MethodName+".png");
        FileUtils.copyFile(screenshotFile ,des);
        String errflpath = des.getAbsolutePath();
        return errflpath;
    }

    public static void RepRes(ITestResult Res) throws IOException {
        if(Res.equals(1)){
            test.log(LogStatus.PASS,test.addScreenCapture(screenshot(driver, String.valueOf(Res.getMethod())))+ "Test Passed");
        }

        else if(Res.equals(2)){
            test.log(LogStatus.FAIL,test.addScreenCapture(screenshot(driver, String.valueOf(Res.getMethod())))+ "Test Failed");
        }

        else {
            test.log(LogStatus.SKIP,test.addScreenCapture(screenshot(driver, String.valueOf(Res.getMethod())))+ "Test Skipped");
        }
    }


    static ExtentTest test;
}
