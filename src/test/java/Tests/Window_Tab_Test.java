package Tests;

import Pages.Window_Tab;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Set;

public class Window_Tab_Test extends Test_base{
    static Window_Tab WT;



    @Test
    public static void Wt(){
        WT = new Window_Tab(driver);
        WT.Open();
        ArrayList<String> Windows = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(Windows.get(1));
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(Windows.get(2));
            System.out.println(driver.getTitle());
            driver.close();
            driver.switchTo().window(Windows.get(0));
    }
}
