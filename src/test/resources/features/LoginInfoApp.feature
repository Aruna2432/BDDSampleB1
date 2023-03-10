@PhaseTwo
Feature: Login Function

#Scenario: Valid Login
#Given User is on Login Page
#When User enters credentials
#Then Should display Home Page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display Home Page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display Home Page

#Examples:
# | usernmae | password |
# | testUser1 | welcome123 |
# | testUser2 | welcome123 |
# | tomsmith | SuperSecretPassword! |
 
#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters credentials
# | tomsmith | SuperSecretPassword! |
#Then Should display Home Page

@RegressionTest @SmokeTest
Scenario Outline: Valid Login
Given User is on Login Page
When User enters credentials
 | username | password |
 | tomsmith | SuperSecretPassword! |
Then Should display Home Page
