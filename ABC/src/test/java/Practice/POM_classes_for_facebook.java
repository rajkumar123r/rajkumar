package Practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM_classes_for_facebook {
	//declaration
	@FindBy(xpath = "")private WebElement firstnametextbox;
	@FindBy(xpath = "")private WebElement surnametextbox;
	@FindBy(xpath = "")private WebElement mobileoremailadresstextbox;
	@FindBy(xpath = "")private WebElement newpwdtextbox;
	
	
	//initialization
	public  POM_classes_for_facebook()
	{
		
	}
	
	//implementation

	public WebElement getFirstnametextbox() {
		return firstnametextbox;
	}

	public WebElement getSurnametextbox() {
		return surnametextbox;
	}

	public WebElement getMobileoremailadresstextbox() {
		return mobileoremailadresstextbox;
	}

	public WebElement getNewpwdtextbox() {
		return newpwdtextbox;
	}

	
	}

    


