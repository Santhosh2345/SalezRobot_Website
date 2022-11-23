package com.salezrobot.salezRobotWebsite;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Properties;
import java.util.Random;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.salezrobot.salezrobot_Website_Clickable_Elements.Salezrobot_Website_Chatbot_Element;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Rsoft_Website_ChatBot_and_WhatsApp extends Salezrobot_Website_Chatbot_Element {


	public Rsoft_Website_ChatBot_and_WhatsApp(RemoteWebDriver driver, ExtentTest node, Properties prop,
			String Environment, String StageUrl, String Stage1Url) {
		super.driver = driver;
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
	public void firstQA() throws InterruptedException, IOException {
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
        	cb_Refresh().click();
        	cb_close().click();
        	cb_chatbotIcon().click();
        }catch(Exception g) {
        	String a = "Chatbot Initial Error<br />"+url();
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
            	System.err.println("WL text Fail");
            	String a = "Chatbot Welcome Text is not equal<br />"+url();
    	    	reportStep2(a, "FAIL");
            }
        }catch(Exception g) {
        	System.err.println("Catch WL text Fail");
        	String a = "Error in Chatbot Welcome Text Verification<br />"+url();
	    	reportStep2(a, "FAIL");
        }
        
        //Into the Chatbot Frame 
        try {
        	driver.switchTo().frame(cb_frame());
        }catch(Exception g) {
        	System.err.println("Failed to switch to frame");
        	String a = "Unable to switch to chatbot frame<br />"+url();
	    	reportStep2(a, "FAIL");
        }
        
        
        //Introduction Text First Question
         try {
        	
            String intro = prop.getProperty("Intro");
            System.out.println(intro);
            waitTovisible(cb_Intro_Text());
            System.out.println(cb_Intro_Text().getText());
            if(cb_Intro_Text().getText().equals(intro)) {
            	System.out.println("Introduction Text is Equal");
            }else {
            	System.err.println("Intro text fail");
            	String a = "Introduction Text is not equal<br />"+url();
    	    	reportStep2(a, "FAIL");
            }
        }catch(Exception g) {
        	System.err.println("Catch WL text Fail");
        	String a = "Error in Chatbot Introduction Text Verification<br />"+url();
	    	reportStep2(a, "FAIL");
        }
         
	}
    
	
   public void second_QA(int num) throws IOException {
        	 FileInputStream fis = new FileInputStream(filePath);
             Properties prop = new Properties();
             prop.load(fis);
             
       //Second Question
         try {
        	 String SecondQuestion = prop.getProperty("SecondQuestion");
             System.out.println(SecondQuestion);
             waitTovisible(cb_Intro_Text());
             System.out.println(cb_Question(num).getText());
             if(cb_Question(num).getText().equals(SecondQuestion)) {
             	System.out.println("First Question Text is Equal");
             }else {
             	System.err.println("Intro text fail");
             	String a = "Second Question Text is not equal<br />"+url();
     	    	reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
         	System.err.println("Catch Second Question text Fail");
         	String a = "Error in Chatbot Second Question Text Verification<br />"+url();
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
        		 System.err.println("Pick1_one is Not Equal");
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
        		 System.err.println("Pick1_Two is Not Equal");
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
            	 System.err.println("Pick1_Three is Not Equal");
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
            	 System.err.println("Pick1_Four is Not Equal");
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
            	 System.err.println("Pick1_Five is Not Equal");
            	 String a = "Pick1_One Text is not Equal<br />"+url();
      	    	 reportStep2(a, "FAIL");
             }
         }catch(Exception g) {
        	 String a = "Error in Pick1_Five Text<br />"+url();
  	    	 reportStep2(a, "FAIL");
         }
	}
	
	public void secondQA_Option_Selection() throws InterruptedException, IOException {
		 FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
         
        	 try {
        	 waitTovisible(cbPick1_One());
        	 cbPick1_Two().click();
        	 cb_Confirm().click();
         }catch(Exception g) {
        	 System.err.println("Catch Pick Option text Fail");
          	String a = "Error in Chatbot Pick_1st Options Text Verification<br />"+url();
  	    	reportStep2(a, "FAIL");
         }
	}
	
	public void thirdQA(int num) throws InterruptedException, IOException {
		 FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
	
         //Third Question
         try {
        	 String ThirdQuestion = prop.getProperty("ThirdQuestion");
        	 System.out.println(ThirdQuestion);
        	 waitTovisible(cb_Question(num));
        	 System.out.println(cb_Question(num).getText());
        	 if(cb_Question(3).getText().equals(ThirdQuestion)) {
        		 System.out.println("Third Question Text is Equal");
        	 }else {
        		 System.err.println("Third Question Text is Not Equal");
        		 String a = "ThirdQuestion Text is not Equal<br />"+url();
       	    	reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.err.println("Catch Third Question");
        	 String a = "Error in ThirdQuestion Text Verification<br />"+url();
   	    	reportStep2(a, "FAIL");
         }
         
	}
	
	
	public void thirdQA_Answer() throws InterruptedException, IOException {
		 FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
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
        		 System.err.println("Given Text is Not Equal");
        		 String a = "Given Text is Not Equal<br />"+url();
        	     reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.err.println("Error in Given text");
    		 String a = "Error in Given text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
	}
	
	
	
	public void fourthQA(int num) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
		//Fourth Question
		 try {
        	 String FourthQuestion = prop.getProperty("FourthQuestion");
        	 waitTovisible(cb_Question(num));
        	 String h = cb_Question(num).getText();
        	 System.out.println(FourthQuestion);
        	 System.out.println(h);
        	 if(h.equals(FourthQuestion)) {
        		 System.out.println("Fourth Question Text is Equal");
        	 }else {
        		 System.err.println("Fourth Question Text is Not Equal");
        		 String a = "FourthQuestion Text is not Equal<br />"+url();
       	    	reportStep2(a, "FAIL");
        	 }
         }catch(Exception g) {
        	 System.err.println("Catch Fourth Question");
        	 String a = "Error in Fourth Question Fourth Verification<br />"+url();
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
        		System.err.println("pick2_one Text is not Equal");
        		String a = "pick2_one Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_one text");
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
        		System.err.println("pick2_Two Text is not Equal");
        		String a = "pick2_Two Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_Two text");
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
        	 System.err.println("Error in pick2_Three text");
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
        		System.err.println("pick2_Four Text is not Equal");
        		String a = "pick2_Four Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_Four text");
    		 String a = "Error in pick2_Four Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
         
         //Five
         try {
        	 String pick2_Five = prop.getProperty("Pick2_Five");
        	 String text = cbPick2_Five().getText();
        	 
        	 System.out.println(pick2_Five);
        	 System.out.println(text);
        	if(text.equals(pick2_Five)) {
        		System.out.println("pick2_Five Text is equal");
        	}else {
        		System.err.println("pick2_Five Text is not Equal");
        		String a = "pick2_Five Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_Five text");
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
        		System.err.println("pick2_Six Text is not Equal");
        		String a = "pick2_Six Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_Six text");
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
        		System.err.println("pick2_Seven Text is not Equal");
        		String a = "pick2_Seven Text is Not Equal<br />"+url();
       	        reportStep2(a, "FAIL");
        	}
         }catch(Exception g) {
        	 System.err.println("Error in pick2_Seven text");
    		 String a = "Error in pick2_Seven Text<br />"+url();
    	     reportStep2(a, "FAIL");
         }
	}
	

	public void fourthQA_Option_Selection() throws IOException {
		
        
		//Business Type Selection Fifth Question
		try {
			cbPick2_Three().click();
		}catch(Exception g) {
			System.out.println("fourth qa option not clickable");
	}
}
	
	public void fifthQA(int num) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        //Fifth QA
        try {
			String fifthQuestion = prop.getProperty("FifthQuestion");
			System.out.println(fifthQuestion);
			waitTovisible(cb_Question(num));
			String text = cb_Question(num).getText();
			System.out.println(text);
			if(text.equals(fifthQuestion)) {
				System.out.println("Fifth question is Equal");
			}else {
				System.err.println("Fifth question is Not Equal");
				String d = "Fifth question is Not Equal<br />"+url();
				reportStep2(d, "FAIL");
			}
		}catch(Exception g) {
			System.err.println("Catch Fifth question is Not Equal");
			String d = "Error Fifth question Verification<br />"+url();
			reportStep2(d, "FAIL");
		}

	}
	
	
	String Phone_Number = "1234567890";
	//Phone Number
	public void fifthQA_Answer(int givenInputNumber) throws IOException {
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
        	
        	waitTovisible(cb_givenInput(givenInputNumber));
        	String text = cb_givenInput(givenInputNumber).getText();
        	if(text.contains(Phone_Number)) {
        		System.out.println("Given Phone Number Is Verified");
        	}else {
        		System.err.println("Given Phone Number Is Not Equal");
        		String d = "Phone Number is Not Equal<br />"+url();
				reportStep2(d, "FAIL");
        	}
        }catch(Exception g) {
        	System.err.println("Catch Given Phone Number Is Not Equal");
        	String d = "Error Phone Number Verification<br />"+url();
			reportStep2(d, "FAIL");
        }
	}
	
	
	//Ashking Name Sixth Question
	public void sixthQA(int num, int givenInputNumber) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        String name = "Santhosh";
        
        try {
        String sixthQA = prop.getProperty("SixQuestion");
		String text = cb_Question(num).getText();
		if(text.equals(sixthQA)) {
			System.out.println("Sixth Question is Equal");
		}else {
			System.err.println("Sixth Question is Not Equal");
			String d = "Sixth Question is Not Equal<br />"+url();
			reportStep2(d, "FAIL");
		}
	}catch(Exception g) {
		System.err.println("Catch Sixth Question Is Not Equal");
    	String d = "Error Sixth Question Verification<br />"+url();
		reportStep2(d, "FAIL");
	}
        
        try {
        	cb_Input().sendKeys(name);
        	cb_Send().click();
        	waitTovisible(cb_givenInput(givenInputNumber));
        	String text = cb_givenInput(givenInputNumber).getText();
        	if(text.equals(name)) {
        		System.out.println("Given Name text is Equal");
        	}else {
        		System.err.println("Given Name text is Not Equal");
        		String d = "Name Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g) {
        	System.err.println("Catch Name Text Is Not Equal");
        	String d = "Error  Given Name Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
	}
	
	
	//Origanisation Staff Question
	public void seventhQA(int num) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        try {
        	String seventhQA = prop.getProperty("SeventhQuestion");
        	System.out.println(seventhQA);
        	waitTovisible(cb_Question(num));
        	String text = cb_Question(num).getText();
        	if(text.equals(seventhQA)) {
        		System.out.println("Seventh Question Text is Equal");
        	}else {
        		System.err.println("Seventh Question Text is Not Equal");
        		String d = "Seventh Question Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g) {
        	System.err.println("Catch SevethQuestion Text Is Not Equal");
        	String d = "Error  Seventh Question  Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        //Option One
        try {
        	String Pick3_One = prop.getProperty("Pick3_One");
        	System.out.println(Pick3_One);
        	String text = cbPick3_(1).getText();
        	System.out.println(text);
        	if(text.contentEquals(Pick3_One)) {
        		System.out.println("Staff Question 1st Pick Text is Equal");
        	}else {
        		System.err.println("Staff Question 1st Pick Text is Not Equal");
        		String d = "taff Question 1st Pick Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g){
        	System.err.println("Catch Staff Question 1st Pick Text is Not Equal");
        	String d = "Error  staff Question 1st Pick Text Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        //Option Two
        try {
        	String Pick3_Two = prop.getProperty("Pick3_Two");
        	System.out.println(Pick3_Two);
        	String text = cbPick3_(2).getText();
        	System.out.println(text);
        	if(text.contentEquals(Pick3_Two)) {
        		System.out.println("Staff Question 2nd Pick Text is Equal");
        	}else {
        		System.err.println("Staff Question 2nd Pick Text is Not Equal");
        		String d = "taff Question 2nd Pick Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g){
        	System.err.println("Catch Staff Question 2nd Pick Text is Not Equal");
        	String d = "Error  staff Question 2nd Pick Text Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        //Option Three
        try {
        	String Pick3_Three = prop.getProperty("Pick3_Three");
        	System.out.println(Pick3_Three);
        	String text = cbPick3_(3).getText();
        	System.out.println(text);
        	if(text.contentEquals(Pick3_Three)) {
        		System.out.println("Staff Question 3rd Pick Text is Equal");
        	}else {
        		System.err.println("Staff Question 3rd Pick Text is Not Equal");
        		String d = "taff Question 3rd Pick Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g){
        	System.err.println("Catch Staff Question 3rd Pick Text is Not Equal");
        	String d = "Error  staff Question 3rd Pick Text Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        //Option Four
        try {
        	String Pick3_Four = prop.getProperty("Pick3_Four");
        	System.out.println(Pick3_Four);
        	String text = cbPick3_(4).getText();
        	System.out.println(text);
        	if(text.contentEquals(Pick3_Four)) {
        		System.out.println("Staff Question 4th Pick Text is Equal");
        	}else {
        		System.err.println("Staff Question 4th Pick Text is Not Equal");
        		String d = "taff Question 4th Pick Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        }catch(Exception g){
        	System.err.println("Catch Staff Question 4th Pick Text is Not Equal");
        	String d = "Error  staff Question 4th Pick Text Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        
        //Option Clicking
        try {
        	jsClick_Only(cbPick3_(3));
        }catch(Exception g) {
        	System.err.println("Organisation Staffs Option Not Clickable");
        	String d = "Error Organisation Staffs Option Clickable Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
	}
	
	//Date Question
	public void eighthQA(int num, int givenInput) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        try {
        	String eighthQA = prop.getProperty("EighthQuestion");
        	System.out.println(eighthQA);
        	waitTovisible(cb_Question(num));
        	String text = cb_Question(num).getText();
        	System.out.println(text);
        	if(text.equals(eighthQA)) {
        		System.out.println("Eighth Question Text is Equal");
        	}else {
        		System.err.println("Eighth Question Text is Not Equal");
        		String d = "Eighth Question Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        	
        	jsClick_Only(cb_DatePickerButton());
        	jsClick_Only(cb_DateYearButton());
        	mouseMove(cb_DateMY_NextButton()).click().perform();
        	mouseMove(cb_DateMY_PreviousButton()).click().perform();
        	int size = cb_DateYearList().size();
        	Random ran = new Random();
        	cb_DateYearList().get(ran.nextInt(size)).click();
        	mouseMove(cb_DateMY_NextButton()).click().perform();
        	mouseMove(cb_DateMY_PreviousButton()).click().perform();
        	mouseMove(cb_Date_SelectButton(1)).click().perform();
        	mouseMove(cb_Date_SelectButton(1)).click().perform();
        	
        	System.out.println("//ggggggggggggg");
        	String date = cb_Date_Selected().getAttribute("ng-reflect-model");
        	System.out.println(date);
        	System.out.println("//llllllllllllllllllllllll");
        	
        	cb_Send().click();
        	
        	System.out.println("hjhjhjh");
        	String convertedDate = date_Convertion(date);
        	System.out.println("//jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj");
        	String text2 = cb_givenInput(givenInput).getText();
        	System.out.println(text2);
        	Thread.sleep(2000);
        	System.out.println(convertedDate);
        	if(text2.equals(convertedDate)) {
        		System.out.println("Given date is verified");
        	}else {
        		System.err.println("Given date is not verified");
        	}
        	
        }catch(Exception g) {
        	System.err.println("Catch Eighth Question Text Is Not Equal");
        	String d = "Error  Eighth Question  Verification<br />"+url();
    		reportStep2(d, "FAIL");
        }
        
        
	}
	
	
	//State Question 
	public void ninethQA(int num) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
        Properties prop = new Properties();
        prop.load(fis);
        
        try {
        	String ninethQA = prop.getProperty("NinethQuestion");
        	System.out.println(ninethQA);
        	waitTovisible(cb_Question(num));
        	String text = cb_Question(num).getText();
        	System.out.println(text);
        	if(text.equals(ninethQA)) {
        		System.out.println("Nineth Question Text is Equal");
        	}else {
        		System.err.println("Nineth Question Text is Not Equal");
        		String d = "Nineth Question Text is Not Equal<br />"+url();
    			reportStep2(d, "FAIL");
        	}
        	
        	
        	String state = "India";
			scroll(cb_State_Input());
			waitTovisible(cb_State_Input());
			cb_State_Input().click();
			cb_State_Input().clear();
			cb_State_Input().sendKeys(state);
        	
        	System.out.println("Hi");

        	java.util.List<WebElement> forText = driver.findElements(By.xpath("//div[@class='suggestions-container is-visible']/ul/li/div/a/b"));
        	Thread.sleep(10000);
        	String text2 = forText.get(0).getText();
        	System.out.println(text2);
        	java.util.List<WebElement> forClick = driver.findElements(By.xpath("//a/b[text()='"+state+"']"));
//        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        	wait.until(ExpectedConditions.elementToBeClickable(forClick.get(0)));
        	System.out.println("Hi");
        	jsClick_Only(forClick.get(0));
        	System.out.println("Hii");
        	Thread.sleep(1000);
        	cb_Send().click();
        	
        }catch(Exception g) {
            	System.err.println("Catch Nineth Question Text Is Not Equal");
            	String d = "Error  Nineth Question  Verification<br />"+url();
        		reportStep2(d, "FAIL");
            }
	}
	
	
	
	String email = "sk@gmail.com";
	//Email Question
		public void tenthQA(int num, int givenInput) throws IOException {
			FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
	        
	        try {
	        	String tenthQA = prop.getProperty("TenthQuestion");
	        	System.out.println(tenthQA);
	        	waitTovisible(cb_Question(num));
	        	String text = cb_Question(num).getText();
	        	System.out.println(text);
	        	if(text.equals(tenthQA)) {
	        		System.out.println("Tenth Question Text is Equal");
	        	}else {
	        		System.err.println("Tenth Question Text is Not Equal");
	        		String d = "Tenth Question Text is Not Equal<br />"+url();
	    			reportStep2(d, "FAIL");
	        	}
	        	
	        	cb_Input().sendKeys(email);
	        	cb_Send().click();
	        	
	        	waitTovisible(cb_givenInput(givenInput));
	        	String emailText = cb_givenInput(givenInput).getText();
	        	if(emailText.equals(email)) {
	        		System.out.println("Given Email is Equal");
	        	}else {
	        		System.err.println("Given Email is Not Equal");
	        		String d = "Given Email is not equal Verification<br />"+url();
	        		reportStep2(d, "FAIL");
	        	}
	        }catch(Exception g) {
	        	System.err.println("Given Email is Not Verified");
	        	String d = "Error given Email Verification<br />"+url();
        		reportStep2(d, "FAIL");
	        }
		}
		
		
		//Ending Emoji
		public void eleventhQA(int num) throws IOException, InterruptedException {
			FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
	        
	        try {
	        	String eleventhQA = prop.getProperty("EleventhQuestion");
	        	System.out.println(eleventhQA);
	        	waitTovisible(cb_Question(num));
	        	String text = cb_Question(num).getText();
	        	System.out.println(text);
	        	if(text.equals(eleventhQA)) {
	        		System.out.println("Eleventh Question Text is Equal");
	        	}else {
	        		System.err.println("Eleventh Question Text is Not Equal");
	        		String d = "Eleventh Question Text is Not Equal<br />"+url();
	    			reportStep2(d, "FAIL");
	        	}
	        }catch(Exception g) {
	        	System.err.println("Last Question Text is Not Verified");
	        	String d = "Error Last Question Text Verification<br />"+url();
        		reportStep2(d, "FAIL");
	        }
	        
	        String imgsrc = cb_Ending().getAttribute("src");
	        System.out.println(imgsrc);
			URL imgURL = new URL(imgsrc);
			Thread.sleep(10000);
			try {
			BufferedImage img = ImageIO.read(imgURL);
			File file = new File(".\\rsoftLogo1\\Chatbot_Ending_Emoji.png");
			boolean boo = ImageIO.write(img, "png", file);
			System.out.println(boo);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			try {
				System.out.println("hhhhhh");
				String text = cb_Completed().getText();
				System.out.println(text);
			if(cb_Completed().isDisplayed()) {
				System.out.println("Chat Completed");
			}else {
				System.out.println("Chat Not Completed");
			}
			
			driver.switchTo().defaultContent();
			System.out.println(cb_BottomTextandLogo().size());
			String text1 = cb_BottomTextandLogo().get(0).getText();
		    String text2 = cb_BottomTextandLogo().get(1).getText();
			System.out.println(text1 + " "+ text2);
			if(prop.getProperty("Bottom_Text1").contains(text1)&&prop.getProperty("Bottom_Text2").contains(text2)) {
				System.out.println("Test Finished");
			}else {
				System.err.println("Test not Finished");
			}
			}catch(Exception g) {
				System.err.println("Error in Bottom Section");
			}
			
			refresh();
		}
		
		
		
		
		
		//When choosing Other option in chatbot
		public void chatbot_Other_Option() throws InterruptedException, IOException {
			
			FileInputStream fis = new FileInputStream(filePath);
	        Properties prop = new Properties();
	        prop.load(fis);
	        
			firstQA();
			second_QA(2);
			
		       //Second Question
			 try {
	        	 waitTovisible(cbPick1_Five());
	        	 cbPick1_Five().click();
	        	 cb_Confirm().click();
	         }catch(Exception g) {
	        	 System.err.println("Catch Pick Option text Fail");
	          	String a = "Error in Chatbot Pick_1st Options Text Verification<br />"+url();
	  	    	reportStep2(a, "FAIL");
	         }
			 

			 //Third Question
	         try {
	        	 String otherQuestion = prop.getProperty("OtherOPtionInLookingToday");
	        	 System.out.println(otherQuestion);
	        	 waitTovisible(cb_Question(3));
	        	 System.out.println(cb_Question(3).getText());
	        	 if(cb_Question(3).getText().equals(otherQuestion)) {
	        		 System.out.println("Third Question Text is Equal");
	        	 }else {
	        		 System.err.println("Third Question Text is Not Equal");
	        		 String a = "ThirdQuestion Text is not Equal<br />"+url();
	       	    	reportStep2(a, "FAIL");
	        	 }
	         }catch(Exception g) {
	        	 System.err.println("Catch Third Question");
	        	 String a = "Error in ThirdQuestion Text Verification<br />"+url();
	   	    	reportStep2(a, "FAIL");
	         }
	         
	         thirdQA_Answer();
	         fourthQA(4);
	         
	         try {
	        	 cbPick2_Seven().click();
	 		}catch(Exception g) {
	 			System.out.println("fourth qa option not clickable in chatbotOther Option Method");
	 	}
	         
	         //Fifth QA
	         try {
		        	String fifthQA = prop.getProperty("OtherOptionInBusinessType");
		        	System.out.println(fifthQA);
		        	waitTovisible(cb_Question(5));
		        	String text = cb_Question(5).getText();
		        	System.out.println(text);
		        	if(text.equals(fifthQA)) {
		        		System.out.println("Fifth Question Text is Equal - Other");
		        	}else {
		        		System.err.println("Fifth Question Text is Not Equal - Other");
		        		String d = "Fifth Question Text is Not Equal - Other<br />"+url();
		    			reportStep2(d, "FAIL");
		        	}
		        }catch(Exception g) {
		        	System.err.println("Fifth Question Text is Not Verified - Other");
		        	String d = "Error Fifth Question Text Verification - Other<br />"+url();
	        		reportStep2(d, "FAIL");
		        }
	         
	         
	         String cmptype = "IT";
	         try {
	         cb_Input().sendKeys(cmptype);
	         cb_Send().click();
	         
	         waitTovisible(cb_givenInput(4));
	        	String text = cb_givenInput(4).getText();
	        	if(text.contains(cmptype)) {
	        		System.out.println("Given Company Type Is Verified - Other");
	        	}else {
	        		System.err.println("Given Company Type Is Not Equal - Other");
	        		String d = "Company Type is Not Equal - Other<br />"+url();
					reportStep2(d, "FAIL");
	        	}
	        }catch(Exception g) {
	        	System.err.println("Catch Given Company Type Is Not Equal - Other");
	        	String d = "Error Company Type Verification - Other<br />"+url();
				reportStep2(d, "FAIL");
	        }
	         /*
	         For Selecting other option
	         Increase the question number
	         */
	         
	         fifthQA(6);
	         fifthQA_Answer(5);  //Given Input in 5th place
	         sixthQA(7, 6);      //Given Input in 6th place
	         seventhQA(8);
	         eighthQA(9, 8);
	         ninethQA(10);
	         tenthQA(11, 10);
	         eleventhQA(12);
		}
		
		
		
		
	public String date_Convertion(String str) {
	        String[] r = str.split(" ", 0);
	        ArrayList<String> hh = new ArrayList<>();
	        for (int j = 0; j < 4; j++) {
             hh.add(r[j]);
         }
	        String w = hh.get(2)+" "+hh.get(1)+" "+hh.get(3);
	        DateTimeFormatter ff = DateTimeFormatter.ofPattern("d MMM yyyy", Locale.ENGLISH);
	        LocalDate parse2 = LocalDate.parse(w, ff);
	        System.out.println(parse2);
	        String string = parse2.toString();
	        String[] split = string.split("-", 0);
	        ArrayList<String> arr = new ArrayList<>();
	        for (int j = split.length-1; j >=0 ; j--) {
             System.out.print(split[j]);
             arr.add(split[j]);
         }
	        String f = arr.get(0)+"/"+arr.get(1)+"/"+arr.get(2);
	        System.out.println();
	        System.out.println(f);
	        
	        return f;

	}
	
	
	public void whatsapp() {
		//refresh();
		if (Environment.equalsIgnoreCase("Live")) {
			navigateto(StageURL);
		} else {
			navigateto(Stage1URL);
		}
		waitTovisible(cb_WhatsappIcon());
		cb_WhatsappIcon().click();
	    ArrayList<String> wh = windowHandles();
	    if(wh.size()>1) {
	    	driver.switchTo().window(wh.get(1));
	    }
	    
	    try {
	    	if(cb_wh_rsoftlogo().isDisplayed()) {
	    		String src = cb_wh_rsoftlogo().getAttribute("src");
	    		URL url = new URL(src);
	    		BufferedImage img = ImageIO.read(url);
	    		ImageIO.write(img, "png", new File(".\\rsoftLogo1\\RsoftLogo_In_Whatsapp.png"));
	    	}else {
	    		String a = "Rsoft Logo is not present"+url();
	    		reportStep2(a, "FAIL");
	    	}
	    	
	    	if(cb_wh_RsoftText().getText().equalsIgnoreCase("RSoft")) {
	    		System.out.println("Text is Equal");
	    	}else {
	    		System.out.println("Rsoft Text is Not Equal");
	    		String a = "RSoft Text in Whatsapp page is Not Equal"+url();
	    		System.out.println(a);
	    	}
	    	
	    	if(cb_wh_RsoftTick().isDisplayed()) {
	    		System.out.println("Tick symbol for Rsoft in Whatsapp is dispalayed");
	    		String src = cb_wh_RsoftTick().getAttribute("src");
	    		URL url = new URL(src);
	    		BufferedImage img = ImageIO.read(url);
	    		ImageIO.write(img, "png", new File(".\\rsoftLogo1\\Rsoft_Text_Tick.png"));
	    	}else {
	    		System.out.println("Tick symbol for Rsoft in Whatsapp is Not dispalayed");
	    		String a = "Tick symbol for Rsoft in Whatsapp is Not dispalayed<br />"+url();
	    		reportStep2(a, "FAIL");
	    	}
	    	
	    	if(cb_wh_ContinueToChat().isDisplayed()) {
	    		cb_wh_ContinueToChat().click();
	    	}else {
	    		System.out.println("Continue To Chat in Whatsapp is Not dispalayed");
	    		String a = "Continue To Chat in Whatsapp is Not dispalayed<br />"+url();
	    		reportStep2(a, "FAIL");
	    	}
	    	
	    	waitTovisible(cb_wh_UseWebLink());
	    	if(cb_wh_UseWebLink().isDisplayed()) {
	    		cb_wh_UseWebLink().click();
	    	}else {
	    		System.out.println("User weblink to chat is Not Displayed");
	    		String a = "User weblink to chat is Not Displayed<br />"+url();
	    		reportStep2(a, "FAIL");
	    	}
	    	
	    	if(cb_wh_whatsappScanner().isDisplayed()) {
	    		System.out.println("Whatsapp QR Scanner is displayed");
	    	}else {
	    		System.out.println("Whatsapp QR Scanner is Not displayed");
		    	String a = "Whatsapp QR Scanner is Not displayed<br />"+url();
		    	reportStep2(a, "FAIL");
	    	}
	    }catch(Exception g) {
	    	System.out.println("Error in Whatsapp - section");
	    	String a = "Error in Whatsapp section<br />"+url();
	    	reportStep2(a, "FAIL");
	    }
	}
	
}
