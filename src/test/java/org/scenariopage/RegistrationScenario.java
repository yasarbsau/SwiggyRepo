package org.scenariopage;

import java.io.IOException;

import java.util.ResourceBundle;

import org.baseclass.commonutils;
import org.baseclass.slf4J;
import org.baseclass.ReadData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pagefactory.Swiggy_pagefactory;
import org.slf4j.Logger;

import com.aventstack.extentreports.Status;

public class RegistrationScenario extends commonutils{
	
	//public static Logger log = slf4J.loadLogger(RegistrationScenario.class);

	
	@BeforeClass
	
	public static void BrowserLaunch () {

		BrowserLaunch ("chrome");
	} 
	
//	@Before
	
	public void loadURL () throws IOException {
		
	//	ReadData.getConfigPropData("url");
		
		driver.get("https://www.swiggy.com/");
		
//		ResourceBundle rb = ResourceBundle.getBundle("config");
//		rb.getString("url");
	}
	
	@Test
	
	public void Assertexample () {
		//partial validation works based on condition
//		boolean a = true;
//		int b=10
//		Assert.assertTrue(b<11);
//		
//		System.out.println("afterconditionpass");
		
		
		//full validation works based on comparison 

	//	logger = extend.createTest("test");
		int a = 10;
	//	boolean b = false;
		
	//	logger.log(Status.INFO, "first test");
		
		
		Assert.assertEquals(a, 10);
		
	//	logger.log(Status.INFO, "aftercomparisonpass");
		
		log.warn("answer");
		System.out.println("aftercomparisonpass");

	}
	
	

	@Ignore
	@Test
	
	public void phonenumber_ValidData () throws Exception {
		
		Swiggy_pagefactory test1 = new Swiggy_pagefactory ();
		
		test1.signupclick();
		
		test1.phonenumnerCheck(ReadData.getdatafromexcel("ReadData", 1, 1));
		
		test1.continueClick();
		
		String phoneLabelDataRead	= test1.phoneLabelDataRead();
		
		try {
			
			Assert.assertTrue(phoneLabelDataRead.equalsIgnoreCase("phone number"));
			
		} catch (Exception a) {
			
			System.out.println("error");
		}
	
		
		
		
	}
	
	@After
	
	public void afterTest () {
		
		System.out.println("afterTest");
	}
	
	@AfterClass
	
	public static void afterClass () {
		
	//	extend.flush();
	//	driver.quit();
		
	}
		
}

