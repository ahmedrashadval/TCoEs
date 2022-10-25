package Tests;

import org.testng.annotations.Test;

public class Infinite_Scroll_Test extends Test_base{

    static long intialLength ;


    @Test
    public static void infinite (){

        intialLength = (long) js.executeScript("return document.body.scrollHeight");

        for(int i = 0 ;i<30 ; i++){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            long currentLength = (long) js.executeScript("return document.body.scrollHeight");
            if(intialLength == currentLength) {
                break;
            }
            intialLength = currentLength;

        }




    }
}
