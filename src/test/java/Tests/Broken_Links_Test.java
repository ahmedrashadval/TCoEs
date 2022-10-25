package Tests;

import Pages.Broken_Links;
import org.testng.annotations.Test;

import java.net.ProtocolException;

public class Broken_Links_Test extends Test_base{

    Broken_Links BR;


    @Test
    public void links() throws ProtocolException {
        BR = new Broken_Links(driver);
        BR.broken(homeurl);
    }
}
