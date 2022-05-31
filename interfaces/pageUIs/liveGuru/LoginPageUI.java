package pageUIs.liveGuru;

public class LoginPageUI {
	public static final String LOGIN_BUTTON = "//button[@title='Login']";
	public static final String EMAIL_TEXTBOX = "//label[@for='email']/following-sibling::div/input[@type='email']";
	public static final String PASSWORD_TEXTBOX = "//div[@class='input-box']/input[@type='password']";
	public static final String INVALID_EMAIL_MESSAGE = "//label[@for='email']/following-sibling::div/input[@type='email']/following-sibling::div[text()='Please enter a valid email address. For example johndoe@domain.com.']";
	public static final String INVALID_PASSWORD_MESSAGE = "//div[@class='input-box']/input[@type='password']/following-sibling::div[text()='Please enter 6 or more characters without leading or trailing spaces.']";
	public static final String INCORRECT_PASSOWRD_EMAIL_MESSAGE = "//button[@title='Login']";
	public static final String EMPTY_PASSWORD_MESSAGE = "//div[@class='input-box']/input[@type='password']/following-sibling::div[text()='This is a required field.']";
	public static final String EMPTY_EMAIL_MESSAGE = "//label[@for='email']/following-sibling::div/input[@type='email']/following-sibling::div[text()='This is a required field.']";
	public static final String CREATE_AN_ACCOUNT_BUTTON = "//span[text()='Create an Account']";
	public static final String INCORRECT_EMAIL_OR_PASSWORD = "//span[text()='Invalid login or password.']";
}
