@darkSky @web
Feature: Dark Sky Feature

  Background:
    Given I am on Dark Sky webpage

  @temp-by-zipcode
  Scenario: Verify present temperature is between lowest and highest
    When I enter zip code as 10001
    And I click on search button
    Then I verify present temperature is between lowest and highest