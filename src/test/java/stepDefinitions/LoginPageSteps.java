package stepDefinitions;



import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.LoginPage;


public class LoginPageSteps {
	
	TestContext testContext;
	LoginPage login;
	
	public LoginPageSteps(TestContext context){
		
		testContext = context;
		login = testContext.getPageObjectManager().getLoginPage();
		
		
	}
	@When("^user login to portal \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_to_portal_and(String arg1, String arg2)  {
		login.LoginUsrClick();
		login.LoginUsrLogin();
		login.LoginUsrContinue();
		login.LoginUsrPassword();
		login.LoginsignInSubmit();
	}
	


}
