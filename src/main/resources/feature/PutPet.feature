Feature: put updated the featfeature


  Scenario: update pet to pet store with all valid data

     Given I have valid URL with all valid data

    When I send the put request with valid header

    Then I validate the successful response

Scenario: update pet to pet store with invalid data

  Given I have invalid URL with invalid data

  When I send the put request with invalid header

  Then I validate the sucsecfull response