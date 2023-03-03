package com.pfm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement username;
	//or
	//WebElement username = driver.findElement(By.id("user-name"))
	

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement login;

	// Local Variables/Method Variables
	public LoginPage(WebDriver driver) {
		// this.driver always refers to the class varaible called driver
        // Assigns the local variable driver to the class variable driver
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String name) {
		username.sendKeys(name);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void clickOnLogin() {
		login.click();
	}

}
