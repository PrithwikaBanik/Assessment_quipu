package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    WebElement webElement;

    public Boolean isVisible(String element) {
        return findElement(By.xpath(element)).isDisplayed();
    }

    public String getText(String element) {
        return findElement(By.xpath(element)).getText();
    }


    public void setByID(String element, String stringToSet) {
        driver.findElement(By.xpath(element)).sendKeys(stringToSet);
    }

    public void click(String element) {
        findElement(By.xpath(element)).click();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement findElement(By by) {
        try {
            webElement = driver.findElement(by);
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Message from error handling: " + noSuchElementException.getLocalizedMessage());
        }
        return webElement;
    }
}