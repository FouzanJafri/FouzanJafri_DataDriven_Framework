package mvnTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mvnTest.com.pages.LoginPage;
import utilityes.EXPRAC;
import utilityes.ExcelDataPro;

public class TestMainClas {
	WebDriver driver;
	WebElement element;
//	ExcelDataPro ex = new ExcelDataPro("./src/test/resources/excel/swaglab.xlsx", "swaglab");
	
	@BeforeTest
	private void bff() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider = "getData",dataProviderClass = ExcelDataPro.class)
	public void test1(String userName, String password) {
		System.out.println(userName + password);
		
		
		element = driver.findElement(By.xpath("//input[@id='user-name']"));
		element.sendKeys(userName);
        element.clear();
		element =  driver.findElement(By.id("password"));
        element.sendKeys(password);
		element.clear(); 
        driver.findElement(By.id("login-button")).click();		
		
		LoginPage.UserName_Feild(driver).sendKeys(userName);
		LoginPage.password_feild(driver).sendKeys(password);
		LoginPage.LoginBtn(driver).click();
		
	}

}
