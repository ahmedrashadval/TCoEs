package Tests;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.awt.*;
import java.io.IOException;
import java.util.Objects;

import static Helper.Help_Func.RepRes;

public class Test_base extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    static ExtentTest test;
    static ExtentReports report;
    static Actions action;
    static JavascriptExecutor js;
    static Robot robot;

    @BeforeSuite
    @Parameters({"URL","browser"})
    public void StartDriver(@Optional String URL,@Optional String browser) throws  InterruptedException
    {   if(browser.equalsIgnoreCase("chrome-headless")) {
        report = new ExtentReports("Report" + "Chrome_Results-Final.html");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        options.setHeadless(true);
        driver = new ChromeDriver(options);

    }
    else if (browser.equalsIgnoreCase("Chrome")) {
        report = new ExtentReports("Report" + "Chrome_Results-Final.html");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
        driver.manage().window().maximize();
        driver.navigate().to(URL);
        Thread.sleep(2000);
        action = new Actions(driver);
        js = (JavascriptExecutor) driver;
    }

    @AfterSuite
    public void StopDriver() {
        driver.quit();
        report.flush();
    }


//    @AfterMethod
//        public void Report(ITestResult N) throws IOException {
//        test = report.startTest(String.valueOf((ExtentTest) N.getMethod()));
//        RepRes(N);
//        report.endTest((ExtentTest) N.getMethod());
//        }
    }
