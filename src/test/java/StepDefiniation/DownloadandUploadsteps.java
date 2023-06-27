package StepDefiniation;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pageobject.DownloadandUploadpage;
import io.cucumber.java.en.Then;

public class DownloadandUploadsteps extends Base{
public WebDriver driver;
DownloadandUploadpage daup;
JavascriptExecutor js;
public static Logger logger;

@Then("click on download and upload images")
public void click_on_download_and_upload_images() throws InterruptedException{
	js=(JavascriptExecutor)getdriver();
	daup=new DownloadandUploadpage(getdriver());
	logger=Logger.getLogger("ToolsQA");
   logger.info("scroll the page");
   js.executeScript("window.scrollBy(0,500)", "");
   logger.info("click on download and upload image");
   daup.clickondownloadandupload();
   Thread.sleep(4000);
   
}

@Then("upload the file in upload file button")
public void upload_the_file_in_upload_file_button() throws IOException, InterruptedException {
    logger.info("upload the file in upload file button");
    daup.sendfiletouploadfile(getuploadfile());
    Thread.sleep(4000);
}

@Then("verify the file path")
public void verify_the_file_path() throws IOException {
	logger.info("scroll the page");
	js.executeScript("window.scrollBy(0,200)","");
   logger.info("verify the upload file");
   daup.verifytheuploadedfilepath(getverify_file_path());
}
	

}
