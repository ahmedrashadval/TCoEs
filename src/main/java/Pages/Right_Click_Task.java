package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Right_Click_Task extends Page_base{
    public Right_Click_Task(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id=\"authentication\"]/span")
    public WebElement btn;

    @FindBy(xpath="//*[@id=\"authentication\"]/ul")
    public WebElement List;
}
