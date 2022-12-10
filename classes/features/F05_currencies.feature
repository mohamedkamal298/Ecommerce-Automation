@Smoke
Feature: F05_Currencies | Logged User could switch between currencies US-Euro

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully

  Scenario: user could switch between currencies to Euro

    When user switches currency to Euro
    Then Products currency is switched to Euro successfully

  Scenario: user could switch between currencies to US Dollar

    When user switches currency to Dollar
    Then Products currency is switched to Dollar successfully

