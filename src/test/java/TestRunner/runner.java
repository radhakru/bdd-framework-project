package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import com.aventstack.extentreports.reporter.ExtentReporter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		//FormFeatures/Forms.featur
		features = { ".//Features/FormFeatures/Forms.feature"}, 
		glue = { "StepDefiniation" }, 
		dryRun = false, 
		plugin = {"Utilities.Evenlistner" },
		// it is used for readable output.(well formatted)
		monochrome = true
		//or means two scenario execute
		,tags= "@three"
)

public class runner extends  AbstractTestNGCucumberTests{

	
	  @Override
	  
	 @DataProvider(parallel = true)
	  
	  public Object[][] scenarios() { 
		  return super.scenarios();
		  }
	// Utility ul=new Utility();
	/*
	 * @AfterClass public static void writeExtentReport() throws Exception {
	 * //ExtentHtmlReporter resport=new
	 * ExtentHtmlReporter(System.getProperty("user.dir")+"report"+".html");
	 * Reporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
	 * }
	 */

}
