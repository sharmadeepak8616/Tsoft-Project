@mobile-regression @mobile-login @mobile
Feature: Mobile Login Feature

  @mobile-login-1
  Scenario: Verify sidebar validation
    When I click on skip button
    And I click on menu button
    Then I verify sidebar menu is displayed


  @mobile-login-2
  Scenario: Verify favourites validation
    When I click on skip button
    And I click on favourites button
    Then I verify "No Sessions Found" text displayed