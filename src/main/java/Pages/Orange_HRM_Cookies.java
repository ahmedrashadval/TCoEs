package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Orange_HRM_Cookies extends Page_base{
    public Orange_HRM_Cookies(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "username")
    WebElement Username;
    @FindBy(name = "password")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    WebElement LgnBtn;


    public void login(String username, String password) throws InterruptedException {

        SetTextElement(Username,username);
        SetTextElement(Password,password);
        ClickButton(LgnBtn);
        Thread.sleep(1500);
    }
    public void loginC(String username, String password) throws InterruptedException {

        SetTextElement(Username,username);
        SetTextElement(Password,password);
        Thread.sleep(1500);
    }
    public void loginTBN() throws InterruptedException {
        ClickButton(LgnBtn);
        Thread.sleep(1500);
    }

}
