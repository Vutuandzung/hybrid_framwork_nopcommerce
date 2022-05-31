package com.jqueryscript.demo;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTestNopcommerce;
import commons.PageObjectGeneratorJqueryScript;
import pageObject.Jqueryscript.TablePageObject;

public class Data_Table_Locator_Dynamic extends BaseTestNopcommerce {
	WebDriver driver;

	@Parameters({ "browser", "appUrl" })
	@BeforeClass
	public void initBrowser(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		driver.manage().window().maximize();

	}

//	@Test
//	public void TC_01_Paging() {
//		tablePage = PageObjectGeneratorJqueryScript.getTablePage(driver);
//		tablePage.openPageByNumber("1");
//		Assert.assertTrue(tablePage.isPageByNumberDisplayed("1"));
//
//		tablePage.openPageByNumber("2");
//		Assert.assertTrue(tablePage.isPageByNumberDisplayed("2"));
//
//		tablePage.openPageByNumber("6");
//		Assert.assertTrue(tablePage.isPageByNumberDisplayed("6"));
//
//		tablePage.openPageByNumber("10");
//		Assert.assertTrue(tablePage.isPageByNumberDisplayed("10"));
//
//		tablePage.openPageByNumber("15");
//		Assert.assertTrue(tablePage.isPageByNumberDisplayed("15"));
//
//	}
//
//	@Test
//	public void TC_02_Action() {
//		tablePage.refreshCurrentPage(driver);
//		tablePage.sendKeyToHeaderTextboxByName("16700", "Females");
//
//		tablePage.refreshCurrentPage(driver);
//		tablePage.sendKeyToHeaderTextboxByName("Zimbabwe", "Country");
//
//		tablePage.refreshCurrentPage(driver);
//		tablePage.sendKeyToHeaderTextboxByName("4490", "Males");
//
//		tablePage.refreshCurrentPage(driver);
//		tablePage.sendKeyToHeaderTextboxByName("2083000", "Total");
//
//		tablePage.refreshCurrentPage(driver);
//
//		tablePage.clickToIconByCountryName("Afghanistan", "remove");
//		tablePage.sleepInSecond(2);
//
//		tablePage.clickToIconByCountryName("Armenia", "remove");
//		tablePage.sleepInSecond(2);
//
//		tablePage.clickToIconByCountryName("Angola", "remove");
//		tablePage.sleepInSecond(2);
//
//		tablePage.clickToIconByCountryName("Argentina", "remove");
//		tablePage.sleepInSecond(2);
//		cleanBrowser();
//
//	}
	@Test
	public void TC_03_Action() {
		tablePage = PageObjectGeneratorJqueryScript.getTablePage(driver);
		tablePage.clickToAddByNumber(10);

		tablePage.sendKeyByColumNameAndRowNumber("John", "Album", "1");
		tablePage.sendKeyByColumNameAndRowNumber("Wick", "Artist", "2");
		tablePage.sendKeyByColumNameAndRowNumber("Con", "Year", "3");
		tablePage.sendKeyByColumNameAndRowNumber("12", "Price", "10");
		

	}

	@AfterClass

	public void cleanBrowser() {
		driver.quit();
	}

	TablePageObject tablePage;

}
