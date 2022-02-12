package E2El;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainLogin {
	
	public WebDriver driver;
	
	By Mobile = By.xpath("//input[@name='emailOrPhone']");
	By Crossbutton =  By.xpath("//a[contains(text(),'X')]");
	
	public MainLogin(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement getNumber() {
		
		return driver.findElement(Mobile);
	}
	
public WebElement getCross() {
		
		return driver.findElement(Crossbutton);
	}
}
