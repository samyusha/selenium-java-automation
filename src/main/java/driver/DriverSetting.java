package driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverSetting {
	public static WebDriver getDriver(String browser) {
		WebDriver driver;
		switch (browser.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "D:\\SeleniumDrivers\\geckodriver-v0.35.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "edge":
				System.setProperty("webdriver.edge.driver", "D:\\SeleniumDrivers\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
			default:
				throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
		
		driver.manage().window().maximize();
        return driver;
	}

}
