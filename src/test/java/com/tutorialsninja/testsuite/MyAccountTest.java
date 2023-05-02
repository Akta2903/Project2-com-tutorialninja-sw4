package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest {
    MyAccountsPage accountPage = new MyAccountsPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully()
    {
        accountPage.clickOnMyAccountLink();
        accountPage.clickOnRegisterLink("Register");
        Assert.assertEquals(registerPage.getRegisterText(),"Register Account");
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully()
    {
        accountPage.clickOnMyAccountLink();
        accountPage.clickOnLoginLink("Login");
        Assert.assertEquals(loginPage.getReturningCustomerText(),"Returning Customer");
    }
}
