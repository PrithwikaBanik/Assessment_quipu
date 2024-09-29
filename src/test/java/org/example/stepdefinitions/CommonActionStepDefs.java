package org.example.stepdefinitions;

import org.example.pages.LoginPage;
import org.junit.Assert;

import java.time.Duration;

public class CommonActionStepDefs {

    LoginPage currentPage = new LoginPage();


    public void navigateToPage(String page, String url) {
        currentPage.navigateTo(url);
    }

    public void page_element_set_action(String page, String value, String elementName) {
        String element_xPath = null;
        switch (elementName) {
            case "Email":
                element_xPath = "//input[@id='email']";
                break;
            case "Password":
                element_xPath = "//input[@id='passwd']";
                break;
            case "Search":
                element_xPath = "//input[@id='search_query_top']";
                break;
            default:
        }

        currentPage.setByID(element_xPath, value);

    }

    public void page_element_click_action(String page, String element) {
        currentPage.click(element);
    }

    public void page_element_is_visible(String page, String elementName) {
        Assert.assertTrue("Element is not visible", currentPage.isVisible(elementName));
    }


    public void page_element_should_be(String page, String elementName, String expectedValue) {
        String elementValue = currentPage.getText(elementName);
        Assert.assertEquals("Element does not match expected value", elementValue,expectedValue);
    }


    public void onTheHomePageContainsValue(String elementName, String expectedValue) {
        String elementValue = currentPage.getText("//a[contains(text(), '" + elementName + "')]");
        Assert.assertEquals("Element does not match expected value", elementValue,expectedValue);
    }

    public void snooze(String page, int duration) {
        try {
            Thread.sleep(Duration.ofSeconds(duration));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
