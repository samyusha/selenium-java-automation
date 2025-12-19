package base;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import driver.DriverSetting;

public class BaseTest {
	protected WebDriver driver;
	
@Parameters({"browser", "baseUrl"})
@BeforeMethod
public void setup(String browser, String url) {
	if(browser.equals("chrome")) {
		driver = DriverSetting.getDriver(browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

	}
}
@AfterMethod
public void teardown() {
	 if (driver != null) {
         driver.quit();
}

}

}
