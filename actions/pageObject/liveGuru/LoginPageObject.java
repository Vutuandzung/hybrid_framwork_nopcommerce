package pageObject.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.LoginPageUI;

public class LoginPageObject extends BasePage {

	private WebDriver driver;

	public LoginPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToLoginButton() {

		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}

	public boolean isEmptyEmailErrorDisplayed() {
		waitForElementVisisble(driver, LoginPageUI.EMPTY_EMAIL_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.EMPTY_EMAIL_MESSAGE);
		 
	}

	public boolean isEmptyPasswordErrorDisplayed() {
		waitForElementVisisble(driver, LoginPageUI.EMPTY_PASSWORD_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.EMPTY_PASSWORD_MESSAGE);
	}

	public void enterEmailTextbox(String string) {
		waitForElementVisisble(driver, LoginPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.EMAIL_TEXTBOX, string);
	}

	public void enterPasswordTextbox(String string) {
		waitForElementVisisble(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, string);

	}

	public boolean isInvalidEmailMessageDisplayed() {
		waitForElementVisisble(driver, LoginPageUI.INVALID_EMAIL_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.INVALID_EMAIL_MESSAGE);
	}

	public boolean isInvalidPasswordMessageDisplayed() {
		waitForElementVisisble(driver, LoginPageUI.INVALID_PASSWORD_MESSAGE);
		return isElementDisplayed(driver, LoginPageUI.INVALID_PASSWORD_MESSAGE);	
		
	}

	public boolean isIncorrectEmailPasswordMessageDisplayed() {
		waitForElementVisisble(driver, LoginPageUI.INCORRECT_EMAIL_OR_PASSWORD);
		return isElementDisplayed(driver, LoginPageUI.INCORRECT_PASSOWRD_EMAIL_MESSAGE);
	}

	public void clickToCreateAnAccountButton() {
		waitForElementClickable(driver, LoginPageUI.CREATE_AN_ACCOUNT_BUTTON);
		clickToElement(driver, LoginPageUI.CREATE_AN_ACCOUNT_BUTTON);

	}

}