package com.cuke.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class WebUserSteps extends BaseUserSteps {

    @Given("^I am a web user$")
    public void iAmAWebUser() throws Throwable {
        assertTrue(user.exists());
    }

    @Given("^I go to Google$")
    public void iGoToGoogle() throws Throwable {
        user.atSearchPage().open();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String searchString) throws Throwable {
        user.atSearchPage().searchFor(searchString);
    }

    @Then("^I should find \"([^\"]*)\"$")
    public void iShouldFind(String url) throws Throwable {
        assertTrue(user.atResultsPage().resultExists(url));
    }
}
