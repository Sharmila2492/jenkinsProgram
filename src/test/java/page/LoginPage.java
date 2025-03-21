package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods{

	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage enterUserName(String name) {
		
		username.sendKeys(name);
		return this;
	}
	
	public LoginPage enterPassword(String pass) {
		
		password.sendKeys(pass);
		return this;
	}
	
	public DashBoardPage clickLogin() {
		
		login.click();
		return new DashBoardPage(driver);
	}
}