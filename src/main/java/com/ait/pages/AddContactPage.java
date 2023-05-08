package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddContactPage extends BasePage{

    public AddContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input:nth-child(1)")
    WebElement nameField;
    @FindBy(css = "input:nth-child(2)")
    WebElement lastNameField;
    @FindBy(css = "input:nth-child(3)")
    WebElement phoneField;
    @FindBy(css = "input:nth-child(4)")
    WebElement emailField;
    @FindBy(css = "input:nth-child(5)")
    WebElement addressField;
    @FindBy(css = "input:nth-child(6)")
    WebElement descField;

    public AddContactPage fillAddContactForm
            (String name,
             String lastName,
             String phone,
             String email,
             String address,
             String desc) {
        type(nameField,name);
        type(lastNameField,lastName);
        type(phoneField,phone);
        type(emailField,email);
        type(addressField,address);
        type(descField,desc);
        return this;
    }

    @FindBy(css = ".add_form__2rsm2 button")
    WebElement safeButton;

    public ProfilePage clickOnSafeButton() {
        click(safeButton);
        return new ProfilePage(driver);
    }
}
