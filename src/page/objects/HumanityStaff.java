package page.objects;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
		public static final String URL = "https://none487.humanity.com/app/staff/list/load/true/";
		private static final String ADD = "//button[@id='act_primary']";
		private static final String SAVE="//button[@id='_as_save_multiple']";
		private static final String ALLEMP="//a[contains(text(),'All Staff')]";
		private static final String EMP="//a[@class='staff-employee']";
		//private static String EMPX = "//a[contains(text(),'";
		//private static String EMPX_END = "')]";
		//private static String TABLE = "//table[contains(@class,'employeesList')]//tbody";

		// click AddEmployee
		public static WebElement getAddNew(WebDriver driver) {
			return driver.findElement(By.xpath(ADD));
		}

		public static void clickAddNew(WebDriver driver) {
			getAddNew(driver).click();
		}
		

		public static WebElement getUbaciIme(WebDriver driver, int index) {
			String pd = "//input[@id='_asf";
			String dd = "']";
			String xpath = pd + index + dd;
			return driver.findElement(By.xpath(xpath));
		}

		public static void clickUbaciIme(WebDriver driver, int index) {
			getUbaciIme(driver, index).click();
		}

		public static void inputIme(WebDriver driver, int index, String data) {
			getUbaciIme(driver, index).sendKeys(data);
		}

		public static WebElement getUbaciSur(WebDriver driver, int index) {
			String pd = "//input[@id='_asl";
			String dd = "']";
			String xpath = pd + index + dd;
			return driver.findElement(By.xpath(xpath));
		}

		public static void clickUbaciSur(WebDriver driver, int index) {
			getUbaciSur(driver, index).click();
		}

		public static void inputSur(WebDriver driver, int index, String data) {
			getUbaciSur(driver, index).sendKeys(data);
		}

		public static WebElement getUbaciMail(WebDriver driver, int index) {
			String pd = "//input[@id='_ase";
			String dd = "']";
			String xpath = pd + index + dd;
			return driver.findElement(By.xpath(xpath));
		}

		public static void clickUbaciMail(WebDriver driver, int index) {
			getUbaciMail(driver, index).click();
		}

		public static void inputMail(WebDriver driver, int index, String data) {
			getUbaciMail(driver, index).sendKeys(data);
		}
		public static WebElement getSave(WebDriver driver) {
			return driver.findElement(By.xpath(SAVE));
		}
		public static void clickSaveEmp(WebDriver driver) {
			getSave(driver).click();
		}
		public static WebElement getAll(WebDriver driver) {
			return driver.findElement(By.xpath(ALLEMP));
		}

		public static void clickAllEmp(WebDriver driver) {
			getAll(driver).click();
		}
		//public static WebElement getEmp(WebDriver driver) {
		//	return driver.findElement(By.xpath("//a[contains(text(),'Ime-1287066345 Prezime-282264966')]"));
		//}
		public static WebElement getZap(WebDriver driver) {
			return driver.findElement(By.xpath(EMP));
		}

		public static void clickEmp(WebDriver driver) {
			getZap(driver).click();
		}
	
		
}
