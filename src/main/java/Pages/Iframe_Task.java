package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Iframe_Task extends Page_base{
    public Iframe_Task(WebDriver driver) {
        super(driver);
    }

@FindBy(xpath="//*[@id=\"course-list\"]/div[1]/div/a")
WebElement JavaScriptCourse;

    @FindBy(id="courses-iframe")
    WebElement frame;

    @FindBy(xpath="//*[@id=\"zen_cs_desc_with_promo_dynamic\"]/div/div/div[1]/h1")
  public  WebElement beginners;



    public void frame_switch(){
        driver.switchTo().frame(frame);
    }

    public void course_click(){
        JavaScriptCourse.click();
    }
}
