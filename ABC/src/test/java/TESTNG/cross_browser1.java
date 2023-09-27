package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser1 {
	@Parameters("browsername")
	@Test
	public void tc1(String browsername)
	{
	WebDriver driver=null;
	if(browsername.equals("firefox"))
	{
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
	else if(browsername.equals("edge"))
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}
	}

}
