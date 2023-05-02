package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

//abc96987@gmail.com
    //Abc@12300

    MyAccountsPage myAccountsPage = new MyAccountsPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully()
    {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnLoginLink("Login");
        loginPage.enterEmail("abc96987@gmail.com");
        loginPage.enterPassword("Abc@12300");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getLoginText(),"My Account");
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnLogOutLink("Logout");
        Assert.assertEquals(myAccountsPage.getAccountLogoutText(),"Account Logout");
        myAccountsPage.clickOnAccountLogoutContinueButton();

    }
}
