
@regressionTest
Feature: user could reset password


Scenario: user forget password

#    Given user open browser
Given user navigate to login page
And   user click on Forgot password button
When  Password recovery page opened
And   ask user to enter yor email address
And   click on recover button
Then  msg recovery sent