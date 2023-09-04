package definition_steps;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loadproperty {

	WebDriver driver =null;
	@Test
	public void configure() throws IOException {
		
		
		FileInputStream stream=new  FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(stream);
		
		String url=properties.getProperty("APP_URL");
		String browser=properties.getProperty("BROWSER");
		
		
	if (browser.equalsIgnoreCase("chrome")) {
	
		driver=new ChromeDriver();
		
	} else if(browser.equalsIgnoreCase("firefox")){
		
		driver=new FirefoxDriver();
	}
       driver.get(url);
	
	}
	
}
