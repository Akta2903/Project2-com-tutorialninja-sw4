package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By topMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By desktop = By.linkText("Desktops");
    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(topMenu);
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(topMenu);
        }
    }

    public void mouseHoverOnDesktops()
    {
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverOnLaptopsAndNotebooks()
    {
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }
    public void mouseHoverOnComponents()
    {
        mouseHoverToElementAndClick(components);
    }

    public void clickOnShowAllDesktopsMenu(String menu)
    {
        selectMenu(menu);
    }

    public void clickOnShowAllLaptopsAndNotebooks(String menu)
    {
        selectMenu(menu);
    }

    public void clickOnShowAllComponents(String menu)
    {
        selectMenu(menu);
    }
}
