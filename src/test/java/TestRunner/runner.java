package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/CheckBox.feature",
		glue={"StepDefiniation"},
		dryRun=false,
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty","html:target/test-report.html"},
		//it is used for readable output.(well formatted)
		monochrome=true
		,tags= "@nineth"
		)

public class runner {

}
