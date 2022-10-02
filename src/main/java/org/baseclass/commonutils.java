package org.baseclass;

import java.io.File;


import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class commonutils {
	
			protected static ExtentHtmlReporter report = new ExtentHtmlReporter (new File ("./target/example.html")); 
			
			protected static ExtentReports extend = new ExtentReports(); 
			
			protected static ExtentTest logger;
			
			
			public static Logger log = slf4J.loadLogger(commonutils.class);
          

public static WebDriver driver;
	
	static Select sel;
	
	int a;
	
	public static void BrowserLaunch (String browser) {
		
		switch(browser) {
			
			case ("chrome"):
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Maven_JUnit\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				//driver.manage().window().maximize();
				break;
				
			case ("firefox"):
				
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\SELENIUM-BASIC\\selenium\\geckodriver.exe");
				driver= new FirefoxDriver();
				//driver.manage().window().maximize();
				break;
				
			default:
				
				System.out.println("the given browser is not found");
				break;
				}}
	

	public static void URLlaunch (String url) {
			driver.get(url);	
	}
	
	
	public static void maximize() {
			driver.manage().window().maximize();
	}
	
	
	public static WebElement findElementusingId(String Id) {
			WebElement element=	driver.findElement(By.id(Id));
			return element;
	}
	
	
	public static WebElement findElementusingName(String name) {
			WebElement element=	driver.findElement(By.name(name));
			return element;
	}
	
	
	public static WebElement findElementusingXpath(String xpath) {
			return driver.findElement(By.xpath(xpath));
		
	}
	
	
	public static WebElement findElementusingXpath(By xpath) {
			return driver.findElement(xpath);
		
	}
	
	
	public static List<WebElement> findElementsusingXpath(String xpath) {
			return driver.findElements(By.xpath(xpath));
		
	}
	
	
	public static void elementClick(WebElement element) {
			element.click();
	}
	
	
	public static void SendKeysValues (WebElement element, String name) {
			element.sendKeys(name);
		
	}
	
	
	public static void Selectdropdown(WebElement element) {
		 	sel= new Select( element);
		
	}
	
	
	public static void acceptpopup() {
		driver.switchTo().alert().accept(); //to click ok
	}
	
	public static String getText() {
		return driver.switchTo().alert().getText();  
		
	}
	
	public static void dismisspopup() {
		 driver.switchTo().alert().dismiss(); // to click cancel
		
	}
	
	
	public static void sendKeysAlertHandling(String text) {
		 driver.switchTo().alert().sendKeys(text);
		
	}
	
	public static void implicitwait() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	
	//JUnit
	
	
	
	
	//get input from specific config.properties
	
	public void URLlaunchfromResource (String url) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		rb.getString(url);
	}
	
	
		
	}

