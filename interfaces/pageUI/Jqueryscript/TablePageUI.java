package pageUI.Jqueryscript;

public class TablePageUI {
public static final String HEADER_TEXTBOX = "//div[@class='qgrd-header-text' and text()='%s']/parent::div/following-sibling::input[@class='qgrd-header-filter']";
public static final String FOOTER_LINK_NUMBER = "//li[@class='qgrd-pagination-page']//a[text()='%s']";
public static final String FOOTER_LINK_NUMBER_ACTIVED = "//li[@class='qgrd-pagination-page']//a[@class='qgrd-pagination-page-link active' and text()='%s']";
public static final String ICON_BY_CONTRY_NAME = "//td[@data-key='country' and text()='%s'] //preceding-sibling::td[@class='qgrd-actions']//button[@class='qgrd-%s-row-btn']";
public static final String INCON_ADD_ROW = "//span[@class='ui-button-icon-primary ui-icon ui-icon-plusthick']";
public static final String TEXTBOX_BY_NAME_AND_ROW = "//input[@id='tblAppendGrid_%s_%s']";

}
