package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SVassignment.gmailAutomation.BasePage;

public class LoginPassword_PF extends BasePage {
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//*[@id='passwordNext']")
	private WebElement passwordNextBtn;

	public LoginPassword_PF(WebDriver driver) {
		super(driver);

	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPasswordNextBtn() {
		return passwordNextBtn;
	}

}
