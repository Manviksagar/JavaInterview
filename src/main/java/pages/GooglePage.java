package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    public WebDriver driver;

    @FindBy(name="q")
    private WebElement g_name;



    public  GooglePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public void navigate_URL(){
        this.driver.get("https://www.google.com/");
    }

    public void serach(){
        this.g_name.sendKeys("java");
    }
    public void tearDown(){

        this.driver.quit();
    }
}
