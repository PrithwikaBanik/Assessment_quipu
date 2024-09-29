package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SearchPageSteps {

    private final CommonActionStepDefs commonActionStepDefs = new CommonActionStepDefs();

    @Then("^on the Search page (.*) is set for the search field value")
    public void search_page_element_set_action(String value) {
        commonActionStepDefs.page_element_set_action("Dashboard", value, "Search");
    }

    @And("^on the Search page SearchButton is clicked")
    public void search_page_element_click_action() {
        commonActionStepDefs.page_element_click_action("page","//button[@name='submit_search']");
    }

    @Then("^on the Search page SearchHeader title should be (.*)")
    public void search_page_element_should_be(String expectedValue) {
        commonActionStepDefs.page_element_should_be("page","//h1[@class='page-heading  product-listing']//span[@class='lighter']",expectedValue);
    }
}
