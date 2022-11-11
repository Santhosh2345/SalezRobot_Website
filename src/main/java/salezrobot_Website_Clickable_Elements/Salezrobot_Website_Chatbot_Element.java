package salezrobot_Website_Clickable_Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v104.input.Input;

import projectSpecific.base.ProjectSpecificMethods;

public class Salezrobot_Website_Chatbot_Element extends ProjectSpecificMethods {
	public WebElement name() {
		   try {
			   
			   return null;
		   }catch(Exception g) {
			   return null;
		   }
	   }
	
	//Chatbot Close Button
	public WebElement cb_close() {
		 WebElement close = driver.findElement(By.id("closeClick"));
 		 return close;	    	
	   }
	
	//Chatbot Icon
	public WebElement cb_chatbotIcon() {
		WebElement chatbot = driver.findElement(By.id("imgg"));
		return chatbot;
	}
	
	//Chatbot Refresh Button
	public WebElement cb_Refresh() {
		WebElement refresh = driver.findElement(By.id("refreshClick"));
		return refresh;	
	}
	
	//Chatbot Welcome Text
	public WebElement cb_Welcome_Text() {
		WebElement welcome = driver.findElement(By.xpath("//div[@class='chatshow-title']"));
		return welcome;
	}
	
	//Chatbot frame
	public WebElement cb_frame() {
		try {
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeId']"));
		return frame;
		}catch(Exception g) {
			return null;
		}
	}
	
	//Chatbot Introduction Text
	public WebElement cb_Intro_Text() {
		WebElement intro = driver.findElement(By.xpath("//div[text()='Hello! This is Riya from SalezRobot, How can I help you ?']"));
		return intro;
	}
	
	//Chatbot First Question
	public WebElement cb_FirstQuestion() {
		WebElement qa = driver.findElement(By.xpath("//div[text()='What are you looking for Today ?']"));
		return qa;
	}
	
	//Picklists
	public WebElement cbPick1_One() {
		WebElement crm = driver.findElement(By.xpath("//li/p[text()='SalezRobot CRM']"));
		return crm;
	}
	
	public WebElement cbPick1_Two() {
		WebElement ivr = driver.findElement(By.xpath("//li/p[text()='RPHone IVR']"));
		return ivr;
	}
	
	public WebElement cbPick1_Three() {
		WebElement bot = driver.findElement(By.xpath("//li/p[text()='RBot cb']"));
		return bot;
	}
	
	public WebElement cbPick1_Four() {
		WebElement api = driver.findElement(By.xpath("//li/p[text()='Whatsapp API']"));
		return api;
	}
	
	public WebElement cbPick1_Five() {
		WebElement other = driver.findElement(By.xpath("//li/p[text()='Others']"));
		return other;
	}
	
	//Confirm Button
	public WebElement cb_Confirm() {
		WebElement confirm = driver.findElement(By.xpath("//button[text()='Confirm']"));
		return confirm;
	}
	
	//Chatbot Question After Picked the List
	public WebElement cb_SecondQuestion() {
		WebElement secondQuestion = driver.findElement(By.xpath("//div[text()='May I have your Business Name ?']"));
		return secondQuestion;
	}
	
	//Chatbot Message Input
	public WebElement cb_Input() {
		WebElement input = driver.findElement(By.id("messageboxid"));
		return input;
	}
	
	//Chatbot Send Button
	public WebElement cb_Send() {
		WebElement send = driver.findElement(By.xpath("//i[text()='near_me']"));
		return send;
	}
	
	//Chatbot given Input
	public WebElement cb_givenInput(int num) {
		WebElement input = driver.findElement(By.xpath("(//div[@class='chatshow-msg-user ng-star-inserted'])["+num+"]"));
		return input;
	}
	
	//ThirdQuestion
	public WebElement cb_thirdQuestion() {
		WebElement third = driver.findElement(By.xpath("//div[text()='Please choose your Business Type?']"));
		return third;
	}
	
	
	//Business Type Picklists
	public WebElement cbPick2_One() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Real Estate ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Two() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Education  ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Three() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Healthcare ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Four() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Tours & Travels ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Five() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Banking & Financial ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Six() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Automobile ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Seven() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Others ']"));
		return realEstate;
	}
	
	//Fourth Question
	public WebElement cb_fourthQuestion() {
		WebElement fourth = driver.findElement(By.xpath("//div[text()='Noted! May I have your Mobile Number to reach you?']"));
		return fourth;
	}
	
	//Chatbot PhonePrefix Cancel button
	public WebElement cb_PhonePrefix_Clear() {
		WebElement phonePrefix = driver.findElement(By.xpath("//span[@class='ng-clear']"));
		return phonePrefix;
	}
	
	//Chatbot PhonePrefix Arrow button
		public WebElement cb_PhonePrefix_Arrow() {
			WebElement arrow = driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']"));
			return arrow;
		}
		
	//Chatbot PhonePrefix Select
		public WebElement cb_PhonePrefix_Select() {
			WebElement select = driver.findElement(By.tagName("ng-select"));
			return select;
		}
		
	//Chatbot Phone Prefix Option label
		public WebElement cb_PhonePrefix_Options() {
			WebElement options = driver.findElement(By.xpath("//span[contains(@class,'ng-option-label')]"));
			return options;
		}
		
	//Chatbot Phone Prefx Input
		public WebElement cb_PhonePrefixInput() {
			WebElement prefixInput = driver.findElement(By.xpath("//div/div/div[3]/input"));
			return prefixInput;
		}
		
	//Chatbotstaff in  Organisation 	
		public WebElement cbPick3_one() {
			WebElement lessThan = driver.findElement(By.xpath("//li[text()=' Less Than 3 ']"));
			return lessThan;
		}
		
		public WebElement cbPick3_Two() {
			WebElement people = driver.findElement(By.xpath("//li[text()=' 3 To 10 People ']"));
			return people;
		}
		
		public WebElement cbPick3_Three() {
			WebElement people = driver.findElement(By.xpath("//li[text()=' 10 - 25 People ']"));
			return people;
		}
		
		public WebElement cbPick3_Four() {
			WebElement people = driver.findElement(By.xpath("//li[text()=' 25+ People ']"));
			return people;
		}
		
	//Chatbot Date Picker
		public WebElement cb_DatePicker() {
			WebElement datePicker = driver.findElement(By.xpath("//button[@class='datebot-datebtn']"));
			return datePicker;
		}
		
	//Chatbot Date Year Button
		public WebElement cb_DateYearButton() {
			WebElement year = driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]"));
			return year;
		}
		
	//Chatbot Date Month Button
		public WebElement cb_DateMonth_NextButton() {
			WebElement month = driver.findElement(By.xpath("(//span[@class='mat-button-focus-overlay'])[3]"));
			return month;
		}
		
		public WebElement cb_DateMonth_PreviousButton() {
			WebElement month = driver.findElement(By.xpath("(//span[@class='mat-button-focus-overlay'])[2]"));
			return month;
		}
		
	//Chatbot Date Date Select
		public WebElement cb_Date_SelectButton(int num) {
			WebElement date = driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[@class='mat-calendar-body-cell ng-star-inserted'])["+num+"]"));
			return date;
		}
		
	//Chatbot Date Select
		public WebElement cb_Date_Selected() {
			WebElement dateSelected = driver.findElement(By.id("appnbot_dateinput"));
			return dateSelected;
		}
		
	//Chatbot State Selection 
		public List<WebElement> cb_State_Select_List() {
			List<WebElement> arr = driver.findElements(By.xpath("//div[@class='suggestions-container is-visible']/ul/li"));
			return arr;
		}
		
	//Chatbot State Input
		public WebElement cb_State_Input() {
			WebElement state = driver.findElement(By.xpath("//div[@class='input-container']/input"));
			return state;
		}
		
    //Chatbot State Close Button
		public WebElement cb_StateClose_Button() {
			WebElement close = driver.findElement(By.xpath("(//i[text()='close'])[2]"));
			return close;
		}
		
	//Chatbot Ending Thumb
		public WebElement cb_Ending() {
			WebElement endingImg = driver.findElement(By.className("chatshow-endimg ng-star-inserted"));
			return endingImg;
		}
		
	//Chatbot Completed
		public WebElement cb_Completed() {
			WebElement completed = driver.findElement(By.xpath("//label[text()='Chat completed..!']"));
			return completed;
		}
}
