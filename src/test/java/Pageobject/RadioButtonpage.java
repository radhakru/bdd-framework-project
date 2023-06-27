package Pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonpage {
public WebDriver ldriver;

public RadioButtonpage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
int leng;
String name;

//By radiobutton=By.xpath("(//*[contains(text(),'Radio Button')])[2]");
By radiobutton=By.xpath("//span[contains(text(),'Radio Button')]");
By verifyradiobuttontext=By.xpath("//div[@class='main-header']");
By yesRadiobutton=By.xpath("//label[@for='yesRadio']");
By impresivebutton=By.xpath("//label[@for='impressiveRadio']");
By verifyrediobutton=By.xpath("//span[@class='text-success']");



public void clickonradiobutton() {
	ldriver.findElement(radiobutton).click();
}
public void verifytherediobuttontext(String status) {
	 name=ldriver.findElement(verifyradiobuttontext).getText();
	 System.out.println(name);
	if(name.equals(status)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonyesradiobutton() {
	ldriver.findElement(yesRadiobutton).click();
}
public void verifytheyesradiobuttontext(String report) {
	name=ldriver.findElement(verifyrediobutton).getText();
	if(name.equalsIgnoreCase(report)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonimpressivebutton() {
	ldriver.findElement(impresivebutton).click();
}
public void verifytheimpresivebuttontext(String report) {
	name=ldriver.findElement(verifyrediobutton).getText();
	System.out.println(name);
	if(name.equalsIgnoreCase(report)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	
}















	
}
