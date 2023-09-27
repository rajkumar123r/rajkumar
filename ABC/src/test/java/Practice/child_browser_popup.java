package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class child_browser_popup {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/"); 
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles");
		//click on enter button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]")).click();
		Thread.sleep(2000);
		Set<String> allwin=driver.getWindowHandles();
		Thread.sleep(2000);
		for(String win:allwin)
		{
			driver.switchTo().window(win);
		}
		String str = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(str);
		
		 
		
	}

}
