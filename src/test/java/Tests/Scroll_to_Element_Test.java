package Tests;

import Pages.Scroll_to_Element;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Scroll_to_Element_Test extends Test_base{

    static Scroll_to_Element Sc;



    @Test
    public static void Scroll() throws InterruptedException {
        Sc = new Scroll_to_Element(driver);
        js = (JavascriptExecutor) getDriver();
        Sc.frame();
        js.executeScript("arguments[0].scrollIntoView();", Sc.Course);
        Thread.sleep(1500);
    }


}
