package com.ait.stepDefinitions;

import com.ait.pages.AddContactPage;
import com.ait.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ait.pages.BasePage.driver;

public class AddContactPageSteps {

    @And("User click on ADD button")
    public void click_AddButton() {
        new ProfilePage(driver).clickOnAddButton();
    }

    @And("User fill Add Contact form")
    public void fill_AddContact_form() {
        new AddContactPage(driver).fillAddContactForm(
                "Karl",
                "Adam",
                "1234567890",
                "adam@gm.co",
                "Barcelona",
                "tower");
    }

    @And("User click on SAFE button")
    public void click_SafeButton() {
        new AddContactPage(driver).clickOnSafeButton();
    }

    @Then("User verifies new contact is created")
    public void verify_newContact_is_created() {
        new ProfilePage(driver).isNewContactCreated();
    }

    @And("User click on Contact field")
    public void click_Contact_field() {
        new ProfilePage(driver).clickOnContactField();
    }

    @And("User click on Remove button")
    public void click_Remove_button() {
        new ProfilePage(driver).clickOnRemoveButton();
    }
}
