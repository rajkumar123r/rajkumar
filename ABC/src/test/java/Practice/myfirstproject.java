package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class myfirstproject {
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rajkumar");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("chiluveru");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9989625199");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("rajkumarach@8");
		//WebElement year=driver.findElement(By.xpath(null))
		Thread.sleep(2000);
		WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		Select s=new Select(day);
		s.selectByVisibleText("6");
		Thread.sleep(3000);
		WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		Select ss=new Select(month);
		Thread.sleep(3000);
		ss.selectByVisibleText("Apr");
		Thread.sleep(2000);
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		Select sss=new Select(year);
		sss.selectByVisibleText("2001");
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();




		//driver.findElement(By.xpath("//select[@id='month']")).sendKeys("April");
		//driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2001");
		//driver.findElement(By.xpath((//input[@type='radio'])[2]")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
}
}
