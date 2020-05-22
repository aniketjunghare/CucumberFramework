package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/main/java/Features/login.feature", 
			//features=".//Features/",// This will run all feature files
			glue={"stepDefinitions"}, 
			format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true, 
			strict = true, 
			dryRun = false 
			//tags = {"~@SmokeTest" , "~@RegressionTest"}			
			)
	 
	public class TestRunner {
	 
	}
	
	
	

