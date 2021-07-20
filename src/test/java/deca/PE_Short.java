package deca;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PE_Short {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		PO_Page.login_url(driver);
		PO_Page.po_Creation(driver);
		for(int i=0;i<=2;i++) {
		
			PO_Page.direct_Po_Creation(driver);
		
		}
		
		
		
		
		
		

	}
	
	
	}

