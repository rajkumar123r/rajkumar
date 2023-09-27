package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class i_frame {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//maximaize the browser
		driver.manage().window().maximize();
		//switch to firstframe
		driver.switchTo().frame(0);
		//take any element on firstframe
		String text = driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		//switch to secondframe
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		//take any element on secondframe
		String text1 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		//switch to third element
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		//take any element on thirdframe and printit
		String text2 = driver.findElement(By.xpath("(//li[@class='navBarCell1Rev'])[2]")).getText();
		System.out.println(text2);
		}

}
