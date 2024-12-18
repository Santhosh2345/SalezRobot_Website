package com.salezrobot.org.website_Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import com.salezrobot.org.webSite.Initial_Page;
import com.salezrobot.projectSpecific.base.ProjectSpecificMethods;


public class Initial_Page_Test extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testCaseName = "Verify all Clikable Elements in SalezRobot Website";
		authors = "Santhosh";
		category = "Smoke";
	}
	
	
	@Test(enabled = false)
	public void clikable_Elements_in_SalezRobot_Website() throws InterruptedException {
		node = test.createNode("F_01_01 Verify all Clikable Elements in SalezRobot Website");
		extent.attachReporter(spark);
		Initial_Page a = new Initial_Page(driver, node, prop, Environment, StageURL, Stage1URL);
		a.launch_Salezrobot_Website();
		a.ff();
	}

}
