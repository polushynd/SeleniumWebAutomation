package seleniumwebautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How;

/**
 * Created by souna on 2017-11-09.
 */

/*
 * Login page
 *
 * @author Hassene Bouraoui
 */
public class LoginPage extends Page {


    @FindBy(how = How.ID, using = "user_email")
    private WebElement userName;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement userPassword;

    //@FindBy(how = How.CLASS_NAME, using = "header-nav__link")
    //private WebElement loginPageText;
    //This locator works for me
    @FindBy(xpath = "//*[@id=\"wrap\"]/header/div/div[2]/nav/ul[1]/li/a")
    private WebElement loginPageText;

    @FindBy(how = How.CLASS_NAME, using = "my-account")
    private WebElement login;


    public LoginPage(WebDriver webDriver) {
        super(webDriver);

        //This initElements method will create all WebElements
        PageFactory.initElements(webDriver, this);

    }

    //Set user name in textbox

    /**
     * @param strUserName
     */
    public void setUserName(String strUserName) {

        userName.sendKeys(strUserName);

    }

    //Set password in password textbox

    /**
     * @param strPassword
     */
    public void setPassword(String strPassword) {

        userPassword.sendKeys(strPassword);
    }


    //Click on login button

    public void clickLogin() {

        login.click();

    }


    //Get the title of Login Page


    /**
     * @return text
     */
    public String getLoginTitle() {

        return loginPageText.getText();

    }

    /**
     * This POM method will be exposed in test case to login in the application
     *
     * @param strUserName
     * @param strPassword
     * @return
     */

    public void loginToUltimateQA(String strUserName, String strPassword) {

        //Fill user name

        this.setUserName(strUserName);

        //Fill password

        this.setPassword(strPassword);

        //Click Login button

        this.clickLogin();


    }

}
