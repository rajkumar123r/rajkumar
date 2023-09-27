package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_javadesignpattern_objectreposetory {
	//declaration
	@FindBy(xpath="")private WebElement untextbox;
	@FindBy(xpath="")private WebElement pwdtextbox;
	@FindBy(xpath="")private WebElement loginbtn;
	
	//initialization
	public pom_javadesignpattern_objectreposetory(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
		
	}
	//implementation

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
