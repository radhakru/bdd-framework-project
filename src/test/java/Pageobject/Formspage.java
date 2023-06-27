package Pageobject;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class Formspage {
public WebDriver ldriver;
public Formspage(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver,this);
}
By formsbutton=By.xpath("(//div[@class='home-body']/div/div/div/div[2])[2]");
By Headertext=By.xpath("//div[@class='main-header']");
By practiceform=By.xpath("//span[contains(text(),'Practice Form')]");
By fullname=By.id("firstName");
By lastname=By.xpath("//input[@id='firstName']/parent::div/following-sibling::div[2]/input");
By email=By.id("userEmail");
By maleradiobutton=By.xpath("//label[contains(text(),'Male')]");
By mobilenumber=By.id("userNumber");
By date=By.xpath("//div[@class='react-datepicker__month']/div/div[contains(text(),'10')]"); 
By subject=By.xpath("//input[@id='subjectsInput']");
By hobbies=By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label[contains(text(),'Sports')]");
By chosefile=By.xpath("//input[@id='uploadPicture']");
By currentaddress=By.xpath("//textarea[@id='currentAddress']");
By dateofbirth=By.id("dateOfBirthInput");

public Select select; 
//select[@class='react-datepicker__year-select']

//select[@class='react-datepicker__month-select']

//div[@class='react-datepicker__month']/div/div[contains(text(),"10")]


public void clickonformsbutton() {

	ldriver.findElement(formsbutton).click();
	
}
public void verifytheformstext(String name) {
	String s=ldriver.findElement(Headertext).getText();
	if(s.equals(name))
		Assert.assertTrue(true);
	else 
		Assert.assertTrue(false);
	
}


public void clickonpraticebutton() {
	ldriver.findElement(practiceform).click();
	
}
public void verifythepracticeformtext(String name) {
	String s=ldriver.findElement(Headertext).getText();
	if(s.equals(name))
		Assert.assertTrue(true);
	else 
		Assert.assertTrue(false);
	
}

public void enterfullname(String name) {
	/*
	 * for(int i=0;i<3;i++) {
	 * ldriver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys
	 * .ADD)); }
	 */
	
	
	ldriver.findElement(fullname).sendKeys(name);
}
public void enterlastname(String name)
{
	ldriver.findElement(lastname).sendKeys(name);
}
public void enteremailid(String name) {
	ldriver.findElement(email).sendKeys(name);
}
public void selectgender() {
ldriver.findElement(maleradiobutton).click();
}
public void entermobilenumber(String name) {
	ldriver.findElement(mobilenumber).sendKeys(name);
}
public void selectdate() {
	ldriver.findElement(dateofbirth).click();
	select=new Select(ldriver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
	select.selectByValue("1999");
	
	select=new Select(ldriver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
	select.selectByValue("6");
	
	
	ldriver.findElement(date).click();
}
public void entersubject(String name) {
	ldriver.findElement(subject).sendKeys(name);
	ldriver.findElement(subject).sendKeys(Keys.ENTER);
}

public void enterHobbies() {
	ldriver.findElement(hobbies).click();
	
}
public void uploadfiles(String filename) {
	ldriver.findElement(chosefile).sendKeys(filename);
}
public void entercurrentaddress(String Address) {
	ldriver.findElement(currentaddress).sendKeys(Address);
}


	
	
}
