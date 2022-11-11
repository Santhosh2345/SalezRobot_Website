package salezRobotWebsite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
	public void chatbot_part1() throws InterruptedException, IOException {
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
         
         
       //First Question
         try {
        	 String firstQuestion = prop.getProperty("FirstQuestion");
             System.out.println(firstQuestion);
             waitTovisible(cb_Intro_Text());
             System.out.println(cb_FirstQuestion().getText());
             if(cb_FirstQuestion().getText().equals(firstQuestion)) {
             	System.out.println("First Question Text is Equal");
             }else {
             	System.out.println("Intro text fail");
             	String a = "First Question Text is not equal<br />"+url();
     	    	reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
         	System.out.println("Catch First Question text Fail");
         	String a = "Error in Chatbot First Question Text Verification<br />"+url();
 	    	reportStep2(a, "FAIL");
         }
         
         
         
         //Pick Option 
         try {
        	 waitTovisible(cbPick1_One());
        	 System.out.println(prop.getProperty("Pick1_One"));
    		 System.out.println(cbPick1_One().getText());
        	 if(cbPick1_One().getText().equals(prop.getProperty("Pick1_One"))) {
        		 System.out.println("Pick1_one is Equal");
        	 }else {
        		 System.out.println("Pick1_one is Not Equal");
        		 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 String a = "Error in Pick1_One Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
        	 }
        	
         try {
        	 System.out.println(prop.getProperty("Pick1_Two"));
    		 System.out.println(cbPick1_Two().getText());
        	 if(cbPick1_Two().getText().equals(prop.getProperty("Pick1_Two"))) {
        		 System.out.println("Pick1_Two is Equal");
        	 }else {
        		 System.out.println("Pick1_Two is Not Equal");
        		 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 String a = "Error in Pick1_Two Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
    	 }
         
         try {
        	 System.out.println(prop.getProperty("Pick1_Three"));
    		 System.out.println(cbPick1_Three().getText());
             if(cbPick1_Three().getText().equals(prop.getProperty("Pick1_Three"))) {
            	 System.out.println("Pick1_Three is Equal");
             }else {
            	 System.out.println("Pick1_Three is Not Equal");
            	 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
        	 String a = "Error in Pick1_Three Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
    	 }
             
         try {
        	 System.out.println(prop.getProperty("Pick1_Four"));
    		 System.out.println(cbPick1_Four().getText());
             if(cbPick1_Four().getText().equals(prop.getProperty("Pick1_Four"))) {
            	 System.out.println("Pick1_Four is Equal");
             }else {
            	 System.out.println("Pick1_Four is Not Equal");
            	 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
        	 String a = "Error in Pick1_Four Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
    	 }
         
         try {
        	 System.out.println(prop.getProperty("Pick1_Five"));
    		 System.out.println(cbPick1_Five().getText());
             if(cbPick1_Five().getText().equals(prop.getProperty("Pick1_Five"))) {
            	 System.out.println("Pick1_Five is Equal");
             }else {
            	 System.out.println("Pick1_Five is Not Equal");
            	 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
        	 String a = "Error in Pick1_Five Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
         }
         
        	 try {
        	 waitTovisible(cbPick1_One());
        	 cbPick1_Two().click();
        	 cb_Confirm().click();
         }catch(Exception g) {
        	 System.out.println("Catch Pick Option text Fail");
          	String a = "Error in Chatbot Pick_1st Options Text Verification<br />"+url();
  	    	reportStep2(a, "FAIL");
         }
         
        	 
        	 
        	 
         //Second Question
         try {
        	 String secondQuestion = prop.getProperty("SecondQuestion");
        	 waitTovisible(cb_SecondQuestion());
        	 System.out.println(cb_SecondQuestion().getText());
        	 if(cb_SecondQuestion().getText().equals(secondQuestion)) {
        		 System.out.println("Second Question Text is Equal");
        	 }else {
        		 System.out.println("Second Question Text is Not Equal");
        		 String a = "SecondQuestion Text is not Equal<br />"+url();
       	    	reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.out.println("Catch Second Question");
        	 String a = "Error in SecondQuestion Text Verification<br />"+url();
   	    	reportStep2(a, "FAIL");
         }
         
         
         
         //Input
         String input = "IT";
         try {
        	 cb_Input().sendKeys(input);
        	 cb_Send().click();
        	 System.out.println(input);
        	 System.out.println(cb_givenInput(2).getText());
        	 if(cb_givenInput(2).getText().equals(input)) {
        		 System.out.println("Given Text is Verified");
        	 }else {
        		 System.out.println("Given Text is Not Equal");
        		 String a = "Given Text is Not Equal<br />"+url();
        	     reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.out.println("Error in Given text");
    		 String a = "Error in Given text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
	}
	
	
	
	public void chatbot_part2() throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
		//Third Question
		 try {
        	 String thirdQuestion = prop.getProperty("ThirdQuestion");
        	 waitTovisible(cb_thirdQuestion());
        	 String h = cb_thirdQuestion().getText();
        	 System.out.println(thirdQuestion);
        	 System.out.println(h);
        	 if(h.equals(thirdQuestion)) {
        		 System.out.println("Third Question Text is Equal");
        	 }else {
        		 System.out.println("Third Question Text is Not Equal");
        		 String a = "SecondQuestion Text is not Equal<br />"+url();
       	    	reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.out.println("Catch Third Question");
        	 String a = "Error in Third Question Third Verification<br />"+url();
   	    	reportStep2(a, "FAIL");
         }
		 
		 
		//Pick_2 options 
		//One
         try {
        	 String pick2_one = prop.getProperty("Pick2_One");
        	 String text = cbPick2_One().getText();
        	 
        	 System.out.println(pick2_one);
        	 System.out.println(text);
        	if(text.equals(pick2_one)) {
        		System.out.println("pick2_one Text is equal");
        	}else {
        		System.out.println("pick2_one Text is not Equal");
        		String a = "pick2_one Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_one text");
    		 String a = "Error in pick2_onetext<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Two
         try {
        	 String pick2_Two = prop.getProperty("Pick2_Two");
        	 String text = cbPick2_Two().getText();
        	 
        	 System.out.println(pick2_Two);
        	 System.out.println(text);
        	if(text.equals(pick2_Two)) {
        		System.out.println("pick2_Two Text is equal");
        	}else {
        		System.out.println("pick2_Two Text is not Equal");
        		String a = "pick2_Two Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Two text");
    		 String a = "Error in pick2_Two Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Three
         try {
        	 String pick2_Three = prop.getProperty("Pick2_Three");
        	 String text = cbPick2_Three().getText();
        	 
        	 System.out.println(pick2_Three);
        	 System.out.println(text);
        	if(text.equals(pick2_Three)) {
        		System.out.println("pick2_Three Text is equal");
        	}else {
        		System.out.println("pick2_Three Text is not Equal");
        		String a = "pick2_Three Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Three text");
    		 String a = "Error in pick2_Three Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Four
         try {
        	 String pick2_Four = prop.getProperty("Pick2_Four");
        	 String text = cbPick2_Four().getText();
        	 
        	 System.out.println(pick2_Four);
        	 System.out.println(text);
        	if(text.equals(pick2_Four)) {
        		System.out.println("pick2_Four Text is equal");
        	}else {
        		System.out.println("pick2_Four Text is not Equal");
        		String a = "pick2_Four Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Four text");
    		 String a = "Error in pick2_Four Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Five
         try {
        	 String pick2_Five = prop.getProperty("Pick2_Five");
        	 String text = cbPick2_One().getText();
        	 
        	 System.out.println(pick2_Five);
        	 System.out.println(text);
        	if(text.equals(pick2_Five)) {
        		System.out.println("pick2_Five Text is equal");
        	}else {
        		System.out.println("pick2_Five Text is not Equal");
        		String a = "pick2_Five Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Five text");
    		 String a = "Error in pick2_Five Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Six
         try {
        	 String pick2_Six = prop.getProperty("Pick2_Six");
        	 String text = cbPick2_Six().getText();
        	 
        	 System.out.println(pick2_Six);
        	 System.out.println(text);
        	if(text.equals(pick2_Six)) {
        		System.out.println("pick2_Six Text is equal");
        	}else {
        		System.out.println("pick2_Six Text is not Equal");
        		String a = "pick2_Six Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Six text");
    		 String a = "Error in pick2_Six Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Seven
         try {
        	 String pick2_Seven = prop.getProperty("Pick2_Seven");
        	 String text = cbPick2_Seven().getText();
        	 
        	 System.out.println(pick2_Seven);
        	 System.out.println(text);
        	if(text.equals(pick2_Seven)) {
        		System.out.println("pick2_Seven Text is equal");
        	}else {
        		System.out.println("pick2_Seven Text is not Equal");
        		String a = "pick2_Seven Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.out.println("Error in pick2_Seven text");
    		 String a = "Error in pick2_Seven Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
	}
	
	public void chatbot_part3() throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
		//Business Type Selection
		try {
			cbPick2_Three().click();
			String fourthQuestion = prop.getProperty("FourthQuestion");
			System.out.println(fourthQuestion);
			waitTovisible(cb_fourthQuestion());
			String text = cb_fourthQuestion().getText();
			System.out.println(text);
			if(text.equals(fourthQuestion)) {
				System.out.println("Fourth question is Equal");
			}else {
				System.out.println("Fourth question is Not Equal");
				String d = "Fourth question is Not Equal<br />"+url();
				reportStep2(d, "FAIL");
			}
		}catch(Exception g) {
			System.out.println("Catch Fourth question is Not Equal");
			String d = "Error Fourth question Verification<br />"+url();
			reportStep2(d, "FAIL");
		}

	}
	
	
	String Phone_Number = "1234567890";
	//Phone Number
	public void chatbot_part4() throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        try {
        	cb_PhonePrefix_Arrow().click();
        	cb_PhonePrefix_Options().click();
        	cb_PhonePrefixInput().sendKeys("91");
        	cb_PhonePrefix_Options().click();
        	cb_Input().sendKeys(Phone_Number);
        	cb_Send().click();
        	
        	waitTovisible(cb_givenInput(4));
        	String text = cb_givenInput(4).getText();
        	if(text.contains(Phone_Number)) {
        		System.out.println("Given Phone Number Is Verified");
        	}else {
        		System.out.println("Given Phone Number Is Not Equal");
        		String d = "Phone Number is Not Equal<br />"+url();
				reportStep2(d, "FAIL");
        	}
        }catch(Exception g) {
        	System.out.println("Catch Given Phone Number Is Not Equal");
        	String d = "Error Phone Number Verification<br />"+url();
			reportStep2(d, "FAIL");
        }
	}
}
