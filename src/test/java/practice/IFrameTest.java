package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Sagar");
		driver.switchTo().frame("frm1");
		Select s = new Select(driver.findElement(By.id("course")));
		s.selectByVisibleText("Java");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Returned To Sagar");

	}

}
