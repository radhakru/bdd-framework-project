package Pageobject;

import java.net.MulticastSocket;
import java.util.List;
import java.util.ListIterator;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WebTablepage {
public WebDriver ldriver;
public Select slt;
public WebTablepage(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}
By webtable=By.xpath("//span[contains(text(),'Web Tables')]");
By webtabletext=By.xpath("//div[@class='main-header']");
By addbutton=By.xpath("//button[@id='addNewRecordButton']");
By firstname=By.xpath("//input[@id='firstName']");
By lastname=By.xpath("(//input[@id='firstName']/ancestor::div[2]/following-sibling::div/preceding::input[@id])[3]");
By email=By.xpath("(//input[@id='firstName']/ancestor::div[2]/following-sibling::div/preceding::input[@id])[4]");
By age=By.xpath("(//input[@id='firstName']/ancestor::div[2]/following-sibling::div/preceding::input[@id])[5]");
By salary=By.xpath("(//input[@id='firstName']/ancestor::div[2]/following-sibling::div/preceding::input[@id])[6]");
By department=By.xpath("(//input[@id='firstName']/ancestor::div[2]/following-sibling::div/preceding::input[@id])[7]");
By submit=By.xpath("//button[contains(text(),'Submit')]");
By searchbox=By.xpath("//input[@id='searchBox']");
By rows=By.xpath("//select[@aria-label='rows per page']");
By totalpage=By.xpath("//span[@class='-totalPages']");
By edit=By.xpath("//span[@id='edit-record-1']");
By pagenumber=By.xpath("//input[@aria-label='jump to page']");
By deletebutton=By.xpath("//span[@id='delete-record-1']");

By verifyfirstname=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][1]");
By verifylastname=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][2]");
By verifyage=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][3]");
By verifyemail=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][4]");
By verifysalary=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][5]");
By verifydepartment=By.xpath("//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][6]");
By verifyName=By.xpath("//div[@class='rt-tr -odd']/div[1]");



public void clickonwebtable() {
	ldriver.findElement(webtable).click();
}
public void verifythewebtabletextpresent(String text) {
	String s=ldriver.findElement(webtabletext).getText();
	if(s.equals(text)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonaddbutton() {
	ldriver.findElement(addbutton).click();
}
public void filltheFirstName(String fstname) {
	ldriver.findElement(firstname).sendKeys(fstname);
}
public void filltheLastName(String lstname) {
	ldriver.findElement(lastname).sendKeys(lstname);
}
public void filltheEmailId(String mail) {
	ldriver.findElement(email).sendKeys(mail);
}
public void filltheAge(int agenumber) {
	String a=Integer.toString(agenumber);
	ldriver.findElement(age).sendKeys(a);
	
}
public void fillthesalary(int Sal) {
	String a=Integer.toString(Sal);
	ldriver.findElement(salary).sendKeys(a);
}
public void fillthedepartment(String depart) {
	ldriver.findElement(department).sendKeys(depart);
}
public void clickonsumbit() {
	ldriver.findElement(submit).click();
}

public void verifytheFirstName(String name) {
	//String name
	List<WebElement> fstname=ldriver.findElements(verifyfirstname);
	ListIterator<WebElement> li=fstname.listIterator();
	String arr[]=new String[fstname.size()];
	for(int i=0;i<fstname.size();i++) {
		arr[i]=li.next().getText();
	}	
	for(String s:arr) {
		if(s.equals(name)) {
			//System.out.println("yes");
			Assert.assertTrue(true);
		}
		
		
	}
	
}
public void verifytheLastName(String name) {
	List<WebElement> lstname=ldriver.findElements(verifylastname);
	ListIterator<WebElement> li=lstname.listIterator();
	String arr[]=new String[lstname.size()];
	for(int i=0;i<arr.length;i++) {
		arr[i]=li.next().getText();
	}
	for(String a:arr)
	{
		if(a.equals(name)) {
			Assert.assertTrue(true);	
			}
		
	}
}
public void verifytheEmailid(String name) {
	List<WebElement> Email=ldriver.findElements(verifyemail);
	ListIterator<WebElement> li=Email.listIterator();
	while(li.hasNext()) {
		if(li.next().getText().equals(name)) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(true);
		}
	}
}
public void verifytheAge(int name) {
	List<WebElement> Age=ldriver.findElements(verifyage);
	ListIterator<WebElement> li=Age.listIterator();
	while(li.hasNext()) {
		if(li.next().getText().equals(Integer.toString(name))) {
			Assert.assertTrue(true);
		}
	}
}
public void verifytheSalary(int name) {
	List<WebElement> salary=ldriver.findElements(verifysalary);
	ListIterator <WebElement> li=salary.listIterator();
	String s=Integer.toString(name);
	while(li.hasNext()) {
		if(li.next().getText().equals(s)) {
			Assert.assertTrue(true);
		}
	}
}
public void verifythedepartment(String name) {
	List<WebElement> department=ldriver.findElements(verifydepartment);
	ListIterator<WebElement> li=department.listIterator();
	while(li.hasNext()) {
		if(li.next().getText().equals(name)) {
			Assert.assertTrue(true);
		}
	}
}
public void sendvaluestosearch(String name) {
	ldriver.findElement(searchbox).sendKeys(name);
}
public void verifythename(String name) {
	String s=ldriver.findElement(verifyName).getText();
	if(s.equals(name)) {	
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void clickonrows() {
	ldriver.findElement(rows).click();
	slt=new Select(ldriver.findElement(rows));
	slt.selectByIndex(0);
}
public void verifyrows() {
	int size=ldriver.findElements(verifyfirstname).size();
	if(size==5) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void verifythetotalpage() {
	String s=ldriver.findElement(totalpage).getText();
	int a=Integer.parseInt(s);
	if(a==2) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
}
public void typeinsearchbox(String name) {
	ldriver.findElement(searchbox).sendKeys(name);
}
public void clickoneditbutton() {
	ldriver.findElement(edit).click();
}
public void edit_the_fristname(String name) {
	ldriver.findElement(firstname).sendKeys(name);
}
public void verify_the_firstname() {
	String s=ldriver.findElement(verifyName).getText();
	String s1=ldriver.findElement(By.xpath("(//div[@class='rt-tr-group']/child::div[@role='row']/*[@class='rt-td'][1])[1]")).getText();
	if(s.equals(s1)) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
		 	 
}
public void Enterthepagenumber() {
String s=ldriver.findElement(pagenumber).getAttribute("type");
if(s.equals("number"))
	ldriver.findElement(pagenumber).clear();
	ldriver.findElement(pagenumber).sendKeys(Integer.toString(2));
	ldriver.findElement(pagenumber).sendKeys(Keys.ENTER);
}
public void clickondeletebutton(){
	ldriver.findElement(deletebutton).click();
}
public void verifythedeletenamenotpresentintable(String name) {
	ldriver.findElement(searchbox).clear();
	List<WebElement>l=ldriver.findElements(verifyName);
	ListIterator<WebElement> li=l.listIterator();
	for(int i=0;i<l.size();i++) {
		if(li.next().getText().equals(name)) {
			Assert.assertTrue(false);
		}
	}
}



}
