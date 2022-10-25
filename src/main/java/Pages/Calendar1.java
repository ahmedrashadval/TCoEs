package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Calendar1 extends Page_base{
    public Calendar1(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "day")
    static
    WebElement calendar;


    public static void Time(String time){

        SetTextElement(calendar,time);


    }
}
