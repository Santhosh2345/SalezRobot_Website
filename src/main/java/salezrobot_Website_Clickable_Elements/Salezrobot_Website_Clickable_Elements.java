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
		
		//Footer ELement
		public WebElement footerElement() {
			WebElement footer = driver.findElement(By.xpath("//div[@class='footer']"));
			return footer;

		}
}
