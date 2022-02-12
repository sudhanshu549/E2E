package E2El;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import resources.base;

public class firstPageSearch extends base {
	
	@Test
	public void Firstpage()
	{
		SearchItem It = new SearchItem(driver);
		It.getSearch().click();
		It.getSearch().sendKeys("lens" +Keys.ENTER);
		
	}

}
