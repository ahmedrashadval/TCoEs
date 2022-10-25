package Tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;



public class PropertiesRead extends Test_base {
    public static void main() {
        English=  getProperties("English");
        deutsch=getProperties("deutsch");
        Spanish = getProperties("Spanish");
        Title_es = getProperties("Title_es");
        Title_en = getProperties("Title_en");
    }

    public static String getProperties(String property) {
        try {
            InputStream input = new FileInputStream("Config/Config.properties");
            prop.load(input);
            String getProperty= prop.getProperty(property);
            // System.out.println(getProperty);
            return getProperty;

        }catch(Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp.getCause());
            exp.printStackTrace();
        }
        return "-1";
    }
//
//    public static void setProperties(String property,String value) {
//        try {
//            OutputStream output = new FileOutputStream(projectPath+"\\src\\test\\java\\config\\config.properties");
//            prop.setProperty(property, value);
//            prop.store(output, null);
//
//        }catch(Exception exp) {
//            System.out.println(exp.getMessage());
//            System.out.println(exp.getCause());
//            exp.printStackTrace();
//        }
//    }



}
