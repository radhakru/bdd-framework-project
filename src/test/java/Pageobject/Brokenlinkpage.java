package Pageobject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Brokenlinkpage {
	public WebDriver ldriver;
	public Brokenlinkpage(WebDriver rdriver) {
		this.ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
By brokenlink_image=By.xpath("//span[contains(text(),'Broken Links - Images')]");
By Text=By.xpath("//div[@class='main-header']");
By Linktext=By.tagName("a");
By image=By.tagName("img");

public void clickonbrokernlinkimage() {
	ldriver.findElement(brokenlink_image).click();
}
public void verifythebrolenlinkimagetext(String name) {
	String s=ldriver.findElement(Text).getText();
	if(s.equalsIgnoreCase(name)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void verifybrokenlink() {
	List<WebElement>n=ldriver.findElements(Linktext);
	for(int i=0;i<n.size();i++) {
		WebElement e=n.get(i);
		String url=e.getAttribute("href");
		verifylinks(url);
	}
}
private void verifylinks(String linkurl) {
	try {
		URL url=new URL(linkurl);
		//open Httpurlconnection
		HttpURLConnection httpurlcon=(HttpURLConnection)url.openConnection();
		//wait 5000 second to load
		httpurlcon.setConnectTimeout(5000);
		//connect the url
		httpurlcon.connect();
		if(httpurlcon.getResponseCode()>=400) {
			Assert.assertTrue(true);
			System.out.println(linkurl+"->"+httpurlcon.getResponseMessage()+"this is broken link");
		}
		
	}
	catch(Exception e) {
		
	}
	
}
public void verifyimage() {
		List<WebElement>images=ldriver.findElements(image);
		//verify the image link fetch
		for(int i=0;i<images.size();i++) {
			WebElement img=images.get(i);
			String imgs=img.getAttribute("src");
			verifyimages(imgs);
		//validate image dispaly using javaScript Executeor
		try {
			boolean ab=(boolean)((JavascriptExecutor)ldriver).executeScript("return(typeof arguments[0].natularWidth!=\"undefine\" && arguments[0].naturalWidth>0);", img);
			if(ab) {
				System.out.println("Displayed-image");
			}
			else {
				System.out.println("Displayed-image-No");
			}
		}
		catch(Exception e) {
			
		}
		}
}
private void verifyimages(String imgs) {
	
	try {
		URL urls=new URL(imgs);
			
		//we will creating url connection and getting the response code
		HttpURLConnection con=(HttpURLConnection)urls.openConnection();
		con.setConnectTimeout(5000);
		con.connect();
		if(con.getResponseCode()>=400) {
			System.out.println(imgs+"->"+con.getResponseMessage()+"brokenlink");
		}
		else {
			System.out.println(imgs+"->"+con.getResponseMessage()+"not broken link");
		}
		
	}
	catch(Exception e) {
		
	}
}
	

}
