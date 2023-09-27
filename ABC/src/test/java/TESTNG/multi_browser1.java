package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class multi_browser1 {
	@Test
	public void m()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}

}
