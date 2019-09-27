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
		private static String EMPX = "//a[contains(text(),'";
		private static String EMPX_END = "')]";
		private static String TABLE = "//table[contains(@class,'employeesList')]//tbody";

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
		//employee by name
		public static void editEmployee(WebDriver driver, String name) {
			driver.findElement(By.xpath(EMPX + name + EMPX_END)).click();
		}
		public static boolean findEmp(WebDriver driver, String name) {
			driver.findElement(By.xpath(EMPX + name + EMPX_END)).isDisplayed();
			return true;
		}
		//List of employees
		public static List<String> getList(WebDriver driver) {
			List<WebElement> list = driver.findElement(By.xpath(TABLE))
					.findElements(By.className("staff-employee"));
			List<String> listE = new ArrayList<String>();
			for (WebElement we : list) {
				listE.add(we.getAttribute("innerHTML"));
			}
			return listE;
		}
		//Is the name in the list
		public static boolean employee(WebDriver driver, String name) {
			getList(driver).contains(name + " ");
			return true;
		}
		//Employee
		public static WebElement getZap(WebDriver driver) {
			return driver.findElement(By.xpath(EMP));
		}

		public static void clickEmp(WebDriver driver) {
			getZap(driver).click();
		}
		//all employees add an int i for a different email
		public static boolean addEmployee(WebDriver driver,int i, int broj, String ime, String prezime, String mail) {
			inputIme(driver, i, ime);
			inputSur(driver, i, prezime);
			inputMail(driver, i, broj+mail);
		return true;
		}
}
