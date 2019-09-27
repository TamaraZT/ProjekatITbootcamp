package page.tests.manu;


	import static org.testng.Assert.assertEquals;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import page.objects.HumanityHome;
	import page.objects.HumanityMenu;

	import page.objects.LogIn;
	import utility.ExcelUtils;


	public class HumanityLoginTest {
		@Test
		public void HumanityLogIn() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();			
			
			HumanityHome.clickLogin(driver);
			LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
			
			
			Thread.sleep(5000);
			assertEquals(driver.getCurrentUrl(), HumanityMenu.URL);
			driver.close();

		}

}
