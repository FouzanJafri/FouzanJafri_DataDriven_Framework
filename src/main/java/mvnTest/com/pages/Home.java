package mvnTest.com.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mvnTest.com.properties.BrowserManager;
import utilityes.ReadPropertyFile;


public class Home {
	static WebDriver driver;
	

	@BeforeTest
	private void pp() throws IOException {
		driver = BrowserManager.BeforeTestScr(driver, ReadPropertyFile.readFilePropBrowserName());
		driver.get(ReadPropertyFile.readFileURL());
	}
	@Test
	private void djk() {
		System.out.println("jskj");
	}
}
