package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SVassignment.gmailAutomation.BasePage;

public class Emailbody_PF extends BasePage
{
	@FindBy(xpath="//span[@role='link' and text()='Forward']")
	WebElement fwdBtn;
	
	public Emailbody_PF(WebDriver driver) {
		super(driver);
		}

	public WebElement getFwdBtn() {
		return fwdBtn;
	}



}


