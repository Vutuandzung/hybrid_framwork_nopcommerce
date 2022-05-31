package commons;

import org.openqa.selenium.WebDriver;

import pageObject.admin.nopCommerce.LoginPageObject;
import pageObject.admin.nopCommerce.MyDasboardPageObject;
import pageObject.admin.nopCommerce.ProductDetailPageObject;
import pageObject.admin.nopCommerce.ProductSearchPageObject;

public class PageObjectGeneratorAdminNopcommerce {

	private static LoginPageObject loginPage;
	private static ProductDetailPageObject productDetailPage;
	private static ProductSearchPageObject productSearchPage;
	private static MyDasboardPageObject myDashboardPage;

	public static LoginPageObject getLoginPage(WebDriver driver) {
		if (loginPage == null) {
			loginPage = new LoginPageObject(driver);
		}

		return loginPage;
	}

	public static ProductDetailPageObject getProductDetailPage(WebDriver driver) {
		if (productDetailPage == null) {
			productDetailPage = new ProductDetailPageObject(driver);
		}

		return productDetailPage;
	}

	public static ProductSearchPageObject getProductSearchPage(WebDriver driver) {
		if (productSearchPage == null) {
			productSearchPage = new ProductSearchPageObject(driver);
		}

		return productSearchPage;
	}

	public static MyDasboardPageObject getMyDashboardPage(WebDriver driver) {
		if (myDashboardPage == null) {
			myDashboardPage = new MyDasboardPageObject(driver);
		}

		return myDashboardPage;
	}
}