package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Scroll_to_Element extends Page_base{
    public Scroll_to_Element(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "courses-iframe")
    static
    WebElement Iframe;

    @FindBy(xpath="//*[@id=\"course-list\"]/div[4]/div/a")
   public WebElement Course;



    public static void frame(){
        driver.switchTo().frame(Iframe);

    }

}
