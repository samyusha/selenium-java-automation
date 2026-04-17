package tests;
import base.BaseTest;
import org.testng.annotations.Test;
import pages.OpenPage;
import org.testng.annotations.Parameters;

public class OpenPageTest extends BaseTest {
	@Parameters("baseUrl")
	@Test
	public void openWebpage() {
		try
		{
			OpenPage openPage = new OpenPage(driver);
			openPage.open();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
