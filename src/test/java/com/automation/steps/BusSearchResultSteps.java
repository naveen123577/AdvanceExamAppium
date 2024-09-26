package com.automation.steps;

import com.automation.pages.BusSearchResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BusSearchResultSteps {

    BusSearchResultPage busSearchResultPage = new BusSearchResultPage();

    @Then("verify the list of buses are displayed")
    public void verifyTheListOfBusesAreDisplayed() {
        Assert.assertTrue(busSearchResultPage.isSearchBusesAreDisplayed());
    }

    @When("user selects the sleeper option")
    public void userSelectsTheSleeperOption() {
        busSearchResultPage.clickOnSleeperOption();
    }

    @Then("verify the sleeper buses are only present")
    public void verifyTheSleeperBusesAreOnlyPresent() {
        Assert.assertTrue(busSearchResultPage.isSleeperBusesAreOnlyPresent());
    }

    @When("user selects the Non AC option")
    public void userSelectsTheNonACOption() {
        busSearchResultPage.clickOnNonACOption();
    }

    @Then("verify the Non AC buses are only present")
    public void verifyTheNonACBusesAreOnlyPresent() {
        Assert.assertTrue(busSearchResultPage.isNonACBusesAreDisplayed());
    }
}
