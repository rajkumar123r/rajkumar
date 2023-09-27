package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TESTNG_invocation {
	@Test(invocationCount = 10)
	public void m1()
	{
		Reporter.log("had you done your dinner",true);
	}

}
