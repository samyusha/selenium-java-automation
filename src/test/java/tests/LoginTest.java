package tests;
import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Login;

public class LoginTest extends BaseTest {
	@Parameters("baseUrl")
    @Test
    public void OpenLogin(String baseUrl) {

        Login loginPage = new Login(driver);
        loginPage.openLoginPage(baseUrl);
        loginPage.getPageTitle();
        loginPage.login("standard_user","secret_sauce");
    }

}
