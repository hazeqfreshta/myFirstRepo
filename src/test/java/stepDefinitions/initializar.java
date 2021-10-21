package stepDefinitions;
import java.util.logging.Logger;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class initializar extends Base{
	
	
    @Before
	public void beforHooks(Scenario Scenario) {
    	logger.info("Scenario" + Scenario.getName()+ "Started");
    	
    	
    	
    	browser();
    	openBrowser();
		
	}
		
    @After
    public void afterHooks(Scenario Scenario) {
    	
    	tearDown();
    	logger.info("Scenario"+ Scenario.getName()+ " " + Scenario.getStatus());
    	
		}
		
	

}