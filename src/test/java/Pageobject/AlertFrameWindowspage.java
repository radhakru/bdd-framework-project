package Pageobject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertFrameWindowspage {
	public WebDriver ldriver;
	public WebDriverWait wait;

	public AlertFrameWindowspage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By alertframewindows = By.xpath("//div[@class='card-body']/h5[contains(text(),'w')]");
	By pageheader = By.xpath("//div[@class='main-header']");
	By browserwindows = By.xpath("//span[contains(text(),'Browser Windows')]");
	By NewWindows = By.xpath("//button[@id='windowButton']");
	By Newtab = By.xpath("//button[@id='tabButton']");
	By graptext = By.tagName("h1");
	By newwindowmessage = By.xpath("//button[@id='messageWindowButton']");
	By alerts = By.xpath("//span[contains(text(),'Alerts')]");
	By alertbutton = By.xpath("//button[@id='alertButton']");
	By alertActivateAfter5second = By.xpath("//button[@id='timerAlertButton']");
	By confirmalertbutton = By.xpath("//button[@id='confirmButton']");
	By verifycomfrmtext = By.xpath("//span[@id='confirmResult']");
	By prompedalertbutton = By.xpath("//button[@id='promtButton']");
	By verifypromtedtext = By.xpath("//span[@id='promptResult']");

//new update code: 27/06/2023
	By iframebutton = By.xpath("//li/span[text()='Frames']");
	By parentiframe = By.id("frame1");
	By iframetext = By.xpath("//h1[@id='sampleHeading']");

	By miniiframe = By.id("frame2");
	By miniiframetext = By.xpath("//h1[@id='sampleHeading']");

	// nested frame xpath
	By nestedframe = By.xpath("//li/span[text()='Nested Frames']");
	// nested frame parent frame id
	By Nestedparentiframe = By.id("frame1");

	// get text of the parent frame
	By NestedperentiframeText = By.tagName("body");

	// child iframe
	By Nestedchildiframe = By.tagName("iframe");

	// child frame text
	By childframetext = By.tagName("p");

	// Modal dialogs element
	By Modaldialogs = By.xpath("//li/span[text()='Modal Dialogs']");

	// modal dialogs text
	By Modaldialogstext = By.xpath("//div[@id='modalWrapper']/div/div");

	// small modal element
	By smallModaldialogs = By.xpath("//button[@id='showSmallModal']");

	// small modal text
	By smallModaldialogstext = By.xpath("//div[@class='modal-content']/div[2]");

	// small modal close
	By smallModaldialogclose = By.xpath("//button[@id='closeSmallModal']");

	// large modal dialogs
	By largeModaldialogs = By.xpath("//button[@id='showLargeModal']");

	// large modal text
	By largeModaldialogstext = By.xpath("//div[@class='modal-body']/p");

	// large modal dialogs close
	By largeModaldialogsclose = By.xpath("//button[@id='closeLargeModal']");

	public void clickonalertframewindowbutton() {
		ldriver.findElement(alertframewindows).click();
	}

	public void verifythealertfrmaewindowstext(String textname) {
		String name = ldriver.findElement(pageheader).getText();
		if (name.equals(textname))
			Assert.assertTrue(true);
		else {
			Assert.assertFalse(true);
		}
	}

	public void clickonbrowserwindows() {
		ldriver.findElement(browserwindows).click();
	}

	public void verifythebrowserwindowtest(String name) {
		String s = ldriver.findElement(pageheader).getText();
		if (s.equals(name))
			Assert.assertTrue(true);
		else {
			Assert.assertTrue(false);
		}
	}

	public void clickonnewtab_button() {
		ldriver.findElement(Newtab).click();
	}

	public void verify_the_newwindows(String bodyname) {
		String parent = ldriver.getWindowHandle();
		Set<String> windows = ldriver.getWindowHandles();
		Iterator<String> li = windows.iterator();
		for (int i = 0; i < windows.size(); i++) {
			String child = li.next();

			ldriver.switchTo().window(child);
		}

		String body = ldriver.findElement(graptext).getText();
		if (body.equals(bodyname))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		ldriver.close();
		ldriver.switchTo().window(parent);
	}

	public void clickonnewWindowsbutton() {
		ldriver.findElement(NewWindows).click();
	}

	public void clickonnewwindowmessage() {
		ldriver.findElement(newwindowmessage).click();
	}

	public void verifythenewwindowsmessage(String s) {
		String parent = ldriver.getWindowHandle();
		Set<String> windows = ldriver.getWindowHandles();
		Iterator<String> li = windows.iterator();
		while (li.hasNext()) {
			String child = li.next();
			ldriver.switchTo().window(child);

		}
		// simply close that windows
		/*
		 * String name=ldriver.findElement(grapmessagetext).getText();
		 * System.out.println(name); if(name.equals(s)) Assert.assertTrue(true);
		 * 
		 * else Assert.assertTrue(false);
		 */

		// child window close
		ldriver.close();

		// driver switch to parent window
		ldriver.switchTo().window(parent);

	}

	public void clickonalertsbutton() {
		ldriver.findElement(alerts).click();
	}

	public void verifythealerttext(String name) {
		String s = ldriver.findElement(pageheader).getText();
		if (s.equals(name))
			Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
	}

	public void clickonfirstalertbutton() {
		ldriver.findElement(alertbutton).click();
	}

	public void accepthealertbutton(String arr[]) {
		String s = ldriver.switchTo().alert().getText();
		for (String a : arr) {
			if (s.equals(a)) {
				ldriver.switchTo().alert().accept();
			}
		}
	}

	public void clickontimealert() {
		ldriver.findElement(alertActivateAfter5second).click();
	}

	public void clickonconfirmalertbutton() {
		ldriver.findElement(confirmalertbutton).click();
	}

	public void verify_the_alerttext(String co) {
		String s = ldriver.findElement(verifycomfrmtext).getText();
		String arr[] = s.split(" ");
		int count = 0;
		for (String a : arr) {
			if (a.equalsIgnoreCase(co)) {
				count++;
			}
		}
		if (count >= 1) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	public void clickonpromptedalert() {
		ldriver.findElement(prompedalertbutton).click();
	}

	public void enterkeyinalert(String s) {
		ldriver.switchTo().alert().sendKeys(s);

	}

	public void verifytheprompedtext(String s) {
		String name = ldriver.findElement(verifypromtedtext).getText();
		String arr[] = name.split(" ");
		for (String a : arr) {
			if (a.equals(s)) {
				Assert.assertTrue(true);
			}
		}
	}

	public void clickoniframebutton() {
		// here iframe button clicked
		ldriver.findElement(iframebutton).click();

	}

	public void verifythetextofiframe(String s) {
		// now switch our driver to iframe
		ldriver.switchTo().frame(ldriver.findElement(parentiframe));
		String page = ldriver.getPageSource();
		System.out.println("Current pagesource for iframe" + page);

		wait = new WebDriverWait(ldriver, 5);

		// driver wait until for iframetext loaded in dom.
		wait.until(ExpectedConditions.visibilityOfElementLocated(iframetext));

		// Then get text from that WebElement
		String text = ldriver.findElement(iframetext).getText();

		// ternary operation
		boolean b = (text.equals(s) ? true : false);
		Assert.assertTrue(b);

	}

//mini iframe code
	public void verifythetextofminiiframe(String content) {

		// driver switch to mini iframe
		ldriver.switchTo().frame(ldriver.findElement(miniiframe));

		// use webdriver wait or explicity wait
		wait = new WebDriverWait(ldriver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(miniiframetext));

		String text = ldriver.findElement(miniiframetext).getText();
		// verify the text
		boolean value = (text.equals(content) ? true : false);
		Assert.assertTrue(value);

		String page = ldriver.getPageSource();
		System.out.println("mini iframe of pagesource : " + page);
	}

	// Nested frame code
	public void clickonnestedframe() {
		ldriver.findElement(nestedframe).click();

	}

	public void verifythenestedparenttext(String text) {
		// switch driver to frame
		ldriver.switchTo().frame(ldriver.findElement(Nestedparentiframe));

		String pagesource = ldriver.getPageSource();
		System.out.println(pagesource);

		WebElement body = ldriver.findElement(NestedperentiframeText);
		String parentiframetext = body.getText();

		boolean value = (parentiframetext.equals(text) ? true : false);
		Assert.assertTrue(value);

	}

	// switch parent frame to child frame
	public void verifythenestedchildtext(String text) {
		int iframeId = ldriver.findElements(Nestedchildiframe).size();
		int userFrame = 0;
		for (int i = 0; i < iframeId; i++) {
			if (userFrame == i) {
				ldriver.switchTo().frame(i);
			}
		}
		String childpage = ldriver.getPageSource();
		System.out.println(childpage);

		String childframevalue = ldriver.findElement(childframetext).getText();
		boolean value = (childframevalue.equals(text) ? true : false);
		Assert.assertTrue(value);

	}

	public void clickonmodaldialogs() {
		ldriver.findElement(Modaldialogs).click();
	}

	// here verify the text of modal dialogs
	public void verifythetextofmodaldialogs(String text) {
		String Modaltext = ldriver.findElement(Modaldialogstext).getText();
		boolean value = (Modaltext.equals(text) ? true : false);
		Assert.assertTrue(value);
	}

	public void clickonsmalldialogs() {
		ldriver.findElement(smallModaldialogs).click();
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(smallModaldialogstext));

	}

	// here verify the small dialogs text
	public void verifythetextofsmalldialogs(String text) {
		String smalldialogsText = ldriver.findElement(smallModaldialogstext).getText();
		boolean value = (smalldialogsText.equals(text) ? true : false);
		Assert.assertTrue(value);
	}

	// close the small dialog box
	public void clickonsmalldialogsclose() {
		ldriver.findElement(smallModaldialogclose).click();
	}

	public void clickonlargemodaldialogs() {
		ldriver.findElement(largeModaldialogs).click();
		wait = new WebDriverWait(ldriver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(largeModaldialogstext));
	}

	// verify the large dialogs text
	public void verifythetextoflargemodaldialogs(String text) {
		String largedialogstext = ldriver.findElement(largeModaldialogstext).getText();

		boolean value = (largedialogstext.equals(text) ? true : false);

		Assert.assertTrue(value);
	}

	// close the large modal
	public void clickonlargedilogsclose() {
		ldriver.findElement(largeModaldialogsclose).click();
	}

}
