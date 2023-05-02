package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By registerText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By subscribeRadioButton = By.xpath("//fieldset[3]//input");
    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By accountCreationMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By accountCreatedContinueButton = By.xpath("//a[normalize-space()='Continue']");

    public void enterFirstNameRegister(String firstname)
    {
        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname)
    {
        sendTextToElement(lastName,lastname);
    }
    public void enterEmail(String emailId)
    {
        sendTextToElement(email,emailId);
    }

    public void enterTelephoneNumber(String telephoneNo)
    {
        sendTextToElement(telephone,telephoneNo);
    }

    public void enterPassword(String passwordText)
    {
        sendTextToElement(password,passwordText);
    }
    public void enterConfirmPassword(String passwordText)
    {
        sendTextToElement(confirmPassword,passwordText);
    }

    public void clickOnSubscribeRadioButton()
    {
        clickOnElement(subscribeRadioButton);
    }
    public void clickOnPrivacyPolicyCheckBox()
    {
        clickOnElement(privacyPolicy);
    }
    public void clickOnContinueButton()
    {
        clickOnElement(continueButton);
    }



    public String getRegisterText()
    {
        return getTextFromElement(registerText);
    }

    public String getAccountCreatedMessageText()
    {
        return getTextFromElement(accountCreationMessage);
    }

    public void clickOnAccountCreatedContinueButton()
    {
        clickOnElement(accountCreatedContinueButton);
    }

}
