package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JS_Amazon extends Page_base{
    public JS_Amazon(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"navbar-backup-backup\"]/div/div[3]/a[1]")
     public WebElement account;

    @FindBy(xpath="//*[@id=\"nav-link-accountList\"]")
    public WebElement menu;
}
