package seleniumwebautomation.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



/**
 * Created by souna on 2017-11-09.
 */
public class LoginPageTest {

    WebDriver driver;

    LoginPage loginpage;

    HomePage homepage;

    @BeforeTest

    public void setup(){

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver-v0.19.0-win64/geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://courses.ultimateqa.com");

    }

    /**

     * This test go to https://courses.ultimateqa.com

     * Verify login page title as All Courses

     * Sign in to dashboard

     * Verify the home page using My Dashboard text

     */

    @Test(priority=0)

    public void test_Home_Page_Appear_Correct(){

        //Create Login Page object

        loginpage = new LoginPage(driver);

        //Verify login page title

        String loginPageTitle = loginpage.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("all courses"));

        //login to application

        loginpage.loginToUltimateQA("hassene.bouraoui@gmail.com", "souna1985");

        // go the next page

        homepage = new HomePage(driver);

        //Verify home page

        Assert.assertTrue(homepage.getHomePageDashboardText().toLowerCase().contains("My Dashboard"));

    }

}

