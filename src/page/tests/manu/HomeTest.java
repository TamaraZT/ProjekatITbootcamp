package page.tests.manu;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import page.objects.HumanityHome;

	public class HomeTest {
		@Test
		public void TestOpcijaHome() throws InterruptedException {
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
		}

}
