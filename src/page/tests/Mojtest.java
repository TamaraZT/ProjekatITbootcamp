package page.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityEditStaff;
import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.HumanityProfile;
import page.objects.HumanitySettings;
import page.objects.HumanityStaff;
import page.objects.LogIn;


public class Mojtest {
	
	
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
		driver.close();
		}*/
	/*
	@Test
	public void TestSettings() throws InterruptedException {
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
		HumanityMenu.clickSettings(driver);
		Thread.sleep(3000);
		HumanitySettings.inputCountry(driver, "Serbia");
		HumanitySettings.inputLanguage(driver, "Serbian (machine)");
		HumanitySettings.inputTimeFormat(driver, "24 hour");
		Thread.sleep(5000);
		
		driver.close();
	}
	*/
	/*
	@Test
	public void TestProfile() throws InterruptedException {
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
	HumanityProfile.clickProfile(driver);
	HumanityProfile.clickSettings(driver);
	Thread.sleep(4000);

	driver.close();
	}
	*/
	@Test
	public void testEdit() throws InterruptedException {
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
		HumanityProfile.clickProfileDropDown(driver);
		HumanityProfile.clickSettings(driver);
		HumanityEditStaff.clickUpload(driver);
		Thread.sleep(4000);
		HumanityEditStaff.Upload(driver, "novine");
		
		Thread.sleep(5000);
		driver.close();
	}

}
