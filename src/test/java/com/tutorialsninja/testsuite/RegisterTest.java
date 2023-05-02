package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {
    MyAccountsPage myAccountPage = new MyAccountsPage();
    RegisterPage registerPage = new RegisterPage();

    @Test
    public void verifyThatUserRegisterAccountSuccessfully()
    {
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnRegisterLink("Register");
        registerPage.enterFirstNameRegister("Prime");
        registerPage.enterLastName("Testing");
        registerPage.enterEmail("abc96987@gmail.com");
        registerPage.enterTelephoneNumber("298654789");
        registerPage.enterPassword("Abc@12300");
        registerPage.enterConfirmPassword("Abc@12300");
        registerPage.clickOnSubscribeRadioButton();
        registerPage.clickOnPrivacyPolicyCheckBox();
        registerPage.clickOnContinueButton();
        Assert.assertEquals(registerPage.getAccountCreatedMessageText(),"Your Account Has Been Created!");
        registerPage.clickOnAccountCreatedContinueButton();
        myAccountPage.clickOnMyAccountLink();
        myAccountPage.clickOnLogOutLink("Logout");
        Assert.assertEquals(myAccountPage.getAccountLogoutText(),"Account Logout");
        myAccountPage.clickOnAccountLogoutContinueButton();


    }
}
