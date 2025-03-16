package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificationMethods;
import page.LoginPage;

public class TC_001LoginTest extends ProjectSpecificationMethods {
	@BeforeTest
	public void setup() {
		
		sheetname="LoginData";
		
	}
	
	@Test(dataProvider = "readData")
	public void loginTest(String name,String pass, String testType,String expectedText) {
		
		LoginPage obj = new LoginPage(driver);
		
	}
}


