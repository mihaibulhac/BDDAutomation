Feature:
  Scenario:
    Given I open hotel application and login with "mihai1"
    Then I sleep 3000
    Then I close the application
    And I open hotel application and login with "mihai2"
    Then I close the application


