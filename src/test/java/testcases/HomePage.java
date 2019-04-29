package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import SVassignment.gmailAutomation.BaseTest;
import pages.LoginPassword_PF;
import pages.LoginUsername_PF;

public class HomePage extends BaseTest {
	private Map<String, String> dataMap = new HashMap();
	
	
	@BeforeClass
	public void getdata() throws IOException {
		FileInputStream fin = new FileInputStream("data//InputDataFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet = wb.getSheet("DataSheet");
		Iterator<Row> rows = sheet.iterator();
		Iterator<Cell> cell = rows.next().cellIterator();
		int columnnum = 0;
		int datacolumn = 0;
		while (cell.hasNext()) {
			Cell ce = cell.next();
			if (ce.getStringCellValue().equalsIgnoreCase("Field")) {
				datacolumn = columnnum;
				break;
			}
			columnnum++;

		}

		while (rows.hasNext()) {
			Row r = rows.next();
			Cell cell1 = r.getCell(datacolumn);
			if (cell1 == null || cell1.getStringCellValue() == null) {
				break;
			}
			Iterator<Cell> cv = r.cellIterator();
			Cell c = cv.next();
			String key = c.getStringCellValue();

			c = cv.next();
			String value = c.getStringCellValue();
			dataMap.put(key, value);

		}
		Set<String> dataKeys = dataMap.keySet();
		for (String key : dataKeys) {
			System.out.println(key + "  -- " + dataMap.get(key));
		}

	}

	@Test
	public void login() throws IOException, InterruptedException {
		WebDriver driver = getDriver();
		driver.get("https://www.google.com/gmail");
		LoginUsername_PF home = new LoginUsername_PF(driver);
		String username=dataMap.get("username");
		String password=dataMap.get("password");
		home.getusername().sendKeys(username);
		home.getnextbtn().click();
		LoginPassword_PF home2=new LoginPassword_PF(driver);
		Thread.sleep(1000);
		home2.getPassword().sendKeys(password);
		home2.getPasswordNextBtn().click();

}
	
	
}