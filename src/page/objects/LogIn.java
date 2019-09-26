package page.objects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LogIn {
		public static final String URL="https://none487.humanity.com/app/";
		private static final String EMAIL="//input[@id='email']";
		private static final String PASSWORD="//input[@id='password']";
		private static final String LOGIN="//button[contains(text(),'Log in')]";
		
		//email
		public static WebElement getEmail(WebDriver driver) {
			return driver.findElement(By.xpath(EMAIL));
		}
		public static void clickEmail(WebDriver driver) {
			getEmail(driver).click();
		}
		public static void inputEmail(WebDriver driver,String data) {
			getEmail(driver).sendKeys(data);
		}
		//password
		public static WebElement getPassword(WebDriver driver) {
			return driver.findElement(By.xpath(PASSWORD));
		}
		public static void clickPassword(WebDriver driver) {
			getPassword(driver).click();
		}
		public static void inputPassword(WebDriver driver,String data) {
			getPassword(driver).sendKeys(data);
		}
		//login
		public static WebElement getLogIn(WebDriver driver) {
			return driver.findElement(By.xpath(LOGIN));
		}
		public static void clickLogIn(WebDriver driver) {
			getLogIn(driver).click();
		}
		public static boolean logIN(WebDriver driver, String email, String password) {
			inputEmail(driver, email);
			inputPassword(driver, password);
			clickLogIn(driver);
			return true;
		}
		
}
