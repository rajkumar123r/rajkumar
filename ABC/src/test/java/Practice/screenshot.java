package Practice;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new EdgeDriver();
		//Random r=new Random();
	   // int rc=r.nextInt(10);
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\Desktop\\screenshot\\Googlepage.png");
	   Files.copy(src, dest);
		//individual element of webpage
		//WebElement abc=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		//File src1=abc.getScreenshotAs(OutputType.FILE);
		//File dest1=new File("C:\\Users\\DELL\\Desktop\\screenshot\\GooglepageLOGO.png");
		//Files.copy(src, dest);
		
		
	}

}
