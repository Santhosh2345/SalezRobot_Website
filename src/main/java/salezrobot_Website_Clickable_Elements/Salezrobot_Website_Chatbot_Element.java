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
		WebElement refresh = driver.findElement(By.xpath("//button[@id='refreshClick']"));
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
		WebElement intro = driver.findElement(By.xpath("(//div[@class='chatshow-msg-sys ng-star-inserted'])[1]"));
		return intro;
	}
	
	public WebElement cb_Question(int num) {
		WebElement qa = driver.findElement(By.xpath("(//div[@class='chatshow-msg-sys ng-star-inserted'])["+num+"]"));
		return qa;
	}
	//Chatbot First Question
	
	
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
	
	//Chatbot Question After Picked the List   -   Business Name Second Question
	
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
	
	//Business Type QUestion
	
	//Business Type Picklists
	public WebElement cbPick2_One() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Real Estate ']"));
		return realEstate;
	}
	
	public WebElement cbPick2_Two() {
		WebElement realEstate = driver.findElement(By.xpath("//li[text()=' Education ']"));
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
		
	//Chatbot FifthQuestion
		
	//Chatbotstaff in  Organisation   picklist
		public WebElement cbPick3_(int num) {
			WebElement pick = driver.findElement(By.xpath("(//li[@class='item float-item msbot-list-li myanimation ng-star-inserted'])["+num+"]"));
			return pick;
		}
		
	//Chatbot Date Picker
		public WebElement cb_DatePickerButton() {
			WebElement datePicker = driver.findElement(By.xpath("//button[@class='datebot-datebtn']"));
			return datePicker;
		}
		
	//Chatbot Date Year Button
		public WebElement cb_DateYearButton() {
			WebElement year = driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']"));
			return year;
		}
		
	//Chatbot Date Year List
		public List<WebElement> cb_DateYearList(){
			List<WebElement> year = driver.findElements(By.xpath("//table[@class='mat-calendar-table']/tbody/tr/td"));
			return year;
		}
		
	//Chatbot Date Month Button
		public WebElement cb_DateMY_NextButton() {
			WebElement month = driver.findElement(By.xpath("(//span[@class='mat-button-focus-overlay'])[3]"));
			return month;
		}
		
		public WebElement cb_DateMY_PreviousButton() {
			WebElement month = driver.findElement(By.xpath("(//span[@class='mat-button-focus-overlay'])[2]"));
			return month;
		}
		
	//Chatbot Date Date Select
		public WebElement cb_Date_SelectButton(int num) {
			try {
			WebElement date = driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[@class='mat-calendar-body-cell ng-star-inserted'])["+num+"]"));
			return date;
			}catch(Exception g) {
				WebElement date = driver.findElement(By.xpath("(//table[@class='mat-calendar-table']/tbody/tr/td[@class='mat-calendar-body-cell mat-calendar-body-active ng-star-inserted'])"));
				return date;
			}
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
			WebElement endingImg = driver.findElement(By.xpath("//img[@class='chatshow-endimg ng-star-inserted']"));
			return endingImg;
		}
		
	//Chatbot Completed
		public WebElement cb_Completed() {
			WebElement completed = driver.findElement(By.xpath("//label[text()='Chat completed..!']"));
			return completed;
		}
		
	//BottomText
		public List<WebElement> cb_BottomTextandLogo(){
			List<WebElement> text = driver.findElements(By.xpath("//div[@class='chatshow-branding']/label"));
			return text;
		}
}
