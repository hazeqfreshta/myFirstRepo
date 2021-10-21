package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TestpageObject;

public class TestStepDef extends Base{
	
	TestpageObject testpageObject= new TestpageObject();
	
	
	
	@When("user search for {string}")
	public void user_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		testpageObject.enterValueForSearchBar(string);
		testpageObject.clickOnSearchButton();
	    
	}
	@Then("iphone should be displayed")
	public void iphone_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		
	   Assert.assertTrue(testpageObject.isIphoneDisplayed()); 
	}
	
	
	

}
