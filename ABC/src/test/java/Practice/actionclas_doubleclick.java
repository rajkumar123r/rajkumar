package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclas_doubleclick {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com");
		WebElement ele = driver.findElement(By.xpath("(//a[@class='gb_y'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).doubleClick().perform();
	}

}
