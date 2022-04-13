

@regressionTest

Feature: user able to add the product to shopping cart

  Scenario: user is able to add the product to shopping cart

#    Given user open the url chrome browser

      Given   user navigate to login page
      And     user enter valid Email and password
      When    user click on login button
      Given   user has an empty shopping cart
      And     user search with the name of the product
      When    user click the add to cart button to add the product to shopping cart
      Then    The shopping cart is displayed the item added
#    And   user quit the driver
