package practice;

import java.io.IOException;

import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class AutoIt {
 
 
 
 public static void main(String[] args) throws IOException, InterruptedException {
 
	/* WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
 
     driver.get("http://demo.guru99.com/test/upload/");
 
     driver.findElement(By.id("uploadfile_0")).click();*/
 
     Runtime.getRuntime().exec("\"C:\\Users\\Va185060\\udemy_docker\\SeleniumTesting\\src\\test\\resources\\AutoItTest.exe\"");
 
    //Thread.sleep(5000);
 
     //driver.close();
 
 }
 
}