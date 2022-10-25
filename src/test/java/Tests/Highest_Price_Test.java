package Tests;

import Pages.Highest_Price;
import org.testng.annotations.Test;

public class Highest_Price_Test extends Test_base{

    Highest_Price HP;


    @Test
    public void Price(){
        HP = new Highest_Price(driver);

        HP.login();
        HP.Highest_Price();

    }
}
