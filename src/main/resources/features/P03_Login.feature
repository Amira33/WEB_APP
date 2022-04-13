
@regressionTest
Feature: user should be able to login to the system


# Testcase 1 (first test scenario)

  Scenario: user is able to login with valid username and password

#    Given user open browser
     Given user navigate to login page
     And   user enter valid Email and password
     When  user click on login button
     Then  user could login successfully and go to home page



#  Testcase 2 (second test scenario)

  Scenario: user login with invalid username and password

#    Given user open browser
     Given user navigate to login page
     And   user enter invalid Email and password
     When  user click on login button
     Then  user couldn't login successfully and error msg is displayed




