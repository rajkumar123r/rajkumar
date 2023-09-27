package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNG_enable {
	//it will not showing
	@Test(enabled = false)
	public void m1()
	{
		Reporter.log("had you done your dinner",true);
	}
	@Test
	public void m2()
	{
		Reporter.log("had you done your breakfast",true);
	}
	@Test
	public void m3()
	{
		Reporter.log("had you done your lunch",true);
	}
}
