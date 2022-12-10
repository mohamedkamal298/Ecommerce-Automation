@Smoke
Feature: F08_SelectTags | Logged user could filter with color

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully

  Scenario:user could filter with color

    When user selects Books category
    And user clicks apparel tag
    Then user go to apparel successfully

    When user clicks compact tag
    Then user go to compact successfully