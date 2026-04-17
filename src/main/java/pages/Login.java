package pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login  {
	private WebDriver driver;

    // Constructor
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    // Open Login Page
    public void openLoginPage(String url) {
        driver.get(url);
    }

    // Optional: simple page check
    public void getPageTitle() {
    	System.out.println("title"+ driver.getTitle());
       
    }
    public void login(String username, String password) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name"))).sendKeys(username);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();
		System.out.println("Login attempted with username: " + username);

    }
    }
