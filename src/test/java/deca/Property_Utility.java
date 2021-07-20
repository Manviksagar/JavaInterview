package deca;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Property_Utility {
	
	public static Properties getPropertyFile() throws IOException {
		// Load the properties File		
	    Properties prop = new Properties();					
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\PO_Details.properties");									
	    prop.load(objfile);	
		return prop;
	}
	
	/*public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println(Property_Utility.getPropertyFile().get("vendor"));
	}
*/
}
