package TESTNG;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotation_flow {
	@BeforeSuite
	public void m1()
	{
		Reporter.log("connection to database",true);
	}
	@BeforeClass
	public void m2()
	{
		Reporter.log("open the browser",true);
	}
	@BeforeMethod
	public void m3()
	{
		Reporter.log("login to app",true);
	}
	@Test
	public void t1()
	{
		Reporter.log("boss jam main tc",true);
		
	}
	@AfterMethod
	public void m5()
	{
		Reporter.log("logout the app",true);
	}
	@AfterClass
	public void m6()
	{
		Reporter.log("close the browser",true);
	}
	@AfterSuite
	public void m7()
	{
		Reporter.log("close the database disconnection",true);
	}


}
