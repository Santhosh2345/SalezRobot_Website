package salezRobotWebsite;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import rsoft_web_Application_All_Elements.Rsoft_web_Application_All_Elements_and_All_Methods;
import salezrobot_Website_Clickable_Elements.Salezrobot_Website_Chatbot_Element;
import salezrobot_Website_Clickable_Elements.Salezrobot_Website_Clickable_Elements;

public class SalezRobot_Website extends Salezrobot_Website_Clickable_Elements{
	public SalezRobot_Website(RemoteWebDriver driver, ExtentTest node, Properties prop, String Environment,
			                   String StageUrl, String Stage1Url) {
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
		Salezrobot_Website_Chatbot_Element d = new Salezrobot_Website_Chatbot_Element();
		Thread.sleep(7000);
	    try {
	    	d.cb_close().click();
	    }catch(Exception g) {
	    	String a = "Automatic Open was not opened<br />"+url();
	    	reportStep2(a, "FAIL");
	    }
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
	     skipIntro().click();
	     Thread.sleep(5000);
	     
	}
	
	
	@When("Verify the All Clickable Elements")
	public void clickable_Element_Verification() throws InterruptedException {
	    appScrollingFunction();
	    homePage();
	    aboutPage();
	    pricingPage();
	    productsPage();
	    contactUsPage();
	    jsClick(freeDemo(), "Free Demo", url());
	    dataEntryForm();
	    
	}
	
	@And("Finish The Test")
	public void homePage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
	    verify_report_Click(home(), home().getText(), url());
	    skipIntro().click();
	    
	    //Read Customer Stories
	    scroll(readCustomerStories());
	    readCustomerStories().click();
	    
	    //Following Salez Robot For
	    scroll(salezRobotForButtonToClose());
	    salezRobotForButtonToClose().click();
	    salezRobotForButtonToOpen(1).click();
	    salezRobotForButtonToClose().click();
	    salezRobotForButtonToOpen(2).click();
	    salezRobotForButtonToClose().click();
	    salezRobotForButtonToOpen(3).click();
	    salezRobotForButtonToClose().click();
	    salezRobotForButtonToOpen(4).click();
	    salezRobotForButtonToClose().click();
	    salezRobotForButtonToOpen(5).click();
	    salezRobotForButtonToClose().click();
	    
	    //Middle Get Started Today
		scroll(getStartedTodayMiddle());
		click2(getStartedTodayMiddle(), getStartedTodayMiddle().getText(), url());
		dataEntryForm();
		refresh();
		
		//Social Media
		socialMediaLink();
		
		//Footer Elements
		scrollToBottom();
		footerElementList();
        scroll(pricing());
        pricing().click();
		home().click();
		
		//Bottom Get Started Today
		scrollToBottom();
		Thread.sleep(3000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
		kebabSocialMediaLink();
		}
	
	public void aboutPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
	    verify_report_Click(about(), about().getText(), url());
	    
	    //Top Get Started Today
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		
		//Our Journey
	    for (int i = 0; i >=0; i++) {
		
				try {
				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(ourJourneyNext()));
				ourJourneyNext().click();
				}catch(Exception h) {
					break;
				}
	    }
	    for (int j = 0; j >=0; j++) {
				try {
					WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(ourJourneyPrevious()));
					ourJourneyPrevious().click();
					}catch(Exception h) {
						break;
					}
			}
		
	    
	    //Our Team
	    ourTeam(1).click();
	    Thread.sleep(2000);
	    ourTeam(2).click();
	    Thread.sleep(2000);
	    ourTeam(3).click();
	    Thread.sleep(2000);
	    ourTeam(4).click();
	    
	    //Clients Review
		clientsReviewClicks();    
		    
		//Footer Elements
		footerElementList();
        scroll(pricing());
        pricing().click();
        about().click();
        
		scrollToBottom();
		Thread.sleep(2000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
		kebabSocialMediaLink();
	}
	
	
	public void pricingPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
		verify_report_Click(pricing(), pricing().getText(), url());
		
		//Get Started Today TOp
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		
		
		//Plans
		scroll(getStartedTodayTop());
		Thread.sleep(2000);
        WebElement usd = driver.findElement(By.xpath("//li[text()='USD']"));
        usd.click();
        WebElement inr = driver.findElement(By.xpath("//li[text()='INR']"));
        inr.click();
        WebElement gbp = driver.findElement(By.xpath("//li[text()='GBP']"));
        gbp.click();
        refresh();
        
        //Plans
        mouseMove(basicPlan());
        Thread.sleep(2000);
        jsClick_Only(basicPlan());
        Thread.sleep(2000);
        mouseMove(enterprisePlan());
        Thread.sleep(2000);
        jsClick_Only(enterprisePlan());
        Thread.sleep(2000);
        mouseMove(customisedPlan());
        Thread.sleep(2000);
        jsClick_Only(customisedPlan());
        Thread.sleep(2000);
        
        mouseMove(basicPlan_Signup());
        Thread.sleep(2000);
        jsClick_Only(basicPlan_Signup());
        Thread.sleep(2000);
        mouseMove(enterprisePlan_Signup());
        Thread.sleep(2000);
        jsClick_Only(enterprisePlan_Signup());
        Thread.sleep(2000);
        mouseMove(customisedPlan_Signup());
        Thread.sleep(2000);
        jsClick_Only(customisedPlan_Signup());
        Thread.sleep(2000);
        
        //Clients Review
        clientsReviewClicks();  
      		
      	
      	//Get Started Today Middle
        scroll(driver.findElement(By.xpath("//h2[text()='FAQ’s']")));
        Thread.sleep(1000);
        jsClick(getStartedTodayMiddle(), getStartedTodayMiddle().getText(), url());
        dataEntryForm();
        refresh();
        
        //FAQ's
        jsClick_Only(minus(1));  jsClick_Only(plus(2));       jsClick_Only(minus(2));
        jsClick_Only(plus(3));   jsClick_Only(minus(3));      jsClick_Only(plus(4));   jsClick_Only(minus(4));
        jsClick_Only(plus(5));   jsClick_Only(minus(5));      jsClick_Only(plus(6));   jsClick_Only(minus(6));
        jsClick_Only(plus(7));   jsClick_Only(minus(7));      jsClick_Only(plus(8));   jsClick_Only(minus(8));
        jsClick_Only(plus(9));   jsClick_Only(minus(9));
        
        //Footer Elements
        footerElementList();
        scroll(pricing());
        pricing().click();
        
        //Scocial Media Link
        scrollToBottom();
        facebook(2);
        twitter(2);
        linkedin(2);
        instagram(2);
        youtube(2);
        
        //Get Started Today Bottom
        getStartedbottom().click();
        dataEntryForm();
        refresh();
	}
	
	public void productsPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
		verify_report_Click(products(), products().getText(), url());
		
		//Get Started Today Top
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		
		//Clients Review
  		clientsReviewClicks(); 
  		
  		//Footer Elements
        footerElementList();
        scroll(pricing());
        pricing().click();
        products().click();
        
        //Scocial Media Link
        scrollToBottom();
        facebook(2);
        twitter(2);
        linkedin(2);
        instagram(2);
        youtube(2);
        
		//Get Started Today Bottom
		scrollToBottom();
        getStartedbottom().click();
        dataEntryForm();
        refresh();
	}
	
	public void contactUsPage() throws InterruptedException {
		contact = "Contact";
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
		verify_report_Click(contactUs(), contactUs().getText(), url());
	    
	    //Get Started Today Top
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		phoneNumber();
		refresh();
		
		WebElement contactEmail = driver.findElement(By.xpath("(//a[contains(text(),'.com')])[2]"));
		emailContact();
		refresh();
		
		//Bottom Entry Form
		dataEntryForm();
		refresh();

		//Footer Elements
        footerElementList();
        scroll(pricing());
        pricing().click();
  		contactUs().click();
  		
        //Scocial Media Link
        scrollToBottom();
        facebook(2);
        twitter(2);
        linkedin(2);
        instagram(2);
        youtube(2);
        
		//Get Started Today Bottom
		verify_report_Click(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();

	}
	public void dataEntryForm() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		try {
		WebElement name = driver.findElement(By.name("contactname"));
		clearAndType(name, "Santhosh", url());
		}catch(Exception g) {
			try {
			WebElement name = driver.findElement(By.name("name"));
			clearAndType(name, "Santhosh", url());
			}catch(Exception h) {
				WebElement name = driver.findElement(By.xpath("(//input[@name='contactname'])[2]"));
				clearAndType(name, "Santhosh", url());
			}
		}
		
		try {
		WebElement submit = driver.findElement(By.className("button"));
		act().moveToElement(submit).click().perform();
		}catch(Exception g) {
			try {
			WebElement submit = driver.findElement(By.xpath("//input[@class='button']"));
			act().moveToElement(submit).click().perform();
			}catch(Exception k) {
				WebElement submit = driver.findElement(By.xpath("(//input[@class='button'])[2]"));
				act().moveToElement(submit).click().perform();
			}
		}
		
		try {
		WebElement email = driver.findElement(By.name("contactemail"));
		clearAndType(email, "sk@gmail.com", url());
		}catch(Exception g) {
			try {
			WebElement email = driver.findElement(By.name("email"));
			clearAndType(email, "Santhosh", url());
			}catch(Exception hh) {
				WebElement email = driver.findElement(By.xpath("(//input[@name='contactemail'])[2]"));
				clearAndType(email, "Santhosh", url());
			}
		}
		
		try {
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='contactphone']"));
		clearAndType(phoneNumber, "1234567890", url());
		}catch(Exception g) {
			try {
			WebElement phone = driver.findElement(By.xpath("//input[@placeholder='Phone Number']"));
			clearAndType(phone, "1234567890", url());
			}catch(Exception jj) {
				WebElement phone = driver.findElement(By.xpath("(//input[@name='contactphone'])[2]"));
				clearAndType(phone, "1234567890", url());
			}
		}
		
		try {
		WebElement companyName = driver.findElement(By.name("companyname"));
		clearAndType(companyName, "Richie Rich", url());
		}catch(Exception g) {
			try {
			WebElement companyName = driver.findElement(By.name("Company"));
			clearAndType(companyName, "Richie Rich", url());
			}catch(Exception dd){
				WebElement companyName = driver.findElement(By.xpath("(//input[@name='companyname'])[2]"));
				clearAndType(companyName, "Richie Rich", url());
			}
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
			try {
			WebElement message = driver.findElement(By.xpath("(//textarea[@name='message'])[2]"));
			clearAndType(message, "Hello rsoft", url());
			}catch(Exception ss) {
				WebElement message = driver.findElement(By.xpath("(//textarea[@name='message'])[2]"));
				clearAndType(message, "Hello rsoft", url());
			}
		}
		
		try {
		WebElement close = driver.findElement(By.xpath("//button[@aria-label='Close']"));
		verify_report_Click(close, "Close Button", url());
		}catch(Exception g) {
			System.out.println("No Close Button");
		}
		
	}
	
	
	
	//Kebab Button Function
	public void kebabPageLink() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
        
		verify_report_Click(kebabButton(), "Kebab Button", url());
		jsClick(about(), about().getText(), url());	
		
		back();
		jsClick(pricing(), pricing().getText(), url());	
		
		back();
		jsClick(products(), products().getText(), url());	
		
		back();
		jsClick(contactUs(), contactUs().getText(), url());	
		
		back();
        jsClick(home(), home().getText(), url());	
        
//        jsClick_Only(kebabButton());
//        jsClick(Kebab_phoneNumber(), "Kebab Phone Contact", url());	
//        refresh();
//        
//        if(Kebab_emailContact().isDisplayed()) {
//        	jsClick(Kebab_emailContact(), "Kebab Email Contact", url());	
//        }else {
//        jsClick_Only(kebabButton());
//        jsClick(Kebab_emailContact(), "Kebab Email Contact", url());	
//        }
	}
	
	
	public void kebabSocialMediaLink() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(kebabButton(), "Kebab Button", url());
		facebook(1);
		twitter(1);
        linkedin(1);
        instagram(1);
        youtube(1);
        
        verify_report_Click(kebabButton(), "Kebab Button", url());
	}
	
	
	public void footerElementList() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);

		ArrayList<String> about_SalezRobot = new ArrayList<>();
		about_SalezRobot.add("Customer Case Study");   about_SalezRobot.add("Channel Partners");   
		about_SalezRobot.add("Customers");    //about_SalezRobot.add("Pricing");
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
	
	//Footer Pricing Element
	public WebElement pricingFooter() {
		try {
			WebElement pricing = driver.findElement(By.linkText("Pricing"));
			return pricing;
		}catch(Exception g) {
			return null;
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
	
	//Clients Review
	public void clientsReviewClicks() {
	    for (int i = 0; i >=0; i++) {
			
					try {
					WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
					wait.until(ExpectedConditions.visibilityOf(clientsReviewNext()));
					clientsReviewNext().click();
					}catch(Exception h) {
						break;
					}
		    }
		    for (int j = 0; j >=0; j++) {
					try {
						WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
						wait.until(ExpectedConditions.visibilityOf(clientsReviewPrevious()));
						clientsReviewPrevious().click();
						}catch(Exception h) {
							break;
						}
				}
	}
	
	
	//FB Page Function
	public WebElement facebook(int num) throws InterruptedException {
		fbLinkButton(num).click();
        Thread.sleep(3000);
        ArrayList<String> arr = windowHandles();
        System.out.println(arr.size());
        if(arr.size()>1) {
        	driver.switchTo().window(arr.get(1));
		try {
			WebElement fbPage = driver.findElement(By.xpath("//h1[text()='SalezRobot CRM']"));
			if(fbPage.isDisplayed()) {
				String a = "SalezRobot FB Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(arr.get(0));
				return fbPage;
			}else {
				String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
				return fbPage; 
			}
		}catch(Exception g) {
			String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
			return null;
		}
        }else {
        	try {
    			WebElement fbPage = driver.findElement(By.xpath("//h1[text()='SalezRobot CRM']"));
    			if(fbPage.isDisplayed()) {
    				String a = "SalezRobot FB Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    				return fbPage;
    			}else {
    				String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
    				reportStep2(a, "FAIL");
    				return fbPage;
    			}
    		}catch(Exception g) {
    			String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
    			reportStep2(a, "FAIL");
    			return null;
    		}
        }
	}
	
	
	//Twitter Function
	public void twitter(int num) throws InterruptedException {
		twitterLinkButton(num).click();
        Thread.sleep(3000);
        ArrayList<String> arr3 = windowHandles();
        System.out.println(arr3.size());
        if(arr3.size()>1) {
        	driver.switchTo().window(arr3.get(1));
        try {
			WebElement insta = driver.findElement(By.xpath("//h2[text()='salezrobot']"));
			if(insta.isDisplayed()) {
				String a = "SalezRobot Twitter Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(arr3.get(0));
			}else {
				String a = "SalezRobot Twitter Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			String a = "SalezRobot Twitter Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
			back();
		}
        }else {
        	try {
    			WebElement insta = driver.findElement(By.xpath("//h2[text()='salezrobot']"));
    			if(insta.isDisplayed()) {
    				String a = "SalezRobot Twitter Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    			}else {
    				String a = "SalezRobot Twitter Page is Not Dispalyed<br >"+url();
    				reportStep2(a, "FAIL");
    			}
    		}catch(Exception g) {
    			String a = "SalezRobot Twitter Page is Not Dispalyed<br >"+url();
    			reportStep2(a, "FAIL");
    		}
        }
	}
	
	
	//Linkedin Function
	public void linkedin(int num) {
		linkedingLinkButton(num).click();
        ArrayList<String> arr1 = windowHandles();
        System.out.println(arr1.size());
        if(arr1.size()>1) {
        	driver.switchTo().window(arr1.get(1));
        try {
			WebElement linkedInPage = driver.findElement(By.xpath("//input[@id='email-or-phone']"));
			if(linkedInPage.isDisplayed()) {
				String a = "SalezRobot Linkedin Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(arr1.get(0));
			}else {
				String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			try {
				WebElement close = driver.findElement(By.xpath("(//button[@aria-label='Dismiss'])[2]"));
				close.click();
				WebElement SalezrobotPage = driver.findElement(By.xpath("//h1[text()[normalize-space()='SalezRobot CRM']]"));
				String a = "SalezRobot Linkedin Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(arr1.get(0));
			}catch(Exception e) {
			String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
			}
		}
        }else {
        	try {
    			WebElement linkedInPage = driver.findElement(By.xpath("//input[@id='email-or-phone']"));
    			if(linkedInPage.isDisplayed()) {
    				String a = "SalezRobot Linkedin Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    			}else {
    				String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
    				reportStep2(a, "FAIL");
    			}
    		}catch(Exception g) {
    			try {
    				WebElement close = driver.findElement(By.xpath("(//button[@aria-label='Dismiss'])[2]"));
    				close.click();
    				WebElement SalezrobotPage = driver.findElement(By.xpath("//h1[text()[normalize-space()='SalezRobot CRM']]"));
    				if(SalezrobotPage.isDisplayed()) {
    				String a = "SalezRobot Linkedin Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    				}
    			}catch(Exception e) {
    			String a = "SalezRobot Linkedin Page is Not Dispalyed<br >"+url();
    			reportStep2(a, "FAIL");
    			}
    		}
        }
	}
	
	//Instagram Function
	public void instagram(int num) {
		instaLinkButton(num).click();
        ArrayList<String> arr2 = windowHandles();
        System.out.println(arr2.size());
        if(arr2.size()>1) {
        	driver.switchTo().window(arr2.get(1));
        try {
			WebElement insta = driver.findElement(By.xpath("//h2[text()='salezrobot']"));
			if(insta.isDisplayed()) {
				String a = "SalezRobot Instagram Page is Dispalyed<br >"+url();
				reportStep2(a, "PASS");
				driver.close();
				Thread.sleep(1000);
				driver.switchTo().window(arr2.get(0));
			}else {
				String a = "SalezRobot Instagram Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			String a = "SalezRobot Instagram Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
			back();
		}
        }else {
        	try {
    			WebElement insta = driver.findElement(By.xpath("//h2[text()='salezrobot']"));
    			if(insta.isDisplayed()) {
    				String a = "SalezRobot Instagram Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    			}else {
    				String a = "SalezRobot Instagram Page is Not Dispalyed<br >"+url();
    				reportStep2(a, "FAIL");
    			}
    		}catch(Exception g) {
    			String a = "SalezRobot Instagram Page is Not Dispalyed<br >"+url();
    			reportStep2(a, "FAIL");
    		}
        }
	}
	
	
	//Youtube Function
	public void youtube(int num) {
		 youtubeLinkButton(num).click();
	}
}














