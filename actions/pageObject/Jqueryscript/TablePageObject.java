package pageObject.Jqueryscript;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.Jqueryscript.TablePageUI;

public class TablePageObject extends BasePage {

	private WebDriver driver;
	private int numberAdded;

	public TablePageObject(WebDriver driver) {
		
		this.driver = driver;
	}

	public void openPageByNumber(String pageNumber) {
		waitForElementClickable(driver, TablePageUI.FOOTER_LINK_NUMBER, pageNumber);
		clickToElement(driver, TablePageUI.FOOTER_LINK_NUMBER, pageNumber);

	}

	public boolean isPageByNumberDisplayed(String pageNumber) {
		waitForElementVisisble(driver, TablePageUI.FOOTER_LINK_NUMBER_ACTIVED, pageNumber);
		return isElementDisplayed(driver, TablePageUI.FOOTER_LINK_NUMBER_ACTIVED, pageNumber);
	}

	public void sendKeyToHeaderTextboxByName(String value, String headerName) {
		waitForElementVisisble(driver, TablePageUI.HEADER_TEXTBOX, headerName);
		sendKeyToElement(driver, TablePageUI.HEADER_TEXTBOX, value, headerName);
	}

	public void clickToIconByCountryName(String contryName, String iconName) {
		waitForElementVisisble(driver, TablePageUI.ICON_BY_CONTRY_NAME, contryName, iconName);
		clickToElement(driver, TablePageUI.ICON_BY_CONTRY_NAME, contryName, iconName);

	}

	public void sendKeyByColumNameAndRowNumber(String value, String columName, String rowNumber) {
	if(	numberAdded > Integer.valueOf(rowNumber)) {

		waitForElementVisisble(driver, TablePageUI.TEXTBOX_BY_NAME_AND_ROW, columName, rowNumber);
		sendKeyToElement(driver, TablePageUI.TEXTBOX_BY_NAME_AND_ROW, value, columName, rowNumber);
	}
	else {
		throw new RuntimeException("Please in put row number less than" + numberAdded);
	}
	}
	public void clickToAddByNumber(int numberAdded) {
		this.numberAdded = numberAdded;

		for (int i = 0; i < numberAdded; i++) {
			waitForElementClickable(driver, TablePageUI.INCON_ADD_ROW);
			clickToElement(driver, TablePageUI.INCON_ADD_ROW);
		}

	}
}
