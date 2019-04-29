package SVassignment.gmailAutomation;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.io.Files;

public class BasePage {
	protected WebDriver driver;

	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public void takeScreenshot(String testname) throws IOException {

		File srcfile = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcfile, new File("C:\\my\\myWS\\gmailAutomation" + testname + ".png"));

	}

}