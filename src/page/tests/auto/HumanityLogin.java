package page.tests.auto;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import page.objects.HumanityHome;
import page.objects.HumanityMenu;
import page.objects.LogIn;
import utility.ExcelUtils;

public class HumanityLogin {
	@Test
	public void HumanityLogIn() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.get(HumanityHome.URL);
		
		String DATA_SRC = "Data (3).xls";
		driver.manage().window().maximize();
		
		ExcelUtils.setExcell(DATA_SRC);
		ExcelUtils.setWorkSheet(0);
		
		String email, password;
		email=ExcelUtils.getDataAt(1,0);
		password=ExcelUtils.getDataAt(1,1);

		HumanityHome.clickLogin(driver);
		LogIn.logIN(driver, email, password);
		
		Thread.sleep(5000);
		assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
		driver.close();

	}

}
