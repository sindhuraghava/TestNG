package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/cucumber"
		,glue= {"stepdefinitions"},
		plugin = {
				"html:reporting/CucumberHTMLReports/Sanity"
		}
		)
public class realtime {

}
