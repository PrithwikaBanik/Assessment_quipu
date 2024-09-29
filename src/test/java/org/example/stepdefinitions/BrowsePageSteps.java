package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BrowsePageSteps {

    private final CommonActionStepDefs commonActionStepDefs = new CommonActionStepDefs();

    @And("^on the Browse page AddToCartButton is clicked")
    public void browse_page_element_click_action() {
        commonActionStepDefs.page_element_click_action("page","//p[@id='add_to_cart']//button[@name='Submit']");
    }


    @Then("^on the Browse page SuccessfullMessage is displayed")
    public void browse_page_element_is_visible() {
        commonActionStepDefs.page_element_is_visible("page","//h2[text()='Product successfully added to your shopping cart']");
    }

}
