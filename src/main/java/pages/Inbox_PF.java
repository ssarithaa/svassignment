package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SVassignment.gmailAutomation.BasePage;

public class Inbox_PF extends BasePage {

	@FindBy(xpath = "//*[@class='yW']/span")
	private List<WebElement> messages;

	@FindBy(xpath = "//a[@title='Inbox']")
	private WebElement inboxLink;
	
	public Inbox_PF(WebDriver driver) {

		super(driver);

	}

	public List<WebElement> getMessages() {
		return messages;
	}

	public WebElement getInboxLink() {
		return inboxLink;
	}
	
}