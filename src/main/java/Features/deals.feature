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

Feature: Free CRM Deal data creation
 

  
Scenario:  Free CRM create a new deal scenario  

Given User is on the login page
    When Title of login page is free crm
    Then User enters the login details username and password
    |TannuV | Tashubh@123 |
    Then User clicks on the login button
    Then User redirects to home page
    Then User move to new deal page 
    Then User enters deal details title and amount and  probability and commission
    | test deal | 1000 | 50 | 10 |   
    Then Close the browser  
    

 
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
