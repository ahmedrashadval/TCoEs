package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_base {
    protected static WebDriver driver;
    public Page_base(WebDriver driver)
    {

        this.driver=driver;
        PageFactory.initElements(driver,this);
    }



    protected static void ClickButton(WebElement button){

        button.click();
    }
    protected static void SetTextElement(WebElement textElement, String value) {

        textElement.sendKeys(value);

    }

}
