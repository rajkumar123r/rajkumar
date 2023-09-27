package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_year {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//create new account
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(3000);
		Select s=new Select(year);
		Thread.sleep(3000);
		s.selectByVisibleText("2001");
	}

}
