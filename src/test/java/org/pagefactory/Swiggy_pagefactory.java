package org.pagefactory;

import org.baseclass.commonutils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Swiggy_pagefactory extends commonutils {
	
	
	public Swiggy_pagefactory () {
		
		PageFactory.initElements(driver, this);		
		
	}
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signupbutton;
	
	@FindBy(id="mobile")
	private WebElement phonenumber;
	
	@FindBy(id="name")
	private WebElement Name;
	
	@FindBy(xpath = "//a[@class='a-ayg']")
	private WebElement continubutton;
	
	@FindBy(xpath="//label[@for='mobile']")
	private WebElement labeldataforphone;
	
	@FindBy(xpath="//label[text()='Name']")
	private WebElement labeldataforname;
	
	public void signupclick() {
		elementClick(signupbutton);
	}
	
	public void continueClick() {
		elementClick(continubutton);
	}
	
	public WebElement getsignupbutton () {
		return signupbutton;
		
	}
	
	public WebElement getphonenumber () {
		
		return phonenumber;
	}
	
	public WebElement getName () {
		
		return Name;
	}
	
	
	public WebElement getcontinubutton () {
		
		return continubutton;
	}
	
	public WebElement getlabeldatafrophone () {
		
		return labeldataforphone;
	}
	
	public void phonenumnerCheck(String phone) {
		type(phonenumber, phone);
		
	}
	
	private void type(WebElement phonenumber, String phone) {
		// TODO Auto-generated method stub
		
	}

	public String phoneLabelDataRead() {
		WebElement phoneLabelData = labeldataforphone;
		String text = phoneLabelData.getText();
		return text;
		
	}
		
	public String NameLabelDataRead() {
			WebElement nameLabelData = labeldataforname;
			String text1 = nameLabelData.getText();
			return text1;
	}

	

	public void getphonenumber(String getdatafromexcel) {
		// TODO Auto-generated method stub
		
	}
	

}
