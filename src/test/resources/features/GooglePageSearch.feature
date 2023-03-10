@PhaseOne
Feature: Google Search Function

@RegressionTest
Scenario: Java Search
Given User is on Google Home Page
When User search Java Tutorial
Then Should display Java Result Page

@SmokeTest
Scenario: Selenium Search
Given User is on Google Home Page
When User search Selenium Tutorial
Then Should display Selenium Result Page