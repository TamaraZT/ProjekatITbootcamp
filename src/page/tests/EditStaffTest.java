package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.LogIn;

public class EditStaffTest {
	@Test
	public 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	
	driver.get(HumanityHome.URL);
	driver.manage().window().maximize();
	
	
	HumanityHome.clickLogin(driver);
	LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
	

}
