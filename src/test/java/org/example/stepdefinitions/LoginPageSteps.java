package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.LoginPage;
import org.junit.Assert;

import java.time.Duration;

public class LoginPageSteps {
    private final CommonActionStepDefs commonActionStepDefs = new CommonActionStepDefs();

    @Given("^Navigate to (.*) page with (.*)")
    public void navigateToPage(String page, String url) {
        commonActionStepDefs.navigateToPage(page, url);
    }


    @Then("^on the Login page (.*) is set for the (.*) value")
    public void page_element_set_action(String value, String elementName) {
        commonActionStepDefs.page_element_set_action("Login", value, elementName);
    }

    @And("^on the (.*) page (.*) button is clicked")
    public void page_element_click_action(String page, String button) {
        commonActionStepDefs.page_element_click_action(page,"//button[@id='SubmitLogin']");
    }

    @Then("^on the (.*) page (.*) message is displayed")
    public void page_element_is_visible(String page, String elementName) {
        commonActionStepDefs.page_element_is_visible(page,"//p[@class='info-account']");
    }


    @Then("^on the (.*) page (.*) message should be (.*)")
    public void page_element_should_be(String page, String elementName, String expectedValue) {
        commonActionStepDefs.page_element_should_be(page,"//p[@class='info-account']",expectedValue);
    }


    @Then("^on the HomePage (.*) button contains (.*)")
    public void onTheHomePageContainsValue(String elementName, String expectedValue) {
        commonActionStepDefs.onTheHomePageContainsValue(elementName,expectedValue);
    }

    @Then("^on the (.*) snooze for (.*) seconds")
    public void snooze(String page, int duration) {
       commonActionStepDefs.snooze(page,duration);
    }

}