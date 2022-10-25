package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Calendar2 extends Page_base{
    public Calendar2(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="datepicker")
  static  WebElement date;

    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
    static WebElement Month;

    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
    static WebElement Year;

    Select select;
    Select select2;
    List <WebElement> days;
    @FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[2]/a")
    WebElement sday;

    public void SetDate(String Month, String Year, String day){
        ClickButton(date);
        select = new Select(this.Month);
        select.selectByVisibleText(Month);
        select2 = new Select(this.Year);
        select2.selectByVisibleText(Year);
        //ClickButton(sday);
        days = driver.findElements(By.tagName("a"));

        for(int i = 0 ; i< days.size();i++){
            if(day.equals(days.get(i).getText()))
            {
                days.get(i).click();
                System.out.println(days.get(i).getText());
                break;
            }
        }
      //  System.out.println(days.size());
    }
}
