package E2El;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	
	public WebDriver driver;
	
	By Sin = By.xpath("//span[contains(text(),'Sign In')]");


	public SignIn(WebDriver driver) {
		this.driver = driver;
	}
	

	public WebElement Login() {
		
		return driver.findElement(Sin);
	}
}
