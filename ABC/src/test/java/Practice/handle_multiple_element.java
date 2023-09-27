package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handle_multiple_element {
	public static void main(String[] args) {
		int count=0;
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		//click on cancel button
           List<WebElement>ele=driver.findElements(By.xpath("//div"));
        		   for(WebElement i:ele)
        		   {
        			   String str=i.getText();
        			   System.out.println(str);
        			   count++;
        		   }
        		   System.out.println(count);
				
	
	}

}
