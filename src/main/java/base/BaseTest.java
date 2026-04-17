package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import driver.DriverSetting;

public class BaseTest {
	protected WebDriver driver;
	protected String baseUrl;
	
	@Parameters({"browser", "baseUrl"})
	@BeforeMethod
	public void setup(String browser, String baseUrl) {
		this.baseUrl = baseUrl;
		if(browser.equals("chrome")) {
			driver = DriverSetting.getDriver(browser);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		}
		else if(browser.equals("firefox")) {
			driver = DriverSetting.getDriver(browser);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		}
		else if(browser.equals("edge")) {
			driver = DriverSetting.getDriver(browser);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		}
        String url;
		switch (baseUrl.trim().toLowerCase()) {
	    case "qa-in":
	        url = "https://qa-in.skillup.online/";
	        break;
	    case "dev-in":
	        url = "https://dev-in.skillup.online/";
	        break;
	    case "prod-in":
	        url = "https://in.skillup.online/";
	        break;
	    default:
	        throw new RuntimeException("Invalid environment: " + baseUrl);
	}
		driver.get(url);
	}

	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
			driver = null; 
		}
	}
}