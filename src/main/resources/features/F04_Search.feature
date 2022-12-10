@Smoke
  Feature: F04_Search | Logged User could search for any product

    Background: user could login with valid email and password
      Given user go to login page

      When user enters correct email and password
      And user press on login button

      Then  user login to the system successfully

      Scenario: User could search for any product
        Given user opens homepage

        When user search for apple products
        Then user finds product results successfully

        When user search by SKU for a product
        Then user finds product result by SKU successfully

