@Smoke
Feature: F03_ResetPassword | User could reset his/her password successfully

  Scenario: user could login with valid email and password
    Given user go to login page

    When user enters correct email and password
    And user press on login button

    Then  user login to the system successfully


  Scenario: user could reset password successfully

    Given user go to login page
    When user clicks on forget password link
    And user enters his Email
    And user clicks on Recover button

    Then Reset message is displayed