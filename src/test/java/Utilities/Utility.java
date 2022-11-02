package Utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Utility {
public Properties pp;
public FileInputStream File;
	
	
	public String getUrl() throws IOException {
		File=new FileInputStream("C:\\Users\\gulu satapathy\\java-selenium\\QAAutomation\\Propertiesfiles\\Utility.properties");
		pp=new Properties();
		pp.load(File);
		
		return pp.getProperty("url");
		
	}
	public String getFullname() {
		return pp.getProperty("Fullname");
	}
	public String getEmailId() {
		return pp.getProperty("Emailid");
		
	}
	public String getCurrentaddress() {
		return pp.getProperty("Currentaddress");
	
	}
	public String getPermanentaddress() {
		return pp.getProperty("Permanentaddress");
	}
	public String getonlyFullname() {
		return pp.getProperty("onlyFullname");
	}
	public String getonlyEmailid() {
		return pp.getProperty("onlyEmailid");
	}
	public String getonlyCurrentAddress() {
		return pp.getProperty("onlyCurrentAddress");
	}
	public String getonlyPermanentAddress() {
		return pp.getProperty("onlyPermanentAddress");
	}
	public String getverifyElementText() {
		return pp.getProperty("ElementText");
	}
	public String getverifyTextboxText() {
		return pp.getProperty("TextBoxText");
	}
	public String getverifyToolsQaText() {
		return pp.getProperty("toolsQAText");
	}
	public String getFullnameOnlyNumbers() {
		return pp.getProperty("Fullnameonlynumber");
	}
	public String getCurrentAddressonlynumbers() {
		return pp.getProperty("Currentaddressonlynumber");
	}
	public String getcurrentaddressonlySpecialcharecter() {
		return pp.getProperty("Currentaddressonlyspecialcharecter");
	}
	public String getcurrentaddressbothnumandchar() {
		return pp.getProperty("currentaddressbothcharecterandnumber");
	}
	public String getcurrentAddressbothnumberandcharecter() {
		return pp.getProperty("currentaddressbothnumbercharecter");
	}
	public String getpermanentAddressonlynumber() {
		return pp.getProperty("permanentaddressonlynumber");
	}
	public String getpermanentAddressbothcharandnum() {
		return pp.getProperty("permanetaddressbothcharandnum");
	}
	public String getpermanentAddressbothnumandchar() {
		return pp.getProperty("permanentaddressbothnumandchar");
	}
	public String getpermanentAddressonlyspecialch() {
		return pp.getProperty("permanentaddressonlyspecialch");
	}
	public String getCheckBoxText() {
		return pp.getProperty("CheckBoxText");
	}
	
	public String getHomeBoxName() {
		return pp.getProperty("HomeBox");
	}
	public String[] getSubnodename() {
		String node=pp.getProperty("subnodes"); 
		String arr[]=node.split(",");
		return arr;
	}
	public String getNotename()
	{
		return pp.getProperty("notesreportvalue");
	}
	
	public String getverifynotecheckbox() {
		return pp.getProperty("Value");
	}
	
	public String getCommandscheckBoxName() {
		return pp.getProperty("verifycommandsvalue");
	}
	
	public String getverifycommandscheckboxstatus() {
		return pp.getProperty("Value");
	}
	
	public String getverifythedesktopcheckboxstatus() {
		return pp.getProperty("Value");
	}
	
	public String[] getverifyallcheckboxtext() {
		String node=pp.getProperty("Checkallcheckboxvalues");
		String arr[]=node.split(",");
		return arr;
	}
	
	public String getverifyunselectcheckbox() {
		return pp.getProperty("value");
	}
	
	
	
	
	
	
	
	
	
	
}
