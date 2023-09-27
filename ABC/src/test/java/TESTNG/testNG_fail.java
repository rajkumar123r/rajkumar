package TESTNG;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class testNG_fail {
	//it will fail testcase
	@Test
	public void m1()
	{
		Reporter.log("had you done your dinner",true);
		//Assert.fail();
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
