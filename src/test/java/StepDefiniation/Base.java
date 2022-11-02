package StepDefiniation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Utility;

public class Base extends Utility {
	protected static WebDriver driver;

	protected WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	public String getText() {
		String name=getCheckBoxText();
		return name;
	}
	
	
}
