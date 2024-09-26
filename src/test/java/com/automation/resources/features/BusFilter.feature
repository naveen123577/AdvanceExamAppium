Feature: Validate The Bus Filter Functionality

  Background:
    Given user opens application
    Then verify user is on the home page
    When user enter "Bus.travelFrom" as the source city
    And user enter "Bus.travelTo" as the destination city
    And user select the date of today
    And user click on the search button
    Then verify the list of buses are displayed

  Scenario: Filter buses by sleeper bus type
    When user selects the sleeper option
    Then verify the sleeper buses are only present

  Scenario: Filter buses by Non AC bus type
    When user selects the Non AC option
    Then verify the Non AC buses are only present