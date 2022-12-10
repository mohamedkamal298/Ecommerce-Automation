@Smoke
Feature: F09_ShoppingCart | Logged user could add different products to Shopping cart

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully

  Scenario: user could add different products to shopping cart
    Given user opens homepage
    When user selects Apple MacBook
    And user clicks on add to cart button for Apple MacBook
    Then product is added successfully

    When user selects Asus Laptop
    And user clicks on add to cart button for Asus Laptop
    Then product is added successfully

