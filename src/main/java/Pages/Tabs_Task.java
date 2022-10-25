package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tabs_Task extends Page_base{
    public Tabs_Task(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a")
  public  WebElement Rec;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
    public  WebElement Vacancies;
}
