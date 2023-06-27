package StepDefiniation;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

import Pageobject.Buttonspage;
import Pageobject.CheckBoxpage;
import Pageobject.Linkspage;
import Pageobject.RadioButtonpage;
import Pageobject.Toolsqapage;
import Pageobject.WebTablepage;
import Utilities.Utility;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
public class Toolsqastpes extends Base {
public static  WebDriver driver=getdriver();
public JavascriptExecutor js;
Toolsqapage Tp;
CheckBoxpage cb;
RadioButtonpage rb;
WebTablepage wb;
Buttonspage bp;
static int i=0;

public static Logger logger;

@Before
public static void setUp() {
	i++;
	//driver=getdriver();
	driver.manage().window().maximize();
	//driver.manage().window().fullscreen();
	logger=Logger.getLogger("Toolsqa");
	PropertyConfigurator.configure("log4j.properties");
	logger.info("Lunch the browser");

	
	
	
}
 



@Given("user go to the url")
public void user_go_to_the_url() throws IOException  {
	//logger=Logger.getLogger("Toolsqa");
	//PropertyConfigurator.configure("log4j.properties");
	
    driver.get(getUrl());
    logger.info("Lunch the url");
    //driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,"50"));
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
public void enter_his_her_fullname() throws InterruptedException, IOException {
	logger.info("Enter Fullname");
	Tp.Fullname(getFullname());
    Thread.sleep(4000);
}


@Then("Enter your fullname")
public void enter_your_fullname() throws InterruptedException, IOException {
	{
		logger.info("Enter only Fullname");
	  Tp.Fullname(getonlyFullname());
	  logger.info("Page scroll");
	  js.executeScript("window.scrollBy(0,500)", "");
	  Thread.sleep(4000);
	}
	
}


@Then("Enter only number in the Fullname field")
public void enter_only_number_in_the_fullname_field() throws InterruptedException, IOException{
	logger.info("Enter only number in the fullname field");
	Tp.Fullname(getFullnameOnlyNumbers());
	Thread.sleep(4000);
	logger.info("Scroll page");
	js.executeScript("window.scrollBy(0,400)", "");
	
   
}

@Then("Enter his\\/her Emailid")
public void enter_his_her_emailid() throws InterruptedException, IOException {
	logger.info("Enter emailid");
	Tp.EmailId(getEmailId());  
   Thread.sleep(4000);
}


@Then("Enter your EmailId")
public void enter_your_email_id() throws InterruptedException, IOException {
	logger.info("Enter only EmailId");
	Tp.EmailId(getonlyEmailid());
	Thread.sleep(4000);
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,400)", "");
	
}

@Then("Enter his\\/her Current address")
public void enter_his_her_current_address() throws InterruptedException, IOException {
	logger.info("Enter Currentaddress");
	Tp.Currentaddress(getCurrentaddress());
   Thread.sleep(4000);
   logger.info("Scroll the page");
   js=(JavascriptExecutor)driver;
   js.executeScript("window.scrollBy(0,400)", "");
   
}


@Then("Enter your Current Address")
public void enter_your_current_address() throws InterruptedException, IOException {
	logger.info("Enter current address");
    Tp.Currentaddress(getonlyCurrentAddress());
    Thread.sleep(4000);
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,400)","");
}



@Then("Enter only number in current address field")
public void enter_only_number_in_current_address_field() throws InterruptedException, IOException {
	logger.info("Enter only number in current address field ");
	Tp.Currentaddress(getCurrentAddressonlynumbers());
	logger.info("Scroll page");
	js.executeScript("window.scrollBy(0,400)","");
	Thread.sleep(4000);
	
    
}

@Then("Enter only special charecter in currenta address field")
public void enter_only_special_charecter_in_currenta_address_field() throws InterruptedException, IOException {
	logger.info("Enter only special charecter in current address field");
    Tp.Currentaddress(getcurrentaddressonlySpecialcharecter());
    Thread.sleep(4000);
    logger.info("Scroll page");
    js.executeScript("window.scrollBy(0,400)", "");
    
}


@Then("Enter both charecter and numbers in currect address field")
public void enter_both_charecter_and_numbers_in_currect_address_field() throws InterruptedException, IOException {
	logger.info("Enter both charecter and number in current address field");
    Tp.Currentaddress(getcurrentaddressbothnumandchar());
    logger.info("Scroll the page");
    js.executeScript("window.scrollBy(0,400)", "");
    Thread.sleep(4000);
}

@Then("Enter both number and charecter in current address field")
public void enter_both_number_and_charecter_in_current_address_field() throws InterruptedException, IOException {
	logger.info("Enter both number and charecter in current address field");
   Tp.Currentaddress(getcurrentAddressbothnumberandcharecter());
   logger.info("Scroll the page");
   js.executeScript("window.scrollBy(0,400)", "");
   Thread.sleep(4000);
}



@Then("Enter his\\/her permanent address")
public void enter_his_her_permanent_address() throws InterruptedException, IOException {
	logger.info("Enter Permanentaddress");
	Tp.Permanentaddress(getPermanentaddress()); 
  Thread.sleep(4000);
}

@Then("Enter your Permanent Address")
public void enter_your_permanent_address() throws InterruptedException, IOException {
	logger.info("First scroll page");
	js.executeScript("window.scrollBy(0,400)", "");
	logger.info("Enter Permanent address");
    Tp.Permanentaddress(getonlyPermanentAddress());
    Thread.sleep(4000);
    
}


@Then("Enter only number in permanent address")
public void enter_only_number_in_permanent_address() throws IOException {
	logger.info("First Scroll the page");
	js.executeScript("window.scrollBy(0,400)", "");
	logger.info("Enter permanent address with only number");
   Tp.Permanentaddress(getpermanentAddressonlynumber());
}

@Then("Enter both charecter and number in permanent address field")
public void enter_both_charecter_and_number_in_permanent_address_field() throws InterruptedException, IOException {
	logger.info("First scroll the page");
	js.executeScript("window.scrollBy(0,400)","");
	logger.info("Enter both charecter and number in permanent address field");
   Tp.Permanentaddress(getpermanentAddressbothcharandnum());
   Thread.sleep(4000);
}

@Then("Enter both number and charecter in permanent address field")
public void enter_both_number_and_charecter_in_permanent_address_field() throws InterruptedException, IOException {
	logger.info("First Scroll the page");
   js.executeScript("window.scrollBy(0,400)","");
   logger.info("Enter both number and charecter in permanent field");
   Tp.Permanentaddress(getpermanentAddressbothnumandchar());
   Thread.sleep(4000);
}


@Then("Enter only Special charecter in permanent address field")
public void enter_only_special_charecter_in_permanent_address_field() throws InterruptedException, IOException {
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
public void verify_the_full_name_as_same_as_report_name() throws IOException {
	logger.info("Verify FullName Successful");
	String FullName=getFullname();
    Tp.verifyFullname(FullName);
}

@Then("verify the fullname as same as report name")
public void verify_the_fullname_as_same_as_report_name() throws IOException {
	
   logger.info("Verify Fullname");
	//Tp.verifyFullname(getFullname());
   String Fullname=getonlyFullname();
   Tp.verifyFullname(Fullname);
}

@Then("verify the EmailId as sama as report name")
public void verify_the_email_id_as_sama_as_report_name() throws IOException {
	logger.info("Verify EmailId Sucessfuly");
	String EmailId=getonlyEmailid();
    Tp.verifyEmailid(EmailId);
    
}
@Then("verify the Emaild as same as report eamilid")
public void verify_the_emaild_as_same_as_report_eamilid() throws IOException {
	logger.info("Verify EmailId");
	String EmailId=getEmailId();
   Tp.verifyEmailid(EmailId);
	
	
}

@Then("verify the Current address as same as in report current address field")
public void verify_the_current_address_as_same_as_in_report_current_address_field() throws IOException {
	String currentaddress=getCurrentaddress();
   Tp.verifyCurrentAddress(currentaddress);
}




@Then("verify the Current Address as same as report Current Address")
public void verify_the_current_address_as_same_as_report_current_address() throws IOException {
   logger.info("Verify Current Address Successful");
   String currentAddress=getonlyCurrentAddress();
	Tp.verifyCurrentAddress(currentAddress);
}


@Then("verify the Current address in report")
public void verify_the_current_address_in_report() throws IOException {
	logger.info("Verify the Current address only numbers");
	String CurrentAddressonlynumber=getCurrentAddressonlynumbers();
    Tp.verifycurrentaddressonlyNumber(CurrentAddressonlynumber);
}

@Then("verify the Current Address")
public void verify_the_current_address() throws IOException {
	logger.info("verify the current address filed with special charecter");
	String currentaddressonlyspecialch=getcurrentaddressonlySpecialcharecter();
   Tp.verifyCurrentAddressonlyspecialch(currentaddressonlyspecialch);
}

@Then("verify current address field")
public void verify_current_address_field() throws IOException {
	logger.info("Verify the current aaddress with numbers and charecter");
	String currentaddressbothnumandchar=getcurrentaddressbothnumandchar();
    Tp.verifyCurrentAddress(currentaddressbothnumandchar);
}

@Then("verify current address field in report")
public void verify_current_address_field_in_report() throws IOException {
	logger.info("Verify the current address with both number and charecter");
    String currentAddressbothnumandchar=getcurrentAddressbothnumberandcharecter();
    Tp.verifyCurrentAddress(currentAddressbothnumandchar);
}
@Then("verify the permanent address as same as in reoprt permanent address field")
public void verify_the_permanent_address_as_same_as_in_reoprt_permanent_address_field() throws IOException {
   logger.info("verify the permanent address");
   String permnentaddreess=getPermanentaddress();
   Tp.verifyPermanentAddress(permnentaddreess);
}

@Then("verify the Permanent Address as same as report Permanent Address")
public void verify_the_permanent_address_as_same_as_report_permanent_address() throws IOException {
	logger.info("Verify the Permanent Address Successful");
	String permanentAddress=getonlyPermanentAddress();
   Tp.verifyPermanentAddress(permanentAddress);
   
}
@Then("verify permanent address with only number")
public void verify_permanent_address_with_only_number() throws IOException {
	logger.info("Verify the permanent address with only number");
    String premanentaddressonlynumber=getpermanentAddressonlynumber();
    Tp.verifyPermanentAddress(premanentaddressonlynumber);
}

@Then("verify permanent address with charecter and number")
public void verify_permanent_address_with_charecter_and_number() throws IOException {
	logger.info("Verify the permanent address with charecter and number");
	String permanentaddressbothcharandnum=getpermanentAddressbothcharandnum();
	Tp.verifyPermanentAddress(permanentaddressbothcharandnum);
}

@Then("verify permanent address with both number and charecter")
public void verify_permanent_address_with_both_number_and_charecter() throws IOException {
    logger.info("verify the permanent address with number and charecter");
    String permanentaddressbothnumandchar=getpermanentAddressbothnumandchar();
    Tp.verifyPermanentAddress(permanentaddressbothnumandchar);
}

@Then("verify permenent address with special charecter")
public void verify_permenent_address_with_special_charecter() throws IOException {
	logger.info("verify the permanent address with only special charecter");
	String getpermanentAddressonlyspecialch=getpermanentAddressonlyspecialch();
    Tp.verifyPermanentAddress(getpermanentAddressonlyspecialch);
}


@Then("Verify the Elements Text should show in Webpage.")
public void verify_the_elements_text_should_show_in_webpage() throws IOException {
	logger.info("Verify the Elements Text");
   Tp.verifyElementText(getverifyElementText());
	
}


@Then("verify the TextBox Text should show in webpage")
public void verify_the_text_box_text_should_show_in_webpage() throws IOException {
    logger.info("verify the Textbox Text ");
	Tp.verifyTextboxText(getverifyTextboxText());
}

@Then("verify the ToolsQA Test should show in webapage")
public void verify_the_tools_qa_test_should_show_in_webapage() throws IOException {
	logger.info("verify the ToolsQA Text");
    Tp.verifyToolsQaText(getverifyToolsQaText());
}

@Then("verify the fullname in report")
public void verify_the_fullname_in_report() throws IOException {
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
public void verify_the_check_box_text_in_heading() throws IOException {
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
public void verify_the_home_box_report() throws IOException {
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
public void verify_the_subtask_present_under_desktop() throws IOException {
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
public void verify_the_note_check_box_is_checked() throws InterruptedException, IOException {
	String s=getverifynotecheckbox();
	logger.info("verify the note check box is check");
    cb.verifyNoteCheckboxischeckedornot(s);
    Thread.sleep(4000);
    js.executeScript("window.scrollBy(0,300)","");
}
@Then("verify the Note box name present in report")
public void verify_the_note_box_name_present_in_report() throws IOException {
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
public void verify_the_commands_check_box_is_checked() throws IOException {
	logger.info("verify the commands Check box status");
	String name=getverifycommandscheckboxstatus();
    cb.verifythecommandscheckboxischeckedornot(name);
}
@Then("Verify the Commands box name present in report.")
public void verify_the_commands_box_name_present_in_report() throws IOException {
	logger.info("Scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
	logger.info("Verify the commands check box text in report");
   cb.verifythecommnadstextinreport(getCommandscheckBoxName());
   
}
//verify all checkbox name present in report

@Then("verify Desktop Check box is checked")
public void verify_desktop_check_box_is_checked() throws IOException {
   logger.info("verify the desktop check box status");
   cb.verifythedesktopcheckboxischeckedornot(getverifythedesktopcheckboxstatus());
   
}
@Then("verify all the check box name present in report")
public void verify_all_the_check_box_name_present_in_report() throws IOException {
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
public void verify_the_note_check_box_is_unchecked() throws IOException {
	logger.info("verify the Note check box status unchecked");
	String s=getverifyunselectcheckbox();
    cb.verifytheNotecheckbox_status(s);
}
@Then("verify the Commands check box is unchecked")
public void verify_the_commands_check_box_is_unchecked() throws IOException {
    logger.info("verify the commands checkbox status uncheck");
    cb.verifythecommandscheckbox_status(getverifyunselectcheckbox());
}
@Then("verify the report is empty")
public void verify_the_report_is_empty() {
	logger.info("verify the report");
    cb.verifythereport();
    
}

//documents subtask check box
@Then("Expand the Documents checkbox")
public void expand_the_documents_checkbox() throws InterruptedException {
 logger.info("Expand the documents checkbox");
 cb.clickondocumentstoggel();
 logger.info("scroll the page");
 js.executeScript("window.scrollBy(0,100)","");
 Thread.sleep(4000);
}
@Then("verify the subtask present in documents")
public void verify_the_subtask_present_in_documents() throws IOException {
 logger.info("verify the subtask present in documents"); 
 String ar[]=getvalue();
 cb.verifythesubtaskpresentindocuments(ar);
}

//Verify the workspace sub text

@Then("Expand the Workspace checkbox")
public void expand_the_workspace_checkbox() throws InterruptedException {
    logger.info("Expand the workspace checkbox");
    cb.clickonworkspacetoggel();
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,100)","");
    Thread.sleep(4000);
    
}
@Then("verify the subtask present in workspace")
public void verify_the_subtask_present_in_workspace() throws IOException {
    logger.info("verify the subtext present in workspace");
    String ar[]=getsubtaskofworkspace();
    cb.verifythesubtextpresentinworkspace(ar);
}

//verify the office subtext


@Then("Expand the Office checkbox")
public void expand_the_office_checkbox() throws InterruptedException {
	logger.info("Expand on office checkbox");
    cb.clickonofficetoggle();
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,100)","");
    Thread.sleep(4000);
}
@Then("verify the sub task present in office")
public void verify_the_sub_task_present_in_office() throws IOException {
    logger.info("verify the subtask present in office");
    String ar[]=getsubtaskofoffice();
    cb.verifythesubtextpresentinoffice(ar);
}

//verify react checkbox


@Then("click on react check box")
public void click_on_react_check_box() throws InterruptedException {
   logger.info("click on react check box");
   cb.clickonreactcheckbox();
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,50)","");
   Thread.sleep(4000);
}
@Then("verify the react check box is checked")
public void verify_the_react_check_box_is_checked() throws IOException {
    logger.info("verify the react check box status is checked");
    String s=getverifyreactcheckboxstatus();
    cb.verifythestatusofreactchekbox(s);
}
@Then("verify the react check box name text show in report")
public void verify_the_react_check_box_name_text_show_in_report() throws IOException {
   logger.info("verify the react text present in report");
   String s=getverifyreacttextinreport();
   cb.verifythereacttextpresentinreport(s);
}
//verify angular checkbox

@Then("click on angular check box")
public void click_on_angular_check_box() throws InterruptedException {
   logger.info("click on angular check box");
   cb.clickonangularcheckbox();
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,50)","");
   Thread.sleep(4000);
   
}
@Then("verify the angular check box is checked")
public void verify_the_angular_check_box_is_checked() throws IOException {
   logger.info("verify the angular check box status is checked");
   String s=getverifyangularcheckboxstatus();
   cb.verifythestatusofangularcheckbox(s);
}
@Then("verify the angular check box text present in report")
public void verify_the_angular_check_box_text_present_in_report() throws IOException {
    logger.info("verify the angular text present in report");
    String s=getverifyangulartextinreport();
    cb.verifytheangularcheckboxtextpresentinreport(s);
}

//verify veu check box

@Then("click on veu check box")
public void click_on_veu_check_box() throws InterruptedException {
   logger.info("click on veu check box");
   cb.clickonveucheckbox();
   logger.info("Scroll the page");
   js.executeScript("window.scrollBy(0,50)","");
   Thread.sleep(4000);
}
@Then("verify the veu check box is checked")
public void verify_the_veu_check_box_is_checked() throws IOException {
   logger.info("verify the veu check box status is checked");
   String s=getverifyveucheckboxstatus();
   cb.verifythestatusofveucheckbox(s);
}
@Then("verify the veu check box text present in report")
public void verify_the_veu_check_box_text_present_in_report() throws IOException {
   logger.info("cerify the veu check box text is present in report");
   String s=getverifyveutextinreport();
   cb.verifytheveucheckboxtextpresentinreport(s);
}
//verify the all the sub task are selected and also parent also selected

@Then("verify the workspace check box is checked")
public void verify_the_workspace_check_box_is_checked() throws IOException {
   logger.info("verify the workspace check box is checked");
   String s=getverifyworkspacestatus();
   cb.verifythestatusofworkspacecheckbox(s);
}
@Then("verify all the subtask and his parent check box name is present in report")
public void verify_all_the_subtask_and_his_parent_check_box_name_is_present_in_report() throws IOException {
    logger.info("verify all the subtask and parent check box is present in report");
    String arr[]=getverifyworkspaceCheckedboxtextinreport();
    cb.verifyallcheckboxnamearepresentinreport(arr);
}
//verify all the sub task check box are unchecked with parent check box


@Then("verify the react check box is unchecked")
public void verify_the_react_check_box_is_unchecked() throws IOException {
    logger.info("verify the react check box status is unchecked");
    String s=getverifyreactuncheckboxstatus();
    cb.verifythestatusofreactcheckboxisunchecked(s);
}
@Then("verify the angular check box is unchecked")
public void verify_the_angular_check_box_is_unchecked() throws IOException {
   logger.info("verify the angular check box status is unchecked");
   String s=getverifyangularuncheckboxstatus();
   cb.verifythestatusofangularcheckboxisunchecked(s);
}
@Then("verify the veu check box is unchecked")
public void verify_the_veu_check_box_is_unchecked() throws IOException {
   logger.info("verify the veu check box status is unchecked");
   String s=getverifyveuuncheckboxstatus();
   cb.verifytheststusofveucheckboxisunchecked(s);
}
@Then("verify the workspace check box is unchecked")
public void verify_the_workspace_check_box_is_unchecked() throws IOException {
    logger.info("verify the workspace check box status is unchecked");
    String s=getverifyworkspaceuncheckboxstatus();
    cb.verifythestatusofworkspacecheckboxisunchecked(s);
}


//verify the public check box

@Then("click on public check box")
public void click_on_public_check_box() throws InterruptedException {
    logger.info("click on public check box");
    cb.clickonpubliccheckbox();
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,50)","");
    Thread.sleep(4000);
}
@Then("verify the public check box is checked")
public void verify_the_public_check_box_is_checked() throws IOException {
	logger.info("verify the check box status is checked");
	String s=getverifypubliccheckboxstatus();
	cb.verifythestatusofpubliccheckbox(s);
}
@Then("verify the public check box name is present in report")
public void verify_the_public_check_box_name_is_present_in_report() throws IOException {
   logger.info("verify the public check box name is present in report");
   String s=getverifypubliccheckboxtext();
   cb.verifythepubliccheckboxtextpresentinreport(s);
}

//verify private checkbox
@Then("click on private check box")
public void click_on_private_check_box() throws InterruptedException {
   logger.info("click on private check box");
   cb.clickonprivatecheckbox();
   Thread.sleep(4000);
}
@Then("verify the private check box is checked")
public void verify_the_private_check_box_is_checked() throws IOException {
   logger.info("verify the private check box status is checked");
   String s=getverifyprivatecheckboxstatus();
   cb.verifythestatusofprivatecheckbox(s);
}
@Then("verify the private check box name is present in report")
public void verify_the_private_check_box_name_is_present_in_report() throws IOException {
    logger.info("verify the private check box name is present in report");
    String s=getverifyprivatecheckboxtext();
    cb.verifytheprivatecheckboxtextpresentinreport(s);
}

//verify the classified check box

@Then("click on classified check box")
public void click_on_classified_check_box() throws InterruptedException {
   logger.info("click on classified check box");
   cb.clickonclassifiedcheckbox();
   Thread.sleep(4000);
}
@Then("verify the classified check box is checked")
public void verify_the_classified_check_box_is_checked() throws IOException {
   logger.info("verify the classified check box status is checked");
   cb.verifythestatusofclassifiedcheckbox(getverifyclassifiedcheckboxstatus());
}
@Then("verify the classified check box name is present in report")
public void verify_the_classified_check_box_name_is_present_in_report() throws IOException {
   logger.info("verify the classified check box name is present in report");
   cb.verifytheclassifiedcheckboxtextpresentinreport(getverifyclassifiedcheckboxtext());
}

//verify the general check box
@Then("click on general check box")
public void click_on_general_check_box() throws InterruptedException {
   logger.info("click on general check box");
   cb.clickongeneralcheckbox();
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,50)","");
   Thread.sleep(4000);
}
@Then("verify the general check box is checked")
public void verify_the_general_check_box_is_checked() throws IOException {
	logger.info("verify the general check box status is checked");
	cb.verifythestatusofgeneralcheckbox(getverifygeneralcheckboxstatus());
   
}
@Then("verify the general check box text is present in report")
public void verify_the_general_check_box_text_is_present_in_report() throws IOException {
 logger.info("verify the general check box text is present in report");
 cb.verifythegeneralcheckboxtextpresentinreport(getverifygeneralcheckboxtext());
}

//verify all the subtask are checked
@Then("verify the office check box is checked")
public void verify_the_office_check_box_is_checked() throws IOException {
    logger.info("verify the office check box status is checked");
    cb.verifythestatusofofficecheckbox(getverifyofficecheckboxstatus());
}
@Then("verify the all the check box name are present in report")
public void verify_the_all_the_check_box_name_are_present_in_report() throws IOException {
    logger.info("verify all the check box name are present in report");
    String arr[]=getverifyofficecheckboxtext();
    cb.verifyallofficecheckboxtextarepresentinreport(arr);
}
//verify if office check box is unchecked then all the sub task present in office check box are unchecked
@Then("verify the office check box is unchecked")
public void verify_the_office_check_box_is_unchecked() throws IOException {
    logger.info("verify the office check box status is unchecked");
    cb.verifytheofficeuncheckboxstatus(getverifyofficeUncheckbox());
}
@Then("verify the public check box is unchecked")
public void verify_the_public_check_box_is_unchecked() throws IOException {
   logger.info("verify the public check box status is unchecked");
   cb.verifythepublicuncheckboxstatus(getverifypublicUncheckbox());
}
@Then("verify the private check box is unchecked")
public void verify_the_private_check_box_is_unchecked() throws IOException {
	logger.info("verify the private check box status is unchecked");
	cb.verifytheprivateuncheckboxstatus(getverifyprivateUncheckbox());
   
}
@Then("verify the classified check box is unchecked")
public void verify_the_classified_check_box_is_unchecked() throws IOException {
    logger.info("verify the classified check box status is unchecked");
    cb.verifytheclassifieduncheckedboxstatus(getverifyclassifiedUncheckbox());
}
@Then("verify the general check box is unchecked")
public void verify_the_general_check_box_is_unchecked() throws IOException {
  logger.info("verify the general check box status is unchecked");
  cb.verifythegeneraluncheckedboxstatus(getverifygeneralUncheckbox());
}

//verify if all the sub task present in documents are checked then automatically documnets is checked


@Then("click on Workspace checkbox")
public void click_on_workspace_checkbox() throws InterruptedException {
    logger.info("click on workscpace checkbox");
    cb.clickonworkspacechecbox();
    Thread.sleep(4000);
}
@Then("click on Office checkbox")
public void click_on_office_checkbox() throws InterruptedException {
    logger.info("click on office checkbox");
    cb.clickonofficecheckbox();
    Thread.sleep(4000);
}
@Then("verify the documents check box is checked")
public void verify_the_documents_check_box_is_checked() throws IOException {
	logger.info("verify the documnets checkbox status is checked");
	cb.verifythestatusofdocumentscheckbox(getverifydocumentscheckbox());
    
}
@Then("verify the documents check box name is present in report")
public void verify_the_documents_check_box_name_is_present_in_report() throws IOException {
    logger.info("verify the documents check box name is present in report");
    cb.verifydocumentscheckboxtextpresentinreport(getverifydocumentscheckboxtext());
}
//verify if documents check box is unchecked then all the sub task present in this is also unchecked.

@Then("verify the documents check box is unchecked")
public void verify_the_documents_check_box_is_unchecked() throws IOException {
   logger.info("verify the documents check box status is unchecked");
   cb.verifythestatusofdocumentsUncheckbox(getverifydocumentsUncheckbox());
}

//verify if one of the subtask is selected from documents then documents check box  is half check. 

@Then("verify the doucments check box is half checked")
public void verify_the_doucments_check_box_is_half_checked() throws IOException {
    logger.info("verify the documents check box status is half check");
    cb.verifythestatusofdocumentsHalfcheckbok(getverifydocmnetsHalfcheckbox());
}



//verify the downloads sub task
@Then("Expand the Downloads checkbox")
public void expand_the_downloads_checkbox() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,100)","");
   logger.info("click on downloads toggels");
   cb.clickondownloadstoggels();
   Thread.sleep(4000);
}
@Then("verify all the sub task are present in downloads check box.")
public void verify_all_the_sub_task_are_present_in_downloads_check_box() throws IOException {
   logger.info("verify all the sub task present in downloads");
   String ar[]=getverifydownloadssubtask();
   cb.verifythesubtaskpresentindownloads(ar);
}


//verify wordfile

@Then("click on Word File.doc checkbox")
public void click_on_word_file_doc_checkbox() throws InterruptedException {
   logger.info("click on word file check box");
   cb.clickonwordfilecheckbox();
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,100)", "");
   Thread.sleep(4000);
}
@Then("verify the word file check box is checked")
public void verify_the_word_file_check_box_is_checked() throws IOException {
	logger.info("verify the word file check box status is checked");
	cb.verifythestatusofwordfilecheckbox(getverifywordfilecheckbox());
    
}
@Then("verify the word file check box name is present in report")
public void verify_the_word_file_check_box_name_is_present_in_report() throws IOException {
 logger.info("verify the word file check box name present in report");
 cb.verifywordfilechecknamepresentinreport(getverifywordfilecheckboxtext());
}

//verify excelfile

@Then("click on Excel file checkbox")
public void click_on_excel_file_checkbox() throws InterruptedException {
    logger.info("click on Excel file checkbox");
    cb.clickonexcelfilecheckbox();
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,100)","");
    Thread.sleep(4000);
}
@Then("verify the excel file check box is checked")
public void verify_the_excel_file_check_box_is_checked() throws IOException {
    logger.info("verify the excel check box status is checked");
    cb.verifythestatusofexcelfilecheckbox(getverifyexcelfilecheckbox());
}
@Then("verify the excel file checkbox name is present in report")
public void verify_the_excel_file_checkbox_name_is_present_in_report() throws IOException {
	logger.info("verify excel file check box name is present in report");
	cb.verifyexcelfilecheckboxnamepresentinreport(getverifyexcelfilecheckboxtext());
   
}

//verify if one of the sub task is checked from downloads then downloads check box status is half checked 



@Then("verify the downloads check box is half checked")
public void verify_the_downloads_check_box_is_half_checked() throws IOException {
    logger.info("verify the downloads check box is status is Half checked");
    String s=getverifydownloadsHalfcheckbox();
    cb.verifythestatusofdownloadshalfcheckbox(s);
}

//verify if all sub task present in downloads are checked then downloads status is checked.
@Then("verify the downloads check box is checked")
public void verify_the_downloads_check_box_is_checked() throws IOException {
   logger.info("verify the downloads check box status is checked");
   cb.verifythestatusofdownloadscheckbox(getverifydownloadscheckbox());
}
@Then("verify all the checked box name is present in report")
public void verify_all_the_checked_box_name_is_present_in_report() throws IOException {
    logger.info("verify all the checked box name is present in report");
    String ar[]=getverifyallcheckedboxnameinreport();
    cb.verifyallcheckedboxnamedownloadspresentinreport(ar);
}

//verify if downloads check box is unchecked then all sub task present in it is unchecked.

@Then("verify the downloads check box is unchecked")
public void verify_the_downloads_check_box_is_unchecked() throws IOException {
   logger.info("verify the downloads check box status is unchecked");
   cb.verifythestatusofdownloadsUncheckedbox(getverifydownloadsUncheckedbox());
}
@Then("verify the word file check box is unchecked")
public void verify_the_word_file_check_box_is_unchecked() throws IOException {
    logger.info("verify the word file check box status is unchecked");
    cb.verifythestatusofwordfileUncheckedbox(getverifywordfileUncheckedbox());
}
@Then("verify the excel file check box is unchecked")
public void verify_the_excel_file_check_box_is_unchecked() throws IOException {
   logger.info("verify the excel file check box status is unchecked");
   cb.verifythestatusofexcelfileUncheckedbox(getverifyexcelfileUncheckedbox());
}

//verify if one of the sub task is checked from Desktops then desktop check box is Half checked

@Then("verify Desktop check box is half checked")
public void verify_desktop_check_box_is_half_checked() throws IOException {
	logger.info("verify the desktop check box status is half check");
  cb.verifythestatusofdesktophalfcheckedbox(getverifydesktophalfcheckedbox()); 
}

//verify if one of the sub task is checked from home page then home check box is half checked

@Then("click on Downloads checkbox")
public void click_on_downloads_checkbox() {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,50)","");
   logger.info("click on downloads check box");
   cb.clickondownloadscheckbox();
}
@Then("verify the home check box is half checked.")
public void verify_the_home_check_box_is_half_checked() throws IOException {
	logger.info("verify the home check box status is half checked");
	cb.verifythestatusofhomehalfcheckbox(getverifyhomehalfcheckedbox());
    
}
//verify if home check box is unchecked then all the sub task present in it is unchecked.

@Then("verify the desktop check box is unchecked")
public void verify_the_desktop_check_box_is_unchecked() throws IOException {
   logger.info("verify the desktop check box status is unchecked");
   cb.verifythestatusofdesktopUnchekedbox(getverifydesktopUncheckedbox());
}
@Then("verify the home check box is unchecked")
public void verify_the_home_check_box_is_unchecked() throws IOException {
    logger.info("verify the home check box status is unchecked");
    cb.verifythestatusofhomeUnchekedboc(getverifyhomeUncheckedbox());
}

//verify if one of the sub task is checked from workspace then workspace check box is half checked



@Then("verify the workspace check box is half checked")
public void verify_the_workspace_check_box_is_half_checked() throws IOException {
    logger.info("verify the workspace check box status is half checked");
    cb.verifythestatusofworkspacehalfcheckedbox(getverifyworkspacehalfcheckedbox());
}

//verify if one of the sub task is checked from office then office check box is half checked 


@Then("verify the office check box is half checked")
public void verify_the_office_check_box_is_half_checked() throws IOException {
	logger.info("verify the office check box status is half checked");
    cb.verifythestatusofofficehalfcheckbox(getverifyofficehalfcheckedbox());
}



//Radio button
@Then("click on Radio Button button")
public void click_on_radio_button_button() throws InterruptedException {
    rb=new RadioButtonpage(driver);
    logger.info("first scroll the page");
    js.executeScript("window.scrollBy(0,100)","");
    logger.info("click on radio button button");
    rb.clickonradiobutton();
    Thread.sleep(4000);
}
@Then("verify the Radio Button text present in Elements Page")
public void verify_the_radio_button_text_present_in_elements_page() throws IOException {
	logger.info("verify the radio button text in Elements page");
    rb.verifytherediobuttontext(getverifyradiobuttontext());
}

//verify the yes radio button


@Then("click on yes radio button")
public void click_on_yes_radio_button() throws InterruptedException {
	logger.info("click on yes radio button");
   rb.clickonyesradiobutton();
   Thread.sleep(4000);
}
@Then("verify the yes text is present after you have selected")
public void verify_the_yes_text_is_present_after_you_have_selected() throws IOException {
	logger.info("verify the yes text present in you have selcted:");
    rb.verifytheyesradiobuttontext(getverifyyesradiobutton());
}

//verify impresive radio button



@Then("click on impresive radio button")
public void click_on_impresive_radio_button() throws InterruptedException {
	logger.info("impresive radio button");
   rb.clickonimpressivebutton();
   Thread.sleep(4000);
}
@Then("verify the impressive text is present after you have selected text")
public void verify_the_impressive_text_is_present_after_you_have_selected_text() throws IOException {
	logger.info("verify the impresive text present after you have selected text");
    rb.verifytheimpresivebuttontext(getverifyimpresiveradiobutton());
}

//Web Table

@Then("click on Web Table button")
public void click_on_web_table_button() throws InterruptedException {
	wb=new WebTablepage(driver);
    logger.info("scroll the page");
    js.executeScript("window.scrollBy(0,160)","");
    logger.info("click on webtable");
    wb.clickonwebtable();
    Thread.sleep(4000);
}

@Then("verify the web table text present in Elements page")
public void verify_the_web_table_text_present_in_elements_page() throws IOException {
    logger.info("verify the web table text present in elements page");
    wb.verifythewebtabletextpresent(getverifywebtabelstext());
}
//add button work
@Then("click on Add button")
public void click_on_add_button() throws InterruptedException {
    logger.info("click on add button");
    wb.clickonaddbutton();
    Thread.sleep(4000);
}
@Then("Enter First name")
public void enter_first_name() throws InterruptedException, IOException {
    logger.info("enter first name");
    wb.filltheFirstName(getfirstname());
    Thread.sleep(4000);
}
@Then("Enter Last name")
public void enter_last_name() throws InterruptedException, IOException {
   logger.info("enter last name");
   wb.filltheLastName(getlastname());
   Thread.sleep(4000);
}
@Then("Enter Email id")
public void enter_email_id() throws InterruptedException, IOException {
	logger.info("enter the emailid");
   wb.filltheEmailId(getEmailId());
   Thread.sleep(4000);
}
@Then("Enter Age")
public void enter_age() throws InterruptedException, IOException {
	logger.info("enter the age");
    wb.filltheAge(getage());
    Thread.sleep(4000);
}
@Then("Enter Salary")
public void enter_salary() throws InterruptedException, IOException {
	logger.info("enter the salary");
    wb.fillthesalary(getsalary());
    Thread.sleep(4000);
}
@Then("Enter Department")
public void enter_department() throws InterruptedException, IOException {
   logger.info("enter the department");
   wb.fillthedepartment(getdepartment());
   Thread.sleep(4000);
}
@Then("click on sumbit")
public void click_on_sumbit() throws InterruptedException {
	logger.info("Full scren page");
	driver.manage().window().fullscreen();
   logger.info("click on submit button");
   wb.clickonsumbit();
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,100)","");
 Thread.sleep(4000);
 
}
@Then("verify his\\/her First name present in First name  column")
public void verify_his_her_first_name_present_in_first_name_column() throws InterruptedException, IOException {
    logger.info("verify the first name present in first name column");
    wb.verifytheFirstName(getfirstname());
    
}
@Then("verify his\\/her Last name present in last name column")
public void verify_his_her_last_name_present_in_last_name_column() throws InterruptedException, IOException {
   logger.info("verify the Last name present in last name coloum");
   wb.verifytheLastName(getlastname());
  
}
@Then("verify his\\/her Email id  present in Email id column")
public void verify_his_her_email_id_present_in_email_id_column() throws InterruptedException, IOException {
    logger.info("verify the emailid present in email id column");
    wb.verifytheEmailid(getemail());
    
}
@Then("verify his\\/her Age present in Age column")
public void verify_his_her_age_present_in_age_column() throws InterruptedException, IOException {
   logger.info("verify the age present in age column");
   wb.verifytheAge(getage());
  
}
@Then("verify his\\/her Salary present in salary column")
public void verify_his_her_salary_present_in_salary_column() throws InterruptedException, IOException {
	logger.info("verify the salary present in salary column");
   wb.verifytheSalary(getsalary());
  
}
@Then("verify his\\/her Department name presnt in Department column.")
public void verify_his_her_department_name_presnt_in_department_column() throws IOException {
	logger.info("verify the department present in department column");
	wb.verifythedepartment(getdepartment());
    
}

//search name
@Then("enter first first three later of someones name")
public void enter_first_first_three_later_of_someones_name() throws InterruptedException, IOException {
   logger.info("Enter first three letter of name");
   wb.sendvaluestosearch(getsearchname());
   Thread.sleep(4000);
}
@Then("verify your searching name is present in table names")
public void verify_your_searching_name_is_present_in_table_names() throws IOException {
    logger.info("verify your searching name is present in table");
    wb.verifythename(getfirstname());
}

//customize the rows

@Then("select the rows from row button")
public void select_the_rows_from_row_button() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,600)", "");
    logger.info("select the rows from row button");
    wb.clickonrows();
    Thread.sleep(4000);
}
@Then("verify the number of rows in table is same as you selected rows")
public void verify_the_number_of_rows_in_table_is_same_as_you_selected_rows() {
 logger.info("verify the rows number present in table is same as you selected rows from row table");  
 wb.verifyrows();
}
//verify the pages

@Then("fill the fullname {string}")
public void fill_the_fullname(String string) throws InterruptedException {
	logger.info("fill the firstname");
    wb.filltheFirstName(string);
    Thread.sleep(2000);
}
@Then("fill the lastname {string}")
public void fill_the_lastname(String string) throws InterruptedException {
	logger.info("fill the lastname");
   wb.filltheLastName(string);
   Thread.sleep(2000);
}
@Then("fill the email {string}")
public void fill_the_email(String string) throws InterruptedException {
	logger.info("fill the email");
    wb.filltheEmailId(string);
    Thread.sleep(2000);
}

@Then("fill the age {string}")
public void fill_the_age(String string) throws InterruptedException {
	logger.info("fill the age");
    wb.filltheAge(Integer.parseInt(string));
    Thread.sleep(2000);
}
@Then("fill the salary {string}")
public void fill_the_salary(String string) throws InterruptedException {
    logger.info("fill the salary");
    wb.fillthesalary(Integer.parseInt(string));
    Thread.sleep(2000);
}
@Then("fill the department {string}")
public void fill_the_department(String string) throws InterruptedException {
   logger.info("fill the department");
   wb.fillthedepartment(string);
   Thread.sleep(2000);
}

@Then("verify the page number")
public void verify_the_page_number() {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,600)","");
	logger.info("verify the total page");
   wb.verifythetotalpage();
}

//verify the edit button
@Then("enter search name in search box")
public void enter_search_name_in_search_box() throws InterruptedException, IOException {
	logger.info("enter three letter in search box");
    wb.typeinsearchbox(getname());
    Thread.sleep(2000);
}
@Then("click on edit button")
public void click_on_edit_button() {
	logger.info("scroll the page");
	js.executeScript("scrollBy(0,50)", "");
	logger.info("click on edit button");
    wb.clickoneditbutton();
    
}
@Then("edit the name")
public void edit_the_name() throws IOException {
    logger.info("edit the fullname");
    wb.edit_the_fristname(geteditname());
}
@Then("verify edit name present in table")
public void verify_edit_name_present_in_table() {
    logger.info("verify the edit name and table is same");
    wb.verify_the_firstname();
}

@Then("go to the next page through enter the page number")
public void go_to_the_next_page_through_enter_the_page_number() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
    logger.info("Go to next page");
    wb.Enterthepagenumber();
    Thread.sleep(5000);
}
@Then("click on delete button")
public void click_on_delete_button() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,50)","");
   logger.info("click on delete button");
   wb.clickondeletebutton();
   Thread.sleep(4000);
   
}
@Then("verify delete name do not present in table")
public void verify_delete_name_do_not_present_in_table() throws IOException {
    logger.info("verify the delele name have not present in table");
    wb.verifythedeletenamenotpresentintable(getverifydeletename());
}

//verify Buttons Text 

@Then("click on Buttons button")
public void click_on_buttons_button() {
	bp=new Buttonspage(driver);
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,250)","");
   logger.info("click on button");
   bp.clickonbutton();
   
}
@Then("verify the button text present in elements page")
public void verify_the_button_text_present_in_elements_page() throws IOException {
    logger.info("verify the button text");
    bp.verifybuttonstext(getverifybuttonstext());
}

//verify double click button
@Then("clcik on Double click me button")
public void clcik_on_double_click_me_button() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,50)","");
	bp.clickondubleclickbutton(driver);
	Thread.sleep(4000);
}

@Then("verify the double click text in report")
public void verify_the_double_click_text_in_report() throws IOException {
    logger.info("verify the double click text in report");
    bp.verifythetextdoubleclick(getverifydoubleclicktext());
}

//verify right click
@Then("click on Right click button")
public void click_on_right_click_button() throws InterruptedException {
	js.executeScript("window.scrollBy(0,55)", "");
    logger.info("click on right click button");
    bp.clickonrightclickbutton(driver);
    Thread.sleep(4000);
}
@Then("verify the right click text in report")
public void verify_the_right_click_text_in_report() throws IOException {
    logger.info("verify the right text in report");
    bp.verifythetextrightclickbutton(getverifyrightclicktext());
}

//verify the click me text
@Then("click on Click Me button")
public void click_on_click_me_button() throws InterruptedException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,60)", "");
    logger.info("click on click me button");
    bp.clickonclickmebutton(driver);
    Thread.sleep(4000);
}
@Then("verify the click me text in report")
public void verify_the_click_me_text_in_report() throws IOException {
    logger.info("verify the click me text");
    bp.verifytheclickmetextinreport(getverifyclickmetext());
}



@AfterAll
public static void setDown() {
	  	
	/*
	 * if (scenario.isFailed()) { // Take byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES);
	 * scenario.attach(screenshot,"image/png", scenario.getName());
	 * 
	 * }
	 */
 		driver.close();
 
  
  
  
  }
  
 
 
  
 
}
