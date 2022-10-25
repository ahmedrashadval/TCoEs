package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Window_Tab extends Page_base{
    public Window_Tab(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "opentab")
    static
    WebElement Tab;

    @FindBy(id = "openwindow")
    static
    WebElement Window;

    public static void Open(){
    ClickButton(Tab);
    ClickButton(Window);




    }
}
