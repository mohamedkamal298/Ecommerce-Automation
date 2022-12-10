@Smoke
Feature: F14_FollowUs - user could access followUs links

  Scenario: user could access youtube followUs link
    When user opens homepage
    And user clicks youtube icon
    Then youtube is accessed successfully

  Scenario: user could access facebook followUs link
    When user opens homepage
    And user clicks facebook icon
    Then facebook is accessed successfully

  Scenario: user could access twitter followUs link
    When user opens homepage
    And user clicks twitter icon
    Then twitter is accessed successfully

  Scenario: user could access RSS followUs link
    When user opens homepage
    And user clicks RSS icon
    Then RSS is accessed successfully