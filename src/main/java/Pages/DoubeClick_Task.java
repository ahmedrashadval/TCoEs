package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoubeClick_Task extends Page_base{
    public DoubeClick_Task(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"example-1\"]/div[2]/iframe")
    WebElement Frame;

    @FindBy(xpath="/html/body/div")
    public WebElement Box;

    public void Frame(){
        driver.switchTo().frame(Frame);
    }
}
