package Pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DynamicPropertiespage {
public WebDriver ldriver;
public DynamicPropertiespage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
	
}

By dynamicproperties=By.xpath("//span[contains(text(),'Dynamic Properties')]");
By verifyheadertext=By.xpath("//div[@class='main-header']");
By visiblebutton=By.xpath("//div/button[@id='visibleAfter']");

public void clickondynamicproperties() {
	ldriver.findElement(dynamicproperties).click();
}
public void verifythedynamicproertiestext(String name) {
	String s=ldriver.findElement(verifyheadertext).getText();
	if(s.equals(name))
		Assert.assertTrue(true);
	else
		Assert.assertTrue(false);
}
public void verifythevisiblebutton()
{
	boolean b=ldriver.findElement(visiblebutton).isEnabled();
	if(b==true)
		Assert.assertTrue(true);
	else
		Assert.assertTrue(false);
}

}
