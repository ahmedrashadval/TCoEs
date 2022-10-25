package Tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Get_Title_JS_Test extends Test_base{


    @Test
    public static void JStitle(){
         js = (JavascriptExecutor) driver;
         System.out.println( js.executeScript("return document.title;"));



    }
}
