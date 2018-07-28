package managers;

import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductPages;

public class PageObjectManager {

	private WebDriver driver;

	
	private HomePage home;
	private LoginPage login;
	private ProductPages product;

	;
	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}

	
	public HomePage getHomePage(){

		return (home == null) ? home = new HomePage(driver) : home;

	}

	
	public LoginPage getLoginPage(){

		return (login == null) ? login = new LoginPage(driver) : login;
	
}
	
	public ProductPages getproPage(){

		return (product == null) ? product = new ProductPages(driver) : product;
		
	}
	
}