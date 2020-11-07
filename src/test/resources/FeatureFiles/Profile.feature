Feature: Profile
	I want to see if the users profile page functions correctly
	
	#Scenario: I want to change my birthday
		#Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		#When I fill in email with "testuser1@livinghouse.com"
	    #And I fill in password with "password"
	    #And I press Sign in
	    #And I am redirected to my home page
	    #And I click on my name in the nav
	    #And I am redirected to my profile page
	    #And I change my birthday
	    #Then my birthday should appear on the screen
    
    Scenario: I want to change my relationship status
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I change my relationship status
	    Then my relationship status should appear on the screen
    