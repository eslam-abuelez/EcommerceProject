@smoke
Feature: F01_Register | users could register with new accounts
    Scenario: Scenario: guest user could register with valid data successfully
    Given user go to register page
    Then user select gender type
    Then user enter first name automation
    Then user enter last name tester
    When  user enter day of birth
    When  user enter Month of birth
    When  user enter Year of birth
    Then  user enter email "Islam@example.com" field
    Then  user fills Password field P@ssw0rd
    Then user confirm "P@ssw0rd"
    Then  user clicks on register button
    Then success message is displayed

