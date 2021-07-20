package excelCheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fr= new File("C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(fr);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int row= sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		
		for( int i =0; i<=row; i++) {
			XSSFRow rr=sheet.getRow(i);
		int colCount = rr.getPhysicalNumberOfCells();
		for(int j=0; j<colCount; j++) {
			XSSFCell cell = rr.getCell(j);
			 //String sw= cell.getStringCellValue();
			System.out.print(cell);
			System.out.println();
			
			
		
			}
		
		System.out.println(" --------------------");
			
			
		}
		
		
		
		

	}

}
