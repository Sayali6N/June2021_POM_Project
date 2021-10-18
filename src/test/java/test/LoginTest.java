package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
//To call methods from different class following are different ways
//Inherit//Creating Object// Calling By the name of Class.
//here we are using calling By Name Of Class --> to call methods from different Class.
	
	WebDriver driver;
	
	//Login Data
//	String userName = "demo@techfios.com";
//	String password = "abc123";
	

	
	@Test
	public void validUserShouldBeAbleToLogin() {
		
		driver = BrowserFactory.init();
		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
//		System.out.println(driver.getTitle());
		
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver,DashboardPage.class);
		dashboard.verifyDashboard();
		
//		BrowserFactory.tearDown();
	}
}
