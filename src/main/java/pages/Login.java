package pages;
import org.openqa.selenium.WebDriver;


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
    	System.out.println("title" +driver.getTitle());
       
    }

}
