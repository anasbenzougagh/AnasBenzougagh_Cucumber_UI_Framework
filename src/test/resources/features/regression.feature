Feature: As a user, I want to use Google search
  @regression
  Scenario: User input must match title
    Given I entered "Regression Test" in the search input
    Then assert page title contains entered words