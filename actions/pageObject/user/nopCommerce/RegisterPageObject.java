package pageObject.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageObjectGeneratorUserNopcommerce;
import pageUIs.user.nopCommerce.RegisterPageUI;

public class RegisterPageObject extends BasePage {
	private WebDriver driver;

	public RegisterPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void enterToFirstnameTextbox(String string) {
		waitForElementVisisble(driver, RegisterPageUI.FIRSTNAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.FIRSTNAME_TEXTBOX, string);
	}

	public void clickToGerderMaleRaidoButton() {
		waitForElementClickable(driver, RegisterPageUI.GENDER_MALE_RADIO);
		clickToElement(driver, RegisterPageUI.GENDER_MALE_RADIO);
	}

	public void enterToEmailTextbox(String string) {
		waitForElementVisisble(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, string);

	}

	public void enterToLastnameTextbox(String string) {
		waitForElementVisisble(driver, RegisterPageUI.LASTNAME_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.LASTNAME_TEXTBOX, string);
	}

	public void enterToConfirmPasswordTextbox(String string) {
		waitForElementVisisble(driver, RegisterPageUI.CONFIRM_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.CONFIRM_TEXTBOX, string);
	}

	public void enterToPasswordTextbox(String string) {
		waitForElementVisisble(driver, RegisterPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.PASSWORD_TEXTBOX, string);
	}

	public void clickToRegisterButton() {
		waitForElementClickable(driver, RegisterPageUI.REGISTER_BUTTON);
		clickToElement(driver, RegisterPageUI.REGISTER_BUTTON);

	}

	public boolean isSuccesMessageDisplayed() {
		waitForElementVisisble(driver, RegisterPageUI.SUCCESS_MESSAGE);
		return isElementDisplayed(driver, RegisterPageUI.SUCCESS_MESSAGE);
	}

	public HomePageObject clickToLogoutLink() {
		waitForElementClickable(driver, RegisterPageUI.LOGOUT_LINK);
		clickToElement(driver, RegisterPageUI.LOGOUT_LINK);
		return PageObjectGeneratorUserNopcommerce.getHomePage(driver);
	}

}
