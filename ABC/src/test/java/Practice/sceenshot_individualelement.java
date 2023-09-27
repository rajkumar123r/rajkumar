package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class sceenshot_individualelement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement abc = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src=abc.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\DELL\\Desktop\\screenshot\\amazonpageLOGO.png");
		Files.copy(src, dest);

	}

}
