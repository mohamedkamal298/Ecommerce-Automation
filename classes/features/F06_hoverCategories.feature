@Smoke
Feature: F06_Categories | Logged user could select different Categories

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully


  Scenario: user could select different categories

    Given user opens homepage
    When user selects Books category
    Then user go to Books category successfully

    When user selects Computers category then hover to Others subcategory
    Then user go to Computers category successfully
