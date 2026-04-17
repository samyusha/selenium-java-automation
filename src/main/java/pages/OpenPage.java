package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenPage {
	private WebDriver driver;
	private By blogLink = By.linkText("Blog");
	//Constructor
	public OpenPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void open () {
	  WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	  WebElement blogElement = wait.until(ExpectedConditions.elementToBeClickable(blogLink));
		 System.out.println("Current URL: " + driver.getCurrentUrl());
	    blogElement.click();
	   wait.until(ExpectedConditions.urlContains("blog"));
	    driver.navigate().back();
		
	}

}