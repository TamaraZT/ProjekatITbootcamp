package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	private static final String ACCOUNT= "//img[@id='tr_avatar']";
	private static final String SETTINGS="//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	private static final String PROFILE="//a[contains(text(),'Profile')]";
	private static final String AVAILABILITY="//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	private static final String VERSION="//b[contains(text(),'9.5.5')]";
	private static final String SIGNOUT="//a[contains(text(),'Sign Out')]";
	//drop down meni za profil
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(ACCOUNT));
	}
	public static void clickProfileDropDown(WebDriver driver) {
		getProfile(driver).click();
	}
	//sign out
	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT));
	}
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
	//za Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	//za Profil
	public static WebElement getProfil(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE));
	}
	public static void clickProfile(WebDriver driver) {
		getProfil(driver).click();
	}
	//Availability
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	//Za verziju
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.id("humanityAppVersion"));
	}
	public static WebElement clickVersion(WebDriver driver) {
		return getVersion(driver).findElement(By.tagName("b"));
	}
	public static String verzija(WebDriver driver) {
		return clickVersion(driver).getText();
	}
}
