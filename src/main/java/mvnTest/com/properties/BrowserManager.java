package mvnTest.com.properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserManager {

	public static WebDriver BeforeTestScr(WebDriver driver, String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "src/test/resources/driver/msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();

		}
		return driver;
	}
}
