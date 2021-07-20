package kal;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections ;
import java.util.List;

public class Amazon  {

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile", Keys.ENTER);
        Thread.sleep(3000);
        List<WebElement> we = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer> fin = new ArrayList<>();
        for (WebElement lwe : we) {
            int r = Integer.parseInt(lwe.getText().replace(",", ""));
            fin.add(r);


        }
        Collections.sort(fin);
        System.out.println(fin);

        write_excel(fin);
    }
    public static void write_excel (List ls) throws IOException {

       /* File fr= new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\Output.xlsx");
        FileInputStream fs = new FileInputStream(fr);
        Workbook wb = new XSSFWorkbook(fs);
        Sheet sheet1 = wb.getSheetAt(0);
        *//*int lastRow = sheet1.getLastRowNum();
        for (int i = 0; i <= lastRow; i++) {*//*
        sheet1.getRow(0)
*/

        File fr= new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\Output.xlsx");
        FileInputStream fis = new FileInputStream(fr);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheetAt(0);
        int row= sheet.getPhysicalNumberOfRows();
        System.out.println(row);
        for(int i =0; i<ls.size();i++){
            sheet.createRow(i).createCell(0).setCellValue(ls.get(i).toString());
        }



        FileOutputStream fos = new FileOutputStream(fr);
        wb.write(fos);
        wb.close();
    }
}


