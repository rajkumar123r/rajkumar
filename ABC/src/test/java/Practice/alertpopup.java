package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		//write customer ID 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123456");
		//click on sub,it Btn
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//move the cursor fom main webpage to alert popup
		Alert alt = driver.switchTo().alert();
		//clico on ok btn using Accept method
		//alt.accept();
		
		//click on cancel Btn
		//alt.dismiss();
		
		//get te text on alert Popup
		String txt = alt.getText();
		System.out.println(txt);
		
	}

}
