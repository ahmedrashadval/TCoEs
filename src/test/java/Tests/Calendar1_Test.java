package Tests;

import Pages.Calendar1;
import org.testng.annotations.Test;

public class Calendar1_Test extends Test_base{


   static Calendar1 c1;


    @Test
    public static void Time() throws InterruptedException {
        c1 = new Calendar1(driver);

        c1.Time("10262023");
        Thread.sleep(1500);
    }
}
