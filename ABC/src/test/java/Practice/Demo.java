package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		System.out.println("hi");
	

	}

}
