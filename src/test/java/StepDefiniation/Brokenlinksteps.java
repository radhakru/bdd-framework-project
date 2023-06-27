package StepDefiniation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pageobject.Brokenlinkpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Brokenlinksteps extends Base {
	
	public WebDriver driver;
Brokenlinkpage blp;
public static  Logger logger;
JavascriptExecutor js;

@Then("click on Broken Link Image button")
public void click_on_broken_link_Image_button() throws InterruptedException{
   blp=new Brokenlinkpage(getdriver());
   js=(JavascriptExecutor)getdriver();
   logger=Logger.getLogger("ToolsQA");
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,400)","");
   logger.info("click on broken link");
   blp.clickonbrokernlinkimage();
   Thread.sleep(4000);
   
}

@Then("verify the broken link text present in elements page")
public void verify_the_broken_link_text_present_in_elements_page() throws IOException {
    logger.info("verify the broken link text present");
    blp.verifythebrolenlinkimagetext(getverifybrokenlinkimagetext());
    
}
//verify the broken link

@Then("verify the status code of broken link")
public void verify_the_status_code_of_broken_link() {
    logger.info("verify the status code");
    blp.verifybrokenlink();
}
//verify the broken image 
@Then("verify the broken image is broken image")
public void verify_the_broken_image_is_broken_image() {
    logger.info("verify the broken image");
    blp.verifyimage();
}



	
	

}
