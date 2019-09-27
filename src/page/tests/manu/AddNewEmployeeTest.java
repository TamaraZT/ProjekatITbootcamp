package page.tests.manu;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;
import page.objects.LogIn;

public class AddNewEmployeeTest {
	@Test
	private void DodajZaposlenog() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();

		HumanityHome.clickLogin(driver);
		LogIn.logIN(driver, "sama@coin-host.net", "blabla1");

		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		HumanityStaff.clickAddNew(driver);
		Thread.sleep(3000);
		HumanityStaff.addEmployee(driver, 1, 4, "Ime", "Prezime", "nesto@gmail.com");
		Thread.sleep(3000);
		HumanityStaff.clickSaveEmp(driver);
		Thread.sleep(4000);
		HumanityMenu.clickStaff(driver);
		HumanityStaff.employee(driver, "Ime");
		HumanityStaff.getList(driver);
		boolean a=HumanityStaff.findEmp(driver, "Ime");
		assertTrue(a);
		driver.close();
	}
}
