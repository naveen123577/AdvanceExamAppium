package com.automation.steps;

import com.automation.pages.CancelBookingPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CancelBookingSteps {
    CancelBookingPage cancelBookingPage = new CancelBookingPage();

    @Given("click on cancel Booking option")
    public void click_on_cancel_booking_option() {
        cancelBookingPage.clickOnCancelTicketOption();
    }

    @Then("verify the user is on Cancel Booking page")
    public void verify_the_user_is_on_cancel_booking_page() {
        Assert.assertTrue(cancelBookingPage.isCancelBookingPageDisplayed());
    }

    @Then("user enters an invalid {string} and {string}")
    public void user_enters_an_invalid_and(String ticketNum, String mobileNum) {
        cancelBookingPage.enterInvalidTicketDetails(ticketNum,mobileNum);
    }

    @And("user clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        cancelBookingPage.clickOnSubmitBtn();
    }

    @Then("verify an error message is displayed")
    public void verify_an_error_message_is_displayed() {
        Assert.assertFalse(cancelBookingPage.isErrorMessageDisplayed());
    }

}
