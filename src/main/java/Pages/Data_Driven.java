package Pages;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class Data_Driven extends Page_base{
    public Data_Driven(WebDriver driver) {
        super(driver);
    }

    public String[][]  readDatavalid (String paramsvalid,String Sheet) throws IOException {
        File inputStream = new File(paramsvalid);
        DataFormatter df=new DataFormatter();
        FileInputStream fis = new FileInputStream(inputStream);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet(Sheet);
        int numberrows = sheet.getPhysicalNumberOfRows();
        int numbercols = sheet.getRow(0).getLastCellNum();
        String ARR[][] = new String[numberrows][numbercols];
        for (int i = 0; i < numberrows; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < numbercols; j++) {
                XSSFCell cell  =row.getCell(j);
                String value =df.formatCellValue(cell);
                ARR[i][j]=value.trim();
            }
        }
        return ARR;
    }
}


