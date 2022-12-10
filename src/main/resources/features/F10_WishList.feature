@Smoke
Feature: F10_WishList | Logged user could add different products to Wishlist

  Background: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button
    Then  user login to the system successfully

  Scenario: user could add different products to Wishlist
    Given user opens homepage
    When user selects HTC Mobile
    And user clicks on add to wishlist for mobile
    Then product is added successfully to Wishlist

    When user selects Portable Sound Speakers
    And user clicks on add to wishList for speakers
    Then product is added successfully to Wishlist