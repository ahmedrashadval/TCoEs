package Tests;

import Pages.Orange_HRM_Cookies;
import Pages.Tabs_Task;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Objects;

import static org.openqa.selenium.Keys.TAB;

public class Tabs_Task_Test extends Test_base{

    Tabs_Task Tb;

    Orange_HRM_Cookies Lo;


    @Test
    public void Rec() throws InterruptedException, AWTException {
        action=new Actions(getDriver());
        Lo=new Orange_HRM_Cookies(driver);
        Tb= new Tabs_Task(driver);
        robot = new Robot();
        String actual = null;
        Lo.login("Admin","admin123");
        String rr = Tb.Rec.getAccessibleName();
        while (!Objects.equals(actual,rr)){
          //  System.out.println(actual);
            action.sendKeys(TAB).perform();
            actual = getDriver().switchTo().activeElement().getAccessibleName();
            Thread.sleep(500);
        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(1500);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_T);
        Thread.sleep(1500);
        //paste the required address in the new tab
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(1500);



    }
}
