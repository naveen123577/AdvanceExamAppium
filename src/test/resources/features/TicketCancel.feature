Feature: Validate Ticket Cancel Functionality

  Scenario Outline:Verify the user is unable to cancel ticket with invalid data

    Given user opens application
    Then verify user is on the home page
    Given user clicks on account button
    And click on cancel Booking option
    Then verify the user is on Cancel Booking page
    And user enters an invalid "<ticket number>" and "<mobile number>"
    And user clicks on the submit button
    Then verify an error message is displayed

    Examples:
      | ticket number     | mobile number     |
      | cancel.bookingID1 | cancel.mobileNum1 |
      | cancel.bookingID2 | cancel.mobileNum2 |
