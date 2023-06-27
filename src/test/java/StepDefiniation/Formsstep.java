package StepDefiniation;
import org.openqa.selenium.WebDriver;

import com.google.common.collect.Maps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import Pageobject.Formspage;

import org.openqa.selenium.JavascriptExecutor;
import org.apache.log4j.Logger;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class Formsstep extends Base{
public WebDriver driver;
public JavascriptExecutor js;
public static Logger logger;
public Formspage fp;

@Then("click on Forms button")
public void click_on_forms_button() throws InterruptedException{
   driver=getdriver();
   fp=new Formspage(driver);
   logger=Logger.getLogger("ToolsQa");
   //PropertyConfigurator.configure("log4j.properties");
   js=(JavascriptExecutor)driver;
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,300)","");
   logger.info("click on forms button");
   fp.clickonformsbutton();
   Thread.sleep(2000);
   
}
@Then("verify the forms text displayed.")
public void verify_the_forms_text_displayed() throws IOException{
	logger.info("verify the forms text");
   fp.verifytheformstext(getverifyFormsText());
}
@Then("click on Practice Form")
public void click_on_practice_form() throws InterruptedException{
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("click on practice form");
    fp.clickonpraticebutton();
    Thread.sleep(2000);
}
@Then("verify the practice form text present in forms page")
public void verify_the_practice_form_text_present_in_forms_page() throws IOException{
   logger.info("verify the practice text");
   fp.verifythepracticeformtext(getverifyPracticeFormtext());
}

//All

@Then("Enter Firstname {string}")
public void enter_firstname(String string) throws InterruptedException {
	logger.info("enter full name");
    fp.enterfullname(string);
    Thread.sleep(4000);
}
@Then("Enter Lastname {string}")
public void enter_lastname(String string) throws InterruptedException{
	logger.info("enter lastname");
	fp.enterlastname(string);
	Thread.sleep(4000);
   
}
@Then("Enter emial id {string}")
public void enter_emial_id(String string) throws InterruptedException {
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("enter emial id");
    fp.enteremailid(string);
    Thread.sleep(4000);
}
@Then("select gender")
public void select_gender() throws InterruptedException{
	logger.info("select geder");
	fp.selectgender();
	Thread.sleep(4000);
	
    
}

@Then("Enter mobile number {string}")
public void enter_mobile_number(String string) throws InterruptedException {
    logger.info("enter mobile numebr");
    fp.entermobilenumber(string);
    Thread.sleep(4000);
}
@Then("Enter Date of Birth")
public void enter_date_of_birth() throws InterruptedException{
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
   logger.info("enter date of birth");
   fp.selectdate();
   Thread.sleep(4000);
}
@Then("Enter Subject")
public void enter_subject() throws IOException,InterruptedException{
   logger.info("Enter Subject");
   fp.entersubject(getsubject());
   Thread.sleep(4000);
}
@Then("select Hobbies check box")
public void select_hobbies_check_box() throws InterruptedException {
	logger.info("select hobbies");
	fp.enterHobbies();
	Thread.sleep(4000);
    }
	
@Then("updoad files")
public void updoad_files() throws IOException,InterruptedException{
   logger.info("upload files");
   fp.uploadfiles(getfile());
   Thread.sleep(2000);
}
@Then("Enter Current Address {string}")
public void enter_current_address(String string) throws InterruptedException{
     logger.info("enter address");
     fp.entercurrentaddress(string);
     Thread.sleep(4000);
}


//All with Table data
/*
 * @Then("Enter all the blank fill") public void
 * enter_all_the_blank_fill(DataTable dataTable) throws IOException,
 * InterruptedException{ List<Map<String,String>>
 * s=dataTable.asMaps(String.class,String.class);
 * 
 * System.out.println(s.get(0).get("Firstname"));
 * System.out.println(s.get(1).get("Firstname"));
 * System.out.println(s.get(2).get("Firstname")); for( Map<String, String>
 * data:dataTable.asMaps(String.class,String.class)){
 * logger.info("Enter the Firstname"); fp.enterfullname(data.get("Firstname"));
 * Thread.sleep(2000); logger.info("Enter last name");
 * fp.enterlastname(data.get("Lastname")); Thread.sleep(2000);
 * logger.info("Scroll the page");
 * js.executeScript("window.scrollBy(0,200)",""); logger.info("Enter email id");
 * fp.enteremailid(data.get("emailid")); Thread.sleep(4000);
 * logger.info("selct gender"); fp.selectgender(); Thread.sleep(4000);
 * logger.info("select mobile number");
 * fp.entermobilenumber(data.get("Mobile number")); Thread.sleep(4000);
 * logger.info("select date"); fp.selectdate(); Thread.sleep(4000);
 * logger.info("select subjet"); fp.entersubject(getsubject());
 * Thread.sleep(4000); logger.info("Scroll the pages");
 * js.executeScript("window.scrollBy(0,200)",""); logger.info("enter hobbies");
 * fp.enterHobbies(); Thread.sleep(4000); logger.info("enter files");
 * fp.uploadfiles(getfile()); Thread.sleep(4000);
 * logger.info("Current address"); fp.entercurrentaddress("Current Address");
 * 
 * }
 * 
 * }
 */




}
