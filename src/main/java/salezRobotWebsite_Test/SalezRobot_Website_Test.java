package salezRobotWebsite_Test;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import projectSpecific.base.ProjectSpecificMethods;
import salezRobotWebsite.SalezRobot_Website;

public class SalezRobot_Website_Test extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testCaseName = "Verify all Clikable Elements in SalezRobot Website";
		authors = "Santhosh";
		category = "Smoke";
	}
	
	
	@Test
	public void clikable_Elements_in_SalezRobot_Website() throws InterruptedException {
		node = test.createNode("F_01_01 Verify all Clikable Elements in SalezRobot Website");
		extent.attachReporter(spark);
		SalezRobot_Website a = new SalezRobot_Website(driver, node, prop, Environment, StageURL, Stage1URL);
		a.launch_Salezrobot_Website();
		//a.clickable_Element_Verification();
		a.kebabPageLink();
	}
}
