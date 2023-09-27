package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class multi_browser {
	@Test
	public void m()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
	}

}
