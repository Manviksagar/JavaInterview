package pagefactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GooglePage;

public class PageFactoryCheck {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        GooglePage pg = new GooglePage(driver);
        pg.navigate_URL();
        pg.serach();
        Thread.sleep(4000);
        pg.tearDown();

    }

}
