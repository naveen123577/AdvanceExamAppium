package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user opens application")
    public void user_opens_application() {
        homePage.openApplication();
    }

    @Then("verify user is on the home page")
    public void verify_user_is_on_the_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @Given("user clicks on account button")
    public void user_clicks_on_account_button() {
        homePage.clickOnAccountButton();
    }

    @When("user enter {string} as the source city")
    public void userEnterAsTheSourceCity(String sourceCity) {
        homePage.enterSourceCity(sourceCity);
    }

    @And("user enter {string} as the destination city")
    public void userEnterAsTheDestinationCity(String destinationCity) {
        homePage.enterDestinationCity(destinationCity);
    }

    @And("user select the date of today")
    public void userSelectTheDateOfToday() {
        homePage.selectDate();
    }

    @And("user click on the search button")
    public void userClickOnTheSearchButton() {
        homePage.clickOnSearchButton();
    }


}
