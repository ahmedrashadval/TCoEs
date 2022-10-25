package Tests;

import Pages.Upload;
import org.testng.annotations.Test;

public class Upload_test extends Test_base{

    static Upload up;

    @Test
    public static void upload() throws InterruptedException {
        up = new Upload(driver);

        up.upl();

        Thread.sleep(1500);


    }
}
