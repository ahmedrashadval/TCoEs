package Tests;

import Pages.Data_Driven;
import Pages.Orange_HRM_Cookies;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class Data_Driven_test extends Test_base{
    Data_Driven DD;
    static Orange_HRM_Cookies CM;


    @Test(dataProvider = "INV")
    public static void INV_Login(String user,String pass) throws InterruptedException {
        CM= new Orange_HRM_Cookies(driver);
        CM.login(user,pass);
        System.out.println(Thread.currentThread());
    }






    @DataProvider
    public Object[][] INV() throws IOException {
        DD = new Data_Driven(driver);
        return DD.readDatavalid("C:\\Users\\aossama\\IdeaProjects\\Automation-Tasks\\Data\\INV.xlsx","Sheet1");
    }
}
