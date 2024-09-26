package com.automation.pages;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BusSearchResultPage extends BasePage {

    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.app.abhibus:id/innerLinearLayout']")
    List<WebElement> busSearchList;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/abQuickFilterText' and @text='Sleeper']")
    WebElement sleeperSelect;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/abQuickFilterText' and @text='Non AC']")
    WebElement nonACSelect;

    @FindBy(xpath = "//android.widget.TextView[@text='End of results']")
    WebElement endOfResult;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/typeTextView']")
    List<WebElement> busType;

    public boolean isSearchBusesAreDisplayed() {
        return !busSearchList.isEmpty();
    }

    public boolean isSleeperBusesAreOnlyPresent() {
        boolean sleeperPresent = false;
        for (WebElement bus: busType){
            if (bus.getText().toLowerCase().contains("sleeper")){
                sleeperPresent = true;
            }
            else {
                return false;
            }
        }
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        while (!isPresent(endOfResult)) {
            scrollOrSwipe(width / 2, height / 2, width / 2, 0);
            for (WebElement bus: busType){
                if (bus.getText().toLowerCase().contains("sleeper")){
                    sleeperPresent = true;
                }
                else {
                    return false;
                }
            }
        }
        return sleeperPresent;
    }

    public void clickOnSleeperOption() {
        waitForElementToBeClickable(sleeperSelect);
        sleeperSelect.click();
    }

    public void clickOnNonACOption() {
        waitForElementToBeClickable(nonACSelect);
        nonACSelect.click();
    }

    public boolean isNonACBusesAreDisplayed() {
        boolean nonACPresent = false;
        for (WebElement bus : busType) {
            if (bus.getText().toUpperCase().contains("NON-AC")) {
                nonACPresent = true;
            } else {
                return false;
            }
        }
        Dimension dimension = driver.manage().window().getSize();
        int width = dimension.getWidth();
        int height = dimension.getHeight();

        while (!isPresent(endOfResult)) {
            scrollOrSwipe(width / 2, height / 2, width / 2, 0);
            for (WebElement bus : busType) {
                if (bus.getText().toUpperCase().contains("NON-AC")) {
                    nonACPresent = true;
                } else {
                    return false;
                }
            }
        }
        return nonACPresent;
    }

}
