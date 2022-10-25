package Tests;

import Pages.DoubeClick_Task;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class DoubeClick_Task_Test extends Test_base{

    static DoubeClick_Task DC;


    @Test
    public static void DoubleClick() throws InterruptedException {
        DC = new DoubeClick_Task(driver);
        DC.Frame();
       // js.executeScript("window.scrollBy(0,-3500)");
        js.executeScript("arguments[0].scrollIntoView();", DC.Box);
        Thread.sleep(2000);
        action.doubleClick(DC.Box).perform();
        Thread.sleep(1000);
    }
}
