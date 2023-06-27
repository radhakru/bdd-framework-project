package Pageobject;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Linkspage {
public WebDriver ldriver;

public Linkspage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
By linksbutton=By.xpath("(//span[contains(text(),'Links')])[1]");
By linktext=By.xpath("//div[@class='main-header']");
By homelink=By.linkText("Home");
By dynamichomelink=By.xpath("//a[@id='dynamicLink']");
By createdlink=By.linkText("Created");
By nocontentlink=By.linkText("No Content");
By movelink=By.linkText("Moved");
By badrequestlink=By.linkText("Bad Request");
By unauthorizedlink=By.linkText("Unauthorized");
By forbiddenlink=By.linkText("Forbidden");
By notfoundlink=By.linkText("Not Found");
By linkstatus=By.xpath("//p[@id='linkResponse']/b[1]");

public void clickonlinksbutton() {
	ldriver.findElement(linksbutton).click();
}
public void verify_the_link_text(String name) {
	String s=ldriver.findElement(linktext).getText();
	if(s.equals(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonHomelink() {
	
	ldriver.findElement(homelink).click();
}
public void verify_the_windows_page(String name) {
	String parwin=ldriver.getWindowHandle();
	Set<String> WindowHandels=ldriver.getWindowHandles();
	Iterator<String> wn=WindowHandels.iterator();
	while(wn.hasNext()) {
		String child=wn.next();
		if(!parwin.equals(child)) {
			ldriver.switchTo().window(child);
			String s=ldriver.switchTo().window(child).getTitle();
			if(s.equalsIgnoreCase(name))
				ldriver.close();
		}
		
	}
	ldriver.switchTo().window(parwin);
}
public void clickondynamichomelink() {
	ldriver.findElement(dynamichomelink).click();
}
public void verifythedynamichomelinkopennewtap(String name) {
	String parent=ldriver.getWindowHandle();
	Set<String> win=ldriver.getWindowHandles();
	Iterator<String> li=win.iterator();
	while(li.hasNext()) {
		String child=li.next();
		if(!parent.equals(child)) {
			ldriver.switchTo().window(child);
			String s=ldriver.getTitle();
			if(s.equalsIgnoreCase(name))
			{
				ldriver.close();
			}
		}
	}
	ldriver.switchTo().window(parent);
}
	
public void clickoncreatedlink() {
	ldriver.findElement(createdlink).click();
}
public void verifycreatedlinkstatus(String Value) {
	String value=ldriver.findElement(linkstatus).getText();
	if(value.equals(Value)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonnocontent() {
	ldriver.findElement(nocontentlink).click();
}
public void verifythenocontentlinkstatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonmoved() {
	ldriver.findElement(movelink).click();
}
public void verifythemovedlinkstatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonbadrequestlink() {
	ldriver.findElement(badrequestlink).click();
}
public void verifythebadrequeststatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonunauthorizedlink() {
	ldriver.findElement(unauthorizedlink).click();
}
public void verifytheunauthorizedstatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonforbiddenlink() {
	ldriver.findElement(forbiddenlink).click();
}
public void verifytheforbiddenstatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonnotfoundlink() {
	ldriver.findElement(notfoundlink).click();
}
public void verifythenotfoundstatus(String status) {
	String s=ldriver.findElement(linkstatus).getText();
	if(s.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}

}
