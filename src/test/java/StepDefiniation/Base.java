package StepDefiniation;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Utility;


public class Base extends Utility {

	public static Logger logger;
	protected static WebDriver driver;

	protected static WebDriver getdriver() {
		
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver2.exe");
		driver=new ChromeDriver();
		
		}
		return driver;
		
	}
	
	public String getText() throws IOException {
		String name=getCheckBoxText();
		return name;
	}
	
	
	
}
