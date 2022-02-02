package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {

	public WebDriver driver;
	
	public WebDriver InitializeDriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\Sudhanshu\\eclipse-workspace\\E2E\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		String URL = prop.getProperty("URL");
		
		if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		    driver = new ChromeDriver();	
		    driver.get(URL);
		}
		else if (browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		    driver = new FirefoxDriver();	
		    driver.get(URL);
		}
		else if( browserName.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "c://msedgedriver.exe");
		    driver = new EdgeDriver();	
		    driver.get(URL);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	
	}
}
