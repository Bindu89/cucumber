#Author: your.email@your.domain.com
#Keywords Summary :

@tag
 Feature:SFDC TESTCASES
  I want to use this template to test all the sfdc test cases

  @tag1
  Scenario: Navigate to SFDC
  
    Given Launch SFDC application
    
    And Enter User Name
    
    When Clear Password field
    
    And Click on Login button
    
    Then validate the enterpwd arror
    
  @tag2
  Scenario Outline: Login to SFDC
  
    Given Launch SFDC application
    
    When Login to SFDC
    
    Then verify the sfdc home page
    
     @tag3
  Scenario: Test the remember username check box 
  
  
    Given Launch SFDC application
    
    And Login to SFDC with remember username check box checked
    
    
    When Log out of SFDC
    
    
    And Check for Username field
    
    
    Then validate the enterpwd error
    
    
       @tag4a
  Scenario: Test forgot password
  
  
  
    Given Launch SFDC application
    
    And Click on Forgot password
    
    
    
    When Test Forgot password
    
    
    
    And ValidateLoginErrorMessage
    
    
    
    
       @tag4b
  Scenario: Test the remember username check box 
  
  
    Given Launch SFDC application
    
    And Enter Wrong USerName
        
    
    When Enter wrong PWd
    
    
    
    And Click on Login button
    
    Then validate the error login attemp has failed
    
   