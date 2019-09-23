package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "https://www.humanity.com";
	private static final String FULL_NAME = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORKEMAIL = "//input[@id='free-trial-link-01']";
	private static final String STARTFREE = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String ABOUTUS = "//a[@class='nav-link no-before'][contains(text(),'About us')]";
	private static final String LOGIN = "//p[contains(text(),'LOGIN')]";
	private static final String STARTFREEUP = "//a[@class='button pale']";

	// fullname box
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME));
	}

	public static void clickFullname(WebDriver driver) {
		getFullName(driver).click();
	}

	// workemail box
	public static WebElement getWorkemail(WebDriver driver) {
		return driver.findElement(By.xpath(WORKEMAIL));
	}

	public static void clickWorkemail(WebDriver driver) {
		getWorkemail(driver).click();
	}

	// Startfree
	public static WebElement getStartfree(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREE));
	}

	public static void clickStartfree(WebDriver driver) {
		getStartfree(driver).click();
	}

	// About us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUTUS));
	}

	public static void clickAboutUS(WebDriver driver) {
		getAboutUs(driver).click();
	}

	// login
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN));
	}

	public static void clickLogin(WebDriver driver) {
		getLogIn(driver).click();
	}

	// startfree in the corner
	public static WebElement getStartFreeUp(WebDriver driver) {
		return driver.findElement(By.xpath(STARTFREEUP));
	}

	public static void clickStartFreeUp(WebDriver driver) {
		getStartFreeUp(driver).click();
	}

	

}