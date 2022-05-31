package pageObject.liveGuru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUIs.liveGuru.HomepageUI;

public class HomePageObject extends BasePage {
	private WebDriver driver;

	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToMyAccountFooter() {

		waitForElementClickable(driver, HomepageUI.FOOTER_MY_ACCOUNT);
		clickToElement(driver, HomepageUI.FOOTER_MY_ACCOUNT);
	}
	

}
