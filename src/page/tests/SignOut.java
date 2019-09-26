package page.tests;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityProfile;
import page.objects.LogIn;

public class SignOut {
	@Test
	public void SignOutTest() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get(HumanityHome.URL);
	driver.manage().window().maximize();
	
	
	HumanityHome.clickLogin(driver);
	LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
	Thread.sleep(3000);
	
	HumanityProfile.clickProfileDropDown(driver);
	HumanityProfile.clickSignOut(driver);
	Thread.sleep(5000);
	assertEquals(driver.getCurrentUrl(), "https://none487.humanity.com/app/");
	
	driver.close();
	}
}
