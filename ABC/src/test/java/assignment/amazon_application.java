package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazon_application {
	@Test
	public void m()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com");
	}

}
