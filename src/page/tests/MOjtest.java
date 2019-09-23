package page.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityStaff;
import page.objects.LogIn;


public class MOjtest {
	/*@Test
	public void Testic() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
	
		HumanityHome.clickFullname(driver);
		HumanityHome.clickWorkemail(driver);
		
		HumanityHome.clickStartfree(driver);
		HumanityHome.clickAboutUS(driver);
		HumanityHome.clickStartFreeUp(driver);
		HumanityHome.clickLogin(driver);
		
		Thread.sleep(5000);
		
		driver.close();

	}*/
	/*@Test
	public void DrugiTestic() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		LogIn.inputEmail(driver, "sama@coin-host.net");
		LogIn.inputPassword(driver, "blabla1");
		LogIn.clickLogIn(driver);
	
		HumanityMenu.clickDashboard(driver);
		HumanityMenu.clickShiftPlan(driver);
		driver.navigate().back();
		HumanityMenu.clicTimeClock(driver);
		driver.navigate().back();
		Thread.sleep(5000);
		HumanityMenu.clickShiftPlan(driver);
		driver.navigate().back();
		Thread.sleep(5000);
		HumanityMenu.clickLeave(driver);
		driver.navigate().back();
		Thread.sleep(5000);
		HumanityMenu.clickTraining(driver);
		driver.navigate().back();
		HumanityMenu.clickStaff(driver);
		driver.navigate().back();
		HumanityMenu.clickPayroll(driver);
		driver.navigate().back();
		HumanityMenu.clickReports(driver);
		driver.navigate().back();
		
		Thread.sleep(3000);
		driver.close();
	}*/
	/*@Test
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		HumanityHome.clickLogin(driver);
		Thread.sleep(4000);
		LogIn.inputEmail(driver, "sama@coin-host.net");
		LogIn.inputPassword(driver, "blabla1");
		LogIn.clickLogIn(driver);
		Thread.sleep(5000);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		/*HumanityStaff.clickAddNew(driver);
		Random r=new Random();
		for(int i=1;i<5;i++) {
			HumanityStaff.inputIme(driver, i, "Ime"+r.nextInt());
			HumanityStaff.inputSur(driver, i, "Prezime"+r.nextInt());
			HumanityStaff.inputMail(driver, i, "nekitext"+r.nextInt()+"@gmail.com");
		}
	
		assertEquals(HumanityStaff.getEmp(driver),"Ime"+"%" );
		Thread.sleep(5000);
		driver.close();*/
	
		
	

}
