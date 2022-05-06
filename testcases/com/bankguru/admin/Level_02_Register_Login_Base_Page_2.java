package com.bankguru.admin;

import static org.testng.Assert.assertEquals;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;

public class Level_02_Register_Login_Base_Page_2 {
	WebDriver driver;
	BasePage basePage;
	String userName, password, loginPageUrl;
	String projectLocation = System.getProperty("user.dir");

	@BeforeClass
	public void initBrowser() {
		System.setProperty("webdriver.gecko.driver", projectLocation + ".\\browserDrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		basePage = BasePage.getBasePage();
	}

	@Test
	public void Login_01_Register_To_System() {
		loginPageUrl = basePage.getCurrentUrl(driver);
		basePage.clickToElement(driver, "//a[text()='here']");
		basePage.sendkyToElement(driver, "//input[@name='emailid']", getRandomEmail());
		basePage.clickToElement(driver, "//input[@name='btnLogin']");
		userName = basePage.getElementText(driver, "//td[text()='User ID :']/following-sibling::td");
		password = basePage.getElementText(driver, "//td[text()='Password :']/following-sibling::td");
	}

	@Test
	public void Login_02_Register_To_System() {
		basePage.openPageUrl(driver, loginPageUrl);
		basePage.sendkyToElement(driver, "//input[@name='uid']", userName);
		basePage.sendkyToElement(driver, "//input[@name='password']", password);
		basePage.clickToElement(driver, "//input[@name='btnLogin']");
		String welcomeMessage = basePage.getElementText(driver, "//marquee[@class='heading3']");
		Assert.assertEquals(welcomeMessage, "Welcome To Manager's Page of Guru99 Bank");
		cleanBrowser();
	}

	public String getRandomEmail() {
		String randomEmail;
		return randomEmail = "dungvutuan" + getRandomNumber() + "@gmail.com";
	}

	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(99999);
	}

	public void cleanBrowser() {
		driver.quit();
	}

	@AfterClass
	public void afterClass() {

	}

}
