package Practice;

//import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		//Dimension d1=new Dimension(100,200);
		
	Point d=new Point(200,400);
		driver.manage().window().setPosition(d);	
		}
} 
