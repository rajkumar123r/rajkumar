package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keysclass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
	}

}
