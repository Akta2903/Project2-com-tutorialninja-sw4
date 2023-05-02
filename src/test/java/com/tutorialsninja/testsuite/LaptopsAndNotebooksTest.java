package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebooksTest extends BaseTest {

    HomePage homePage = new HomePage();
    LaptopsAndNotebooksPage lPage = new LaptopsAndNotebooksPage();
    MacBookPage macBookPage = new MacBookPage();
    ShoppingCart cart = new ShoppingCart();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully()
    {
        homePage.mouseHoverOnLaptopsAndNotebooks();
        homePage.clickOnShowAllLaptopsAndNotebooks("Show AllLaptops & Notebooks");
        lPage.selectSortByPriceHighToLow("Price (High > Low)");
        Assert.assertEquals(lPage.getProductPriceListHighToLow(),lPage.getProductPriceList());


    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully()
    {
        homePage.mouseHoverOnLaptopsAndNotebooks();
        homePage.clickOnShowAllLaptopsAndNotebooks("Show AllLaptops & Notebooks");
        lPage.selectSortByPriceHighToLow("Price (High > Low)");
        lPage.clickOnMacBook();
        Assert.assertEquals(macBookPage.getMacBookText(),"MacBook");
        macBookPage.clickOnAddToCart();
        Assert.assertEquals(macBookPage.getAddToCartText().substring(0,54),"Success: You have added MacBook to your shopping cart!");

        macBookPage.clickOnShoppingCart();
        Assert.assertEquals(cart.getMacBookAddToCartMessageText().substring(0,13),"Shopping Cart");
        Assert.assertEquals(cart.getMacBookText(),"MacBook");
        cart.updateQuantity("2");
        cart.clickOnUpdateTab();
        Assert.assertEquals(cart.getUpdateQtyText().substring(0,46),"Success: You have modified your shopping cart!");
        cart.changeCurrency("£Pound Sterling");
        Assert.assertEquals(cart.getMacBookTotalText(),"£737.45");
        cart.clickOnCheckoutButton();
        Assert.assertEquals(checkOutPage.getCheckoutText(),"Checkout");
        Assert.assertEquals(checkOutPage.getNewCustomerText(),"New Customer");
        checkOutPage.clickOnGuestCheckOut();
        checkOutPage.clickOnContinueButton();
        checkOutPage.enterFirstName("Prime");
        checkOutPage.enterLastName("Testing");
        checkOutPage.enterEmail("prime123@gmail.com");
        checkOutPage.enterTelephoneNumber("02235688996");
        checkOutPage.enterAddress("Garden view");
        checkOutPage.enterCity("London");
        checkOutPage.enterPostCode("NW90LD");
        checkOutPage.selectCountryFromDropDown("United Kingdom");
        checkOutPage.selectStateFromDropDown("Cardiff");
        checkOutPage.clickOnGuestCheckoutContinueButton();
        checkOutPage.enterCommentsAboutYourOrder("Order Placed Successfully!");
        checkOutPage.clickOnTermsAndConditionsCheckbox();
        checkOutPage.clickOnTermAndConditionContinueButton();
        Assert.assertEquals(checkOutPage.getTermsAndConditionText().substring(0,33),"Warning: Payment method required!");




        
    }
}
