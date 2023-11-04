package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Lenovo\\eclipse-workspace\\July_Cucumber1\\Features",
		glue = {"stepDefinition"},
		dryRun = false,
		tags = "@regression",
		monochrome = true,
		plugin = {"pretty","html:Reports/index.html","junit:Reports/cucumber.xml","json:Reports/cucumber.json"},
		publish = true
		)
public class TestRunner {

}
