package pageObject.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.RegisterPageUI;

public class RegisterPageObject extends BasePage {

	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeyToFirstname(String string) {
		waitForElementVisisble(driver, RegisterPageUI.FIRST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRST_NAME_TEXTBOX, string);
	}

	public void sendKeyToEmailAddress(String string) {
		waitForElementVisisble(driver, RegisterPageUI.EMAIL_ADDRESS_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_ADDRESS_TEXTBOX, string);		
	}

	public void sendKeyToLastname(String string) {
		waitForElementVisisble(driver, RegisterPageUI.LAST_NAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.LAST_NAME_TEXTBOX, string);		
	}

	public void sendKeyToConfirmPassword(String string) {
		waitForElementVisisble(driver, RegisterPageUI.CONFIRM_PASWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_PASWORD_TEXTBOX, string);		
	}

	public void sendKeyToPassword(String string) {
		waitForElementVisisble(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, string);		
	}

	public boolean isMyDashboardMessageDisplayed() {
		waitForElementVisisble(driver, RegisterPageUI.MY_DASHBOARD_SUCCESS_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.MY_DASHBOARD_SUCCESS_MESSAGE);
	}

	public void clickToRegisterButton() {
		waitForElementVisisble(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON );
		
	}
}
