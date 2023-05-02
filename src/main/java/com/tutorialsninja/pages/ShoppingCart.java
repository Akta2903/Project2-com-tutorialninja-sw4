package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By shoppingCartText = By.xpath("//div[@id='content']//h1");
    By productNameText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By deliveryDateText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");

    By modelText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By totalText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By macBookShoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By macBookText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By qty = By.xpath("//input[contains(@name, 'quantity')]");
    By updateTab = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By updateTabText = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By currencyButton = By.xpath("//span[contains(text(),'Currency')]");
    By sterlingPound = By.xpath("//ul[@class = 'dropdown-menu']/li");
    By verifyTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutButton = By.xpath("//a[@class='btn btn-primary']");




    public String getShoppingCartText()
    {
        return getTextFromElement(shoppingCartText);
    }

    public String getProductNameText()
    {
        return getTextFromElement(productNameText);
    }

    public String getDeliveryDateText()
    {
        return getTextFromElement(deliveryDateText);
    }

    public String getModelText()
    {
        return getTextFromElement(modelText);
    }

    public String gettotalText()
    {
        return getTextFromElement(totalText);
    }

    public String getMacBookAddToCartMessageText()
    {
        return getTextFromElement(macBookShoppingCartText);
    }
    public String getMacBookText()
    {
        return  getTextFromElement(macBookText);
    }
    public void updateQuantity(String newQty)
    {
        driver.findElement(qty).clear();
        sendTextToElement(qty,newQty);
    }
    public void clickOnUpdateTab()
    {
        clickOnElement(updateTab);
    }
    public String getUpdateQtyText()
    {
        return getTextFromElement(updateTabText);
    }
    public void changeCurrency(String text)
    {
        clickOnElement(currencyButton);
        selectByContainsTextFromListOfElements(sterlingPound,text);
    }
    public String getMacBookTotalText()
    {
        return  getTextFromElement(verifyTotal);
    }
    public void clickOnCheckoutButton()
    {
        clickOnElement(checkoutButton);
    }


}
