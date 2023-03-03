package com.pfm.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage {
	WebDriver driver;

	@FindBy(xpath = "//select[@data-test='product_sort_container']")
	WebElement filter;
	//WebElement filter = driver.findElement(By.xpath("//select[@data-test='product_sort_container']"));
	
	@FindBy(id = "react-burger-menu-btn")
	WebElement menuItem;
	//WebElement menuItem = driver.findElement(By.id("react-burger-menu-btn"));
	
	@FindBy(id = "logout_sidebar_link")
	WebElement logout;
	////WebElement logout = driver.findElement(By.id("logout_sidebar_link"));

//	To initialize the driver variable of the class
	public ProductsPage(WebDriver driver) {
		// Assigns the local variable driver to the class variable driver
		PageFactory.initElements(driver, this);
	}

	public void changeFilter() {
		WebElement dropdown = filter;
		Select filterOpt = new Select(dropdown);
		filterOpt.selectByIndex(2); // For selecting the 2nd option from the filter
	}

	public void clickOnLogout() {
		try {
			menuItem.click();
			Thread.sleep(2000);
			logout.click();
		} catch (Exception e) {

		}
	}
}
