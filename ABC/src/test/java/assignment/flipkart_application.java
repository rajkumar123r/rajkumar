package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class flipkart_application {
	@Parameters("browser")
	@Test
	public void m(String browser)
	{
	WebDriver driver=null;
	if(browser.equals("firefox"))
	{
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.com");
	}
	else if(browser.equals("edge"))
	{
	driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	}
	

	}
}


