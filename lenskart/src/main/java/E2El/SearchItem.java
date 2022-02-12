package E2El;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchItem {

	public WebDriver driver;
	
	By Item = By.xpath("//input[@type='text']");
	
	public SearchItem(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getSearch()
	{
		return driver.findElement(Item);
	}
	
	
}
