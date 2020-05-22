@FunctionalTest
Feature: Free application testing


@RegressionTest
Scenario: Login with incorrect username and correct password
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "naveen12" and "test@123"
Then user clicks on login button
Then user is on home page

@SmokeTest
Scenario: Login with correct username and incorrect password
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "naveenk" and "test@453"
Then user clicks on login button
Then user is on home page


@SmokeTest @RegressionTest
Scenario: Login with correct inusername and incorrect password
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "naveen34" and "test12@123"
Then user clicks on login button
Then user is on home page


Scenario: browser closed
Given This is a close broswer test


