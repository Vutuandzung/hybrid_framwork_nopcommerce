package com.liveguru.login;

import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.liveGuru.HomePageObject;
import pageObject.liveGuru.LoginPageObject;
import pageObject.liveGuru.RegisterPageObject;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Register_Login extends BaseTest {
	WebDriver driver;
	String emailAddress, homePageUrl;

	@Parameters({ "browser", "url" })
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		emailAddress = getRandomEmail();
	}

	@Test
	public void TC01_Login_Empty_Email_And_Password() {
		homePageObject = new HomePageObject(driver);
		homePageUrl = homePageObject.getPageUrl(driver);
		homePageObject.clickToMyAccountFooter();
		loginPageOject = new LoginPageObject(driver);
		loginPageOject.clickToLoginButton();
		Assert.assertTrue(loginPageOject.isEmptyEmailErrorDisplayed());
		Assert.assertTrue(loginPageOject.isEmptyPasswordErrorDisplayed());

	}

	@Test
	public void TC02_Login_Invalid_Email() {
		loginPageOject.openPageUrl(driver, homePageUrl);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickToMyAccountFooter();
		loginPageOject = new LoginPageObject(driver);
		loginPageOject.enterEmailTextbox("132132@13214");
		loginPageOject.enterPasswordTextbox("12313213");
		loginPageOject.clickToLoginButton();
		Assert.assertTrue(loginPageOject.isInvalidEmailMessageDisplayed());
	}

	@Test
	public void TC03_Login_Invalid_Password() {
		loginPageOject.openPageUrl(driver, homePageUrl);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickToMyAccountFooter();
		loginPageOject = new LoginPageObject(driver);
		loginPageOject.enterEmailTextbox("ngu@gmail.com");
		loginPageOject.enterPasswordTextbox("123");
		loginPageOject.clickToLoginButton();
		Assert.assertTrue(loginPageOject.isInvalidPasswordMessageDisplayed());

	}

	@Test
	public void TC04_Login_Incorrect_Email_Password() {
		loginPageOject.openPageUrl(driver, homePageUrl);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickToMyAccountFooter();
		loginPageOject = new LoginPageObject(driver);
		loginPageOject.enterEmailTextbox("ngu@gmail.com");
		loginPageOject.enterPasswordTextbox("1234567");
		loginPageOject.clickToLoginButton();
		Assert.assertTrue(loginPageOject.isIncorrectEmailPasswordMessageDisplayed());

	}

	@Test
	public void TC05_Register() {
		loginPageOject.openPageUrl(driver, homePageUrl);
		homePageObject = new HomePageObject(driver);
		homePageObject.clickToMyAccountFooter();
		loginPageOject = new LoginPageObject(driver);
		loginPageOject.clickToCreateAnAccountButton();
		registerPageObject = new RegisterPageObject(driver);
		registerPageObject.sendKeyToFirstname("John");
		registerPageObject.sendKeyToLastname("Wick");
		registerPageObject.sendKeyToEmailAddress(emailAddress);
		registerPageObject.sendKeyToPassword("123132");
		registerPageObject.sendKeyToConfirmPassword("123132");
		registerPageObject.clickToRegisterButton();
		Assert.assertTrue(registerPageObject.isMyDashboardMessageDisplayed());
		cleanBrowser();

	}

	@AfterClass
	public void cleanBrowser() {
		driver.quit();
	}

	HomePageObject homePageObject;
	RegisterPageObject registerPageObject;
	LoginPageObject loginPageOject;
}
