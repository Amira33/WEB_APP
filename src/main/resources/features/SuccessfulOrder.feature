

@regressionTest
Feature: user should be able to make a successful order

  Scenario: user could doing a successful order


# Given user navigate to home page
# And   user click to register
# And   user enter a valid section of first name,last name and Email
# And   user enter a valid section of password and confirm password
# And   user click on register button
# And   user should register successfully and success msg is appeared
# And   user logout

 And   user navigate to login page
 And   user enter valid Email and password
 And   user click on login button
 And   user could login successfully and go to home page

 And   user search with the name of the product
 And   user is able to find what lookig for

 And   user click the add to cart button to add the product to shopping cart
 And   The shopping cart is displayed the item added

 When  user agree with the terms of service
 Then  user could doing checkout