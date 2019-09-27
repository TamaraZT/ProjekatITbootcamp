package page.tests.auto;


	import static org.testng.Assert.assertEquals;
	import static org.testng.Assert.assertNotEquals;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import page.objects.HumanityHome;
	import page.objects.HumanityMenu;
	import page.objects.LogIn;
	import utility.ExcelUtils;

	public class HumanityLoginNegative {
		
			@Test (priority=0)
			public void WrongPassword() throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				
				driver.get(HumanityHome.URL);
				
				String DATA_SRC = "Data (3).xls";
				driver.manage().window().maximize();
				
				ExcelUtils.setExcell(DATA_SRC);
				ExcelUtils.setWorkSheet(0);
				
				String email, password;
				email=ExcelUtils.getDataAt(1,0);//Right email
				password=ExcelUtils.getDataAt(2,1);//Wrong password

				HumanityHome.clickLogin(driver);
				LogIn.logIN(driver, email, password);
				Thread.sleep(5000);
				assertNotEquals(driver.getCurrentUrl(), HumanityMenu.URL);
				driver.close();
			}
			@Test (priority=1)
			public void WrongEmail() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				
				driver.get(HumanityHome.URL);
				
				String DATA_SRC = "Data (3).xls";
				driver.manage().window().maximize();
				
				ExcelUtils.setExcell(DATA_SRC);
				ExcelUtils.setWorkSheet(0);
				
				String email, password;
				email=ExcelUtils.getDataAt(2,0);//Wrong email
				password=ExcelUtils.getDataAt(1,1);//Right password

				HumanityHome.clickLogin(driver);
				LogIn.logIN(driver, email, password);
				Thread.sleep(5000);
				assertNotEquals(driver.getCurrentUrl(), HumanityMenu.URL);
				driver.close();
				
			}
			@Test (priority=2)
			public void NullCase() {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				
				driver.get(HumanityHome.URL);
				
				String DATA_SRC = "Data (3).xls";
				driver.manage().window().maximize();
				
				ExcelUtils.setExcell(DATA_SRC);
				ExcelUtils.setWorkSheet(0);
				try {
				String email, password;
				email=ExcelUtils.getDataAt(3,0);//Wrong email
				password=ExcelUtils.getDataAt(1,1);//Right password

				HumanityHome.clickLogin(driver);
				LogIn.logIN(driver, email, password);
				}catch(Exception e) {
					System.out.println("Null u podacima za email ili password");
				}finally{
				assertNotEquals(driver.getCurrentUrl(), HumanityMenu.URL);
				driver.close();}
				
			}
}
