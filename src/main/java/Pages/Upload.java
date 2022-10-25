package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Upload extends Page_base{
    public Upload(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id=\"file-upload\"]")
    static
    WebElement upload;


    public static void upl(){
        upload.sendKeys("C:\\Users\\aossama\\IdeaProjects\\Automation-Tasks\\Iframe.xml");




    }

}
