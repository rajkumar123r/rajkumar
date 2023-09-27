package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class dynamic_element_handling {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		//carona virus cases
		String ele = driver.findElement(By.xpath("//div[@class='maincounter-number']/span")).getText();
		System.out.println(ele);
		//print death cases
		String str1 = driver.findElement(By.xpath("(//div[@class='maincounter-number']/span)[2]")).getText();
		System.out.println(str1);
		//print recovery cases
		String str2 = driver.findElement(By.xpath("(//div[@class='maincounter-number']/span)[3]")).getText();
		System.out.println(str2);
		
	}

}
