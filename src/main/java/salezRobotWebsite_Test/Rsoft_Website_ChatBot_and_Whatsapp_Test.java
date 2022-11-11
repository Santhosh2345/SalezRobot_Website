package salezRobotWebsite_Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectSpecific.base.ProjectSpecificMethods;
import salezRobotWebsite.Rsoft_Website_ChatBot_and_Whatsapp;

public class Rsoft_Website_ChatBot_and_Whatsapp_Test extends ProjectSpecificMethods{

	@BeforeTest
	public void setValues() {
		testCaseName = "Verify the Chatbot and Whatsapp section in the Website";
		authors = "Santhosh";
		category = "Smoke";
	}
	
	
	@Test
	public void clikable_Elements_in_SalezRobot_Website() throws InterruptedException, IOException {
		node = test.createNode("F_01_002 Verify the Chatbot and Whatsapp section in the Website");
		extent.attachReporter(spark);
		Rsoft_Website_ChatBot_and_Whatsapp f = new Rsoft_Website_ChatBot_and_Whatsapp(driver, node, prop, Environment,
				                                      StageURL, Stage1URL);
		f.launch_Salezrobot_Website();
		f.chatbot_part1();
		f.chatbot_part2();
		f.chatbot_part3();
		f.chatbot_part4();
	}
}
