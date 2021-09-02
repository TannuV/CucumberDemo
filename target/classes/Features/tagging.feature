Feature: Free CRM Tagging testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and password 
Given: This is a valid login test

@RegressionTest
Scenario: Login with correct username and incorrect password 
Given: This is a invalid login test

@SmokeTest
Scenario: create a contact
Given: This is a contact test cases

@SmokeTest
Scenario: create a deal
Given: This is a deal test cases

@SmokeTest
Scenario: create a task
Given: This is a task test cases

@RegressionTest
Scenario: create a case
Given: This is a case test cases


@RegressionTest
Scenario: verify left panel link
Given: clicking on left panel link

@SmokeTest
Scenario: search a contact
Given: This is a search contact test cases

@EndToEndTest
Scenario: search a case
Given: This is a search case test cases

@RegressionTest
Scenario: search a task
Given: This is a search call test cases

@EndToEndTest @SmokeTest
Scenario: search an email 
Given: This is a search email test cases

@RegressionTest
Scenario: search a docs
Given: This is a search docs test cases

@EndToEndTest @SmokeTest
Scenario: search a form
Given: This is a search form test cases

@SmokeTest
Scenario: validate a report
Given: This is a report test cases

@EndToEndTest
Scenario: application logout
Given: This is a logout test cases