package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    @FindBy(xpath = "//android.widget.TextView[@text='Skip']")
    WebElement skipBtn;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.app.abhibus:id/closeImageView']")
    WebElement loginCloseBtn;


    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/titleTextView']")
    WebElement homePageHeading;

    @FindBy(xpath = "//android.widget.HorizontalScrollView[@resource-id='com.app.abhibus:id/main_tab_layout']/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout")
    WebElement accountBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/sourceTextView']")
    WebElement sourceSelect;

    @FindBy(xpath = "//android.widget.AutoCompleteTextView[@resource-id='android:id/search_src_text']")
    WebElement cityInput;

    @FindBy(xpath = "//android.view.ViewGroup[@resource-id='com.app.abhibus:id/constraintLayout']")
    WebElement firstCitySelect;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/destinationTextView']")
    WebElement destinationSelect;

    @FindBy(id = "com.app.abhibus:id/lrt_onward_monthyear")
    WebElement dateButton;

    @FindBy(id = "com.app.abhibus:id/todayLayout")
    WebElement todayDate;

    @FindBy(xpath = "//android.widget.TextView[@text='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.app.abhibus:id/textStyles']")
    WebElement styleCloseBtn;

    public void openApplication() {
        skipBtn.click();
        loginCloseBtn.click();
    }

    public boolean isHomePageDisplayed() {
        waitForElementToBeVisible(homePageHeading);
        return homePageHeading.isDisplayed();
    }

    public void clickOnAccountButton() {
        accountBtn.click();
    }

    public void enterSourceCity(String sourceCity) {
        sourceSelect.click();
        cityInput.sendKeys(ConfigReader.getConfigValue(sourceCity));
        wait.until(ExpectedConditions.elementToBeClickable(firstCitySelect));
        firstCitySelect.click();
    }

    public void enterDestinationCity(String destinationCity) {
        destinationSelect.click();
        cityInput.sendKeys(ConfigReader.getConfigValue(destinationCity));
        wait.until(ExpectedConditions.elementToBeClickable(firstCitySelect));
        firstCitySelect.click();
    }

    public void selectDate() {
        dateButton.click();
        todayDate.click();
    }

    public void clickOnSearchButton() {
        searchBtn.click();
        waitForElementToBeVisible(styleCloseBtn);
        styleCloseBtn.click();
    }
}
