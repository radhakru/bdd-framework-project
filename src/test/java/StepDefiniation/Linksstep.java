package StepDefiniation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pageobject.Linkspage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class Linksstep extends Base{
public WebDriver driver;	
Linkspage lp;
JavascriptExecutor js;
public static Logger logger;


 
 

	@Then("click on Links button")
	public void click_on_links_button() throws InterruptedException {
		
		lp=new Linkspage(getdriver());
		logger=Logger.getLogger("ToolsQA");
		logger.info("scroll the page");
		js =(JavascriptExecutor)getdriver();
		js.executeScript("window.scrollBy(0,280)","");
	    logger.info("click on Links button");
	    lp.clickonlinksbutton();
	    Thread.sleep(4000);
	}

	@Then("verify the link text present in the elements page")
	public void verify_the_link_text_present_in_the_elements_page() throws IOException {
	    logger.info("verify the link text present in the element page");
	    lp.verify_the_link_text(getverifylinktext());
	}
	
	
//verify the home link 

@Then("click on Home link")
public void click_on_home_link() throws InterruptedException {
   logger.info("click on Home link");
   lp.clickonHomelink();
   Thread.sleep(4000);
}
@Then("verify the home link open another tab")
public void verify_the_home_link_open_another_tab() throws IOException {
    logger.info("verify the home link ");
    lp.verify_the_windows_page(getverifytheHomelink());
}
//verify the dynamic home link 
@Then("click on dynamic Home link")
public void click_on_another_home_link() throws InterruptedException {
    logger.info("click on dynamic home link");
    lp.clickondynamichomelink();
    Thread.sleep(4000);
}
@Then("verify the dynamic home link open in new tab")
public void verify_the_another_home_link_open_in_new_tab() throws IOException {
    logger.info("verify the dynamic link");
    lp.verifythedynamichomelinkopennewtap(getverifytheHomelink());
}
//verify created link
@Then("click on created link")
public void click_on_created_link() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,70)","");
    logger.info("click on created link");
    lp.clickoncreatedlink();
    Thread.sleep(4000);
}
@Then("verify the created link status")
public void verify_the_created_link_status() throws IOException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("verify the created link status");
    lp.verifycreatedlinkstatus(getverifycreated_status());
}
//verify the nocontent link
@Then("click on no contant link")
public void click_on_no_contant_link() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,120)","");
    logger.info("click on no nontent link");
    lp.clickonnocontent();
    Thread.sleep(4000);
}
@Then("verify the no content link status")
public void verify_the_no_content_link_status() throws IOException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("verify the no content link");
    lp.verifythenocontentlinkstatus(getverifynocontent_status());
}
	
//verify the moved link
@Then("click on Moved linked")
public void click_on_moved_linked() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,150)","");
    logger.info("click on the moved link");
    lp.clickonmoved();
    Thread.sleep(4000);
}
@Then("verify the moved link status")
public void verify_the_moved_link_status() throws IOException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("verify the moved link status");
    lp.verifythemovedlinkstatus(getverifymoved_status());
}

//verify the bad request link status
@Then("click on Bad Request link")
public void click_on_bad_request_link() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
   logger.info("click on bad request link");
   lp.clickonbadrequestlink();
   Thread.sleep(4000);
   
}
@Then("verify the bad request link status")
public void verify_the_bad_request_link_status() throws IOException {
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,250)","");
    logger.info("verify the bad request link status");
    lp.verifythebadrequeststatus(getverifybadrequest_status());
}
//verify the unauthorized link
@Then("click on unauthorized link")
public void click_on_unauthorized_link() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,250)","");
   logger.info("click on unauthorized link");
   lp.clickonunauthorizedlink();
   Thread.sleep(4000);
}
@Then("verify the unauthorized link status")
public void verify_the_unauthorized_link_status() throws IOException  {
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,200)","");
    logger.info("verify the unauthorized link");
    lp.verifytheunauthorizedstatus(getverifyunauthorized_status());
}

//verify the forbidden status
@Then("click on Forbidden link")
public void click_on_forbidden_link() throws InterruptedException {
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,300)","");
   logger.info("click on for bidden link");
   lp.clickonforbiddenlink();
   Thread.sleep(4000);
}
@Then("verify the forbidden link status")
public void verify_the_forbidden_link_status() throws IOException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("verift the forbidden link status");
    lp.verifytheforbiddenstatus(getverifyforbidden_status());
}
//verify the not found status
@Then("click on Not Found link")
public void click_on_not_found_link() throws InterruptedException {
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,340)","");
   logger.info("click on not found link");
   lp.clickonnotfoundlink();
   Thread.sleep(4000);
}
@Then("verify the not found link status")
public void verify_the_not_found_link_status() throws IOException {
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,50)","");
    logger.info("verify the not found link");
    lp.verifythenotfoundstatus(getverifynotfound_status());
}
/*
 @After
 public void setdown() { 
logger.info("close the browser");
 driver.close();
 }*/
 


	
}
