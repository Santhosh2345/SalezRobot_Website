package salezrobot_Website_Clickable_Elements;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.aventstack.extentreports.ExtentTest;

import projectSpecific.base.ProjectSpecificMethods;
import rsoft_web_Application_All_Elements.Rsoft_web_Application_All_Elements_and_All_Methods;

public class Salezrobot_Website_Clickable_Elements extends ProjectSpecificMethods{

public WebElement name() {
	   try {
		   
		   return null;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
//Home Button
   public WebElement home() {
	   try {
		   WebElement home = driver.findElement(By.linkText("Home"));
		   return home;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //About Button
   public WebElement about() {
	   try {
		   WebElement about = driver.findElement(By.linkText("About"));
		   return about;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //Pricing Button
   public WebElement pricing() {
	   try {
		   WebElement pricing = driver.findElement(By.linkText("Pricing"));
		   return pricing;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
 //Products Button
   public WebElement products() {
	   try {
		   WebElement products = driver.findElement(By.linkText("Products"));
		   return products;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //Contact us
   public WebElement contactUs() {
	   try {
		   WebElement contactus = driver.findElement(By.linkText("Contact us"));
		   return contactus;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //Free demo
   public WebElement freeDemo() {
	   try {
		   WebElement freedemo = driver.findElement(By.xpath("//a[text()='free demo ']"));
		   return freedemo;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //Login
   public WebElement loginLink() {
	   try {
		   WebElement login = driver.findElement(By.linkText("Log in"));
		   return login;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //Skip Intro
   public WebElement skipIntro() {
	   try {
		   WebElement skipIntro = driver.findElement(By.linkText("Skip Intro"));
		   return skipIntro;
	   }catch(Exception g) {
		   return null;
	   }
   }
   //Kebab button
   public WebElement kebabButton() {
	   try {
		      WebElement kebab = driver.findElement(By.xpath("//label[@class='navigation__button home']"));
			  return kebab;
	   }catch(Exception g) {
		   return null;
	   }
   }
   
   //FB Link Button
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
	
   //Twitter Link Button
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
	
	//LinkedIn Link Button
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
	
	//Instagram Link Button
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
	
	//Youtube Link Button
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
	
	
	//Get started button for Salezrobot
	public WebElement getStartedTodayTop() {
		try {
		WebElement getStartedToday = driver.findElement(By.xpath("(//a[text()=' Get started today '])[1]"));
        return getStartedToday;
		}catch(Exception g) {
			return null;
		}
	}
		public WebElement getStartedTodayMiddle() {
			try {
			WebElement getStartMiddle = driver.findElement(By.xpath("//span[text()='Get started today']"));
	        return getStartMiddle;
			}catch(Exception g) {
				return null;
			}
		}
		
		public WebElement getStartedbottom() {
			try {
			WebElement getStartedbottom = driver.findElement(By.xpath("(//div[@class='container']/a[text()=' Get started today '])[1]"));
			return getStartedbottom;
			}catch(Exception g) {
				return null;
			}

		}
		
		
		//Read customer stories
		public WebElement readCustomerStories() {
			try {
				WebElement read = driver.findElement(By.linkText("Read customer stories"));
				return read;
			}catch(Exception g) {
				return null;
			}
		}
		
		//Robot CLose Button
		public WebElement robotCloseButton() {
			try {
		    	 WebElement close = driver.findElement(By.id("closeClick"));
		 		 return close;
		     }catch(Exception g) {
		    	 return null;
		     }
		}
		//SalezRobot for button
		public WebElement salezRobotForButtonToOpen(int num) {
			try {
				WebElement forButton = driver.findElement(By.xpath("(//button[@class='accordion-button collapsed'])["+num+"]"));
				return forButton;
			}catch(Exception g) {
				return null;
			}
		}
		
		public WebElement salezRobotForButtonToClose() {
			try {
				WebElement forButton = driver.findElement(By.xpath("(//button[@class='accordion-button'])"));
				return forButton;
			}catch(Exception g) {
				return null;
			}
		}
		//Plus and Minu methods are for Maximize and Minimize function for the content in Pricing Page
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
		
		
		//Our Team
		public WebElement ourTeam(int num) {
			try {
			WebElement team = driver.findElement(By.xpath("(//li/button[contains(@id,'slick-slide-control0')])["+num+"]"));
			return team;
			}catch(Exception g) {
				return null;
			}
		}
		
		
		//Our Journey
		public WebElement ourJourneyNext() {
			try {
				WebElement journey = driver.findElement(By.xpath("//div[@class='row ourJourneyBottom']//button[@class='slick-next slick-arrow']"));
				return journey;
			}catch(Exception gg) {
				return null;
			}
		}
		
		public WebElement ourJourneyPrevious() {
			try {
				WebElement journey = driver.findElement(By.xpath("//div[@class='row ourJourneyBottom']//button[@class='slick-prev slick-arrow']"));
				return journey;
			}catch(Exception f) {
				return null;
			}
		}
		
		
		//Clients Review
		public WebElement clientsReviewNext() {
			try {
				WebElement review = driver.findElement(By.xpath("(//div[@class='testimonial']//button[@class='slick-next slick-arrow'])[1]"));
				return review;
			}catch(Exception gg) {
				return null;
			}
		}
		
		public WebElement clientsReviewPrevious() {
			try {
				WebElement review = driver.findElement(By.xpath("//div[@class='testimonial']//button[@class='slick-prev slick-arrow']"));
				return review;
			}catch(Exception gg) {
				return null;
			}
		}
		
		
		//Amount per annum
		public WebElement basicPlan() {
			try {
				WebElement basicPlan = driver.findElement(By.xpath("(//div[@class='price']//span)[2]"));
				return basicPlan;
			}catch(Exception g) {
				return null;
			}
		}

		public WebElement enterprisePlan() {
			try {
				WebElement plan = driver.findElement(By.xpath("(//div[@class='price']//span)[5]"));
				return plan;
			}catch(Exception g) {
				return null;
			}
		}
		
		public WebElement customisedPlan() {
			try {
				WebElement customised = driver.findElement(By.xpath("(//div[@class='price']//span)[8]"));
				return customised;
			}catch(Exception g) {
				return null;
			}
		}
		
		//Signup Now
		public WebElement basicPlan_Signup() {
			try {
		        WebElement signUp1 = driver.findElement(By.xpath("(//div[@class='plan']//a)[2]"));
		        return signUp1;
		        }catch(Exception g) {
		        	return null;
		        }
		}

		public WebElement enterprisePlan_Signup() {
			try {
		        WebElement signUp1 = driver.findElement(By.xpath("(//div[@class='plan']//a)[4]"));
		        return signUp1;
		        }catch(Exception g) {
		        	return null;
		        }
		}
		
		public WebElement customisedPlan_Signup() {
			try {
		        WebElement signUp1 = driver.findElement(By.xpath("(//div[@class='plan']//a)[6]"));
		        return signUp1;
		        }catch(Exception g) {
		        	return null;
		        }
		}
		
		//Contact div Element in Contact us
		public WebElement phoneNumber() {
			try {
				WebElement contact = driver.findElement(By.xpath("(//li[text()='Contact : ']/a)[1]"));
				return contact;
			}catch(Exception g) {
				return null;
			}
		}
		
		public WebElement emailContact() {
			try {
				WebElement emailcontact = driver.findElement(By.xpath("(//li[text()='Mail Us : ']/a)[1]"));
				return emailcontact;
			}catch(Exception g) {
				return null;
			}
		}
		
		//Kebab Contact
		public WebElement Kebab_phoneNumber() {
			try {
				WebElement phone = driver.findElement(By.xpath("(//div[@class='col-md-4']/h4/a)[1]"));
				return phone;
			}catch(Exception g) {
				return null;
			}
		}
		
		public WebElement Kebab_emailContact() {
			try {
				WebElement email = driver.findElement(By.xpath("(//div[@class='col-md-4']/h4/a)[2]"));
				return email;
			}catch(Exception g) {
				return null;
			}
		}
		
		
		//Footer ELement
		public WebElement footerElement() {
			WebElement footer = driver.findElement(By.xpath("//div[@class='footer']"));
			return footer;

		}
}
