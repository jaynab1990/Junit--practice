Feature: Get pet by status using Get API request

  Scenario Outline:  Get pet successfully using valid status<value>

    When I send get request to get all pet which has status<value>
    Then I validate the sucsecfull response get by status

    Examples:



    |value|

    |available|

    |pending  |

    |sold     |


    @getPetByStatus

    Scenario Outline: Get pet successfully using valid status

      When I send get request to get pet which has invalid status

      Then I validate the sucsecfull response get by status



      Examples:

      |value|

      |invalid|
