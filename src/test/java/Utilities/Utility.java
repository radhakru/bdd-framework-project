package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public Properties pp;
	public FileInputStream file;
	public FileInputStream utility() throws IOException{
 file=new FileInputStream("C:\\Users\\gulu satapathy\\java-selenium\\QAAutomation\\Propertiesfiles\\Utility.properties");
 return file;
	}
	public void loadproperties() throws IOException {
		pp=new Properties();
		
		//change utility()
		pp.load(utility());
		
	}
	
	public String getReportforconfig() throws IOException{
		loadproperties();
		String reportpath=pp.getProperty("ReportConfig");
		if(reportpath != null) {
			return reportpath;
		}
		else throw new RuntimeException("Report Config Path not specified in the utility.properties file for the Key:ReportConfig");
		
	}
	
	
	
	public String getUrl() throws IOException {
		loadproperties();
		return pp.getProperty("url");
		
	}
	public String getFullname() throws IOException {
		loadproperties();
		return pp.getProperty("Fullname");
	}
	public String getEmailId() throws IOException {
		loadproperties();
		return pp.getProperty("Emailid");
		
	}
	public String getCurrentaddress() throws IOException {
		loadproperties();
		return pp.getProperty("Currentaddress");
	
	}
	public String getPermanentaddress() throws IOException {
		loadproperties();
		return pp.getProperty("Permanentaddress");
	}
	public String getonlyFullname() throws IOException {
		loadproperties();
		return pp.getProperty("onlyFullname");
	}
	public String getonlyEmailid() throws IOException {
		loadproperties();
		return pp.getProperty("onlyEmailid");
	}
	public String getonlyCurrentAddress() throws IOException {
		loadproperties();
		return pp.getProperty("onlyCurrentAddress");
	}
	public String getonlyPermanentAddress() throws IOException {
		loadproperties();
		return pp.getProperty("onlyPermanentAddress");
	}
	public String getverifyElementText() throws IOException {
		loadproperties();
		return pp.getProperty("ElementText");
	}
	public String getverifyTextboxText() throws IOException {
		loadproperties();
		return pp.getProperty("TextBoxText");
	}
	public String getverifyToolsQaText() throws IOException {
		loadproperties();
		return pp.getProperty("toolsQAText");
	}
	public String getFullnameOnlyNumbers() throws IOException {
		loadproperties();
		return pp.getProperty("Fullnameonlynumber");
	}
	public String getCurrentAddressonlynumbers() throws IOException {
		loadproperties();
		return pp.getProperty("Currentaddressonlynumber");
	}
	public String getcurrentaddressonlySpecialcharecter() throws IOException {
		loadproperties();
		return pp.getProperty("Currentaddressonlyspecialcharecter");
	}
	public String getcurrentaddressbothnumandchar() throws IOException {
		loadproperties();
		return pp.getProperty("currentaddressbothcharecterandnumber");
	}
	public String getcurrentAddressbothnumberandcharecter() throws IOException {
		loadproperties();
		return pp.getProperty("currentaddressbothnumbercharecter");
	}
	public String getpermanentAddressonlynumber() throws IOException {
		loadproperties();
		return pp.getProperty("permanentaddressonlynumber");
	}
	public String getpermanentAddressbothcharandnum() throws IOException {
		loadproperties();
		return pp.getProperty("permanetaddressbothcharandnum");
	}
	public String getpermanentAddressbothnumandchar() throws IOException {
		loadproperties();
		return pp.getProperty("permanentaddressbothnumandchar");
	}
	public String getpermanentAddressonlyspecialch() throws IOException {
		loadproperties();
		return pp.getProperty("permanentaddressonlyspecialch");
	}
	public String getCheckBoxText() throws IOException {
		loadproperties();
		return pp.getProperty("CheckBoxText");
	}
	
	public String getHomeBoxName() throws IOException {
		loadproperties();
		return pp.getProperty("HomeBox");
	}
	public String[] getSubnodename() throws IOException {
		loadproperties();
		String node=pp.getProperty("subnodes"); 
		String arr[]=node.split(",");
		return arr;
	}
	public String getNotename() throws IOException
	{
		loadproperties();
		return pp.getProperty("notesreportvalue");
	}
	
	public String getverifynotecheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	
	public String getCommandscheckBoxName() throws IOException {
		loadproperties();
		return pp.getProperty("verifycommandsvalue");
	}
	
	public String getverifycommandscheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	
	public String getverifythedesktopcheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	
	public String[] getverifyallcheckboxtext() throws IOException {
		loadproperties();
		String node=pp.getProperty("Checkallcheckboxvalues");
		String arr[]=node.split(",");
		return arr;
	}
	
	public String getverifyunselectcheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	
	public String[] getvalue() throws IOException
	{
		loadproperties();
		String s= pp.getProperty("name");
		String arr[]=s.split(",");
		return arr;
	}
	public String[] getsubtaskofworkspace() throws IOException {
		loadproperties();
		String s=pp.getProperty("subtextofworkspace");
		String[] arr=s.split(",");
		return arr;
	}
	public String[] getsubtaskofoffice() throws IOException {
		loadproperties();
		String s=pp.getProperty("subtextofoffice");
		String arr[]=s.split(",");
		return arr;
	}
	public String getverifyreactcheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyreacttextinreport() throws IOException {
		loadproperties();
		return pp.getProperty("verifyreacttext");
	}
	
	public String getverifyangularcheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyangulartextinreport() throws IOException {
		loadproperties();
		return pp.getProperty("verifyangulartext");
	}
	public String getverifyveucheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyveutextinreport() throws IOException {
		loadproperties();
		return pp.getProperty("verifyveutext");
	}
	public String getverifyworkspacestatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String[] getverifyworkspaceCheckedboxtextinreport() throws IOException {
		loadproperties();
		String s=pp.getProperty("verifyworkspaceChecked");
		String arr[]=s.split(",");
		return arr;
	}
	public String getverifyreactuncheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyangularuncheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyveuuncheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyworkspaceuncheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifypubliccheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifypubliccheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifypublictext");
	}
	public String getverifyprivatecheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyprivatecheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifyprivatetext");
	}
	public String getverifyclassifiedcheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyclassifiedcheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifyclassifiedtext");
	}
	public String getverifygeneralcheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifygeneralcheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifygeneraltext");
	}
	public String getverifyofficecheckboxstatus() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String[] getverifyofficecheckboxtext() throws IOException {
		loadproperties();
		String s=pp.getProperty("verifyofficeChecked");
		String []arr=s.split(",");
		return arr;
	}
	public String getverifyofficeUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifypublicUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");	
	}
	public String getverifyclassifiedUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyprivateUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifygeneralUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifydocumentscheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifydocumentscheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifyonlydocumnettext");
		
	}
	public String getverifydocumentsUncheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifydocmnetsHalfcheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String[] getverifydownloadssubtask() throws IOException {
		loadproperties();
		String s=pp.getProperty("subtaskvalueofdownloads");
		String arr[]=s.split(","); 
		return arr;
	}
	public String getverifywordfilecheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifywordfilecheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifywordfiletext");
	}
	public String getverifyexcelfilecheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String getverifyexcelfilecheckboxtext() throws IOException {
		loadproperties();
		return pp.getProperty("verifyexceltext");
	}
	public String getverifydownloadsHalfcheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String getverifydownloadscheckbox() throws IOException {
		loadproperties();
		return pp.getProperty("Value");
	}
	public String[] getverifyallcheckedboxnameinreport() throws IOException {
		loadproperties();
		String s= pp.getProperty("verifydownloadChecked");
		String arr[]=s.split(",");
		return arr;
	}
	public String getverifydownloadsUncheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifywordfileUncheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyexcelfileUncheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifydesktophalfcheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String getverifyhomehalfcheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String getverifydesktopUncheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyhomeUncheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("value");
	}
	public String getverifyworkspacehalfcheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String getverifyofficehalfcheckedbox() throws IOException {
		loadproperties();
		return pp.getProperty("valueHalf");
	}
	public String getverifyradiobuttontext() throws IOException {
		loadproperties();
		return pp.getProperty("verifytheradiobuttontext");
	}
	public String getverifyyesradiobutton() throws IOException {
		loadproperties();
		return pp.getProperty("verifyyesradiotext");
	}
	public String getverifyimpresiveradiobutton() throws IOException {
		loadproperties();
		return pp.getProperty("verifyimpresiveradiotext");
	}
	public String getverifywebtabelstext() throws IOException {
		loadproperties();
		return pp.getProperty("webTabletext");
	}
	public String getfirstname() throws IOException {
		loadproperties();
		return pp.getProperty("firstname");
	}
	public String getlastname() throws IOException {
		loadproperties();
		return pp.getProperty("secondname");
	}
	public String getemail() throws IOException {
		loadproperties();
		return pp.getProperty("email");
	}
	public int getage() throws IOException {
		loadproperties();
		String s=pp.getProperty("age");
		int a=Integer.parseInt(s);
		return a;
	}
	public int getsalary() throws IOException {
		loadproperties();
		String s=pp.getProperty("salary");
		int a=Integer.parseInt(s);
		return a;
	}
	public String getdepartment() throws IOException {
		loadproperties();
		return pp.getProperty("department");
	}
	public String getsearchname() throws IOException {
		loadproperties();
		return pp.getProperty("searchnamebox");
	}
	public String getname() throws IOException {
		loadproperties();
		return pp.getProperty("searchname");
	}
	public String geteditname() throws IOException {
		loadproperties();
		return pp.getProperty("editname");
	}
	public String getverifydeletename() throws IOException {
		loadproperties();
		return pp.getProperty("deletename");
	}
	public String getverifybuttonstext() throws IOException {
		loadproperties();
		return	pp.getProperty("buttontext");
	}
	public String getverifydoubleclicktext() throws IOException {
		loadproperties();
		return	pp.getProperty("doubleclicktext");
	}
	public String getverifyrightclicktext() throws IOException {
		loadproperties();
		return pp.getProperty("rightclicktext");
		
	}
	public String getverifyclickmetext() throws IOException {
		loadproperties();
		return pp.getProperty("clickmetext");
	}
	public String getverifylinktext() throws IOException {
		loadproperties();
		return pp.getProperty("verifythelinktext");
	}
	public String getverifytheHomelink() throws IOException {
		loadproperties();
		return pp.getProperty("verifyhomelink");
	}
	public String getverifycreated_status() throws IOException {
		loadproperties();
		return pp.getProperty("verifystatusnumberofcreated");
	}
	public String getverifynocontent_status() throws IOException {
		loadproperties();
		return pp.getProperty("verifystatusnumberofnocontent");
	}
	public String getverifymoved_status() throws IOException {
		loadproperties();
		return pp.getProperty("verifystatusnumberofmoved");
	}
	public String getverifybadrequest_status() throws IOException {
		loadproperties();
		return pp.getProperty("verifystatusnumberofbadrequest");
	}
	public String getverifyunauthorized_status() throws IOException{
		loadproperties();
		return pp.getProperty("verifystatusnumberofunauthorized");
	}
	public String getverifyforbidden_status() throws IOException {
		loadproperties();
		return pp.getProperty("verifystatusnumberofforbidden");
	}
	public String getverifynotfound_status() throws IOException{
		loadproperties();
		return pp.getProperty("verifystatusnumberofnotfound");
	}
	public String getverifybrokenlinkimagetext() throws IOException
	{
		loadproperties();
		return pp.getProperty("verifybrokenlinkimagetext");
	}
	public String getuploadfile() throws IOException {
		loadproperties();
		return pp.getProperty("uploadfile");	
	}
	public String getverify_file_path() throws IOException {
		loadproperties();
		return pp.getProperty("verifyfile");
	}
	public String getverifydynamicpropertiestext() throws IOException {
		loadproperties();
		return pp.getProperty("verifydyanmicpropertiestext");
		
	}
	public String getverifyFormsText() throws IOException{
		loadproperties();
		return pp.getProperty("verifyformstext");
	}
	public String getverifyPracticeFormtext() throws IOException{
		loadproperties();
		return pp.getProperty("verifypracticeformtext");
	}
	public String getsubject() throws IOException {
		loadproperties();
		return pp.getProperty("Subject");
	}
	public String getfile() throws IOException {
		loadproperties();
		return pp.getProperty("file");
	}
	public String getverifytextofAlertFramesandWindows() throws IOException {
		loadproperties();
		return pp.getProperty("AlertFrameWindowstext");
	}
	public String getverifybrowserswindowstext() throws IOException{
		loadproperties();
		return pp.getProperty("browserwindowtext");
	}
	public String getverifythebodyofnewwindow() throws IOException{
		loadproperties();
		return pp.getProperty("Bodyname");
	}
	public String getverifynewwindowsmessagetext() throws IOException{
		loadproperties();
		return pp.getProperty("messagetext");
	}
	public String getverifyalertstext()throws IOException {
		loadproperties();
		return pp.getProperty("alertvalidtext");
	}
	public String[] getalerttext() throws IOException{
		loadproperties();
		String s=pp.getProperty("alerttexts");
		String alert[]=s.split(",");
		return alert;
	}
	public String gettext() throws IOException {
		loadproperties();
		return pp.getProperty("selectedtextforconfirmbox");
	}
	public String getpromptedalerttext() {
			return pp.getProperty("Promptedalertboxtext");
	}
	
	public String getiframetext() throws IOException {
		loadproperties();
		return pp.getProperty("parentiframetext");
	}
	
	
}
