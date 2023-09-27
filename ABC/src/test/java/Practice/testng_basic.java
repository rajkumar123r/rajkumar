package Practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng_basic {
	@Test
	public void show1()
	{
		Reporter.log("iam executing testcase1",true);
	}
	@Test
	public void show2()
	{
		Reporter.log("iam execting testcase2");
	}
	

}
