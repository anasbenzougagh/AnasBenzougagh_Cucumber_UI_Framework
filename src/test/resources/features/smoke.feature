Feature: As a user, I want to use Google search
  @smoke
  Scenario: User input must match title
    Given I entered "Smoke Test" in the search input
    Then entered data must match the title