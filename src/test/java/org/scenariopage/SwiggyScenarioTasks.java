package org.scenariopage;

import java.io.IOException;

import org.baseclass.ReadData;
import org.baseclass.commonutils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
//import org.junit.BeforeClass;
import org.junit.Test;
import org.pagefactory.Swiggy_pagefactory;

import com.aventstack.extentreports.Status;

public class SwiggyScenarioTasks extends commonutils {
	
	@Before
	
	public void Testbeforelaunch () throws IOException {
		
			BrowserLaunch ("chrome");
			
			driver.get("https://www.swiggy.com/");
	
	}
	
	@Test
	
	public void EnteredInavlidLessThan10PhoneNumber () throws Exception {
		
	//	logger = extend.createTest("EnteredInavlidLessThan10PhoneNumber");
		Swiggy_pagefactory test1 = new Swiggy_pagefactory ();
		
		test1.signupclick();
	//	logger.log(Status.INFO, "clicking on sign up button");
		
		test1.getphonenumber().sendKeys("984534553");
		
		test1.continueClick();
	//	logger.log(Status.INFO, "clicking on continue button");
		
		String phoneLabelDataRead = test1.phoneLabelDataRead();
			
			Assert.assertEquals(phoneLabelDataRead, "Phone number", "InvalidAssertion");
			
			System.out.println("The comparison is passed");

		
	}
	
	@Test
	
	public void EnteredValidName () throws Exception {
		
		Swiggy_pagefactory test2 = new Swiggy_pagefactory ();
		
		test2.signupclick();
				
		test2.getName().sendKeys("yasar");
		
		test2.continueClick();
		
		String NameLabelDataRead = test2.NameLabelDataRead();
		
			Assert.assertTrue(NameLabelDataRead.equalsIgnoreCase("Name"));
			
			System.out.println("The condition is passed");
			
	}

	@Ignore
	@Test

	public void EntererdInValidName () throws Exception {
	
	Swiggy_pagefactory test3 = new Swiggy_pagefactory ();
	
	test3.signupclick();	
	
	test3.continueClick();
	
	String NameLabelDataRead2 = test3.NameLabelDataRead();
	

		Assert.assertEquals(NameLabelDataRead2, "Name", "failedAssertion");
		
		System.out.println("The comparison is passed");


}

	@After
	
	public void closeaftereachtest () {
		
		driver.quit();
	}
}
