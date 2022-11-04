package org.webSite;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Given;
import projectSpecific.base.ProjectSpecificMethods;

public class Initial_Page extends ProjectSpecificMethods {
	public Initial_Page(RemoteWebDriver driver, ExtentTest node, Properties prop, String Environment, String StageUrl,
			String Stage1Url) {
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
		if (Environment.equalsIgnoreCase("Live")) {
			navigateto(StageURL);
		} else {
			navigateto(Stage1URL);
		}
	}
	
    String margin = "margin";     String marginBot = "marginBot";
	String padding = "padding";   String boxSizing = "sizing";     String font = "font";
	String size1 = "size1";       String color1  = "color1";       Dimension size = null;
	public void ff() {
		WebElement initalList = driver.findElement(By.xpath("//ul[@class='mlist']"));
		
		
		String margin_Top = cssValue("margin-top", initalList, margin);
		System.out.println(margin_Top);

		
		String margin_Bottom = cssValue("margin-bottom", initalList, marginBot);
		System.out.println(margin_Bottom);
		
		
		String padding_Left = cssValue("padding-left", initalList, padding);
		System.out.println(padding_Left);
		
		
		String box_Sizing = cssValue("box-sizing", initalList, boxSizing);
		System.out.println(box_Sizing);
		
		String text = "text";
		String text_align = cssValue("text-align", initalList, text);
		System.out.println(text_align);
		
		try {
		size  = initalList.getSize();
		System.out.println(size);
		}catch(Exception g) {
			reportStep2("Size of the element - error", "FAIL");
		}
		
		
		String font_family = cssValue("font-family", initalList, font);
		System.out.println(font_family);
		
		
		String font_size = cssValue("font-family", initalList, size1);
		System.out.println(font_size);
		
		
		String color = cssValue("font-family", initalList, color1);
		System.out.println(color);
		String asHex = Color.fromString(color).asHex();
		System.out.println(asHex);
		}
	public String cssValue(String cssValue_Name, WebElement ElementName, String valueDeclaredName) {
		try {
			valueDeclaredName= ElementName.getCssValue(cssValue_Name);
			return valueDeclaredName;
		}catch(Exception g) {
			reportStep2("No "+ cssValue_Name+" for "+ElementName+" ELement", "FAIL");
			return null;
		}
	

	}
	
}













