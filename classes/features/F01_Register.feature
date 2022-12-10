@Smoke
Feature:  F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully

    Given user go to register page

    When user select gender type
    And user enter first name "Mohamed" and last name "Kamal"
    And user enter date of birth
    And user enter email
    And user enters company
    And user fills Password fields
    And user clicks on register button

    Then success message is displayed




