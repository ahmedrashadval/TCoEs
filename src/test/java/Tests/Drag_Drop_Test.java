package Tests;

import Pages.Drag_Drop;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop_Test extends Test_base{
static Drag_Drop dd;


    @Test
    public static void drag(){
    dd= new Drag_Drop(driver);
    action = new Actions(driver);


    getDriver().switchTo().frame(dd.Iframe);
    action.dragAndDrop(dd.Drag, dd.Drop).build().perform();



}


}
