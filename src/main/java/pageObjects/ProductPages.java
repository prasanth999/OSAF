package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class ProductPages {
	
WebDriver driver;
	
	public ProductPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how = How.ID, using = "twotabsearchtextbox") 
	private WebElement btn_searchText;
	
	@FindBy(how = How.CLASS_NAME, using="nav-input")
	private WebElement btn_search;
	
	public void searchText(){
		btn_searchText.sendKeys("iPad");
		
	 
	}
	
	public void searchBtn(){
		btn_search.click();
		
}
}