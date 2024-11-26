Feature: Validate Search Functionality on ESPNcricinfo

  Scenario: Verify search functionality with "India vs Pakistan"
    Given I am on the ESPNcricinfo homepage
    When I enter "India vs Pakistan" in the search bar
    And I press Enter
    Then I should see relevant search results
    And the results should include match details or articles related to "India vs Pakistan"
