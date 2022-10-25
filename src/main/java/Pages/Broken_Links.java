package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class Broken_Links extends  Page_base{
    public Broken_Links(WebDriver driver) {
        super(driver);
    }

    List<WebElement> Links = driver.findElements(By.tagName("a"));
    String URL;
    HttpURLConnection huc = null;
    int respCode = 200;
    public void broken(String home) throws ProtocolException {

        for(int i = 0 ; i<Links.size();i++){
            URL = Links.get(i).getAttribute("href");
            System.out.println(URL);
            if(URL == null || URL.isEmpty()){
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            if(!URL.startsWith(home)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }

            try {
                huc = (HttpURLConnection)(new URL(URL).openConnection());

                huc.setRequestMethod("HEAD");

                huc.connect();

                respCode = huc.getResponseCode();

                if(respCode >= 400){
                    System.out.println(URL+" is a broken link");
                }
                else{
                    System.out.println(URL+" is a valid link");
                }
            }
                catch (IOException e) {
                e.printStackTrace();;
                 }

        }
    }
}
