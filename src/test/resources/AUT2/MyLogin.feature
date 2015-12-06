@Sprint15 @TRAD-1234 @TRAD-63445
Feature: test login page
  @Sprint_15
  Scenario: login with two users
    Given I open hotel application and login with "mihai1"
    Then I sleep 1000
    Then I close the application
    And I open hotel application and login with "mihai2"
    Then I close the application

    @tagBau
  Scenario: login with one user
    Given I open hotel application and login with "mihai1"
    Then I close the application


