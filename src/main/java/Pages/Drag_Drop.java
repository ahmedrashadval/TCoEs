package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Drag_Drop extends Page_base{
    public Drag_Drop(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id=\"content\"]/iframe")
    public  WebElement Iframe;


    @FindBy(xpath="//*[@id=\"draggable\"]")
   public WebElement Drag;


    @FindBy(xpath="//*[@id=\"droppable\"]")
     public WebElement Drop;
}
