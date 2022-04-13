

@regressionTest

Feature: user able to add the product to wishlist

  Scenario: user is able to add the product to wishlist

#    Given user open the url chrome browser

    Given   user navigate to login page
    And     user enter valid Email and password
    When    user click on login button
    Given   user has an empty wishlist
    And     user search with the name of the product
    When    user click the add the product to wishlist
    Then    The wishlist is displayed the item added
#    And   user quit the driver