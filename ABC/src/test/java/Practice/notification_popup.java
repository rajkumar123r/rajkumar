package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class notification_popup {
	public static void main(String[] args) throws Throwable {

	//System.setProperty("webdriver.chromedriver","\"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe\"");
		EdgeOptions c=new EdgeOptions();
		
		c.addArguments("--disable-notification");
		c.addArguments("start-maximaized");
		WebDriver driver=new EdgeDriver(c);
		Thread.sleep(2000);
		driver.get("https://www.hdfc.com");
		

	
		
		
	}

}
