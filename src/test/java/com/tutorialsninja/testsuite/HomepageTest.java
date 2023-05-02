package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomepageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopPage =new DesktopPage();
    LaptopsAndNotebooksPage  laptop = new LaptopsAndNotebooksPage();
    ComponentPage componentPage = new ComponentPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

        homePage.mouseHoverOnDesktops();
        homePage.clickOnShowAllDesktopsMenu("Show AllDesktops");
        Assert.assertEquals(desktopPage.getDesktopText(),"Desktops");


    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    {
        homePage.mouseHoverOnLaptopsAndNotebooks();
        homePage.clickOnShowAllLaptopsAndNotebooks("Show AllLaptops & Notebooks");
        Assert.assertEquals(laptop.getLaptopAndNotebookText(),"Laptops & Notebooks");

    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully()
    {
        homePage.mouseHoverOnComponents();
        homePage.clickOnShowAllComponents("Show AllComponents");
        Assert.assertEquals(componentPage.getComponentText(),"Components");

    }

}
