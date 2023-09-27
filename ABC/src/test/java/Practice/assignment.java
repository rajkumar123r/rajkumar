package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.google.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("baby movie");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='wM6W7d'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='HnYYW'])[2]")).click();
	}

}
