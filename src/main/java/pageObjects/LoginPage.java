package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how = How.ID, using = "nav-link-yourAccount") 
	private WebElement btn_userAccount;
 
	@FindBy(how = How.ID, using = "ap_email") 
	private WebElement btn_userLogin;
	
	@FindBy(how = How.ID, using = "continue") 
	private WebElement btn_userContinue;
	
	@FindBy(how = How.ID, using = "ap_password") 
	private WebElement btn_userPassword;
	
	@FindBy(how = How.ID, using = "signInSubmit") 
	private WebElement btn_signInSubmit;
	
	public void LoginUsrLogin(){
		btn_userLogin.sendKeys("saurabh.oswy@gmail.com");
		
		
	}
	
	public void LoginUsrClick(){
		btn_userAccount.click();
		
		
	}
		
		public void LoginUsrContinue(){
			btn_userContinue.click();
			
			
		}
			
			public void LoginUsrPassword(){
				btn_userPassword.sendKeys("anumalik");
			
		
			}
				
				public void LoginsignInSubmit(){
					btn_signInSubmit.click();
					
                
		
	}
	
}


