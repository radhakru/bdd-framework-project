package StepDefiniation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base extends Utility{

	public static Logger logger;
	protected static WebDriver driver;

	protected static WebDriver getdriver() {
		
		if(driver==null) {
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver2.exe");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		
		}
		return driver;
		
	}
	
	public String getText() throws IOException {
		String name=getCheckBoxText();
		return name;
	}
	public static void getScreenshort() throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File screenshotFile=screenshot.getScreenshotAs(OutputType.FILE);
		Path source=Paths.get(System.getProperty("user.dir")+"//ScreenShot");
		FileOutputStream fis=new FileOutputStream(screenshotFile);
		Files.copy(source,fis);
		
	}
	
	
	
}
