package mvnTest.com.pages;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	
	public static WebDriver driver;
	public static WebElement element;
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public static WebElement UserName_Feild(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='user-name']"));
	}

	public static WebElement password_feild(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}
	public static WebElement LoginBtn(WebDriver driver) {
		return driver.findElement(By.id("login-button"));
	}
	
	public static void Login_Cred(String username, String password) {
		wait.until(ExpectedConditions.visibilityOf(LoginPage.UserName_Feild(driver)));
		LoginPage.UserName_Feild(driver).sendKeys(username);
		LoginPage.password_feild(driver).sendKeys(password);
	}
	public static void Login_Clear() {
		wait.until(ExpectedConditions.visibilityOf(LoginPage.UserName_Feild(driver)));
		LoginPage.UserName_Feild(driver).clear();
		LoginPage.password_feild(driver).clear();
		try {
			Thread.sleep(22000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginPage.password_feild(driver).clear();
	}
	public static void LoginBtn_Click() {
		LoginPage.LoginBtn(driver).click();
	}
}
