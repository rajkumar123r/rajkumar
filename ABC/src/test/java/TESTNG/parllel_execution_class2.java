package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parllel_execution_class2 {
	@Test
	public void m2()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
	}


}
