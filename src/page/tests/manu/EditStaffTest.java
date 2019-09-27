package page.tests.manu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityEditStaff;
import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;
import page.objects.LogIn;

public class EditStaffTest {
	@Test
	public void FunkcijeEditStaff() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		
		
		HumanityHome.clickLogin(driver);
		LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
		
		HumanityMenu.clickStaff(driver);
		//Get Employee
		
		HumanityStaff.employee(driver, "Nebojsa");
		HumanityStaff.getList(driver);
		HumanityStaff.editEmployee(driver, "Nebojsa");
		//go to edit
		HumanityEditStaff.clickEdit(driver);
		//change nick
		HumanityEditStaff.inputNick(driver, "Nadimak");
		Thread.sleep(2000);
		//change photo
		HumanityEditStaff.getUpload(driver, "C:\\Users\\User\\Documents\\ironman.png");
		Thread.sleep(5000);
		//Save change
		HumanityEditStaff.clickSave(driver);
		Thread.sleep(2000);
		driver.close();
		
	}

}
