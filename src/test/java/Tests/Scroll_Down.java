package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.awt.*;

public class Scroll_Down extends Test_base{

    @Test
    public static void scroll() throws InterruptedException {

        js = (JavascriptExecutor) getDriver();
        Thread.sleep(1500);
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


    }
}
