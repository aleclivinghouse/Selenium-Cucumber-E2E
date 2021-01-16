Feature: Wall
	I want to see if the wall on my home page functions correctly

	Scenario: I enter a post on my wall with just text:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
    	And I upload a post on my wall with just text
    	Then from wall the post is displayed as the first post on my profile and my wall
    	
    Scenario: I like the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on the like button for the first post on my wall
	    Then from wall the like count goes up by one on my profile and on my wall
	    
	Scenario: I comment on the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I enter a comment on the first post in my wall
	    Then from wall the comment appears as the last comment on the first post on my profile and on my wall
	  
	    