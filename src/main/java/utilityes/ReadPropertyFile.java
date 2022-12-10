package utilityes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	
	public static String readFilePropBrowserName() throws IOException {
		
		File file = new File("src/main/java/mvnTest/com/properties/config.properties");
		
		FileInputStream fileInput = new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fileInput);
		
		String BrowserName_Value = prop.getProperty("browserName1");
		
		return BrowserName_Value;
		
	}
	
	public static String readFileURL() throws IOException {
		File file = new File("src/main/java/mvnTest/com/properties/config.properties");
		
		FileInputStream fileInput =  new FileInputStream(file);
		
		Properties prop = new Properties();
		
		prop.load(fileInput);
		
		String BrowserUrl_Value = prop.getProperty("baseUrl");
		
		return BrowserUrl_Value;
		
	}

}
