package StepDefiniation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.CheckBoxpage;
import Pageobject.Toolsqapage;
import Utilities.Utility;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Toolsqastpes extends Base {
public WebDriver driver;
public JavascriptExecutor js;
Toolsqapage Tp;
CheckBoxpage cb;
public static Logger logger;

@Before
public void setUp() {
	
	driver=getdriver();
	driver.manage().window().maximize();
	logger=Logger.getLogger("Toolsqa");
	PropertyConfigurator.configure("log4j.properties");
	logger.info("Lunch the browser");
	
}



@Given("user go to the url")
public void user_go_to_the_url() throws IOException  {
   
    driver.get(getUrl());
    logger.info("Lunch the url");
}


@Then("click on Elements button")
public void click_on_elements_button() throws InterruptedException {
	js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)", "");
	Tp=new Toolsqapage(driver);
	logger.info("Click on Elements Button");
	Tp.clickonElementbutton();
    Thread.sleep(4000);
}

@Then("click on Textbox")
public void click_on_textbox() throws InterruptedException {
	logger.info("Click on TextBox Button");
	Tp.clickonTextBox();
    Thread.sleep(4000);
}

@Then("Enter his\\/her fullname")
public void enter_his_her_fullname() throws InterruptedException {
	logger.info("Enter Fullname");
	Tp.Fullname(getFullname());
    Thread.sleep(4000);
}


@Then("Enter your fullname")
public void enter_your_fullname() throws InterruptedException {
	logger.info("Enter only Fullname");
  Tp.Fullname(getonlyFullname());
  logger.info("Page scroll");
  js.executeScript("window.scrollBy(0,500)", "");
  Thread.sleep(4000);
}


@Then("Enter only number in the Fullname field")
public void enter_only_number_in_the_fullname_field() throws InterruptedException {
	logger.info("Enter only number in the fullname field");
	Tp.Fullname(getFullnameOnlyNumbers());
	Thread.sleep(4000);
	logger.info("Scroll page");
	js.executeScript("window.scrollBy(0,400)", "");
	
   
}

@Then("Enter his\\/her Emailid")
public void enter_his_her_emailid() throws InterruptedException {
	logger.info("Enter emailid");
	Tp.EmailId(getEmailId());  
   Thread.sleep(4000);
}


@Then("Enter your EmailId")
public void enter_your_email_id() throws InterruptedException {
	logger.info("Enter only EmailId");
	Tp.EmailId(getonlyEmailid());
	Thread.sleep(4000);
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,400)", "");
	
}

@Then("Enter his\\/her Current address")
public void enter_his_her_current_address() throws InterruptedException {
	logger.info("Enter Currentaddress");
	Tp.Currentaddress(getCurrentaddress());
   Thread.sleep(4000);
   logger.info("Scroll the page");
   js=(JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,400)", "");
   
}


@Then("Enter your Current Address")
public void enter_your_current_address() throws InterruptedException {
	logger.info("Enter current address");
    Tp.Currentaddress(getonlyCurrentAddress());
    Thread.sleep(4000);
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,400)","");
}



@Then("Enter only number in current address field")
public void enter_only_number_in_current_address_field() throws InterruptedException {
	logger.info("Enter only number in current address field ");
	Tp.Currentaddress(getCurrentAddressonlynumbers());
	logger.info("Scroll page");
	js.executeScript("window.scrollBy(0,400)","");
	Thread.sleep(4000);
	
    
}

@Then("Enter only special charecter in currenta address field")
public void enter_only_special_charecter_in_currenta_address_field() throws InterruptedException {
	logger.info("Enter only special charecter in current address field");
    Tp.Currentaddress(getcurrentaddressonlySpecialcharecter());
    Thread.sleep(4000);
    logger.info("Scroll page");
    js.executeScript("window.scrollBy(0,400)", "");
    
}


@Then("Enter both charecter and numbers in currect address field")
public void enter_both_charecter_and_numbers_in_currect_address_field() throws InterruptedException {
	logger.info("Enter both charecter and number in current address field");
    Tp.Currentaddress(getcurrentaddressbothnumandchar());
    logger.info("Scroll the page");
    js.executeScript("window.scrollBy(0,400)", "");
    Thread.sleep(4000);
}

@Then("Enter both number and charecter in current address field")
public void enter_both_number_and_charecter_in_current_address_field() throws InterruptedException {
	logger.info("Enter both number and charecter in current address field");
   Tp.Currentaddress(getcurrentAddressbothnumberandcharecter());
   logger.info("Scroll the page");
   js.executeScript("window.scrollBy(0,400)", "");
   Thread.sleep(4000);
}



@Then("Enter his\\/her permanent address")
public void enter_his_her_permanent_address() throws InterruptedException {
	logger.info("Enter Permanentaddress");
	Tp.Permanentaddress(getPermanentaddress()); 
  Thread.sleep(4000);
}

@Then("Enter your Permanent Address")
public void enter_your_permanent_address() throws InterruptedException {
	logger.info("First scroll page");
	js.executeScript("window.scrollBy(0,400)", "");
	logger.info("Enter Permanent address");
    Tp.Permanentaddress(getonlyPermanentAddress());
    Thread.sleep(4000);
    
}


@Then("Enter only number in permanent address")
public void enter_only_number_in_permanent_address() {
	logger.info("First Scroll the page");
	js.executeScript("window.scrollBy(0,400)", "");
	logger.info("Enter permanent address with only number");
   Tp.Permanentaddress(getpermanentAddressonlynumber());
}

@Then("Enter both charecter and number in permanent address field")
public void enter_both_charecter_and_number_in_permanent_address_field() throws InterruptedException {
	logger.info("First scroll the page");
	js.executeScript("window.scrollBy(0,400)","");
	logger.info("Enter both charecter and number in permanent address field");
   Tp.Permanentaddress(getpermanentAddressbothcharandnum());
   Thread.sleep(4000);
}

@Then("Enter both number and charecter in permanent address field")
public void enter_both_number_and_charecter_in_permanent_address_field() throws InterruptedException {
	logger.info("First Scroll the page");
   js.executeScript("window.scrollBy(0,400)","");
   logger.info("Enter both number and charecter in permanent field");
   Tp.Permanentaddress(getpermanentAddressbothnumandchar());
   Thread.sleep(4000);
}


@Then("Enter only Special charecter in permanent address field")
public void enter_only_special_charecter_in_permanent_address_field() throws InterruptedException {
	logger.info("First scroll the page");
    js.executeScript("window.scrollBy(0,400)", "");
    logger.info("Enter special charecter in permanent addresss field ");
    Tp.Permanentaddress(getpermanentAddressonlyspecialch());
    Thread.sleep(4000);
    
}





@Then("clcik on submit button")
public void clcik_on_submit_button() throws InterruptedException {
   logger.info("click on Submit");
   Tp.clickonsubmitbutton();
   logger.info("Scroll page");
   js.executeScript("window.scrollBy(0,100)", "");
   Thread.sleep(4000);
}

@Then("click on submit button")
public void click_on_submit_button() throws InterruptedException {
	logger.info("click on submit button");
    Tp.clickonsubmitbutton();
    logger.info("Scrool the page");
    js.executeScript("window.scrollBy(0,100)", "");
    Thread.sleep(4000);
}


@Then("verify the fullName as same as report name")
public void verify_the_full_name_as_same_as_report_name() {
	logger.info("Verify FullName Successful");
	String FullName=getFullname();
    Tp.verifyFullname(FullName);
}

@Then("verify the fullname as same as report name")
public void verify_the_fullname_as_same_as_report_name() {
	
   logger.info("Verify Fullname");
	//Tp.verifyFullname(getFullname());
   String Fullname=getonlyFullname();
   Tp.verifyFullname(Fullname);
}

@Then("verify the EmailId as sama as report name")
public void verify_the_email_id_as_sama_as_report_name() {
	logger.info("Verify EmailId Sucessfuly");
	String EmailId=getonlyEmailid();
    Tp.verifyEmailid(EmailId);
    
}
@Then("verify the Emaild as same as report eamilid")
public void verify_the_emaild_as_same_as_report_eamilid() {
	logger.info("Verify EmailId");
	String EmailId=getEmailId();
   Tp.verifyEmailid(EmailId);
	
	
}

@Then("verify the Current address as same as in report current address field")
public void verify_the_current_address_as_same_as_in_report_current_address_field() {
	String currentaddress=getCurrentaddress();
   Tp.verifyCurrentAddress(currentaddress);
}




@Then("verify the Current Address as same as report Current Address")
public void verify_the_current_address_as_same_as_report_current_address() {
   logger.info("Verify Current Address Successful");
   String currentAddress=getonlyCurrentAddress();
	Tp.verifyCurrentAddress(currentAddress);
}


@Then("verify the Current address in report")
public void verify_the_current_address_in_report() {
	logger.info("Verify the Current address only numbers");
	String CurrentAddressonlynumber=getCurrentAddressonlynumbers();
    Tp.verifycurrentaddressonlyNumber(CurrentAddressonlynumber);
}

@Then("verify the Current Address")
public void verify_the_current_address() {
	logger.info("verify the current address filed with special charecter");
	String currentaddressonlyspecialch=getcurrentaddressonlySpecialcharecter();
   Tp.verifyCurrentAddressonlyspecialch(currentaddressonlyspecialch);
}

@Then("verify current address field")
public void verify_current_address_field() {
	logger.info("Verify the current aaddress with numbers and charecter");
	String currentaddressbothnumandchar=getcurrentaddressbothnumandchar();
    Tp.verifyCurrentAddress(currentaddressbothnumandchar);
}

@Then("verify current address field in report")
public void verify_current_address_field_in_report() {
	logger.info("Verify the current address with both number and charecter");
    String currentAddressbothnumandchar=getcurrentAddressbothnumberandcharecter();
    Tp.verifyCurrentAddress(currentAddressbothnumandchar);
}
@Then("verify the permanent address as same as in reoprt permanent address field")
public void verify_the_permanent_address_as_same_as_in_reoprt_permanent_address_field() {
   logger.info("verify the permanent address");
   String permnentaddreess=getPermanentaddress();
   Tp.verifyPermanentAddress(permnentaddreess);
}

@Then("verify the Permanent Address as same as report Permanent Address")
public void verify_the_permanent_address_as_same_as_report_permanent_address() {
	logger.info("Verify the Permanent Address Successful");
	String permanentAddress=getonlyPermanentAddress();
   Tp.verifyPermanentAddress(permanentAddress);
   
}
@Then("verify permanent address with only number")
public void verify_permanent_address_with_only_number() {
	logger.info("Verify the permanent address with only number");
    String premanentaddressonlynumber=getpermanentAddressonlynumber();
    Tp.verifyPermanentAddress(premanentaddressonlynumber);
}

@Then("verify permanent address with charecter and number")
public void verify_permanent_address_with_charecter_and_number() {
	logger.info("Verify the permanent address with charecter and number");
	String permanentaddressbothcharandnum=getpermanentAddressbothcharandnum();
	Tp.verifyPermanentAddress(permanentaddressbothcharandnum);
}

@Then("verify permanent address with both number and charecter")
public void verify_permanent_address_with_both_number_and_charecter() {
    logger.info("verify the permanent address with number and charecter");
    String permanentaddressbothnumandchar=getpermanentAddressbothnumandchar();
    Tp.verifyPermanentAddress(permanentaddressbothnumandchar);
}

@Then("verify permenent address with special charecter")
public void verify_permenent_address_with_special_charecter() {
	logger.info("verify the permanent address with only special charecter");
	String getpermanentAddressonlyspecialch=getpermanentAddressonlyspecialch();
    Tp.verifyPermanentAddress(getpermanentAddressonlyspecialch);
}


@Then("Verify the Elements Text should show in Webpage.")
public void verify_the_elements_text_should_show_in_webpage() {
	logger.info("Verify the Elements Text");
   Tp.verifyElementText(getverifyElementText());
	
}


@Then("verify the TextBox Text should show in webpage")
public void verify_the_text_box_text_should_show_in_webpage() {
    logger.info("verify the Textbox Text ");
	Tp.verifyTextboxText(getverifyTextboxText());
}

@Then("verify the ToolsQA Test should show in webapage")
public void verify_the_tools_qa_test_should_show_in_webapage() {
	logger.info("verify the ToolsQA Text");
    Tp.verifyToolsQaText(getverifyToolsQaText());
}

@Then("verify the fullname in report")
public void verify_the_fullname_in_report() {
	logger.info("Verify the Fullname only numbers");
	String fullnameonlynumbers=getFullnameOnlyNumbers();
	Tp.verifyfullnameonlynumber(fullnameonlynumbers);
}
//CheckBox



@Then("click on Check Box button")
public void click_on_check_box_button() throws InterruptedException {
	
	cb=new CheckBoxpage(driver);
	js.executeScript("window.scrollBy(0,200)","");
	logger.info("click on Checkbox button");
	cb.clickonCheckBoxButton();
	Thread.sleep(4000);
   
}

@Then("verify the Check Box text in heading")
public void verify_the_check_box_text_in_heading() {
	logger.info("verify the Check box Successful");
    cb.VerifyCheckboxtext(getText());
}



@Then("click on Home box button")
public void click_on_home_box_button() throws InterruptedException {
	logger.info("Click on Home Box");
    cb.clickonHomeBoxButton();
    Thread.sleep(4000);
}

@Then("verify the Home box report")
public void verify_the_home_box_report() {
	logger.info("verify Home box Successful"); 
    cb.VerifyHomeBoxName(getHomeBoxName());
}


//Expand and collapse
@Then("click on Expand button")
public void click_on_expand_button() throws InterruptedException {
	logger.info("click on Expand button");
   cb.clickonExpandbutton();
   logger.info("Scroll page");
   js.executeScript("window.scrollBy(0,400)", "");
   Thread.sleep(4000);
   
}

@Then("Verify the Expand button Expand all the elements")
public void verify_the_expand_button_expand_all_the_elements() {
	logger.info("Verify the expand button");
   cb.verifyExpandButton();
}

@Then("click on Collapse button")
public void click_on_collapse_button() throws InterruptedException {
	logger.info("click on collapse button");
    cb.clickonCollapsebutton();
    logger.info("Scroll the page");
    Thread.sleep(4000);
}

@Then("verify the collapse button collapse all the elements")
public void verify_the_collapse_button_collapse_all_the_elements() {
	logger.info("Verify the collapse button");
	cb.verifyCollapsebutton();
	
   
}


//Verify the SubElements
@Then("Expand the home box")
public void expand_the_home_box() throws InterruptedException {
	logger.info("Click on Homebox toggle");
   cb.clickonHomeboxToggle(); 
   Thread.sleep(4000);
  
}
@Then("you should see Three subtasks present in Home box")
public void you_should_see_three_subtasks_present_in_home_box() {
	logger.info("Verify the three subtasks present in home Box ");
    cb.verifythesubelementspresentinhomebox();
}

//Verify Desktop subElements

@Then("Expand Desktop button")
public void expand_desktop_button() throws InterruptedException {
	logger.info("Click on Desktop Toggle button");
   cb.clickonDesktopbutton(); 
   logger.info("Scroll the page");
   js.executeScript("window.scrollBy(0,100)","");
   Thread.sleep(4000);
}
@Then("Verify the subtask present under Desktop.")
public void verify_the_subtask_present_under_desktop() {
	String []ar=getSubnodename();
	logger.info("Verify the Desktop subnodes");
    cb.verifytheDesktopsubnodes(ar);
}



//Verify notes checkbox
@Then("click on Note check box")
public void click_on_note_check_box() throws InterruptedException {
	logger.info("click on note check box");
    cb.clickonNoteCheckBoX();
    Thread.sleep(4000);
}
@Then("Verify the Note check box is checked")
public void verify_the_note_check_box_is_checked() throws InterruptedException {
	String s=getverifynotecheckbox();
	logger.info("verify the note check box is check");
    cb.verifyNoteCheckboxischeckedornot(s);
    Thread.sleep(4000);
    js.executeScript("window.scrollBy(0,300)","");
}
@Then("verify the Note box name present in report")
public void verify_the_note_box_name_present_in_report() {
	String s=getNotename();
	logger.info("verify the note name shows in report");
   cb.verifyNotenameinreport(s);
}

//Commands check box
@Then("click on Commands Check box")
public void click_on_commands_check_box() throws InterruptedException {
	logger.info("click on Commands check box");
   cb.clickonCommandsCheckbox();
   Thread.sleep(4000);
   
}
@Then("Verify the Commands Check box is checked")
public void verify_the_commands_check_box_is_checked() {
	logger.info("verify the commands Check box status");
	String name=getverifycommandscheckboxstatus();
    cb.verifythecommandscheckboxischeckedornot(name);
}
@Then("Verify the Commands box name present in report.")
public void verify_the_commands_box_name_present_in_report() {
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
	logger.info("Verify the commands check box text in report");
   cb.verifythecommnadstextinreport(getCommandscheckBoxName());
   
}
//verify all checkbox name present in report

@Then("verify Desktop Check box is checked")
public void verify_desktop_check_box_is_checked() {
   logger.info("verify the desktop check box status");
   cb.verifythedesktopcheckboxischeckedornot(getverifythedesktopcheckboxstatus());
   
}
@Then("verify all the check box name present in report")
public void verify_all_the_check_box_name_present_in_report() {
   logger.info("Scroll the page");
   js.executeScript("window.scrollBy(0,200)","");
   logger.info("Verify all check box name are present in report");
   String arr[]=getverifyallcheckboxtext();
   cb.verifyAllCheckboxnamepresentinreport(arr);
		  
}

//verify if parent check box uncheck then sub nodes automatically unchecked.
@Then("click on Desktop button for select all the sub nodes")
public void click_on_desktop_button_for_select_all_the_sub_nodes() throws InterruptedException {
	logger.info("click on desktop button for select all the subnodes");
   cb.clickondesktopcheckboxforselectallthesubnodes(); 
   Thread.sleep(4000);
}
@Then("click on Desktop button for unselect all the sub nodes")
public void click_on_desktop_button_for_unselect_all_the_sub_nodes() throws InterruptedException {
	logger.info("click on desktop button for unselect all the subnodes");
    cb.clickondesktopcheckboxforunselectallthesubnodes();
    Thread.sleep(4000);
}
@Then("verify the Note check box is unchecked")
public void verify_the_note_check_box_is_unchecked() {
	logger.info("verify the Note check box status unchecked");
	String s=getverifyunselectcheckbox();
    cb.verifytheNotecheckbox_status(s);
}
@Then("verify the Commands check box is unchecked")
public void verify_the_commands_check_box_is_unchecked() {
    logger.info("verify the commands checkbox status uncheck");
    cb.verifythecommandscheckbox_status(getverifyunselectcheckbox());
}
@Then("verify the report is empty")
public void verify_the_report_is_empty() {
	logger.info("verify the report");
    cb.verifythereport();
}




@After
public void setDown() {
	logger.info("Close browser");
	driver.close();
}

}
