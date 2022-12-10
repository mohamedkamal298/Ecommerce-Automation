@Smoke
Feature: F12_SuccessfulOrder | Create successful Order
  Background:user could add different products to shopping cart
    Given user opens homepage
    When user selects Apple MacBook
    And user clicks on add to cart button for Apple MacBook
    Then product is added successfully

    When user selects Asus Laptop
    And user clicks on add to cart button for Asus Laptop
    Then product is added successfully

    Scenario:Scenario: user could create successful order
      Given user clicks on shopping cart link
      And user accepts the agreement
      When user clicks on checkout button
      And user enters correct email and password
      And user press on login button
      Then  user login to the system successfully
      And user accepts the agreement
      When user clicks on checkout button
      And user fills all fields
      And user click on continue button
      And user select delivery method and click continue button
      And user select payment method and click continue button
      And user click continue button
      And user click confirm button

      Then order is processed successfully