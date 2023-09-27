package TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parllel_execution_class1 {
	@Test
	public void m1()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	}

}
