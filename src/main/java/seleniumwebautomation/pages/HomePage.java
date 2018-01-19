package seleniumwebautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/*
 * Sample page
 * 
 * @author Hassene Bouraoui
 */
public class HomePage extends Page {

	@FindBy(how = How.CLASS_NAME, using = "header-nav__link")
	private WebElement homePageDashboardText;



	public HomePage(WebDriver webDriver){

		super(webDriver);

		//This initElements method will create all WebElements
		PageFactory.initElements(webDriver, this);


	}


	//Get the User name from Home Page

	public String getHomePageDashboardText(){

		return   homePageDashboardText.getText();

	}
}
