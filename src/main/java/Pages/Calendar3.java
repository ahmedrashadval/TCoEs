package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar3 extends Page_base{
    public Calendar3(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath="//*[@id=\"datepicker\"]/span")
    static WebElement picker;

    @FindBy(xpath="(//th[@class='prev'][normalize-space()='«'])[2]")
    static WebElement prev;

    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[1]/th[3]")
    static WebElement next;

    @FindBy(xpath="/html/body/div[2]/div[1]/table/thead/tr[1]/th[2]")
   static WebElement midlink;
     List <WebElement> months;
     List <WebElement> days;

    public  void setdate(String day, String month, int year) throws InterruptedException {
        int yeardiff = year - Calendar.getInstance().get(Calendar.YEAR);
        ClickButton(picker);
        ClickButton(midlink);
        Thread.sleep(1500);
        if(yeardiff!=0){
            if(yeardiff>0){

                for(int i=0;i< yeardiff;i++){

                  //  System.out.println("Year Diff->"+i);

                    next.click();
                }
            }
            else if(yeardiff<0){

                for(int i=0;i< (yeardiff*(-1));i++){

                  //  System.out.println("Year Diff->"+i);
                    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    prev.click();

                }
            }

        }
        months = driver.findElements(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span"));
     //   System.out.println(months.size());
        for(int i =0 ; i<months.size();i++){
            if(month.equalsIgnoreCase(months.get(i).getText()))
                months.get(i).click();
        }
        days = driver.findElements(By.xpath("//td[@class='day']"));
        System.out.println(days.size());
        for(int i =0 ; i<days.size();i++){
            if(day.equalsIgnoreCase(days.get(i).getText())) {
                days.get(i).click();
                break;
            }
        }
        Thread.sleep(1500);
    }
}
