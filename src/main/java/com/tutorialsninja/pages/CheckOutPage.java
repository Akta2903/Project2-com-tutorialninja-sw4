package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By checkOutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckout = By.xpath("//input[@value='guest']");
    By continueButton = By.xpath("//input[@id='button-account']");
    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By email = By.xpath("//input[@id='input-payment-email']");
    By telephone = By.name("telephone");
    By address = By.name("address_1");
    By city = By.name("city");
    By postcode = By.name("postcode");
    By country = By.xpath("//select[@id='input-payment-country']");
    By state = By.xpath("//select[@id='input-payment-zone']") ;
    By continueButton1 = By.xpath("//input[@id='button-guest']");
    By addComments = By.xpath("//textarea[@name='comment']");
    By termAndCondition = By.xpath("//input[@name='agree']");
    By termsAndConditionsContinueButton = By.xpath("//input[@id='button-payment-method']");
    By termsAndConditionsText = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public String getCheckoutText()
    {
        return  getTextFromElement(checkOutText);
    }

    public String getNewCustomerText()
    {
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckOut()
    {
        clickOnElement(guestCheckout);
    }
    public void clickOnContinueButton()
    {
        clickOnElement(continueButton);
    }

    public void enterFirstName(String firstname)
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

    public void enterAddress(String address1)
    {
        sendTextToElement(address,address1);
    }
    public void enterCity(String cityName)
    {
        sendTextToElement(city,cityName);
    }
    public void enterPostCode(String post)
    {
        sendTextToElement(postcode,post);
    }
    public void selectCountryFromDropDown(String text)
    {
        selectByVisibleTextFromDropDown(country,text);
    }

    public void selectStateFromDropDown(String text)
    {
        selectByVisibleTextFromDropDown(state,text);
    }
    public void clickOnGuestCheckoutContinueButton()
    {
        clickOnElement(continueButton1);
    }

    public void enterCommentsAboutYourOrder(String comment)
    {
        sendTextToElement(addComments,comment);
    }
    public void clickOnTermsAndConditionsCheckbox()
    {
        clickOnElement(termAndCondition);
    }
    public void clickOnTermAndConditionContinueButton()
    {
        clickOnElement(termsAndConditionsContinueButton);
    }

    public String getTermsAndConditionText()
    {
        return getTextFromElement(termsAndConditionsText);
    }
}
