@Smoke
Feature: F07_ColorFilter | Logged user could filter with color

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully

  Scenario: user could filter with color

    When user select Apparel category then hover to Shoes subcategory
    And user select Shoes subcategory

    Then user filter by Grey color

