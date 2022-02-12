package E2El;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.base;

public class SignPage extends base {

	@Test
	public void SignNavigation() throws IOException
	{
		SignIn Sign = new SignIn(driver);
		Sign.Login().click();
		
		MainLogin num = new MainLogin(driver);
		num.getNumber().click();
		num.getNumber().sendKeys("7712398076");
		num.getCross().click();
	
	}
	
}
