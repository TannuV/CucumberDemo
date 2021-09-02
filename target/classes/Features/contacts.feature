
Feature: Free CRM create contacts feature 

Scenario Outline: Free CRM create a new contact  scenario  

Given User is already on the login page
    When Title of the login page is free crm
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then User move to new contact page 
    Then  User enters contact details "<firstname>" and "<lastname>" and "<position>"
    Then Close the browser  
    
 Examples:
 
    |username | password    |firstname | lastname | position  |
    | TannuV  | Tashubh@123 | tom      | vats     | manager  |
    
    
