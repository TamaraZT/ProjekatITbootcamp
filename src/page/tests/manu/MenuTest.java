package page.tests.manu;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import page.objects.HumanityHome;
	import page.objects.HumanityMenu;
	import page.objects.LogIn;

	public class MenuTest {
		@Test
		public void MenuOpcije() throws InterruptedException {
			//test provere trazenih opcija u meniju

			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();

			HumanityHome.clickLogin(driver);
			LogIn.logIN(driver, "sama@coin-host.net", "blabla1");
			HumanityMenu.clickDashboard(driver);

			HumanityMenu.clickShiftPlan(driver);
			driver.navigate().back();

			HumanityMenu.clicTimeClock(driver);
			driver.navigate().back();

			HumanityMenu.clickShiftPlan(driver);
			driver.navigate().back();

			HumanityMenu.clickLeave(driver);
			driver.navigate().back();

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
		}
}
