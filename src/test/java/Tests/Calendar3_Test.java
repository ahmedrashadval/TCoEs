package Tests;

import Pages.Calendar3;
import org.testng.annotations.Test;

public class Calendar3_Test extends Test_base{
   static Calendar3 C3;

    @Test
    public static void time() throws InterruptedException {
        C3 = new Calendar3(driver);
        C3.setdate("1","Dec",2020);
        Thread.sleep(5000);
    }

}
