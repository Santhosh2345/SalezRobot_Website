package salezRobotWebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import salezrobot_Website_Clickable_Elements.Salezrobot_Website_Chatbot_Element;

public class Rsoft_Website_ChatBot_and_Whatsapp extends Salezrobot_Website_Chatbot_Element {
	public Rsoft_Website_ChatBot_and_Whatsapp(RemoteWebDriver driver, ExtentTest node, Properties prop,
			String Environment, String StageUrl, String Stage1Url) {
		this.driver = driver;
		this.node = node;
		this.prop = prop;
		this.Environment = Environment;
		this.StageURL = StageUrl;
		this.Stage1URL = Stage1Url;
	}

	String filePath = ".\\Properties\\Rsoft_Chatbot\\Rsoft_Chatbot_Text.properties";

	@Given("Launch SalezRobot Website")
	public void launch_Salezrobot_Website() {
		if (Environment.equalsIgnoreCase("Live")) {
			navigateto(StageURL);
		} else {
			navigateto(Stage1URL);
		}
	}

	
	@When("Verify the Function of Chatbot")
	public void chatbot() throws InterruptedException, IOException {
		Thread.sleep(9000);
		try {
			cb_close().click();
		    String a = "Automatic Open was opened<br />"+url();
	    	reportStep2(a, "PASS");
		    }catch(Exception g) {
		    	String a = "Automatic Open was not opened<br />"+url();
		    	reportStep2(a, "FAIL");
		    }

        try {
        	cb_chatbotIcon().click();
        }catch(Exception g) {
        	String a = "Chatbot was not opened<br />"+url();
	    	reportStep2(a, "FAIL");
        }
        
        FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        //Welcome Text
        try {
        	
            String welcomeText = prop.getProperty("Welcome_Text");
            System.out.println(welcomeText);
            scroll(cb_Welcome_Text());
            waitTovisible(cb_Welcome_Text());
            System.out.println(cb_Welcome_Text().getText());
            if(cb_Welcome_Text().getText().equals(welcomeText)) {
            	System.out.println("Welcome Text is Equal");
            }else {
            	System.out.println("WL text Fail");
            	String a = "Chatbot Welcome Text is not equal<br />"+url();
    	    	reportStep2(a, "FAIL");
            }
        }catch(Exception g) {
        	System.out.println("Catch WL text Fail");
        	String a = "Error in Chatbot Welcome Text Verification<br />"+url();
	    	reportStep2(a, "FAIL");
        }
        
        //Into the Chatbot Frame
        try {
        	driver.switchTo().frame(cb_frame());
        }catch(Exception g) {
        	System.out.println("Failed to switch to frame");
        	String a = "Unable to switch to chatbot frame<br />"+url();
	    	reportStep2(a, "FAIL");
        }
        
        
        //Introduction Text
         try {
        	
            String intro = prop.getProperty("Intro");
            System.out.println(intro);
            waitTovisible(cb_Intro_Text());
            System.out.println(cb_Intro_Text().getText());
            if(cb_Intro_Text().getText().equals(intro)) {
            	System.out.println("Introduction Text is Equal");
            }else {
            	System.out.println("Intro text fail");
            	String a = "Introduction Text is not equal<br />"+url();
    	    	reportStep2(a, "FAIL");
            }
        }catch(Exception g) {
        	System.out.println("Catch WL text Fail");
        	String a = "Error in Chatbot Introduction Text Verification<br />"+url();
	    	reportStep2(a, "FAIL");
        }
	}
}
