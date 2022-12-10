@Smoke
Feature: F13_HomeSliders - user could access products through sliders

  Scenario: user could access Lumia product through first slider
    When user opens homepage
    And user click on Lumia slider
    Then user open Lumia product successfully


  Scenario: user could access iPhone product through second slider
    When user opens homepage
    And user click on iPhone slider
    Then user open iPhone product successfully