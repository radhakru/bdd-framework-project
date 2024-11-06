package StepDefiniation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

import Pageobject.AlertFrameWindowspage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class AlertFrameWindowsstpes extends Base {
	public WebDriver driver;
	AlertFrameWindowspage afwp;
	public static Logger logger;
	JavascriptExecutor js;

	@Then("click on Alertframeandwindows button")
	public void click_on_alertframeandwindows_button() throws InterruptedException {
		driver = getdriver();
		logger = Logger.getLogger("QAAutomation");
		js = (JavascriptExecutor) driver;
		afwp = new AlertFrameWindowspage(driver);
		logger.info("scroll the page");
		js.executeScript("window.scrollBy(0,300)", "");
		logger.info("click on Alertframewindows button");
		afwp.clickonalertframewindowbutton();
		Thread.sleep(4000);

	}

	@Then("verify the Alertframewindows text")
	public void verify_the_alertframewindows_text() throws IOException, InterruptedException {
		logger.info("verify the text of Alert,Frame and Windows");
		System.out.println(getverifytextofAlertFramesandWindows());// null
		afwp.verifythealertfrmaewindowstext(getverifytextofAlertFramesandWindows());
		Thread.sleep(4000);
	}

	@Then("click on Browser Windows")
	public void click_on_browser_windows() throws InterruptedException {
		logger.info("scroll the page");
		js.executeScript("window.scrollBy(0,400)", "");
		logger.info("click the browsers windows");
		afwp.clickonbrowserwindows();
		Thread.sleep(4000);
	}

	@Then("verify the Browser Windows text")
	public void verify_the_browser_windows_text() throws IOException {
		logger.info("verify the browser windows text");
		afwp.verifythebrowserwindowtest(getverifybrowserswindowstext());
	}

	@Then("click on New Tab")
	public void click_on_new_tab() throws InterruptedException {
		logger.info("click on New Tab button");
		afwp.clickonnewtab_button();
		Thread.sleep(4000);
	}

	@Then("see next window open sucessfully")
	public void see_next_window_open_sucessfully() throws IOException, InterruptedException {
		logger.info("verify the new windows open");
		afwp.verify_the_newwindows(getverifythebodyofnewwindow());
		Thread.sleep(4000);

	}

	@Then("click on New Window button")
	public void click_on_new_window_button() {
		logger.info("click on new window button");
		afwp.clickonnewWindowsbutton();
	}

	@Then("click on New Windows message")
	public void click_on_new_windows_message() throws InterruptedException {
		logger.info("scroll the page");
		js.executeScript("window.scrollBy(0,200)", "");
		logger.info("click on new windows message");
		afwp.clickonnewwindowmessage();
		Thread.sleep(4000);
	}

	@Then("see next window open with some text")
	public void see_next_window_open_with_some_text() throws IOException {
		logger.info("verify the message text");
		afwp.verifythenewwindowsmessage(getverifynewwindowsmessagetext());

	}

	@Then("click on Alerts text")
	public void click_on_alerts_text() throws InterruptedException {
		logger.info("scroll the page");
		js.executeScript("window.scrollBy(0,200)", "");
		logger.info("click on Alert text");
		afwp.clickonalertsbutton();
		Thread.sleep(4000);

	}

	@Then("verify the alert text present in page")
	public void verify_the_alert_text_present_in_page() throws IOException {
		logger.info("verify the alert text ");
		afwp.verifythealerttext(getverifyalertstext());
	}

	@Then("click on click button to see alert")
	public void click_on_click_button_to_see_alert() throws InterruptedException {
		// logger.info("scroll the page");
		// js.executeScript("window.scrollBy(0,200)","");
		logger.info("click on click button to see alert");
		afwp.clickonfirstalertbutton();
		Thread.sleep(2000);

	}

	@Then("click on accept alert")
	public void click_on_accept_alert() throws IOException {
		logger.info("accept alert");
		afwp.accepthealertbutton(getalerttext());

	}

	@Then("click on alert will appear after five seconds")
	public void click_on_alert_will_appear_after_five_seconds() throws InterruptedException {
		logger.info("click on time alert");
		afwp.clickontimealert();
		Thread.sleep(6000);
	}

	@Then("click on comfirm box alert button")
	public void click_on_comfirm_box_alert_button() throws InterruptedException {
		logger.info("scroll the pae");
		js.executeScript("window.scrollBy(0,400)", "");
		logger.info("click on confirm button");
		afwp.clickonconfirmalertbutton();
		Thread.sleep(4000);
	}

	@Then("verify the alert of confirm text")
	public void verify_the_alert_of_confirm_text() throws IOException {
		logger.info("verify the comfirm text in comfirm alert");
		afwp.verify_the_alerttext(gettext());
	}

	@Then("click on prompt box alert button")
	public void click_on_prompt_box_alert_button() throws InterruptedException {
		logger.info("click on prompt alert button");
		afwp.clickonpromptedalert();
		Thread.sleep(4000);
	}

	@Then("enter the alert text")
	public void enter_the_alert_text() throws InterruptedException {
		logger.info("enter keys in alert box");
		afwp.enterkeyinalert(getpromptedalerttext());
		Thread.sleep(2000);
	}

	@Then("verify the prompted text")
	public void verify_the_prompted_text() {
		logger.info("verify the prompted text");
		afwp.verifytheprompedtext(getpromptedalerttext());
	}

//update code
	@Then("click on iframe button")
	public void click_on_iframe_button() throws InterruptedException {
		logger.info("scroll the demoQA page");
		js.executeScript("window.scrollBy(0,400)", "");

		logger.info("driver switch to iframe");
		afwp.clickoniframebutton();

		logger.info("scroll the frame page");
		js.executeScript("window.scrollBy(0,20)", "");
		Thread.sleep(2000);
	}

	@Then("verify iframe text")
	public void verify_iframe_text() throws IOException, InterruptedException {

		logger.info("verify the iframe text");
		String text = getiframetext();
		afwp.verifythetextofiframe(text);

		// driver switch to main page
		driver.switchTo().defaultContent();
		String page = driver.getPageSource();
		System.out.println("Current pagesource for main page" + page);
		Thread.sleep(3000);

	}

	@Then("verify mini iframe text")
	public void verify_mini_iframe_text() throws IOException {
		logger.info("verify the mini iframe text");
		// here we use the same text which is present in parentiframe.
		String content = getiframetext();
		afwp.verifythetextofminiiframe(content);

		// return to main frame.
		driver.switchTo().defaultContent();
		String page = driver.getPageSource();
		System.out.println("main page pagesource :" + page);

	}

	@Then("click on nested form button")
	public void click_on_nested_form_button() throws InterruptedException {
		logger.info("scroll the pae");
		js.executeScript("window.scrollBy(0,500)", "");

		logger.info("clcik on nested frame");
		afwp.clickonnestedframe();

		logger.info("scroll the nestedform page");
		js.executeScript("window.scrollBy(0,50)", "");

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		logger.info("wait 3 second");
		Thread.sleep(3000);
	}

	@Then("verify the parent iframe text.")
	public void verify_the_parent_iframe_text() throws IOException {
		logger.info("verify the parent iframe text");
		String text = getnestedparentiframevalue();
		afwp.verifythenestedparenttext(text);

	}

	@Then("verify the child iframe text.")
	public void verify_the_child_iframe_text() throws IOException {
		logger.info("verify the child iframe text");
		String childframetext = getnestedchildiframevalue();
		afwp.verifythenestedchildtext(childframetext);

		// driver switchto parent frame
		driver.switchTo().parentFrame();

		// driver switch to main page
		driver.switchTo().defaultContent();

	}

	@Then("click on modal dialogs")
	public void click_on_modal_dialogs() {
		logger.info("scroll the page");
		js.executeScript("window.scrollBy(0,400)", "");
		logger.info("click on modal dialogs");
		afwp.clickonmodaldialogs();
	}

	@Then("verify the text present in model dialogs")
	public void verify_the_text_present_in_model_dialogs() throws IOException {
		logger.info("verify the text present in modal dialogs");
		String text = getModaltext();
		afwp.verifythetextofmodaldialogs(text);
	}

	// error will come
	@Then("click on small dialogs")
	public void click_on_small_dialogs() {
		logger.info("click on small dialogs");
		afwp.clickonsmalldialogs();

	}

	@Then("verify the text of small dialogs")
	public void verify_the_text_of_small_dialogs() throws IOException {
		logger.info("verify the text of small dialogs");
		String text = getsmallModaldialogstext();
		afwp.verifythetextofsmalldialogs(text);
		afwp.clickonsmalldialogsclose();
	}

	@Then("click on large dialogs")
	public void click_on_large_dialogs() {
		logger.info("click on large dialogs");
		afwp.clickonlargemodaldialogs();
	}

	@Then("verify the text of large dialogs")
	public void verify_the_text_of_large_dialogs() throws IOException {
		logger.info("verify the test of large dialogs");
		String text = getlargeModaldialogstext();
		afwp.verifythetextoflargemodaldialogs(text);
		afwp.clickonlargedilogsclose();
	}

	/*
	 * @AfterTest
	 * 
	 * public void tearDown(Scenario scenario) { if (scenario.isFailed()) { // Take
	 * a screenshot... final byte[] screenshot = ((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES); scenario.attach(screenshot,
	 * "image/png", scenario.getName()); // ... and embed it in the report. } }
	 */

}
