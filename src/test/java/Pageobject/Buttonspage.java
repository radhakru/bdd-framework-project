package Pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Buttonspage {
public  WebDriver ldriver;
public Actions act;

public Buttonspage(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
}


By buttons=By.xpath("//span[contains(text(),'Buttons')]");
By buttonstext=By.xpath("//div[@class='main-header']");
By doubleclick=By.xpath("//button[@id='doubleClickBtn']");
By rightclick=By.xpath("//button[contains(text(),'Right Click Me')]");
By clickme=By.xpath("(//button[contains(text(),'Click Me')])[3]");
By verifydoubleclick=By.xpath("//p[@id='doubleClickMessage']");
By verifyrightclick=By.xpath("//p[@id='rightClickMessage']");
By verifyclickme=By.xpath("//p[@id='dynamicClickMessage']");
public void clickonbutton() {
	ldriver.findElement(buttons).click();
}
public void verifybuttonstext(String name) {
	String s=ldriver.findElement(buttonstext).getText();
	if(s.equals(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickondubleclickbutton(WebDriver ldriver) {
	act=new Actions(ldriver);
	act.doubleClick(ldriver.findElement(doubleclick)).build().perform();
	 
}
public void verifythetextdoubleclick(String name) {
	String s=ldriver.findElement(verifydoubleclick).getText();
	if(s.equals(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonrightclickbutton(WebDriver ldriver) {
	act=new Actions(ldriver);
	act.contextClick(ldriver.findElement(rightclick)).build().perform();
}
public void verifythetextrightclickbutton(String name) {
	String s=ldriver.findElement(verifyrightclick).getText();
	if(s.equals(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonclickmebutton(WebDriver ldriver) {
	act=new Actions(ldriver);
	act.click(ldriver.findElement(clickme)).build().perform();
}
public void verifytheclickmetextinreport(String name) {
	String  s=ldriver.findElement(verifyclickme).getText();
	if(s.equals(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}

	
	
}
