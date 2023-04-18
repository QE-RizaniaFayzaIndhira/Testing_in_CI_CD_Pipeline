Feature: As a user i want to register so that i can post new user data

  Scenario: As a user i want to register so that i can post new user data
    Given user set valid endpoint
    When user send GET HTTP request
    Then user send post new user data
    And user received valid HTTP response code 200