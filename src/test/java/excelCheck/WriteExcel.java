package excelCheck;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        File fr= new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(fr);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet=wb.getSheetAt(0);
        int row= sheet.getPhysicalNumberOfRows();
        System.out.println(row);

        for( int i =0; i<row; i++) {
            sheet.getRow(i).createCell(2).setCellValue("sagar");

        }
        FileOutputStream fos = new FileOutputStream(fr);
        wb.write(fos);
        wb.close();
    }

}

