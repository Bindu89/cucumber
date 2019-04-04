

Feature: verify the login feature
	  I want to use this feature file to verify all the login features on required url
	 

	
	  Scenario:  log in to sfdc
	    Given launch app and pass url for sfdc
	    When login page is displayed
	    And enter valid usename and password in required fields
	    And check remember me 
	    Then click on login button
	    And sfdc page is displayed with username
	    Then close the page
	   
