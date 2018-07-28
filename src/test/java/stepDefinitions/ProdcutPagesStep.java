package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProductPages;

public class ProdcutPagesStep {
	
	TestContext testContext;
	ProductPages product;
	
	public ProdcutPagesStep(TestContext context) {
		
		testContext = context;
		product = testContext.getPageObjectManager().getproPage();
		
		
	}
	
	@When("^user searches for tablet$")
	public void user_searches_for_tablet() {
		
		product.searchText();
		product.searchBtn();
	}

}
