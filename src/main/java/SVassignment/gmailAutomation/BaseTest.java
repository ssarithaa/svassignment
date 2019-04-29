package SVassignment.gmailAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	private static WebDriver driver;

	public WebDriver getDriver() throws IOException {
		if (driver != null) {
			return driver;
		}

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("data//datafile.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");

		switch (browser.toLowerCase()) {
		case "firefox":
			System.setProperty("webdriver.gecko.driver", prop.getProperty("geckodriverpath"));
			this.driver = new FirefoxDriver();
			this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
			this.driver = new ChromeDriver();
			this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			break;
		default:
			System.out.println("Unsupported browser");

		}

		return driver;

	}


	
	
}