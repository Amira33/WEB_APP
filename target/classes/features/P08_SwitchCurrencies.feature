

@regressionTest

Feature: user able to switch currencies

# first test case using Us currencies
  Scenario: user is able to switch currencies using US

    Given   user navigate to login page
    And     user enter valid Email and password
    And     user click on login button
    When    user click the switch currencies
    Then    Different currencies appears choosen US


# second test case using Us currencies

  Scenario: user is able to switch currencies using Euro

    When    user click the switch currencies
    And     user choosed Euro