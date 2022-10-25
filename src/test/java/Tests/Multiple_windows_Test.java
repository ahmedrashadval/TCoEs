package Tests;

import Pages.Multiple_windows;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Multiple_windows_Test extends Test_base{


  static  Multiple_windows MW;

   @Test
   public static void Window() throws InterruptedException {
       MW = new Multiple_windows(driver);

       MW.click();
       String parentID = getDriver().getWindowHandle();
       ArrayList<String> Windows = new ArrayList<String> (getDriver().getWindowHandles());
       if(parentID.equals(Windows.get(0))) {
           getDriver().switchTo().window(Windows.get(1));
       }else {
           getDriver().switchTo().window(Windows.get(0));
       }
       Thread.sleep(1500);
        String title = driver.getTitle();
       System.out.println(MW.ls);
   }

}
