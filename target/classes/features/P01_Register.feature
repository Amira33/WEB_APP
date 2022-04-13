
@regressionTest
  Feature: user should be able to register with valid data

    Scenario: user could sign up with valid data

#      Given user open the url chrome browser
      Given  user navigate to home page
      And   user click to register
      When  user enter a valid section of first name,last name and Email
      And   user enter a valid section of password and confirm password
      And   user click on register button
      Then  user should register successfully and success msg is appeared

      And user logout
#      And   user quit the driver