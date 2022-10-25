package Tests;

import Pages.Iframe_Task;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Iframe_Task_Test extends Test_base{
    static Iframe_Task I;



    @Test
    public static void Course(){
    I= new Iframe_Task(driver);

    I.frame_switch();
    I.course_click();
        Assert.assertTrue(I.beginners.isDisplayed());
    }
}
