package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SVassignment.gmailAutomation.BasePage;

public class LoginUsername_PF extends BasePage {

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement username;

	@FindBy(xpath = "//*[@id='identifierNext']")
	private WebElement nextbtn;

	

	public LoginUsername_PF(WebDriver driver) {

		super(driver);
	}

	public WebElement getusername() {
		return this.username;
	}

	public WebElement getnextbtn() {
		return this.nextbtn;
	}

}
