package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	public WebDriver driver;

	public WebDriver Initialize() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\tript\\eclipse-workspace\\NewWorkSpace\\lenskart\\src\\main\\java\\resources\\data.properties");
	    prop.load(fis);
	    
	    String BrowserName = prop.getProperty("browser");
	     String URL = prop.getProperty("URL");
	    
	    if(BrowserName.equals("chrome"))
	    		{
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\tript\\OneDrive\\Documents\\Chromedriver\\chromedriver_win32\\Chromedriver.exe");
	    		 driver = new ChromeDriver();
	    		 driver.get(URL);
	    		
	    		}
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    return driver;
	}
	
	
	
	
}
