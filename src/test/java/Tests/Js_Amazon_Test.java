package Tests;

import Pages.JS_Amazon;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Js_Amazon_Test extends Test_base{

    static JS_Amazon A;

    @Test
    public static void M(){
        A = new JS_Amazon(driver);
        js = (JavascriptExecutor) driver;
       // js.executeScript("arguments[0].click();", A.account);

        js.executeScript("arguments[0].click();", A.menu);



    }
}
