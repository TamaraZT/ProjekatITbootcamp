package page.tests.auto;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;
import page.objects.LogIn;
import utility.ExcelUtils;

public class AddNewEmployeeTest {
	private static final String Try = null;

	@Test
	public void Logovanje() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get(HumanityHome.URL);

		String DATA_SRC = "Data (3).xls";
		driver.manage().window().maximize();
		ExcelUtils.setExcell(DATA_SRC);
		ExcelUtils.setWorkSheet(0);

		String email, password;
		email = ExcelUtils.getDataAt(1, 0);
		password = ExcelUtils.getDataAt(1, 1);

		HumanityHome.clickLogin(driver);
		LogIn.logIN(driver, email, password);
		HumanityMenu.clickStaff(driver);
		HumanityStaff.clickAddNew(driver);

		String ime, prezime, mail;
		ExcelUtils.setWorkSheet(1);

		try {
			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				mail = ExcelUtils.getDataAt(i, 2);
				HumanityStaff.addEmployee(driver, i, 2, ime, prezime, mail);
			}
			HumanityStaff.clickSaveEmp(driver);
			;
			Thread.sleep(4000);
			HumanityMenu.clickStaff(driver);

			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				
				boolean present = HumanityStaff.findEmp(driver, ime);
				assertTrue(present);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}