package E2El;

import org.testng.Assert;
import org.testng.annotations.Test;


import resources.base;

public class VerifyTitle extends base {
	
@Test
public void GetTitle()
{
Assert.assertEquals( driver.getTitle() , "Test");
	String ti= driver.getTitle();
	System.out.println(ti);
	}



}
