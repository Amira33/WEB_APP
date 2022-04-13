
@regressionTest

Feature: user able to add the product to compare list

  Scenario: user is able to add the product to compare list

#    Given user open the url chrome browser

    Given   user navigate to login page
    And     user enter valid Email and password
    When    user click on login button
    And     user search with the name of the product
    When    user click the add the product to compare list
    Then    The compare list is displayed the item added