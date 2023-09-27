package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_priority {
	@Test(priority = 3)
	public void m1()
	{
		Reporter.log("had you done your dinner",true);
	}
	@Test(priority=1)
	public void m2()
	{
	Reporter.log("had you done your breakfast",true);	
	}
	@Test(priority = 2)
	public void m3()
	{
		Reporter.log("had you done your lunch",false);
	}

}
