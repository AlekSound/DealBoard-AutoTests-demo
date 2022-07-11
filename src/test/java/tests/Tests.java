package tests;

import org.testng.annotations.Test;

public class Tests extends BaseTest{

    @Test (description = "Check of app loaded")
    public void checkOfPageLoading() {
        page_main.checkIsMainPageLogo();
    }

    @Test (description = "Successful Login, Header")
    public void authIsCorrect_Header() {
        page_main.clickByLoginButton_Header();
        page_main.enterNameForLogin_Header();
        page_main.enterPassForLogin_Header();
        page_main.clickLoginButtonAfterEnterValues();
        page_main.checkLoginButtonAfterCorrectAuth();
    }

    @Test (description = "Failed Login by name, Header")
    public void authIsIncorrectName_Header() {
        page_main.clickByLoginButton_Header();
        page_main.enterIncorrectNameForLogin_Header();
        page_main.enterPassForLogin_Header();
        page_main.clickLoginButtonAfterEnterValues();
        page_main.checkIncorrectLoginData_Header();
    }

    @Test (description = "Failed Login by password, Header")
    public void authIsIncorrectPass_Header() {
        page_main.clickByLoginButton_Header();
        page_main.enterNameForLogin_Header();
        page_main.enterIncorrectPassForLogin_Header();
        page_main.clickLoginButtonAfterEnterValues();
        page_main.checkIncorrectLoginData_Header();
    }

    @Test (description = "Check of error for empty name field")
    public void authWithEmptyName_Header() {
        page_main.clickByLoginButton_Header();
        page_main.enterPassForLogin_Header();
        page_main.clickLoginButtonAfterEnterValues();
        page_main.checkLoginErrorEmptyName_Header();
    }

    @Test (description = "Check of error for empty password field")
    public void authWithEmptyPass_Header() {
        page_main.clickByLoginButton_Header();
        page_main.enterNameForLogin_Header();
        page_main.clickLoginButtonAfterEnterValues();
        page_main.checkLoginErrorEmptyPass_Header();
    }
}