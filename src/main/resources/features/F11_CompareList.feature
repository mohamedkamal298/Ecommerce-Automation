@Smoke
Feature: F11_CompareList | Logged user could add different products to compare list

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully

  Scenario: user could add different products to Comparelist
    Given user opens homepage
    And user selects Books category
    When user selects Pride and Prejudice Book
    And user clicks on add to CompareList
    Then product is added successfully to CompareList

    And user selects Books category
    When user selects First Prize Pies book
    And user clicks on add to CompareList
    Then product is added successfully to CompareList