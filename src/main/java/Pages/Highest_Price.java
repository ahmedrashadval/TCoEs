package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.mail.FetchProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Highest_Price extends Page_base{
    public Highest_Price(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="user-name")
    WebElement username;

    @FindBy(id="password")
    WebElement Pass;
    @FindBy(id="login-button")
    WebElement login;
    List<WebElement> Items;
    List<Float> numbers = new ArrayList<>();
    String s;
    int x;
public void login(){
    SetTextElement(username,"standard_user");
    SetTextElement(Pass,"secret_sauce");
    ClickButton(login);
}


public void Highest_Price(){
    Items = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
    for(int i = 0 ;i<Items.size();i++){
      s = Items.get(i).getText();
     s= s.replace("$","");
     Float t = Float.parseFloat(s);
      //  System.out.println(t);
      numbers.add(t);

    }
    Collections.sort(numbers);
    x = numbers.size()-2;
    System.out.println(numbers.get(x));
}


}
