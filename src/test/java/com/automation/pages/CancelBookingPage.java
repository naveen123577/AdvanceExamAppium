package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBookingPage extends BasePage{

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.app.abhibus:id/cancelLayout']")
    WebElement cancelBookingOption;

    @FindBy(xpath = "//android.widget.TextView[@text='Cancel Booking']")
    WebElement cancelBookingPageHeading;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.app.abhibus:id/abhibusTicketEditText']")
    WebElement bookingIDInput;

    @FindBy(xpath = "//android.widget.EditText[@resource-id='com.app.abhibus:id/cancelMobileEditText']")
    WebElement mobileNumInput;

    @FindBy(id = "com.app.abhibus:id/searchButton")
    WebElement submitBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
    WebElement errorMsg;

    public void clickOnCancelTicketOption() {
        cancelBookingOption.click();
    }

    public boolean isCancelBookingPageDisplayed() {
        return cancelBookingPageHeading.isDisplayed();
    }

    public void enterInvalidTicketDetails(String ticketNum, String mobileNum) {
        bookingIDInput.clear();
        bookingIDInput.sendKeys(ConfigReader.getConfigValue(ticketNum));
        mobileNumInput.clear();
        mobileNumInput.sendKeys(ConfigReader.getConfigValue(mobileNum));
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }

    public boolean isErrorMessageDisplayed() {
        String errorMessage = errorMsg.getText();
        String expectedMessage = "Please enter valid mobile no. or ticket no.";
        return errorMessage.equals(expectedMessage);
    }
}
