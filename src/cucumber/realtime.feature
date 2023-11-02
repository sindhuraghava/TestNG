Feature: Search functionality
Scenario: open browseer
Given open browser
  
  Scenario Outline: Validate valid search functionality 
  
    Given user is in home page
    When 	user enters "<product>" in search field
    And 	user click on search button
    Then 	product "<product>" shud be displayed
    
    Examples:
    | product |
    | iPhone |
    | MacBook Air |

 Scenario: close browseer
Given close browser
   