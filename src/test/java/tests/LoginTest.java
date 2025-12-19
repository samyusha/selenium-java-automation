package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends BaseTest {
	@Parameters("baseUrl")
    @Test
    public void shouldOpenLoginPage(String baseUrl) {

        Login loginPage = new Login(driver);
        loginPage.openLoginPage(baseUrl);
        loginPage.getPageTitle();
    }

}
