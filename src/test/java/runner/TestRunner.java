package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		glue = "stepDefinitions",
		tags = "@smokeTest", // with tages we will run one scenario, or multiple scenarios, or entire feature
		dryRun = false, // dryRun Checks if there are any missing steps in StepDefinitions for each scenario in feature file
		monochrome =true, // monochrome will make console readable
		strict = true, // strict will mark scenario failed if there are any pending steps.
		plugin = {"pretty"}, // plaugin will be used for generating a readable report
		publish = true
		
		)
public class TestRunner {

}