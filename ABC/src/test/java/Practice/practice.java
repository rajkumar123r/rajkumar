package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class practice {
	public static void main(String[] args) throws InterruptedException {
		int count=0;
		WebDriver driver=new EdgeDriver();
		driver.get("https:www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("[id='APjFqb']")).sendKeys("baby movie reviews");
	}
}
	

