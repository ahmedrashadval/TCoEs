package Tests;

import Pages.Right_Click_Task;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Right_Click_Task_Test extends Test_base{
    static Right_Click_Task RC;



    @Test
    public static void Right_Click() throws InterruptedException {
        RC= new Right_Click_Task(driver);
        action.contextClick(RC.btn).perform();
        Thread.sleep(2000);
        Assert.assertTrue(RC.List.isDisplayed());
    }

}
