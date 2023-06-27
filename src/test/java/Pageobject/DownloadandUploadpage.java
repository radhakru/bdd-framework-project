package Pageobject;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DownloadandUploadpage {
public WebDriver ldriver;

public DownloadandUploadpage(WebDriver rdriver) {
	this.ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
	
}
By downloadandupload=By.xpath("//span[contains(text(),'Upload and Download')]");
By uploadfile=By.xpath("//input[@id='uploadFile']");
By verifyfilepath=By.xpath("//p[@id='uploadedFilePath']");


public void clickondownloadandupload() {
	ldriver.findElement(downloadandupload).click();
}
public void sendfiletouploadfile(String s) {
	ldriver.findElement(uploadfile).sendKeys(s);
}
public void verifytheuploadedfilepath(String path) {
	String s=ldriver.findElement(verifyfilepath).getText();
	if(s.equals(path)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}


}
