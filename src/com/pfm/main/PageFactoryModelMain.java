package com.pfm.main;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import com.pfm.pageobjects.LoginPage;
import com.pfm.pageobjects.ProductsPage;

public class PageFactoryModelMain {

	public static void main(String[] args) {
		try {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.saucedemo.com/");
			LoginPage login = new LoginPage(driver);
			login.enterUserName("standard_user");
			Thread.sleep(2000);
			login.enterPassword("secret_sauce");
			Thread.sleep(2000);
			login.clickOnLogin();
			Thread.sleep(2000);
			
			ProductsPage product = new ProductsPage(driver);
			Thread.sleep(2000);
			product.changeFilter();
			Thread.sleep(2000);
			product.clickOnLogout();
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
