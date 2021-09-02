#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: tag hook test

@First
   Scenario: first tag hook
    Given this is a first step
    When this is a second step
    Then this is a third step
 @Second   
    Scenario: second tag hook
    Given this is a first step
    When this is a second step
    Then this is a third step
 @Third   
    Scenario: third tag hook
    Given this is a first step
    When this is a second step
    Then this is a third step
    

 