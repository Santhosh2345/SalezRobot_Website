package salezRobotWebsite;

import java.util.ArrayList;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
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
	
	String contact = "Not_Contact";
	
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
	     try {
	    	 WebElement close = driver.findElement(By.id("closeClick"));
	 		 close.click();
	     }catch(Exception g) {
	    	 System.out.println("Chatbot not opened");
	     }
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
	    HomeLink();
	    aboutLink();
	    pricing();
	    products();
	    contact();
	    WebElement freedemo = driver.findElement(By.xpath("//a[text()='free demo ']"));
	    jsClick(freedemo, "Free Demo", url());
	    dataEntryForm();
	    
	}
	
	public void HomeLink() throws InterruptedException {
		scroll(getStartedTody(1));
		click2(getStartedTody(1), getStartedTody(1).getText(), url());
		dataEntryForm();
		refresh();
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		scrollToBottom();
		Thread.sleep(3000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
		//chatBot();
		kebabFunctions();
		}
	
	public void aboutLink() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
	    verify_report_Click(f.rsoftLinkText("About"), f.rsoftLinkText("About").getText(), url());
		verify_report_Click(f.rsoftLinkText("Get started today"), f.rsoftLinkText("Get started today").getText(), url());
		dataEntryForm();
		refresh();
		scrollToBottom();
		Thread.sleep(2000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
	}
	
	
	public void pricing() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Pricing"), f.rsoftLinkText("Pricing").getText(), url());
		verify_report_Click(f.rsoftLinkText("Get started today"), f.rsoftLinkText("Get started today").getText(), url());
		dataEntryForm();
		refresh();
		scroll(f.rsoftLinkText("Get started today"));
		Thread.sleep(2000);
        WebElement switchButton = driver.findElement(By.id("switcher"));
        switchButton.click();
        switchButton.click();
        scroll(switchButton);
        WebElement signUp1 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[1]"));
        scroll(switchButton);
        signUp1.click();
        WebElement signUp2 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[2]"));
        scroll(switchButton);
        signUp2.click();
        WebElement signUp3 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[3]"));
        scroll(switchButton);
        signUp3.click();
        WebElement signUp4 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[4]"));
        scroll(switchButton);
        signUp4.click();
        scroll(driver.findElement(By.xpath("//h2[text()='FAQ’s']")));
        Thread.sleep(1000);
        jsClick(getStartedTody(1), getStartedTody(1).getText(), url());
        dataEntryForm();
        refresh();
        jsClick_Only(minus(1));  jsClick_Only(plus(2));       jsClick_Only(minus(2));
        jsClick_Only(plus(3));   jsClick_Only(minus(3));      jsClick_Only(plus(4));   jsClick_Only(minus(4));
        jsClick_Only(plus(5));   jsClick_Only(minus(5));      jsClick_Only(plus(6));   jsClick_Only(minus(6));
        jsClick_Only(plus(7));   jsClick_Only(minus(7));      jsClick_Only(plus(8));   jsClick_Only(minus(8));
        jsClick_Only(plus(9));   jsClick_Only(minus(9));
        scrollToBottom();
        getStartedbottom().click();
        dataEntryForm();
        refresh();
	}
	
	public void products() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Products"), f.rsoftLinkText("Products").getText(), url());
		verify_report_Click(f.rsoftLinkText("Get started today"), f.rsoftLinkText("Get started today").getText(), url());
		dataEntryForm();
		refresh();
		scrollToBottom();
        getStartedbottom().click();
        dataEntryForm();
        refresh();
	}
	
	public void contact() throws InterruptedException {
		contact = "Contact";
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Contact us"), f.rsoftLinkText("Contact us").getText(), url());
//		WebElement contactNum = driver.findElement(By.xpath("(//a[contains(text(),'044')])[2]"));
//		contactNum.click();
//		refresh();
//		
//		WebElement contactEmail = driver.findElement(By.xpath("(//a[contains(text(),'.com')])[2]"));
//		contactEmail.click();
//		Thread.sleep(2000);
//		refresh();
		dataEntryForm();
		refresh();

		verify_report_Click(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();

	}
	public void dataEntryForm() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		try {
		WebElement name = driver.findElement(By.name("contactname"));
		clearAndType(name, "Santhosh", url());
		}catch(Exception g) {
			WebElement name = driver.findElement(By.name("name"));
			clearAndType(name, "Santhosh", url());
		}
		
		try {
		WebElement submit = driver.findElement(By.className("button"));
		act().moveToElement(submit).click().perform();
		}catch(Exception g) {
			WebElement submit = driver.findElement(By.xpath("//input[@class='button']"));
			act().moveToElement(submit).click().perform();
		}
		
		if(contact.equalsIgnoreCase("Contact")) {
		try {
			WebElement lastName = driver.findElement(By.name("lname"));
			clearAndType(lastName, "Kumar", url());
		}catch(Exception g) {
			
		}
		}
		
		try {
		WebElement email = driver.findElement(By.name("contactemail"));
		clearAndType(email, "sk@gmail.com", url());
		}catch(Exception g) {
			WebElement email = driver.findElement(By.name("email"));
			clearAndType(email, "Santhosh", url());
		}
		
		try {
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='contactphone']"));
		clearAndType(phoneNumber, "1234567890", url());
		}catch(Exception g) {
			WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
			clearAndType(phone, "1234567890", url());
		}
		
		try {
		WebElement companyName = driver.findElement(By.name("companyname"));
		clearAndType(companyName, "Richie Rich", url());
		}catch(Exception g) {
			WebElement companyName = driver.findElement(By.name("Company"));
			clearAndType(companyName, "Richie Rich", url());
		}
		
		try {
		WebElement dropDown = driver.findElement(By.name("state"));
		verify_report_Click(dropDown, "State Field", url());
		}catch(Exception g) {
			WebElement dropDown = driver.findElement(By.xpath("//select[@name='text']"));
			verify_report_Click(dropDown, "State Field", url());
		}
		
		try {
		WebElement message = driver.findElement(By.xpath("(//textarea[@name='message'])"));
		clearAndType(message, "Hello rsoft", url());
		}catch(Exception g) {
			WebElement message = driver.findElement(By.xpath("(//textarea[@name='message'])[2]"));
			clearAndType(message, "Hello rsoft", url());
		}
		
		try {
		WebElement close = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		verify_report_Click(close, "Close Button", url());
		}catch(Exception g) {
			System.out.println("No Close Button");
		}
		
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
		
		
		//FB Link in Kebab Button
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
        fbLinkButton(1).click();
		try {
			WebElement fbPage = driver.findElement(By.xpath("//h1[text()='SalezRobot CRM']"));
			if(fbPage.isDisplayed()) {
				String a = "SalezRobot FB Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
			}else {
				String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
		}
		
		
		//Linkedin Link in Kebab Button
		verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
        linkedingLinkButton(1).click();
        try {
			WebElement linkedInPage = driver.findElement(By.xpath("//button[text()[normalize-space()='Sign in']]"));
			if(linkedInPage.isDisplayed()) {
				WebElement close = driver.findElement(By.xpath("(//button[@aria-label='Dismiss'])[2]"));
				close.click();
				WebElement SalezrobotPage = driver.findElement(By.xpath("//h1[text()[normalize-space()='SalezRobot CRM']]"));
				if(SalezrobotPage.isDisplayed()) {
				String a = "SalezRobot Linkedin Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				}
			}else {
				String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
		}
        
        
        
        //Instagram Link in Kebab Button
        verify_report_Click(kebabNavigationButton(), "Kebab Button", url());
        instaLinkButton(1).click();
	}
	
	public WebElement getStartedTody(int num) {
		WebElement getStart = driver.findElement(By.xpath("(//span[text()='Get started today'])["+num+"]"));
        return getStart;
	}
	
	public WebElement getStartedbottom() {
		WebElement getStartedbottom = driver.findElement(By.xpath("//a[text()=' Get started today ']"));
		return getStartedbottom;

	}
	public void chatBot() throws InterruptedException {
		WebElement chat = driver.findElement(By.id("imgg"));
		verify_report_Click(chat, "Chat Bot", url());
		WebElement crm = driver.findElement(By.xpath("//li/p[text()='SalezRobot CRM']"));
		mouseMove(crm);
		WebElement ivr = driver.findElement(By.xpath("//li/p[text()='RPHone IVR']"));
		mouseMove(ivr);
		WebElement bot = driver.findElement(By.xpath("//li/p[text()='RBot Chatbot']"));
		mouseMove(bot);
		WebElement whatsapp = driver.findElement(By.xpath("//li/p[text()='Whatsapp API']"));
		mouseMove(whatsapp);
		WebElement other = driver.findElement(By.xpath("//li/p[text()='Others']"));
		mouseMove(other);
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		f.allButtonWithTextXpath("Confirm", "Top").click();
		f.allButtonWithTextXpath("messageboxid", "Top").sendKeys("Hello");
		f.clear(f.allButtonWithTextXpath("messageboxid", "Top"), url());
		WebElement send = driver.findElement(By.xpath("//i[text()='near_me']"));
		send.click();
		WebElement refresh = driver.findElement(By.id("refreshClick"));
		refresh.click();
		WebElement close = driver.findElement(By.id("closeClick"));
		close.click();
	}
	
	public WebElement plus(int num) {
		try {
		WebElement plus = driver.findElement(By.xpath("(//div[@class='horizontal'])["+num+"]"));
		return plus;
		}
		catch(Exception g) {
			return null;
		}
	}
	
	public WebElement minus(int num) {
		try {
		WebElement plus = driver.findElement(By.xpath("(//div[@class='vertical'])["+num+"]"));
		return plus;
		}
		catch(Exception g) {
			return null;
		}
	}
	
	
	public WebElement footerElement() {
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer']"));
		return footer;

	}
	
	
	public void footerElementList() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);

		ArrayList<String> about_SalezRobot = new ArrayList<>();
		about_SalezRobot.add("Customer Case Study");   about_SalezRobot.add("Channel Partners");   
		about_SalezRobot.add("Customers");    about_SalezRobot.add("Pricing");
		about_SalezRobot.add("Career");   about_SalezRobot.add("GDPR");   
		about_SalezRobot.add("Contact Us");
		for (int i = 0; i < about_SalezRobot.size(); i++) {
			scroll(footerElement());
			Thread.sleep(1000);
			try {
			jsClick_Only(f.rsoftLinkText(about_SalezRobot.get(i)));
			System.out.println(f.rsoftLinkText(about_SalezRobot.get(i)).getText());
			}catch(Exception g) {
				String a = f.rsoftLinkText(about_SalezRobot.get(i)).getText()+" in Footer is not clickable<br />"+url();
				reportStep2(a, "Fail");
			}
		}
		
		ArrayList<String> top_Features = new ArrayList<>();
		top_Features.add("Lead Management");     top_Features.add("Sales Management");
		top_Features.add("Contact Management");     top_Features.add("Ticket Management");
		top_Features.add("Marketing Automation");     top_Features.add("Integrations");
		top_Features.add("Sales Activities");
		for (int i = 0; i < top_Features.size(); i++) {
			scroll(footerElement());
			Thread.sleep(1000);
			try {
			jsClick_Only(f.rsoftLinkText(top_Features.get(i)));
			System.out.println(f.rsoftLinkText(top_Features.get(i)).getText());
			}catch(Exception g) {
				String a = f.rsoftLinkText(top_Features.get(i)).getText()+" in Footer is not clickable<br />"+url();
				reportStep2(a, "Fail");
			}
		}
		
		ArrayList<String> crmByIndustry = new ArrayList<>();
		crmByIndustry.add("Real Estate");      crmByIndustry.add("Educational Institute");
		crmByIndustry.add("Healthcare");      crmByIndustry.add("Banking & Financial");
		crmByIndustry.add("Automobile");      crmByIndustry.add("Manufacturing");
		crmByIndustry.add("Travel Agency");
		for (int i = 0; i < crmByIndustry.size(); i++) {
			scroll(footerElement());
			Thread.sleep(1000);
			try {
			jsClick_Only(f.rsoftLinkText(crmByIndustry.get(i)));
			System.out.println(f.rsoftLinkText(crmByIndustry.get(i)).getText());
			}catch(Exception g) {
				String a = f.rsoftLinkText(crmByIndustry.get(i)).getText()+" in Footer is not clickable<br />"+url();
				reportStep2(a, "Fail");
			}
		}
		
		ArrayList<String> resources = new ArrayList<>();
		resources.add("Request Free Demo");      resources.add("CRM Videos");
		resources.add("Blog");      resources.add("CRM Comparison");
		resources.add("Alternative CRM");      resources.add("CRM Software");
		resources.add("FAQ");
		for (int i = 0; i < resources.size(); i++) {
			scroll(footerElement());
			Thread.sleep(1000);
			try {
			jsClick_Only(f.rsoftLinkText(resources.get(i)));
			System.out.println(f.rsoftLinkText(resources.get(i)).getText());
			}catch(Exception g) {
				String a = f.rsoftLinkText(resources.get(i)).getText()+" in Footer is not clickable<br />"+url();
				reportStep2(a, "Fail");
			}
		}
		
		ArrayList<String> getHelp = new ArrayList<>();
		getHelp.add("Help Center");     getHelp.add("API Documentation");
		getHelp.add("Download Desktop App");  
		for (int i = 0; i < getHelp.size(); i++) {
			scroll(footerElement());
			Thread.sleep(1000);
			try {
			jsClick_Only(f.rsoftLinkText(getHelp.get(i)));
			System.out.println(f.rsoftLinkText(getHelp.get(i)).getText());
			}catch(Exception g) {
				String a = f.rsoftLinkText(getHelp.get(i)).getText()+" in Footer is not clickable<br />"+url();
				reportStep2(a, "Fail");
			}
		}
		
		try {
		WebElement mob_GooglePlay = driver.findElement(By.xpath("//img[@src='images/gplay-img.png']"));
		jsClick_Only(mob_GooglePlay);
		}catch(Exception g) {
			String a = "Google Playstore link is not clickable<br />"+url();
			reportStep2(a, "Fail");
		}
		
		try {
		WebElement mob_AppStore = driver.findElement(By.xpath("//img[@src='images/app-store-img.png']"));
		jsClick_Only(mob_AppStore);
		}catch(Exception g) {
			String a = "Appstore link is not clickable<br />"+url();
			reportStep2(a, "Fail");
		}
	}
	
	
	public void socialMediaLink()throws InterruptedException {
		scrollToBottom();
		Thread.sleep(1000);
		fbLinkButton(2).click();
		scrollToBottom();
		Thread.sleep(1000);
		twitterLinkButton(2).click();
		scrollToBottom();
		Thread.sleep(1000);
		linkedingLinkButton(2).click();
		scrollToBottom();
		Thread.sleep(1000);
		instaLinkButton(2).click();
		refresh();
		scrollToBottom();
		Thread.sleep(1000);
		youtubeLinkButton(2).click();
	}
	public WebElement fbLinkButton(int num) {
		try {
		WebElement fb = driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])["+num+"]"));
		return fb;
		}catch(Exception g) {
			String a = "Facebook link is not clickable<br />"+url();
			reportStep2(a, "Fail");
			return null;
		}
	}
	
	public WebElement twitterLinkButton(int num) {
		try {
			WebElement twitter = driver.findElement(By.xpath("(//i[@class='fa fa-twitter'])["+num+"]"));
			return twitter;
			}catch(Exception g) {
				String a = "Twitter link is not clickable<br />"+url();
				reportStep2(a, "Fail");
				return null;
			}
	}
	
	public WebElement linkedingLinkButton(int num) {
		try {
			WebElement linkedin = driver.findElement(By.xpath("(//i[@class='fa fa-linkedin'])["+num+"]"));
			return linkedin;
			}catch(Exception g) {
				String a = "Linkedin link is not clickable<br />"+url();
				reportStep2(a, "Fail");
				return null;
			}
	}
	
	public WebElement instaLinkButton(int num) {
		try {
			WebElement instagram = driver.findElement(By.xpath("(//i[@class='fa fa-instagram'])["+num+"]"));
			return instagram;
			}catch(Exception g) {
				String a = "Instagram link is not clickable<br />"+url();
				reportStep2(a, "Fail");
				return null;
			}
	}
	
	public WebElement youtubeLinkButton(int num) {
		try {
			WebElement youtube = driver.findElement(By.xpath("(//i[@class='fa fa-youtube-play'])["+num+"]"));
			return youtube;
			}catch(Exception g) {
				String a = "Youtube link is not clickable<br />"+url();
				reportStep2(a, "Fail");
				return null;
			}
	}
}


















