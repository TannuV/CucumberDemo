Feature: Free CRM Deal data creation
 

  
Scenario:  Free CRM create a new deal scenario  

Given User is on the login page
    When Title of login page is free crm
    Then User enters the login details username and password
    |username| password    |
    |TannuV  | Tashubh@123 |
    Then User clicks on the login button
    Then User redirects to home page
    Then User move to new deal page 
    Then User enters deal details title and amount and  probability and commission
    |title        |amount| probability | commission |
    | test deal 1 | 1000 | 50          | 10         |  
    | test deal 2 | 2000 | 60          | 20 				| 
    | test deal 3 | 3000 | 60          | 30 				| 
    | test deal 4 | 4000 | 50          | 10				  |  
    Then Close browser  