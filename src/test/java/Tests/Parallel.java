package Tests;

import Pages.Data_Driven;
import Pages.Orange_HRM_Cookies;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Parallel extends Test_base{
    Data_Driven DD;
    static Orange_HRM_Cookies CM;


    @Test(dataProvider = "INV")
    public static void INV_Login(String user,String pass) throws InterruptedException {
        CM= new Orange_HRM_Cookies(driver);
        CM.login(user,pass);
        System.out.println(Thread.currentThread());
    }

@Test
public static void val() throws InterruptedException {
    CM= new Orange_HRM_Cookies(driver);
    Thread.currentThread().join(10000);
    CM.login("Admin","admin123");
    System.out.println(Thread.currentThread());
}




    @DataProvider
    public Object[][] INV() throws IOException {
        DD = new Data_Driven(driver);
        return DD.readDatavalid("C:\\Users\\aossama\\IdeaProjects\\Automation-Tasks\\Data\\INV.xlsx","Sheet1");
    }
}
