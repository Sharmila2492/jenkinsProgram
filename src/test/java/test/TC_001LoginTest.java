package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.LoginPage;

public class TC_001LoginTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() {
		
		sheetname="LoginData";
		testName="Login test";
		testAuthor="Sharmila";
		testCategory="Smoketest";
		testDescription="Login test with positive scenarios";
		
	}
	
	@Test(dataProvider = "readData")
	public void loginTest(String name,String pass, String testType,String expectedText) {
		
		LoginPage obj = new LoginPage(driver);
		
		
		obj.enterUserName(name)
		.enterPassword(pass)
		.clickLogin()
		.validateLogin(testType, expectedText);
		    
		
	}
}


