package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	public static final String URL = "https://none487.humanity.com/app/admin/settings/";

	private static final String COUNTRY_SELECT = "//select[@id='country']";
	private static final String LANGUAGE_SELECT = "//select[@name='language']";
	private static final String TIME_SELECT = "//select[@name='pref_24hr']";
	
	//Country
	public static Select getCountry(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_SELECT)));
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}

	//Language
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_SELECT)));
	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	//Timezone
	public static Select getFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIME_SELECT)));
	}

	public static void inputTimeFormat(WebDriver driver, String data) {
		getFormat(driver).selectByVisibleText(data);
	}
}
