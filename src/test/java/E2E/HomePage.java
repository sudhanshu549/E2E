package E2E;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.base;

public class HomePage extends base {
	
	
	@Test(dataProvider="getData")
	public void BasePage(String username,String password) throws IOException
	{
		driver = InitializeDriver();
		LoginPage lp = new LoginPage(driver);
		lp.getusername().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getsubmit().click();
		
		ProductPage p =new ProductPage(driver);
		p.getItem().sendKeys("Realme Gt Master Edition" + Keys.ENTER);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] Data = new Object[2][2];
		Data[0][0]="9711744534";
		Data[0][1]="Sudh@1811";
		Data[1][0]="9370375083";
		Data[1][1]="tripti@24";
		
		return Data;	
		
	}
	
	
	

}
