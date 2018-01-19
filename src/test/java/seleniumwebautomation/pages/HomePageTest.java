/*
package seleniumwebautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


public class HomePageTest extends TestBase {

	HomePage homepage;
	FirefoxDriver wd;
	
	@Parameters({ "path" })
	@BeforeClass
	public void testInit(String path) {

		// Load the page in the browser
		webDriver.get(websiteUrl + path);
		homepage = PageFactory.initElements(webDriver, HomePage.class);
	}
	@Test
	public void testH1Existing() throws InterruptedException {
		Assert.assertTrue(homepage.getH1() != null);
	}

	*/
/*@Test
	public void test2() throws InterruptedException {
		Assert.assertTrue(true);
	}*//*


	@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.19.0-win64/geckodriver.exe");
		wd = new FirefoxDriver();
		wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Test
	public void recordedTest() throws InterruptedException{
		wd.get("https://courses.ultimateqa.com");
		wd.manage().window().maximize();
		wd.findElement(By.linkText("Sign In")).click();
		wd.findElement(By.id("user_email")).click();
		wd.findElement(By.id("user_email")).clear();
		wd.findElement(By.id("user_email")).sendKeys("hassene.bouraoui@gmail.com");
		wd.findElement(By.id("user_password")).click();
		wd.findElement(By.id("user_password")).clear();
		wd.findElement(By.id("user_password")).sendKeys("souna1985");
		wd.findElement(By.id("btn-signin")).click();
		wd.findElement(By.linkText("My Dashboard")).click();
		if (!wd.findElement(By.tagName("html")).getText().contains("Your Student Dashboard")) {
			System.out.println("verifyTextPresent failed");
		}
		wd.quit();
	}
}
*/
