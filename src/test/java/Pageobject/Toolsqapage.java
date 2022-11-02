package Pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;



public class Toolsqapage {

	public WebDriver ldriver; 
	public Toolsqapage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	int leng;
	By Elementsbutton=By.xpath("(//*[contains(text(),'Elements')])[2]");
	By TextBox=By.xpath("//li[@id='item-0']//child::span[text()='Text Box']");
	By Fullname=By.id("userName");
	By Emailid=By.id("userEmail");
	By Currentaddress=By.id("currentAddress");
	By Permanentaddress=By.id("permanentAddress");
	By Submitbutton=By.id("submit");
	By verifyname=By.xpath("//div[@class='border col-md-12 col-sm-12']/child::p[@id='name']");
	By verifyEmailId=By.xpath("//div[@class='border col-md-12 col-sm-12']/child::p[@id='email']");
	By verifyCurrentAddress=By.xpath("//div[@class='border col-md-12 col-sm-12']/child::p[@id='currentAddress']");
	By verifyPermanentAddress=By.xpath("//div[@class='border col-md-12 col-sm-12']/child::p[@id='permanentAddress']");
	By verifyElementText=By.xpath("//div[contains(text(),'Elements')]");
	By verifyTextBoxText=By.xpath("//div[contains(text(),'Text Box')]");
	By verifytoolsQaText=By.xpath("//a[@href='https://demoqa.com']/child::img");
	
	
	
	public void clickonElementbutton() {
		ldriver.findElement(Elementsbutton).click();
	}
	public void clickonTextBox() {
		ldriver.findElement(TextBox).click();
		
	}
	public void Fullname(String name) {
		 ldriver.findElement(Fullname).sendKeys(name);
	}
	public void EmailId(String email) {
		 ldriver.findElement(Emailid).sendKeys(email);
	}
	public void Currentaddress(String currentaddress) {
		 ldriver.findElement(Currentaddress).sendKeys(currentaddress);
	}
	public void Permanentaddress(String permanentaddress) {
		 ldriver.findElement(Permanentaddress).sendKeys(permanentaddress);
	}
	public void clickonsubmitbutton() {
		ldriver.findElement(Submitbutton).click();
	}
	public void verifyFullname(String Name) {
		String name=ldriver.findElement(verifyname).getText();
		String[] fullName=name.split(":") ;
		leng=fullName.length;
		if(fullName[leng-1].equalsIgnoreCase(Name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
	}
	public void verifyEmailid(String email) {
		String Emailid=ldriver.findElement(verifyEmailId).getText();
		String[] Email=Emailid.split(":");
		leng=Email.length;
		if(Email[leng-1].equalsIgnoreCase(email)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyCurrentAddress(String currentaddress) {
		String currentAddress=ldriver.findElement(verifyCurrentAddress).getText();
		String[] currAdds=currentAddress.split(":");
		leng=currAdds.length;
		if(currAdds[leng-1].equalsIgnoreCase(currentaddress)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyPermanentAddress(String permanentaddress) {
		String permanentAddress=ldriver.findElement(verifyPermanentAddress).getText();
		String[] permAdds=permanentAddress.split(":");
		leng=permAdds.length;
		if(permAdds[leng-1].equalsIgnoreCase(permanentaddress)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyElementText(String elementText) {
		String elementtext=ldriver.findElement(verifyElementText).getText();
		if(elementtext.equals(elementText)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyTextboxText(String Text) {
		String textboxText=ldriver.findElement(verifyTextBoxText).getText();
		if(textboxText.equalsIgnoreCase(Text)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifyToolsQaText(String ToolsQAText) {
		String toolsqaText=ldriver.findElement(verifytoolsQaText).getAttribute("src");
		String toolqaText=toolsqaText.replaceAll("[//,:/?]", " ");
		String ToolsqaText=toolqaText.replace("  "," ");
		String[] toolsQAText=ToolsqaText.split(" ");
		leng=toolsQAText.length;
		if(toolsQAText[leng-1].equalsIgnoreCase(ToolsQAText)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
			
		
	}
	
	
	public void verifyfullnameonlynumber(String Fullnamenum) {
		String fnon=ldriver.findElement(verifyname).getText();
		String[] FNON=fnon.split(":");
		leng=FNON.length;
		if(FNON[leng-1].equalsIgnoreCase(Fullnamenum)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	public void verifycurrentaddressonlyNumber(String currentaddressonlynumber) {
		String caon=ldriver.findElement(verifyCurrentAddress).getText();
		String[] CAON=caon.split(":");
		leng=CAON.length;
		if(CAON[leng-1].equals(currentaddressonlynumber)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	public void verifyCurrentAddressonlyspecialch(String CurrentAddressonlyspecialch) {
		String caosc=ldriver.findElement(verifyCurrentAddress).getText();
		String[] CAOSC=caosc.split(":");
		leng=CAOSC.length;
		if(CAOSC[leng-1].equals(CurrentAddressonlyspecialch)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
