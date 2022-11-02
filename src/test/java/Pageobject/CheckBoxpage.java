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
	
	
	By Homeboxsubtaxt=By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/label/span[@class='rct-title']");
	By DesktopToggle=By.xpath("(//li[@class='rct-node rct-node-parent rct-node-collapsed']/span/button[@type='button'])[1]");
	By SubnodeofDesktop=By.xpath("//li[@class='rct-node rct-node-leaf']/span/label/span[@class='rct-title']");
	By resultBox=By.xpath("//div[@id='result']/span[@class]");
	By checkboxText=By.xpath("//div[@class='main-header']");
	By verifyNoteCheckBox=By.xpath("(//span[@class='rct-checkbox']/*[name()='svg'])[3]");
	By commandsCheck=By.xpath("//label[@for='tree-node-commands']/child::span[1]/*[name()='svg']");
	By Desktopcheckbox=By.xpath("//label[@for='tree-node-desktop']/descendant::span[1]/*[name()='svg']");
	By onlyresulttext=By.xpath("//div[@id='result']/child::span[@class]");
	
	By verifyresulttext=By.xpath("//div[@class='check-box-tree-wrapper']/div[@id]");
	
	
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
		List<WebElement>result=ldriver.findElements(onlyresulttext);
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
	
	
	
	
}
