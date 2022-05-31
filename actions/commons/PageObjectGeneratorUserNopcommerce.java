package commons;

import org.openqa.selenium.WebDriver;

import pageObject.user.nopCommerce.BlogPageObject;
import pageObject.user.nopCommerce.HomePageObject;
import pageObject.user.nopCommerce.LoginPageObject;
import pageObject.user.nopCommerce.NewsPageObject;
import pageObject.user.nopCommerce.RegisterPageObject;
import pageObject.user.nopCommerce.SearchPageObject;

public class PageObjectGeneratorUserNopcommerce {

	private static HomePageObject homePage;
	private static RegisterPageObject registerPage;
	private static LoginPageObject loginPage;
	private static SearchPageObject searchPage;
	private static NewsPageObject newsPage;
	private static BlogPageObject blogPage;

	public static  HomePageObject getHomePage(WebDriver driver) {
		if (homePage == null) {
			homePage = new HomePageObject(driver);
		}

		return homePage;
	}

	public static   LoginPageObject getLoginPage(WebDriver driver) {
		if (loginPage == null) {
			loginPage = new LoginPageObject(driver);
		}

		return loginPage;
	}

	public static   RegisterPageObject getRegisterPage(WebDriver driver) {
		if (registerPage == null) {
			registerPage = new RegisterPageObject(driver);
		}

		return registerPage;
	}

	public static  SearchPageObject getSearchPage(WebDriver driver) {
		if (searchPage == null) {
			searchPage = new SearchPageObject(driver);
		}

		return searchPage;
	}

	public static   NewsPageObject getNewsPage(WebDriver driver) {
		if (newsPage == null) {
			newsPage = new NewsPageObject(driver);
		}

		return newsPage;
	}

	public static  BlogPageObject getBlogPage(WebDriver driver) {
		if (blogPage == null) {
			blogPage = new BlogPageObject(driver);
		}

		return blogPage;
	}
}
