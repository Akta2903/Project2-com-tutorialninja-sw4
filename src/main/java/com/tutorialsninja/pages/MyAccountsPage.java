package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountsPage extends Utility {

    By accountOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");
    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By accountLogOutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By logOutContinueButton = By.xpath("//a[contains(text(),'Continue')]");



    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(accountOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(accountOption);
        }
    }

    public void clickOnMyAccountLink()
    {
        clickOnElement(myAccountLink);
    }

    public void clickOnRegisterLink(String selectOption )
    {
        selectMyAccountOptions(selectOption);
    }

    public void clickOnLoginLink(String selectOption)
    {
        selectMyAccountOptions(selectOption);
    }

    public void clickOnLogOutLink(String option)
    {
        selectMyAccountOptions(option);
    }

    public String getAccountLogoutText()
    {
        return getTextFromElement(accountLogOutText);
    }
    public void clickOnAccountLogoutContinueButton()
    {
        clickOnElement(logOutContinueButton);
    }
}
