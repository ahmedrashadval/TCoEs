package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    static ExtentReports extent;
    static ExtentTest test;


    public static ExtentReports Setup()
    {
        ExtentSparkReporter ER = new ExtentSparkReporter("ExtentReports\\ExtentReport.html");
        ER.config().setDocumentTitle("Automation Task");
        extent=new ExtentReports();
        extent.attachReporter(ER);
        return extent;
    }
}
