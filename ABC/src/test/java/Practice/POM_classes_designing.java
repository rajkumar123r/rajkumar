package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

public class POM_classes_designing {
	
	//declaration
	@FindBy(xpath = "//input[@id='username']")private WebElement untextbox;
	@FindBy(xpath = "(//input[@type='password'])[1]")private WebElement pwdtextbox;
	@FindBy(xpath = "//a[@id='loginButton']")private WebElement loginbtn;
	
	//initialization
	public POM_classes_designing()
	{
		
	}
      
	//
	public WebElement getUntextbox() {
		return untextbox;
	}

	public WebElement getPwdtextbox() {
		return pwdtextbox;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	

}
