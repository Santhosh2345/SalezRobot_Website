package projectSpecific.base;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import selenium.base.SeleniumBase;
import utilities.DataLibrary;

public class ProjectSpecificMethods extends SeleniumBase {

	public String dataSheetName;
	public String Environment;
	public String StageURL;
	public String Stage1URL;

	public String Company_Name = "AUTOMATION";
	public String User_Name = "rsoft";
	public String  Password = "RSoft!@345";
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(dataSheetName);
	}
     
	@BeforeMethod
	public void beforeMethod() throws IOException {
		// Stage.d9 or Stage.d11
		Environment = "Live";
		
		StageURL = "https://www.salezrobot.com";
		Stage1URL = "https://www.salezrobot.com";
		
		String browser = "chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			driver = startApp1("chrome");

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = startApp1("firefox");

		}
		// node = test.createNode(testCaseName);
	}
    public void login() throws InterruptedException {
    	
    	try {
    	Alert alt = driver.switchTo().alert();
    	alt.accept();
    	}catch(Exception d) {
    		System.out.println("No Alert");
    	}
    	
		WebElement Cmpname = driver.findElement(By.xpath("//input[@placeholder='Company Name']"));
		Cmpname.sendKeys(Company_Name);

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='User Name']"));
		username.sendKeys(User_Name);

		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		password.sendKeys(Password);

		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
//		 try{
//			 WebElement toast = driver.findElement(By.id("toast-container"));
//			 System.out.println("\nPlease Enter Valid Credentials\n\n");
//		     reportStep("The Element"+loginbutton+"clicked", "FAIL"); 
//		     driver.quit();
//		    }
//		 catch (Exception e) {
//			 System.out.println("Login Successfull");
//			 //e.printStackTrace();
//			 //reportStep("The Element"+loginbutton+"clicked", "FAIL"); 
//		}
}   
	
	@AfterMethod
	public void afterMethod() {
		quit();
	}
	
}