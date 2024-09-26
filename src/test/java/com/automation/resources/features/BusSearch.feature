Feature: Validate The Bus Search Functionality

  Scenario: Search for buses between two cities
    Given user opens application
    Then verify user is on the home page
    When user enter "Bus.travelFrom" as the source city
    And user enter "Bus.travelTo" as the destination city
    And user select the date of today
    And user click on the search button
    Then verify the list of buses are displayed