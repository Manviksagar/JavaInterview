package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebScrapping {
	
	
	
	@Test
	public void webscrape() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor jc = (JavascriptExecutor)driver;
		jc.executeScript("scroll(0,500)");
		List<WebElement> li= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for(WebElement s: li) {
			
			sum=sum+ Integer.parseInt(s.getText());
			
	
		}
		
		int totalValue =Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		System.out.println("the value getting from for Loop : " +sum + " the toatal values at the bottom is :" + totalValue);
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	

}
