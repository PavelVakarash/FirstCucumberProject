package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage{

    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(.,'Sign Out')]")
    WebElement signOutButton;

    public ProfilePage isSignOutButtonDisplayed() {
        isElementDisplayed(signOutButton);
        return this;
    }

    @FindBy(css = "a:nth-child(5)")
    WebElement addButton;
    public AddContactPage clickOnAddButton() {
        click(addButton);
        return new AddContactPage(driver);
    }

    @FindBy(css = "h2")
    WebElement newContact;

    public ProfilePage isNewContactCreated() {
        isElementDisplayed(newContact);
        return this;
    }

    @FindBy(css = ".contact-item_card__2SOIM")
    WebElement contactField;
    public ProfilePage clickOnContactField() {
        click(contactField);
        return this;
    }

    @FindBy(xpath = "//button[contains(.,'Remove')]")
    WebElement removeButton;
    public ProfilePage clickOnRemoveButton() {
        click(removeButton);

        return this;
    }
}
