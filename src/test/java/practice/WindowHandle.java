package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentWin=driver.getWindowHandle();
		System.out.println(parentWin);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> ss = driver.getWindowHandles();
		
		for(String s: ss) {
			
			System.out.println(s);
			if(!s.equals(parentWin)) {
			
			driver.switchTo().window(s);
			driver.findElement(By.id("firstName")).sendKeys("child window");
			Thread.sleep(3000);
			driver.close();
			
		}}
		driver.switchTo().window(parentWin);
		driver .findElement(By.id("name")).sendKeys("Sagar working");
		driver.quit();
		
		}
		
		

	

}
