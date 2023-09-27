package TESTNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_Assert {
	//it will not execute test sames once the step is fail
	@Test
	public void tc1()
	{
		Reporter.log("iam before failing tc1",true);
		                 //verification1
		Assert.fail();
		System.out.println("boss iam after failing tc1");
	}
		//verification2
		
		@Test
		
		public void tc2()
		{
			Reporter.log("boss iam from tc2",true);
			
		}
	
		
		
	
}
