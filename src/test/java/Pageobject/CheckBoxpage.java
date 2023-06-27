package Pageobject;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxpage  {

	public WebDriver ldriver;
	public CheckBoxpage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	int leng;
	
	By Checkboxbutton=By.xpath("//*[contains(text(),'Check Box')]");
	By Homeboxbutton=By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']");
	By ExpandButton=By.xpath("//button[@aria-label='Expand all']");
	By CollapseButton=By.xpath("//button[@class='rct-option rct-option-collapse-all']");
	By AllElements=By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']/ol");
	By HomeboxToggle=By.xpath("//button[@class='rct-collapse rct-collapse-btn']");
	By NotecheckBox=By.xpath("//label[@for='tree-node-notes']/descendant::span[1]");
	By CommandsBox=By.xpath("//label[@for='tree-node-commands']/child::span[1]"); 
	By Desktopbox=By.xpath("//label[@for='tree-node-desktop']/child::span[1]");
	By DocumentsToggel=By.xpath("(//span[@class='rct-text']/child::button[1])[3]");
	By workspaceToggel=By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/button)[2]"); 
	By officeToggel=By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/button)[3]");
	By reactcheckbox=By.xpath("//label[@for='tree-node-react']/span[@class='rct-checkbox']");
	By angularcheckbox=By.xpath("//label[@for='tree-node-angular']/span[@class='rct-checkbox']");
	By veucheckbox=By.xpath("//label[@for='tree-node-veu']/span[@class='rct-checkbox']");
	By publiccheckbox=By.xpath("//label[@for='tree-node-public']/span[@class='rct-checkbox']");
	By privatecheckbox=By.xpath("//label[@for='tree-node-private']/span[@class='rct-checkbox']");
	By classifiedcheckbox=By.xpath("//label[@for='tree-node-classified']/span[@class='rct-checkbox']");
	By generalcheckbox=By.xpath("//label[@for='tree-node-general']/span[@class='rct-checkbox']");
	By workspacecheckbox=By.xpath("//label[@for='tree-node-workspace']/span[@class='rct-checkbox']");
	By officecheckbox=By.xpath("//label[@for='tree-node-office']/span[@class='rct-checkbox']");
	By downloadstoggel=By.xpath("(//span[@class='rct-text']/button[@class='rct-collapse rct-collapse-btn'])[4]");
	By wordfilecheckbox=By.xpath("(//label[@for='tree-node-wordFile']/span/*[name()='svg'])[1]");
	By excelfilecheckbox=By.xpath("//label[@for='tree-node-excelFile']/span[@class='rct-checkbox']");
	By downloadscheckbox=By.xpath("//label[@for='tree-node-downloads']/span[@class='rct-checkbox']");
	
	By Homeboxsubtaxt=By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/label/span[@class='rct-title']");
	By DesktopToggle=By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/button[@type='button'])[1]");
	By SubnodeofDesktop=By.xpath("//li[@class='rct-node rct-node-leaf']/span/label/span[@class='rct-title']");
	By resultBox=By.xpath("//div[@id='result']/span[@class]");
	By checkboxText=By.xpath("//div[@class='main-header']");
	By verifyNoteCheckBox=By.xpath("(//span[@class='rct-checkbox']/*[name()='svg'])[3]");
	By commandsCheck=By.xpath("//label[@for='tree-node-commands']/child::span[1]/*[name()='svg']");
	By Desktopcheckbox=By.xpath("//label[@for='tree-node-desktop']/descendant::span[1]/*[name()='svg']");
	//By onlyresulttext=By.xpath("//div[@id='result']/child::span[@class]");
	By verifyresulttext=By.xpath("//div[@class='check-box-tree-wrapper']/div[@id]");
	By Documentssubtask=By.xpath("(//li[@class='rct-node rct-node-parent rct-node-expanded']/child::ol)[2]/child::li/span/label/span[3]");
	By workspacesubtext=By.xpath("//li[@class='rct-node rct-node-leaf']/span/label/span[3]");
	By officesubtext=By.xpath("//li[@class='rct-node rct-node-leaf']/span/label/span[3]");
	By verifyreactcheckboxstatus=By.xpath("(//label[@for='tree-node-react']/span/*[name()='svg'])[1]");
	By verifyangularcheckboxstatus=By.xpath("(//label[@for='tree-node-angular']/span/*[name()='svg'])[1]");
	By verifyveucheckboxstatus=By.xpath("(//label[@for='tree-node-veu']/span/*[name()='svg'])[1]");
	By verifyworkspacecheckboxstatus=By.xpath("(//label[@for='tree-node-workspace']/span/*[name()='svg'])[1]");
	By verifypubliccheckboxstatus=By.xpath("(//label[@for='tree-node-public']/span/*[name()='svg'])[1]");
	By verifyprivatecheckboxstatus=By.xpath("(//label[@for='tree-node-private']/span/*[name()='svg'])[1]");
	By verifyclassifiedcheckboxstatus=By.xpath("(//label[@for='tree-node-classified']/span/*[name()='svg'])[1]");
	By verifygeneralcheckboxstatus=By.xpath("(//label[@for='tree-node-general']/span/*[name()='svg'])[1]");
	By verifyofficecheckboxstatus=By.xpath("(//label[@for='tree-node-office']/span/*[name()='svg'])[1]");
	By verifydocumentscheckbox=By.xpath("(//label[@for='tree-node-documents']/span/*[name()='svg'])[1]");
	By verifythedownloadssubtask=By.xpath("//li[@class='rct-node rct-node-leaf']/span/label/span[3]");
	By verifywordfilecheckbox=By.xpath("(//label[@for='tree-node-wordFile']/span/*[name()='svg'])[1]");
	By verifyexcelfilecheckbox=By.xpath("(//label[@for='tree-node-excelFile']/span/*[name()='svg'])[1]");
	By verifydownloadscheckbox=By.xpath("(//label[@for='tree-node-downloads']/span/*[name()='svg'])[1]");
	By verifyhomecheckboxstatus=By.xpath("(//label[@for='tree-node-home']/span/*[name()='svg'])[1]");
	
	
	public void clickonCheckBoxButton() {
		ldriver.findElement(Checkboxbutton).click();
	}
	public void VerifyCheckboxtext(String text) {
		String checkboxtext=ldriver.findElement(checkboxText).getText();
		if(checkboxtext.equals(text)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	
	
	public void clickonHomeBoxButton() {
		ldriver.findElement(Homeboxbutton).click();
		
	}
	public void VerifyHomeBoxName(String target) {
		String s=ldriver.findElement(resultBox).getText();
		String si=s.replaceAll("[//:,?/]"," ");
		String[] so=si.split(" ");
		for(String string:so) {
			if(string.equalsIgnoreCase(target)){
			Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void clickonExpandbutton() {
		ldriver.findElement(ExpandButton).click();
	}

	public void verifyExpandButton() {
	int	Size=ldriver.findElements(AllElements).size();
	if(Size>0) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
	
	}
	public void clickonCollapsebutton() {
		ldriver.findElement(CollapseButton).click();
	}
	public void verifyCollapsebutton() {
		int Size=ldriver.findElements(AllElements).size();
		if(Size==0) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonHomeboxToggle() {
		ldriver.findElement(HomeboxToggle).click();
		
	}
	public void verifythesubelementspresentinhomebox() {
		int size=ldriver.findElements(Homeboxsubtaxt).size();
		if(size==3) {
			List<WebElement> subEle=ldriver.findElements(Homeboxsubtaxt);
			Iterator<WebElement> li=subEle.iterator();
			while(li.hasNext()) {
				String nameofsubElement=li.next().getText();
			}
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickonDesktopbutton() {
		ldriver.findElement(DesktopToggle).click();
		
	}
	public void verifytheDesktopsubnodes(String note[]) {
		int size=ldriver.findElements(SubnodeofDesktop).size();
		if(size==2) {
			List<WebElement> subnode=ldriver.findElements(SubnodeofDesktop);
			ListIterator<WebElement> l=subnode.listIterator();
				for(String s:note) {
				if(l.next().getText().equalsIgnoreCase(s)) {
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			}
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void clickonNoteCheckBoX() {
		ldriver.findElement(NotecheckBox).click();
		
	}
	public void verifyNoteCheckboxischeckedornot(String check) {
		String s=ldriver.findElement(verifyNoteCheckBox).getAttribute("class");
		String arr[]=s.split("-");
		if(arr.length>0) {
			if(arr[arr.length-1].equalsIgnoreCase(check)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifyNotenameinreport(String name) {
		String s=ldriver.findElement(resultBox).getText();
		String []arr=s.split(":");
		if(arr[arr.length-1].equals(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonCommandsCheckbox() {
		ldriver.findElement(CommandsBox).click();
	}
	public void verifythecommandscheckboxischeckedornot(String verify) {
		String commandscheckboxstatus=ldriver.findElement(commandsCheck).getAttribute("class");
		String []arr=commandscheckboxstatus.split("-");
		if(arr.length>0) {
			if(arr[arr.length-1].equals(verify)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifythecommnadstextinreport(String verifytext) {
		String resulttext=ldriver.findElement(resultBox).getText();
		if(resulttext.equalsIgnoreCase(verifytext)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythedesktopcheckboxischeckedornot(String verify) {
		String desktopstatus=ldriver.findElement(Desktopcheckbox).getAttribute("class");
		String arr[]=desktopstatus.split("-");
		if(arr[arr.length-1].equals(verify)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifyAllCheckboxnamepresentinreport(String []arr) {
		List<WebElement>result=ldriver.findElements(resultBox);
		ListIterator<WebElement> li=result.listIterator();
			for(String name:arr)
			{
				if(li.next().getText().equals(name)) {
					Assert.assertTrue(true);
				}
				else {
					Assert.assertTrue(false);
				}
			
		}
	}
	public void clickondesktopcheckboxforselectallthesubnodes() {
		ldriver.findElement(Desktopbox).click();
	}
	public void verifytheNotecheckbox_status(String status){
		String notecheckboxstatus=ldriver.findElement(verifyNoteCheckBox).getAttribute("class");
		String[] arr=notecheckboxstatus.split("-");
		if(arr[arr.length-1].equals(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythecommandscheckbox_status(String status) {
		String commandsstatus=ldriver.findElement(commandsCheck).getAttribute("class");
		String []arr=commandsstatus.split("-");
		if(arr[arr.length-1].equals(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickondesktopcheckboxforunselectallthesubnodes() {
		ldriver.findElement(Desktopbox).click();
	}
	public void verifythereport() {
		int size=ldriver.findElements(verifyresulttext).size();
		if(size<=1) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	public void clickondocumentstoggel() {
		ldriver.findElement(DocumentsToggel).click();
	}
	public void verifythesubtaskpresentindocuments(String []nodes) {
		List<WebElement> node=ldriver.findElements(Documentssubtask);	
		ListIterator<WebElement>li=node.listIterator();
			for(String s:nodes) {
				if(li.next().getText().equalsIgnoreCase(s)) {
				Assert.assertTrue(true);	
				}
				else {
					Assert.assertTrue(false);
				}
			}		
		
	}
	public void clickonworkspacetoggel() {
		ldriver.findElement(workspaceToggel).click();
	}
	public void verifythesubtextpresentinworkspace(String subnodes[]) {
		List<WebElement> name=ldriver.findElements(workspacesubtext);
		ListIterator<WebElement> li=name.listIterator();
		for(String s:subnodes) {
			if(li.next().getText().equalsIgnoreCase(s)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void clickonofficetoggle() {
		ldriver.findElement(officeToggel).click();
	}
	public void verifythesubtextpresentinoffice(String[] subnodes) {
		List<WebElement> subtext=ldriver.findElements(officesubtext);
		ListIterator<WebElement> li=subtext.listIterator();
		for(String s:subnodes) {
			if(li.next().getText().equalsIgnoreCase(s)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void clickonreactcheckbox() {
		ldriver.findElement(reactcheckbox).click();
	}
	public void verifythestatusofreactchekbox(String status) {
		String s=ldriver.findElement(verifyreactcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	public void verifythereacttextpresentinreport(String name) {
		String reacttext=ldriver.findElement(resultBox).getText();
		if(reacttext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonangularcheckbox() {
		ldriver.findElement(angularcheckbox).click();
	}
	public void verifythestatusofangularcheckbox(String status) {
		String s=ldriver.findElement(verifyangularcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheangularcheckboxtextpresentinreport(String name) {
		String angulartext=ldriver.findElement(resultBox).getText();
		if(angulartext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonveucheckbox() {
		ldriver.findElement(veucheckbox).click();
	}
	public void verifythestatusofveucheckbox(String status) {
		String s=ldriver.findElement(verifyveucheckboxstatus).getAttribute("class");
		String []arr=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheveucheckboxtextpresentinreport(String name)
	{
		String veutext=ldriver.findElement(resultBox).getText();
		if(veutext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofworkspacecheckbox(String status) {
		String s=ldriver.findElement(verifyworkspacecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyallcheckboxnamearepresentinreport(String []name) {
		List<WebElement> allcheckboxtext=ldriver.findElements(resultBox);
		ListIterator <WebElement> li=allcheckboxtext.listIterator();
		for(String n:name) {
			if(li.next().getText().equals(n)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void verifythestatusofreactcheckboxisunchecked(String status) {
		String s=ldriver.findElement(verifyreactcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifythestatusofangularcheckboxisunchecked(String status) {
		String s=ldriver.findElement(verifyangularcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheststusofveucheckboxisunchecked(String status) {
		String s=ldriver.findElement(verifyveucheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofworkspacecheckboxisunchecked(String status) {
		String s=ldriver.findElement(verifyworkspacecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonpubliccheckbox() {
		ldriver.findElement(publiccheckbox).click();
	}
	public void verifythestatusofpubliccheckbox(String status) {
		String s=ldriver.findElement(verifypubliccheckboxstatus).getAttribute("class");
		String [] arr=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythepubliccheckboxtextpresentinreport(String name) {
		String publictext=ldriver.findElement(resultBox).getText();
		if(publictext.equalsIgnoreCase(name))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonprivatecheckbox() {
		ldriver.findElement(privatecheckbox).click();
	}
	
	public void verifythestatusofprivatecheckbox(String status) {
		String s=ldriver.findElement(verifyprivatecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheprivatecheckboxtextpresentinreport(String name) {
		String privatetext=ldriver.findElement(resultBox).getText();
		if(privatetext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonclassifiedcheckbox() {
		ldriver.findElement(classifiedcheckbox).click();
	}
	public void verifythestatusofclassifiedcheckbox(String status) {
		String s=ldriver.findElement(verifyclassifiedcheckboxstatus).getAttribute("class");
		String []arr=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheclassifiedcheckboxtextpresentinreport(String name) {
		String classifiredtext=ldriver.findElement(resultBox).getText();
		if(classifiredtext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickongeneralcheckbox() {
		ldriver.findElement(generalcheckbox).click();
	}
	public void verifythestatusofgeneralcheckbox(String status) {
		String s=ldriver.findElement(verifygeneralcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythegeneralcheckboxtextpresentinreport(String name) {
		String generaltext=ldriver.findElement(resultBox).getText();
		if(generaltext.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofofficecheckbox(String status) {
		String s=ldriver.findElement(verifyofficecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyallofficecheckboxtextarepresentinreport(String[] name) {
		List<WebElement> allcheckboxtext=ldriver.findElements(resultBox);
		ListIterator<WebElement> li=allcheckboxtext.listIterator();
		for(String n:name) {
			if(li.next().getText().equalsIgnoreCase(n)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	
	public void verifytheofficeuncheckboxstatus(String status) {
		String s=ldriver.findElement(verifyofficecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythepublicuncheckboxstatus(String status) {
		String s=ldriver.findElement(verifypubliccheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifytheprivateuncheckboxstatus(String status) {
		String s=ldriver.findElement(verifyprivatecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifytheclassifieduncheckedboxstatus(String status) {
		String s=ldriver.findElement(verifyclassifiedcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythegeneraluncheckedboxstatus(String status) {
		String s=ldriver.findElement(verifygeneralcheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonworkspacechecbox() {
		ldriver.findElement(workspacecheckbox).click();
	}
	public void clickonofficecheckbox() {
		ldriver.findElement(officecheckbox).click();
	}
	public void verifythestatusofdocumentscheckbox(String status) {
		String s=ldriver.findElement(verifydocumentscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifydocumentscheckboxtextpresentinreport(String name) {
		List<WebElement>documentstext=ldriver.findElements(resultBox);
		ListIterator<WebElement> li=documentstext.listIterator();
		for(int i=0;i<1;i++) {
			if(li.next().getText().equalsIgnoreCase(name)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
				}
			}
		}
	public void verifythestatusofdocumentsUncheckbox(String status) {
		String s=ldriver.findElement(verifydocumentscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equals(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofdocumentsHalfcheckbok(String status) {
		String s=ldriver.findElement(verifydocumentscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickondownloadstoggels() {
		ldriver.findElement(downloadstoggel).click();
	}
	public void verifythesubtaskpresentindownloads(String name[])
	{
		List<WebElement>s=ldriver.findElements(verifythedownloadssubtask);
		ListIterator<WebElement> li=s.listIterator();
		
		for(String n:name) {
			if(li.next().getText().equalsIgnoreCase(n)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void clickonwordfilecheckbox() {
		ldriver.findElement(wordfilecheckbox).click();	
	}
	public void verifythestatusofwordfilecheckbox(String status) {
		String s= ldriver.findElement(verifywordfilecheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifywordfilechecknamepresentinreport(String name) {
		String wordfile=ldriver.findElement(resultBox).getText();
		if(wordfile.equals(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickonexcelfilecheckbox() {
		ldriver.findElement(excelfilecheckbox).click();
	}
	public void verifythestatusofexcelfilecheckbox(String status) {
		String s=ldriver.findElement(verifyexcelfilecheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifyexcelfilecheckboxnamepresentinreport(String name) {
		String excelfile=ldriver.findElement(resultBox).getText();
		if(excelfile.equalsIgnoreCase(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofdownloadshalfcheckbox(String status) {
		String s=ldriver.findElement(verifydownloadscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofdownloadscheckbox(String status) {
		String s=ldriver.findElement(verifydownloadscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyallcheckedboxnamedownloadspresentinreport(String name[]) {
		List<WebElement> downloadssubtask=ldriver.findElements(resultBox);
		ListIterator<WebElement> li=downloadssubtask.listIterator();
		for(String n:name) {
			if(li.next().getText().equalsIgnoreCase(n)) {
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
	}
	public void verifythestatusofdownloadsUncheckedbox(String status) {
		String s=ldriver.findElement(verifydownloadscheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofwordfileUncheckedbox(String status) {
		String s=ldriver.findElement(verifywordfilecheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofexcelfileUncheckedbox(String status) {
		String s=ldriver.findElement(verifyexcelfilecheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofdesktophalfcheckedbox(String status) {
		String s=ldriver.findElement(Desktopcheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void clickondownloadscheckbox() {
		ldriver.findElement(downloadscheckbox).click();
	}
	public void verifythestatusofhomehalfcheckbox(String status) {
		String s=ldriver.findElement(verifyhomecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status))
		{
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofdesktopUnchekedbox(String status) {
		String s=ldriver.findElement(Desktopcheckbox).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public  void verifythestatusofhomeUnchekedboc(String status) {
		String s=ldriver.findElement(verifyhomecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-1].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifythestatusofworkspacehalfcheckedbox(String status) {
		String s=ldriver.findElement(verifyworkspacecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifythestatusofofficehalfcheckbox(String status) {
		String s=ldriver.findElement(verifyofficecheckboxstatus).getAttribute("class");
		String arr[]=s.split("-");
		leng=arr.length;
		if(arr[leng-2].equalsIgnoreCase(status)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
}
