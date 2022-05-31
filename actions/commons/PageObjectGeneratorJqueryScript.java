package commons;

import org.openqa.selenium.WebDriver;

import pageObject.Jqueryscript.TablePageObject;

public class PageObjectGeneratorJqueryScript {

	private static TablePageObject tablePage;

	public static TablePageObject getTablePage(WebDriver driver) {
		if (tablePage == null) {
			tablePage = new TablePageObject(driver);
		}

		return tablePage;
	}
}
