package salezRobotWebsite;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;
import rsoft_web_Application_All_Elements.Rsoft_web_Application_All_Elements_and_All_Methods;

public class SalezRobot_Website extends ProjectSpecificMethods{
	public SalezRobot_Website(RemoteWebDriver driver, ExtentTest node, Properties prop, String Environment, String StageUrl,
			            String Stage1Url){
		this.driver = driver;
		this.node = node;
		this.prop = prop;
		this.Environment = Environment;
		this.StageURL = StageUrl;
		this.Stage1URL = Stage1Url;
	}
	
	
	@Given("Launch SalezRobot Website")
	public void launch_Salezrobot_Website() {
		if(Environment.equalsIgnoreCase("Live")) {
			navigateto(StageURL);
		}else {
			navigateto(Stage1URL);
		}
	}
	
	
	public void appScrollingFunction() throws InterruptedException{
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		scrollByXY(0, 1000);
	     Thread.sleep(1000);
	     scrollByXY(0, 700);
	     Thread.sleep(2000);
	     scrollByXY(0, 700);
	     Thread.sleep(2000);
	     scrollByXY(0,800);
	     Thread.sleep(2000);
	     scrollToBottom();
	     Thread.sleep(2000);
	     scrollToHeight();
	     Thread.sleep(2000);
	     f.rsoftLinkText("Skip Intro").click();
	}
	
	
	@When("Verify the All Clickable Elements")
	public void clickable_Element_Verification() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
	    verify_report_Click(f.rsoftLinkText("Home"), f.rsoftLinkText("Home").getText(), url());
	    try {
	    WebElement content_h1 = driver.findElement(By.xpath("//h1[text()='Sales Improvement CRM Software']"));
	    if(content_h1.isDisplayed()) {
	    	String a = f.rsoftLinkText("Home").getText()+" is Displayed<br />"+url();
	    	reportStep2(a, "PASS");
	    }else {
	    	String a = f.rsoftLinkText("Home").getText()+" is Not Displayed<br />"+url();
	    	reportStep2(a, "FAIL");
	    }
	}catch(Exception g) {
    	reportStep2("Header content is not displayed<br />", "FAIL");
	}
	    appScrollingFunction();
	    kebabFunctions();
	    aboutLink();
	    dataEntryForm();
	    
	}
	
	public void aboutLink() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
	    verify_report_Click(f.rsoftLinkText("About"), f.rsoftLinkText("About").getText(), url());
		verify_report_Click(f.rsoftLinkText("Get started today"), f.rsoftLinkText("Get started today").getText(), url());
		
	}
	
	public void dataEntryForm() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		WebElement name = driver.findElement(By.name("name"));
		clearAndType(name, "Santhosh", url());
		
		WebElement submit = driver.findElement(By.className("button"));
		verify_report_Click(submit, "Submit Button", url());
		
		WebElement email = driver.findElement(By.name("email"));
		clearAndType(email, "sk@gmail.com", url());
		
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
		clearAndType(phoneNumber, "1234567890", url());
		
		WebElement companyName = driver.findElement(By.name("Company"));
		clearAndType(companyName, "Richie Rich", url());
		
		WebElement dropDown = driver.findElement(By.tagName("select"));
		verify_report_Click(dropDown, "State Field", url());
		
		WebElement message = driver.findElement(By.id("message"));
		clearAndType(message, "Hello rsoft", url());
		
		WebElement close = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		verify_report_Click(close, "Close Button", url());
		
	}
	
	public WebElement kebabNavigationButton() {
		WebElement kebab = driver.findElement(By.xpath("//label[@class='navigation__button home']"));
		return kebab;
	}
	
	public void kebabFunctions() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
        jsClick(f.rsoftLinkText("Home"), f.rsoftLinkText("Home").getText(), url());	
        
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
		jsClick(f.rsoftLinkText("About"), f.rsoftLinkText("About").getText(), url());	
		
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
		jsClick(f.rsoftLinkText("Pricing"), f.rsoftLinkText("Pricing").getText(), url());	
		
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
		jsClick(f.rsoftLinkText("Products"), f.rsoftLinkText("Products").getText(), url());	
		
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
		jsClick(f.rsoftLinkText("Contact us"), f.rsoftLinkText("Contact us").getText(), url());			
	}
}
