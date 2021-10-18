package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddContactPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddContactTest {
	WebDriver driver;
	//Login Data
//	String userName = "demo@techfios.com";
//	String password = "abc123";
	
	//TestData
	String Full_Name = "TestNG";
	String COMPANY_NAME = "Techfios";
	String EMAIL ="abc234@techfios.com";
	String PHONE_NUMBER = "73463943";
	String COUNTRY = "Angola";
	
	@Test
	public void validUserShouldBeAbleToAddCustomer() {
		driver = BrowserFactory.init();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.insertUserName("demo@techfios.com");
		login.insertPassword("abc123");
		login.clickSigninButton();
		
		DashboardPage dashboard = PageFactory.initElements(driver,DashboardPage.class);
		dashboard.verifyDashboard();
		dashboard.clickCustomerButton();
		dashboard.clickAddCustomerButton();
		
		//creating object below
		AddContactPage addContactPage = PageFactory.initElements(driver, AddContactPage.class);
		addContactPage.insertFullName("TestNG");
		addContactPage.selectCompany("Techfios");
		addContactPage.insertEmail("abc234@techfios.com");
		addContactPage.insertPhone("73463943");
		addContactPage.selectCountry("Angola");
		
		
		
		
				
		
	}

}
