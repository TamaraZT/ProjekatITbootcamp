package page.tests.manu;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import page.objects.HumanityHome;
	import page.objects.HumanityMenu;
	import page.objects.HumanitySettings;
	import page.objects.LogIn;

	public class SettingsTest {
		@Test
		public void OpcijeSettings() throws InterruptedException {

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();

			HumanityHome.clickLogin(driver);
			LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
			
			HumanityMenu.clickSettings(driver);
			HumanitySettings.inputCountry(driver, "Serbia");
			HumanitySettings.inputLanguage(driver, "Serbian (machine)");
			HumanitySettings.inputTimeFormat(driver, "24 hour");
			Thread.sleep(5000);
			driver.close();

		}

}
