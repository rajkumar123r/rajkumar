package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample_test1 {
	@Test
	public void m1()
	{
		Reporter.log("testcase1");
	}
	@Test
	public void m2()
	{
		Reporter.log("testcase2");
	}

}
