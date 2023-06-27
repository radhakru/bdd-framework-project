package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.messages.types.TestCaseStarted;
import io.cucumber.plugin.ConcurrentEventListener;
import io.cucumber.plugin.event.EventPublisher;
import io.cucumber.plugin.event.Result;
import io.cucumber.plugin.event.Status;
import io.cucumber.plugin.event.TestCase;
import io.cucumber.plugin.event.TestCaseFinished;
import io.cucumber.plugin.event.TestRunFinished;
import io.cucumber.plugin.event.TestRunStarted;

public class Listner implements ConcurrentEventListener  {
	private ExtentSparkReporter spark;
	private ExtentReports extent;
	 @Override
	    public void setEventPublisher(EventPublisher publisher) {
		// publisher.registerHandlerFor(TestRunStarted.class, this::runStarted);
			//publisher.registerHandlerFor(TestRunFinished.class, this::runFinished);
	        publisher.registerHandlerFor(TestCaseFinished.class, this::handleTestCaseFinished);
	        publisher.registerHandlerFor(TestCaseStarted.class, this::ScenarioStarted);
	        
	    }

	    private void handleTestCaseFinished(TestCaseFinished event) {
	        TestCase testCase = event.getTestCase();
	        Result result = event.getResult();
	        Status status = result.getStatus();
	        Throwable error = result.getError();
	        String scenarioName = testCase.getName();
	        String id = "" + testCase.getName();
	        System.out.println("Testcase " + id + " - " + status.name());
	    }
	    private void ScenarioStarted(TestCaseStarted event) {
	    	String id=event.getTestCaseId();
	    	System.out.println(id);
	    	
	    }
	   
	}


