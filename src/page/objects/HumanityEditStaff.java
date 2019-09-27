package page.objects;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class HumanityEditStaff {
		
		private static final String UPLOAD = "//input[@id='fileupload']";
		private static final String EDIT="//a[contains(text(),'Edit Details')]"; 
		private static final String NICKNAME="//input[@id='nick_name']";
		private static final String SAVE="//button[@id='act_primary']";
		public static final String Thread = null;

		//Click Upload Photo
		public static void getUpload(WebDriver driver, String path) {
			 driver.findElement(By.xpath(UPLOAD)).sendKeys(path);;
		}

		//Edit Profile
		public static WebElement getEdit(WebDriver driver) {
			return driver.findElement(By.xpath(EDIT));
		}

		public static void clickEdit(WebDriver driver) {
			getEdit(driver).click();
		}
		//Add nickname
		public static WebElement getNick(WebDriver driver) {
			return driver.findElement(By.xpath(NICKNAME));
		}

		public static void inputNick(WebDriver driver,String data) {
			getNick(driver).click();
			getNick(driver).sendKeys(data);
		}
		//Save changes
		public static WebElement getSave(WebDriver driver) {
			return driver.findElement(By.xpath(SAVE));
		}

		public static void clickSave(WebDriver driver) {
			getSave(driver).click();
		}
}
