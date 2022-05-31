package com.nopcommerce.login;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTestNopcommerce;
import commons.PageObjectGeneratorUserNopcommerce;
import pageObject.user.nopCommerce.BlogPageObject;
import pageObject.user.nopCommerce.HomePageObject;
import pageObject.user.nopCommerce.LoginPageObject;
import pageObject.user.nopCommerce.NewsPageObject;
import pageObject.user.nopCommerce.RegisterPageObject;
import pageObject.user.nopCommerce.SearchPageObject;

public class Level_03_Register_Login_Base_Page extends BaseTestNopcommerce {
	WebDriver driver;
	String emailAddress, password;

	@Parameters({ "browser", "appUrl" })
	@BeforeClass
	public void initBrowser(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = getRandomEmail();
		password = "123456";

	}

	@Test
	public void Login_01_Register_To_System() {
		homePage = PageObjectGeneratorUserNopcommerce.getHomePage(driver);
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
		registerPage = homePage.clickToRegisterLink();
		registerPage.clickToGerderMaleRaidoButton();
		registerPage.enterToFirstnameTextbox("JOHN");
		registerPage.enterToLastnameTextbox("WICK");
		registerPage.enterToEmailTextbox(emailAddress);
		registerPage.enterToPasswordTextbox(password);
		registerPage.enterToConfirmPasswordTextbox(password);
		registerPage.clickToRegisterButton();
		Assert.assertTrue(registerPage.isSuccesMessageDisplayed());
		homePage = registerPage.clickToLogoutLink();
		;
	}

	@Test
	public void Login_02_Login_To_System() {
		loginPage = homePage.clickToLoginLink();
		loginPage.enterToEmailTextbox(emailAddress);
		loginPage.enterToPasswordTextbox(password);
		homePage = loginPage.clickToLoginButton();
		Assert.assertTrue(homePage.isHomePageSliderDisplayed());
	}
	@Test
	public void Login_02_Switch_Page() {
		homePage.openFooterPageByName(driver, "Search");
		searchPage = PageObjectGeneratorUserNopcommerce.getSearchPage(driver);
		
		searchPage.openFooterPageByName(driver, "Blog");
		blogPage = PageObjectGeneratorUserNopcommerce.getBlogPage(driver);
		
		blogPage.openFooterPageByName(driver, "News");
		newsPage = PageObjectGeneratorUserNopcommerce.getNewsPage(driver);
		
		newsPage.openFooterPageByName(driver, "Search");
		PageObjectGeneratorUserNopcommerce.getSearchPage(driver);
		cleanBrowser();
				
	}

	@AfterClass
	public String getRandomEmail() {
		Random rand = new Random();
		return "dungvutuan" + rand.nextInt(99999) + "@gmail.com";
	}

	public void cleanBrowser() {
		driver.quit();
	}

	HomePageObject homePage;
	LoginPageObject loginPage;
	RegisterPageObject registerPage;
	SearchPageObject searchPage;
	BlogPageObject blogPage;
	NewsPageObject newsPage;

}
