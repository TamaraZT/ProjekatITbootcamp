package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static String URL = "https://none487.humanity.com/app/dashboard/";

	private static final String DASHBOARD = "//p[contains(text(),'Dashboard')]";
	private static final String SHIFTPLAN = "//p[contains(text(),'ShiftPlanning')]";
	private static final String TIME = "//p[contains(text(),'Time Clock')]";
	private static final String LEAVE = "//p[contains(text(),'Leave')]";
	private static final String TRAINING = "//p[contains(text(),'Training')]";
	private static final String STAFF = "//p[contains(text(),'Staff')]";
	private static final String PAYROLL = "//p[contains(text(),'Payroll')]";
	private static final String REPORTS = "//p[contains(text(),'Reports')]";
	private static final String SETTINGS="//i[@class='primNavQtip__icon icon-gear']";

	// Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// SHIFTPLAN
	public static WebElement getShift(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLAN));
	}

	public static void clickShiftPlan(WebDriver driver) {
		getShift(driver).click();
	}

	// TIME
	public static WebElement getTime(WebDriver driver) {
		return driver.findElement(By.xpath(TIME));
	}

	public static void clicTimeClock(WebDriver driver) {
		getTime(driver).click();
	}

	// LEAVE
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
	//Settings
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}

}
