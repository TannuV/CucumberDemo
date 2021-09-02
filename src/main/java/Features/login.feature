
Feature: Free CRM Login feature

#without examples keywords
#Scenario: Free CRM Login Test scenario
    #Given User is already on the login page
    #When Title of the login page is free crm
    #Then User enters "tannuV" and "Tashubh@123"
    #Then User clicks on login button
    #Then User is on home page
    #Then Close the browser
    
#with examples keywords
 Scenario Outline: Free CRM Login Test scenario
    Given User is already on the login page
    When Title of the login page is free crm
    Then User enters "<username>" and "<password>"
    Then User clicks on login button
    Then User is on home page
    Then Close the browser
    
 Examples: 
    | username | password |
    | TannuV   | Tashubh@123 |
    
 
 
 #with example - scenario outline
 