package Tests;

import Pages.Orange_HRM_Cookies;
import Pages.Tabs_Task;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Vacancies_Test extends Test_base{

    static Tabs_Task Tb;

    static Orange_HRM_Cookies Lo;

    @Test
    public static void Vac() throws InterruptedException {
        action=new Actions(getDriver());
        Lo=new Orange_HRM_Cookies(driver);
        Tb= new Tabs_Task(driver);
        Lo.login("Admin","admin123");
        action.moveToElement(Tb.Rec);
        action.click().build().perform();
        Thread.sleep(500);
        action.moveToElement(Tb.Vacancies);
        action.click().build().perform();
        Thread.sleep(500);
    }
}
