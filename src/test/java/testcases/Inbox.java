package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SVassignment.gmailAutomation.BaseTest;
import pages.Emailbody_PF;
import pages.Inbox_PF;

public class Inbox extends BaseTest
{
	Inbox_PF inbox;
	Emailbody_PF body;
	
	@BeforeClass
	public void pagesetup() throws IOException
	{
		WebDriver driver = getDriver();
		inbox=new Inbox_PF(driver);
		body=new Emailbody_PF(driver);
	}
	
	@Test
	public void openEmail_Scenario1a() throws IOException
	{	
		inbox.getMessages().get(2).click();
	}
	
	@Test
	public void openEmail_Scenario1b() throws IOException
	{	
		inbox.getInboxLink().click();
		inbox.getMessages().get(4).click();
	}
	
	@Test
	public void openEmail_Scenario2() throws IOException
	{	
		inbox.getInboxLink().click();
		inbox.getMessages().get(3).click();
		body.getFwdBtn().click();
	}
	
}