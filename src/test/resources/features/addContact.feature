Feature: AddContact

  @addContact
  Scenario: Add new contact
    Given User launches Chrome Browser
    When User opens PhoneBook Home Page
    And User clicks on LOGIN link
    And User enters valid data
    And User click on Login button
    And User verifies SignOut button is displayed
    And User click on ADD button
    And User fill Add Contact form
    And User click on SAFE button
    Then User verifies new contact is created
    And User click on Contact field
    And User click on Remove button
#    And User quites browser
