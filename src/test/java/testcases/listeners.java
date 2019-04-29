package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import SVassignment.gmailAutomation.BasePage;
import SVassignment.gmailAutomation.BaseTest;

public class listeners extends BaseTest implements ITestListener
{

String testcasename;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result)  
	{
	testcasename=result.getName();
	screenshot(testcasename);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		testcasename=result.getName();
		screenshot(testcasename);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onFinish(ITestContext context) {
			
			
	}

	public void screenshot(String testname)
	{
		try {
			WebDriver driver=getDriver();
			BasePage baseobj=new BasePage(driver);
			baseobj.takeScreenshot(testname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
		
}
