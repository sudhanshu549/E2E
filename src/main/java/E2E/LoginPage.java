package E2E;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public WebDriver driver;
	

	By user = By.cssSelector("input[class='_2IX_2- VJZDxU']");
	By password = By.cssSelector("input[type='password']");
	By Submit =By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getusername()
	{
		return driver.findElement(user);
	}
	public WebElement getpassword()
	{
		return driver.findElement(password);
	}
	public WebElement getsubmit()
	{
		return driver.findElement(Submit);
	}
	

}
