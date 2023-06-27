package StepDefiniation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pageobject.DynamicPropertiespage;
import io.cucumber.java.en.Then;

public class DynamicProperitiesstep extends Base{
	public WebDriver driver;
	public JavascriptExecutor js;
	public static Logger logger;
	public DynamicPropertiespage dp;
	@Then("click on Dynamic Properties button")
	public void click_on_dynamic_properties_button() throws InterruptedException{
	   driver=getdriver();
	   logger=Logger.getLogger("Toolsqa");
	   PropertyConfigurator.configure("log4j.properties");
	   js=(JavascriptExecutor)driver;
	   dp=new DynamicPropertiespage(driver);
	   logger.info("scroll the page");
	   	js.executeScript("window.scrollBy(0,500)","");
	   	logger.info("click on dynamic properties button");
	   dp.clickondynamicproperties();
	   Thread.sleep(4000);
	}

	@Then("verify the dyanmic properties text present in Elements page.")
	public void verify_the_dyanmic_properties_text_present_in_elements_page() throws IOException{
		logger.info("verify the dynamic properties text");
	    dp.verifythedynamicproertiestext(getverifydynamicpropertiestext());
	}

@Then("verify the Visible After button is diaplayed")
public void verify_the_visible_after_button_is_diaplayed() throws InterruptedException {
   logger.info("wait for 5 seconds");
   Thread.sleep(5000);
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,200)","");
   logger.info("verify the visible buttion after 5 seconds");
   dp.verifythevisiblebutton();
   
}
	

}
