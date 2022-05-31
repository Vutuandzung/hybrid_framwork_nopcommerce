package pageObject.user.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import commons.PageObjectGeneratorUserNopcommerce;
import pageUIs.user.nopCommerce.HomePageUI;

public class HomePageObject extends BasePage {

	private WebDriver driver;
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public RegisterPageObject clickToRegisterLink() {
		waitForElementClickable(driver, HomePageUI.REGISTER_LINK);
		clickToElement(driver, HomePageUI.REGISTER_LINK);
		return PageObjectGeneratorUserNopcommerce.getRegisterPage(driver);
	}

	public LoginPageObject clickToLoginLink() {
		waitForElementClickable(driver, HomePageUI.LOGIN_LINK);
		clickToElement(driver, HomePageUI.LOGIN_LINK);
		return PageObjectGeneratorUserNopcommerce.getLoginPage(driver);
	}

	public boolean isHomePageSliderDisplayed() {
		waitForElementVisisble(driver, HomePageUI.HOME_PAGE_SLIDER);
		return isElementDisplayed(driver, HomePageUI.HOME_PAGE_SLIDER);

	}

	
}
