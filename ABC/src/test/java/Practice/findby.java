package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class findby {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		WebElement text=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		driver.navigate().refresh();
	     text.sendKeys("mobiles under 20000");
		
	}

}
