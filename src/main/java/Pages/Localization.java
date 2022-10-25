package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Localization extends Page_base{


    public Localization(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement hello;

    String logo = driver.getTitle();
    public void assertions(String hi, String title){

        Assert.assertEquals(hi,hello.getText());
        Assert.assertEquals(title,logo);
}
}
