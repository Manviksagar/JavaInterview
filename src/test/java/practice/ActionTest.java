package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionTest {
	
	
	@Test
	public void Test1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.google.com");
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.name("q"))).click().keyDown(Keys.SHIFT).sendKeys("sagar", Keys.ENTER).build().perform();
		
	}

}
