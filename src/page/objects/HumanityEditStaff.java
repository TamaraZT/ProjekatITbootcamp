package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	private static final String UPLOAD = "//span[@id='in-btn']";

	public static WebElement getUpload(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD));
	}

	public static void clickUpload(WebDriver driver) {
		getUpload(driver).click();
	}
	public static void Upload(WebDriver driver, String data) {
		 driver.switchTo().alert().sendKeys(data);
	}

}
