package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Main extends BasePage{
    public Page_Main(WebDriver driver) {
        super(driver);
    }

    public final String VALUE_LOGIN_NAME_CORRECT = "aliaksandr.tryhubovich@rednavis.com";
    public final String VALUE_LOGIN_NAME_INCORRECT = "aaaliaksandr.tryhubovich@rednavis.com";
    public final String VALUE_LOGIN_PASS_CORRECT = "Xx123456";
    public final String VALUE_LOGIN_PASS_INCORRECT = "Xx123456xX";

    public final String HOME_PAGE = "https://staging.deal-board.eu/";
    public final String BUTTON_COOKIE = "rcc-confirm-button";
    public final String BUTTON_LOGIN_HEADER = "//button[contains(@class, 'iKMXQg hdLOTc')]";
    public final String BUTTON_LOGIN_FORM = "//button[contains(@class, 'emDsmM gxovKo')]";
    public final String BUTTON_LOGIN_FOOTER = "";
    public final String FIELD_LOGIN_NAME_HEADER = "//input[@name='contact']";
    public final String FIELD_LOGIN_PASS_HEADER = "//input[@name='password']";
    public final String MESSAGE_INCORRECT_LOGIN_VALUE = "//p[text() = 'Wrong username or password']";
    public final String MESSAGE_EMPTY_NAME_LOGIN_VALUE = "//div[contains(text(), 'Please enter Email')]";
    public final String MESSAGE_EMPTY_PASS_LOGIN_VALUE = "//div[contains(text(), 'Please enter Password')]";

    public final String CHECK_LOGO_ELEMENT = "//img[@class='sc-hmvnCu heuQzl']";
    public final String CHECK_LOGIN_BUTTON_AUTHORIZED = "//*[text()='Alek Sound']";


    //the main firsts activities with app
    public void goTO() {
        driver.get(HOME_PAGE);
    }
    public void agreeWithCookie() {
        clickOn(By.id(BUTTON_COOKIE));
    }

    public void checkIsMainPageLogo() {
        isElementDisplayed(By.xpath(CHECK_LOGO_ELEMENT));
    }

    //"Login" activities
    public void clickByLoginButton_Header() {
        clickOn(By.xpath(BUTTON_LOGIN_HEADER));
    }
    public void enterNameForLogin_Header() {
        write(By.xpath(FIELD_LOGIN_NAME_HEADER), VALUE_LOGIN_NAME_CORRECT);
    }
    public void enterIncorrectNameForLogin_Header() {
        write(By.xpath(FIELD_LOGIN_NAME_HEADER), VALUE_LOGIN_NAME_INCORRECT);
    }
    public void enterPassForLogin_Header() {
        write(By.xpath(FIELD_LOGIN_PASS_HEADER), VALUE_LOGIN_PASS_CORRECT);
    }
    public void enterIncorrectPassForLogin_Header() {
        write(By.xpath(FIELD_LOGIN_PASS_HEADER), VALUE_LOGIN_PASS_INCORRECT);
    }
    public void clickLoginButtonAfterEnterValues() {
        clickOn(By.xpath(BUTTON_LOGIN_FORM));
    }
    public void checkLoginButtonAfterCorrectAuth() {
        isElementDisplayed(By.xpath(CHECK_LOGIN_BUTTON_AUTHORIZED));
    }
    public void checkIncorrectLoginData_Header() {
        isElementDisplayed(By.xpath(MESSAGE_INCORRECT_LOGIN_VALUE));
    }
    public void checkLoginErrorEmptyName_Header() {
        isElementDisplayed(By.xpath(MESSAGE_EMPTY_NAME_LOGIN_VALUE));
    }
    public void checkLoginErrorEmptyPass_Header() {
        isElementDisplayed(By.xpath(MESSAGE_EMPTY_PASS_LOGIN_VALUE));
    }

    //Item activities
}
