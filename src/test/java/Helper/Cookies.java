package Helper;

import org.openqa.selenium.Cookie;


import java.io.*;
import java.util.Date;
import java.util.StringTokenizer;

import static Tests.Test_base.driver;


public class Cookies {
    static Cookie ck2;
    public static void SaveCookies(String Path) throws InterruptedException {

        Cookie CK = driver.manage().getCookieNamed("orangehrm");
        driver.manage().deleteAllCookies();
        driver.get(Path);
        driver.manage().deleteAllCookies();
        driver.manage().addCookie(CK);
        driver.navigate().refresh();
        Thread.sleep(1500);
    }
    public static void create_file(){
        File file = new File("Cookies.data");
        try
        {
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter writter = new BufferedWriter(fileWrite);

            for(Cookie ck :driver.manage().getCookies())
            {
                writter.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                writter.newLine();
            }
            writter.close();
            fileWrite.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public static void read_file(String URL) throws InterruptedException {
        try{

            File file = new File("Cookies.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while((line=reader.readLine())!=null){
                StringTokenizer token = new StringTokenizer(line,";");
                while(token.hasMoreTokens()){
                    String name = token.nextToken();
                    String value = token.nextToken();
                    String domain = token.nextToken();
                    String path = token.nextToken();
                    Date expiry = null;
                    String val;
                    if(!(val=token.nextToken()).equals("null"))
                    {
                        expiry = new Date(val);
                    }
                    Boolean isSecure = new Boolean(token.nextToken()).
                            booleanValue();
                    Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
                    System.out.println(ck);
                    ck2=ck;
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        driver.manage().deleteAllCookies();
        driver.get(URL);
        driver.manage().deleteAllCookies();
        driver.manage().addCookie(ck2);
        driver.navigate().refresh();
        Thread.sleep(3000);
    }


}
