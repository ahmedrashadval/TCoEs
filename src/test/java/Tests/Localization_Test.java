package Tests;

import Pages.Localization;
import org.apache.xmlbeans.impl.xb.xmlschema.LangAttribute;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Localization_Test extends Test_base{
  static  Localization loc;

    @Test
    public  void Loc(){
        loc = new Localization(driver);
        if(ll.equals("en")){
           loc.assertions(English,Title_en);
            System.out.println("en");
        }
        else if(ll.equals("es")){
            loc.assertions(Spanish,Title_es);
            System.out.println("es");
        }
      else if(ll.equals("de")){
            loc.assertions(deutsch,Title_en);
            System.out.println("de");
        }
    }
}
