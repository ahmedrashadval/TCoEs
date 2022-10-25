package Tests;
import Pages.Orange_HRM_Cookies;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static Helper.Cookies.*;


public class Orange_HRM_Cookies_Test extends Test_base {

    Orange_HRM_Cookies OC;
    @Parameters({"URL"})
@Test
    public void Navigate(String URL) throws InterruptedException {
    OC = new Orange_HRM_Cookies(driver);

    OC.login("Admin","admin123");
   // SaveCookies(URL);
        create_file();
       read_file(URL);

       System.out.println(Thread.currentThread());
}


}
