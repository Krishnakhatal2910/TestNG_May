package testNgg;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class RunFailedTestCases {
	
	@AfterTest
	public void runFailedTests() {
		TestNG obj=new TestNG();
		
		List<String> list=new ArrayList<String>();
		
		list.add("C:\\Users\\Admin\\eclipse-workspace\\TestNG_May\\test-output\\Suite\\testng-failed.xml");
		
		obj.setTestSuites(list);
		
		obj.run();
	}
}
