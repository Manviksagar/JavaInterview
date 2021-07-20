package deca;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pe {
	
	
		
		
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://153.61.219.11:1800/SCMWeb/App/Main/login/login.html");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 50);
		driver.findElement(By.id("username")).sendKeys("vallu");
		driver.findElement(By.id("password")).sendKeys("vallu1" , Keys.ENTER);
		
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='window_frame ui-widget-content no-draggable no-resizable  ui-corner-bottom']")));

		
		driver.findElement(By.xpath("//input[@id='acknowledgeKey']")).click();
		
		driver.findElement(By.xpath("//a[@onclick=\"navTree_expand(this)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[normalize-space()='DECADTE1']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Power Buy']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Enter/Print Purchase Order Options']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Enter/Change Purchase Orders']")).click();
		
		Thread.sleep(8000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tFrame']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a1fmScrn01_#1VNDN_$Po01a1fmScrn01$']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a1fmScrn01_#1VNDN_$Po01a1fmScrn01$']")).sendKeys("1014-SS-7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='nativeFunctionButton']")).click();
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl_Po01h1fmScrn02_ACTIONS_CMD12']")).click();
		
		//again clicking to create PO
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a1fmScrn01_#1VNDN_$Po01a1fmScrn01$']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='ctrl_Po01a1fmScrn01_#1VNDN_$Po01a1fmScrn01$']")).sendKeys("1014-SS-7");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='nativeFunctionButton']")).click();
		Thread.sleep(2000);
		String poNo=driver.findElement(By.xpath("//input[@id='ctrl_Po01a1fmScrn02_#1PONB_$Po01a1fmScrn02$']")).getAttribute("value");
		System.out.println(poNo);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a1fmScrn02_ACTIONS_ENTER']")).click();
		System.out.println(poNo);
		//Entering item in the PO
		
		
		
		String poID=driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn01_#1PONB_$Po01a2fmScrn01$']")).getText();
		System.out.println(poID);
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn04_#4ITMNIN_$Po01a2fmScrn04$']")).click();
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn04_#4ITMNIN_$Po01a2fmScrn04$']")).sendKeys("4782012"); 
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn04_#4QYOA_$Po01a2fmScrn04$']")).click();
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn04_#4QYOA_$Po01a2fmScrn04$']")).sendKeys("10");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a2fmScrn01_ACTIONS_ENTER']")).click();
		
		//accepting the PO
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a2fmScrn01_ACTIONS_CMD10']")).click();
		
		//Exiting the PO to send to DIBS
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a1fmScrn01_ACTIONS_CMD03']")).click();
		
		
		
		//selecting
		Thread.sleep(8000);
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tFrame' and @src='WrapperContent.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='simplemodal-container']//iframe")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tFrame']")));
		//driver.findElement(By.xpath("//span[normalize-space()='Select']")).click();
		
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a6fmScrn02_ACTIONS_CMD11']")).click();
		
		//Dibs option
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a6fmScrn01_#1EDIF_$Po01a6fmScrn01$']")).click();
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a6fmScrn01_#1EDIF_$Po01a6fmScrn01$']")).sendKeys("D");
		
		//Click on Exit
		
		driver.findElement(By.xpath("//button[@id='ctrl_Po01a6fmScrn02_ACTIONS_CMD03']")).click();
		
		/*Thread.sleep(8000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='ctrl_Po01h1fmScrn02_ACTIONS_CMD12']")).click();
		driver.findElement(By.xpath("//input[@id='ctrl_Po01h1fmScrn02_ACTIONS_CMD12']")).sendKeys("4782012"); 
				
		driver.findElement(By.xpath("//input[@id='ctrl_Po01a2fmScrn04_#4QYOA_$Po01a2fmScrn04$']")).click();
		
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();*/
		
		
	

}
		
}
