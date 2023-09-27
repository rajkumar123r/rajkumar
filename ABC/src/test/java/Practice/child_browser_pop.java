package Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class child_browser_pop {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.linkedin.com/");
		WebElement gmailsignin = driver.findElement(By.xpath("(//span[text()='Continue with Google'])[1]"));
		gmailsignin.click();
		Thread.sleep(3000);
		//use get window handles
		Set<String> ids=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(ids);
		String cwid=al.get(1);
		//System.out.println(cwid);
		//click on create account
		//WebElement crtbtn = driver.findElement(By.xpath(""));
		}

}
