package salezRobotWebsite;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import projectSpecific.base.ProjectSpecificMethods;
import rsoft_web_Application_All_Elements.Rsoft_web_Application_All_Elements_and_All_Methods;
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
//	    appScrollingFunction();
//	    homePage();
//	    aboutPage();
//	    pricingPage();
//	    productsPage();
	    contactUsPage();
	    jsClick(freeDemo(), "Free Demo", url());
	    dataEntryForm();
	    
	}
	
	public void homePage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
	    verify_report_Click(f.rsoftLinkText("Home"), f.rsoftLinkText("Home").getText(), url());
		scroll(getStartedTodayMiddle());
		click2(getStartedTodayMiddle(), getStartedTodayMiddle().getText(), url());
		dataEntryForm();
		refresh();
		scrollToBottom();
		Thread.sleep(3000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
		kebabSocialMediaLink();
		}
	
	public void aboutPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		kebabPageLink();
	    verify_report_Click(f.rsoftLinkText("About"), f.rsoftLinkText("About").getText(), url());
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		scrollToBottom();
		Thread.sleep(2000);
		click2(getStartedbottom(), getStartedbottom().getText(), url());
		dataEntryForm();
		kebabSocialMediaLink();
	}
	
	
	public void pricingPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Pricing"), f.rsoftLinkText("Pricing").getText(), url());
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		scroll(getStartedTodayTop());
		Thread.sleep(2000);
        WebElement usd = driver.findElement(By.xpath("//li[text()='USD']"));
        usd.click();
        WebElement inr = driver.findElement(By.xpath("//li[text()='INR']"));
        inr.click();
        WebElement gbp = driver.findElement(By.xpath("//li[text()='GBP']"));
        gbp.click();
        
        try {
        WebElement signUp1 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[1]"));
        scroll(signUp1);
        mouseMove(signUp1);
        jsClick_Only(signUp1);
        }catch(Exception g) {
        	System.out.println("No signUp1");
        }
        
        try {
        WebElement signUp2 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[2]"));
        scroll(signUp2);
        mouseMove(signUp2);
        jsClick_Only(signUp2);
        }catch(Exception g) {
        	System.out.println("No signUp2");
        }
        
        try {
        WebElement signUp3 = driver.findElement(By.xpath("(//a[text()='Signup Now'])[3]"));
        scroll(signUp3);
        mouseMove(signUp3);
        jsClick_Only(signUp3);
        }catch(Exception g) {
        	System.out.println("No signUp3");
        }
        
        scroll(driver.findElement(By.xpath("//h2[text()='FAQ’s']")));
        Thread.sleep(1000);
        jsClick(getStartedTodayMiddle(), getStartedTodayMiddle().getText(), url());
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
	
	public void productsPage() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Products"), f.rsoftLinkText("Products").getText(), url());
		verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
		dataEntryForm();
		refresh();
		scrollToBottom();
        getStartedbottom().click();
        dataEntryForm();
        refresh();
	}
	
	public void contactUsPage() throws InterruptedException {
		contact = "Contact";
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		verify_report_Click(f.rsoftLinkText("Contact us"), f.rsoftLinkText("Contact us").getText(), url());
		//verify_report_Click(getStartedTodayTop(), getStartedTodayTop().getText(), url());
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
		
		verify_report_Click(kebabButton(), "Kebab Button", url());
		jsClick(pricing(), pricing().getText(), url());	
		
		verify_report_Click(kebabButton(), "Kebab Button", url());
		jsClick(products(), products().getText(), url());	
		
		verify_report_Click(kebabButton(), "Kebab Button", url());
		jsClick(contactUs(), contactUs().getText(), url());	
		
		verify_report_Click(kebabButton(), "Kebab Button", url());
        jsClick(home(), home().getText(), url());	
	}
	
	
	public void kebabSocialMediaLink() throws InterruptedException {
		Rsoft_web_Application_All_Elements_and_All_Methods f= new Rsoft_web_Application_All_Elements_and_All_Methods(driver, node, prop, Environment, StageURL, Stage1URL);
		//FB Link in Kebab Button
		verify_report_Click(kebabButton(), "Kebab Button", url());
        fbLinkButton(1).click();
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
			}else {
				String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
				reportStep2(a, "FAIL");
			}
		}catch(Exception g) {
			String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
			reportStep2(a, "FAIL");
		}
        }else {
        	try {
    			WebElement fbPage = driver.findElement(By.xpath("//h1[text()='SalezRobot CRM']"));
    			if(fbPage.isDisplayed()) {
    				String a = "SalezRobot FB Page is Dispalyed<br >"+url();
    				reportStep2(a, "PASS");
    				back();
    				Thread.sleep(2000);
    			}else {
    				String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
    				reportStep2(a, "FAIL");
    			}
    		}catch(Exception g) {
    			String a = "SalezRobot FB Page is Not Dispalyed<br >"+url();
    			reportStep2(a, "FAIL");
    		}
        }
		
		
		
		//Twitter Link in Kebab Button
        twitterLinkButton(1).click();
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
        
        
		//Linkedin Link in Kebab Button
        linkedingLinkButton(1).click();
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
        
        
        
        
        //Instagram Link in Kebab Button
        instaLinkButton(1).click();
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
        
        
        //Youtube Link in Kebab Button
        youtubeLinkButton(1).click();
        verify_report_Click(kebabButton(), "Kebab Button", url());
	}
	
	//This is Chatbot function
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
}














