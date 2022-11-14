package salezRobotWebsite_Test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectSpecific.base.ProjectSpecificMethods;
import salezRobotWebsite.Rsoft_Website_ChatBot;

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
		Rsoft_Website_ChatBot f = new Rsoft_Website_ChatBot(driver, node, prop, Environment,
				                                      StageURL, Stage1URL);
		f.launch_Salezrobot_Website();
		f.firstQA();
		f.second_QA(2);
		f.secondQA_Option_Selection();
		f.thirdQA(3);
		f.thirdQA_Answer();
		f.fourthQA(4);
		f.fourthQA_Option_Selection();
		f.fifthQA(5);
		f.fifthQA_Answer(4);  //Given Input in 4th place
		f.sixthQA(6, 5);      //Given Input in 5th place
		f.seventhQA(7);
		f.eighthQA(8);
		f.ninethQA(9);
		f.tenthQA(10);
		f.eleventhQA(11);
		f.chatbot_Other_Option();
	}
}
