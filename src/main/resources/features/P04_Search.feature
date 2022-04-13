
@regressionTest
Feature: user able to search for any product in advanced search

  Scenario: user could search for product using the name

#    Given user open the url chrome browser
#   Given  user navigate to home page

    Given user navigate to login page
    And   user enter valid Email and password
    When  user click on login button
    And   user click to search
    When  user search with the name of the product
    Then  user is able to find what lookig for
#    And   user quit the driver




  Scenario: user could search for product using the Categories list search

#    Given user open the url chrome browser
     Given user navigate to login page
     And   user enter valid Email and password
     When  user click on login button
     When  user search using the categories for example Jewelry

    Then  user is able to find what lookig for from categories
#    And   user quit the driver