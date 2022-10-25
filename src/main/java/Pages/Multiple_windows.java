package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Multiple_windows extends Page_base{
    public Multiple_windows(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id=\"__next\"]/section[4]/div/div/div[2]/div[1]/a[1]")
    static
    WebElement Twitter;

    public List<WebElement> ls = driver.findElements(By.tagName("a"));

    public static void click(){
        ClickButton(Twitter);



    }
}
