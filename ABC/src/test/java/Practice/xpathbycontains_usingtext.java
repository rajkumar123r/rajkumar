package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains_usingtext {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	      driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
	      driver.findElement(By.xpath("//div[contains(text(),'Login ')] ")).click();
	}

  }
