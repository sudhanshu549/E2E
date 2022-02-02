package E2E;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

	public WebDriver driver;
	
	By Search = By.cssSelector("input[placeholder *= 'Search for']");
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getItem()
	{
		return driver.findElement(Search);
	}
	
}
