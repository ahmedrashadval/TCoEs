package Tests;

import Pages.Calendar2;
import org.testng.annotations.Test;

public class Calendar2_Test extends Test_base{

   static Calendar2 C2;


    @Test
    public static void Time() throws InterruptedException {
        C2= new Calendar2(driver);
        C2.SetDate("Jun","2023","5");
        Thread.sleep(1500);


    }
}
