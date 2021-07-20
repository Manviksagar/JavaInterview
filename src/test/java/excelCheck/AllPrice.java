package excelCheck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPrice {


    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        List<String> items = new ArrayList<>();
        List<Integer> fin = new ArrayList<>();
        List<Integer> tab = new ArrayList<>();
        items.add("Mobile");
        items.add("Tablet");
        List<WebElement> we = new ArrayList<>();
        List<WebElement> tabE = new ArrayList<>();
        int size;

        for (int i = 0; i < items.size(); i++) {
            driver.get("https://www.amazon.in");
            Thread.sleep(3000);
            driver.findElement(By.id("twotabsearchtextbox")).sendKeys(items.get(i), Keys.ENTER);
            Thread.sleep(3000);
            if(items.get(i).equals("Mobile")){

                conditionCheck( we,driver,fin,0);


            }
            if(items.get(i).equals("Tablet")){

                conditionCheck( tabE,driver,tab,1);

            }



                    }

                }



public static void conditionCheck(List<WebElement> twe, WebDriver driver,List<Integer>  finr, int col) throws IOException {

    twe = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
    for (WebElement lwe : twe) {
        int r;
        if (lwe.getText().contains(",")) {
            r = Integer.parseInt(lwe.getText().replace(",", ""));
            finr.add(r);


        }

    }
    Collections.sort(finr);
    System.out.println(finr);
    write_excel(finr, col);

}
        public static void write_excel (List<Integer> ls,int col) throws IOException {

    /* File fr= new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\Output.xlsx");
        FileInputStream fs = new FileInputStream(fr);
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sheet1 = wb.getSheetAt(0);
        int lastRow = sheet1.getLastRowNum();
        for (int i = 0; i <= lastRow; i++) {
        sheet1.getRow(0)
*/

            File fr = new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\Output.xlsx");
            FileInputStream fis = new FileInputStream(fr);
            XSSFWorkbook wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheetAt(0);
            //int row = sheet.getPhysicalNumberOfRows();
            //System.out.println(row);
            if(col==0) {
                sheet.createRow(0).createCell(0).setCellValue("MOBILE");
                for (int i = 0; i < ls.size(); i++) {



                    sheet.createRow(i+1).createCell(0).setCellValue(ls.get(i).toString());
                    FileOutputStream fos = new FileOutputStream(fr);
                    wb.write(fos);
                }
            }
                    if(col==1) {
                        sheet.getRow(0).createCell(1).setCellValue("TABLET");
                        for (int i = 0; i < ls.size(); i++) {
                            sheet.getRow(i+1).createCell(col).setCellValue(ls.get(i).toString());
                            FileOutputStream fos = new FileOutputStream(fr);
                            wb.write(fos);
                        }
                    }




            }


        }







