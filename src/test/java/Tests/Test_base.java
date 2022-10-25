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
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

import static Helper.Help_Func.RepRes;

public class Test_base extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    static ExtentTest test;
    static ExtentReports report;
    static Actions action;
    static JavascriptExecutor js;
    static Robot robot;
    public static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
   static String English;
    static  String deutsch;
    static String Spanish;
    static String Title_es;
    static String Title_en;
    public static Properties prop = new Properties();
    static String homeurl;
String ll;

    public static WebDriver getDriver() {
        return drivers.get();
    }


    @BeforeSuite
    @Parameters({"URL","browser","Lang"})
    public void StartDriver(@Optional String URL,@Optional String browser,@Optional String Lang) throws  InterruptedException {
        ll=Lang;
        PropertiesRead.main();
        homeurl = URL;
        if(browser.equalsIgnoreCase("chrome-headless")) {
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
    }
    else if (browser.equalsIgnoreCase("FireFox"))
    {
        report = new ExtentReports("ScreenShots/screenshot2"+"Firefox_Results.html");
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        driver = new FirefoxDriver(options);

    }
    else if (browser.equalsIgnoreCase("Localization-Chrome"))
    {
        report = new ExtentReports("ScreenShots/screenshot2"+"Firefox_Results.html");
        WebDriverManager.chromedriver().setup();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("intl.accept_languages", Lang);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        driver = new ChromeDriver(options);

    }
        drivers.set(driver);
        getDriver().manage().window().maximize();
        getDriver().navigate().to(URL);
        Thread.sleep(2000);
        action = new Actions(getDriver());
        js = (JavascriptExecutor) getDriver();
    }

    @AfterSuite
    public void StopDriver() {
        getDriver().quit();
        report.flush();
    }


//    @AfterMethod
//        public void Report(ITestResult N) throws IOException {
//        test = report.startTest(String.valueOf((ExtentTest) N.getMethod()));
//        RepRes(N);
//        report.endTest((ExtentTest) N.getMethod());
//        }
    }
