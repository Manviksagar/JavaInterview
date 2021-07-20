package deca;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dax {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://b37rrcnc1277414.decalocal.com/daxmvc#/login");
		WebDriverWait wait = new WebDriverWait(driver, 50);
		//driver.navigate().refresh();
		
		Thread.sleep(5000);
		driver.findElement(By.id("User_UserName")).sendKeys("va185060");
		driver.findElement(By.id("User_Password")).sendKeys("123456" , Keys.ENTER);
		
		Thread.sleep(8000);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//i[@class='menu-icon-orders']"))));
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//i[@class='menu-icon-orders']"))).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Order Monitoring']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='icon-plus']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Select Store']")).sendKeys("3301");
		//driver.findElement(By.xpath("//input[@placeholder='Select Store']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Store']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='Select Store']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@placeholder='Select Store']")).click();
		Actions aa =new Actions(driver);
		aa.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Select Store']"))).sendKeys(Keys.ENTER).build().perform();
		
		
		Thread.sleep(8000);
		Select s = new Select(driver.findElement(By.xpath("//div[@class='form-group']//select[@id='agreements']")));
		s.selectByVisibleText("GUAM CDC DRY");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@ng-hide='!vm.selectedStore && !vm.selectedAgreement || vm.autoDeliveryDate==true || vm.validatePreGenerated()']//span")).click();
		//driver.findElement(By.xpath("//input[@class='ng-isolate-scope ng-touched ng-dirty ng-valid-date ng-not-empty ng-valid ng-valid-required']']")).click();
		//driver.findElement(By.xpath("//input[@class='ng-isolate-scope ng-touched ng-dirty ng-valid-date ng-not-empty ng-valid ng-valid-required']]")).sendKeys("06-28-2021");
		//span[@class='ng-binding'][normalize-space()='30']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='ng-binding'][normalize-space()='30']")).click();
		
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click='vm.apply()']")).click();
		Thread.sleep(3000);
		//button[@class="btn ng-binding"]
		//div[@ng-bind-html="vm.bodyText"]
		String orderid=driver.findElement(By.xpath("//div[@ng-bind-html=\"vm.bodyText\"]")).getText();
		System.out.println(orderid);
		
		driver.findElement(By.xpath("//button[@class=\"btn ng-binding\"]")).click();
		
		
	}

}
