Feature: Wall
	I want to see if the wall on my home page functions correctly

	Scenario: I enter a post on my wall with just text:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
    	And I upload a post on my wall with just text
    	Then the post is displayed as the first post on my profile and my wall
    	
    	
     Scenario: I enter a post on my wall with text and an image:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
    	And I upload a post with text and an image on my wall
    	Then the post is displayed as the first post on my profile and the text and the image are both included
    	
    Scenario: I enter a post on my wall with just an image:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
    	And I upload a post with just an image on my wall
    	Then the post does not display on my profile or my wall
    	
    Scenario: I like the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on the like button for the first post on my wall
	    Then the like count goes up by one on my profile and on my wall
	    
	Scenario: I comment on the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I enter a comment on the first post in my wall
	    Then the comment appears as the last comment on the first post on my profile and on my wall
	    
	Scenario: I delete the last comment on the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    I delete the last comment on the first post on my wall
	    Then the last comment on the first post in my profile and on my wall disappears
    	
	    
	Scenario: Another user comments on the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in firstname with a random string
	    And I fill in lastname with a random string
	    And I fill in register email with a random string
	    And I fill in reenter email with the same random string
	    And I fill in register password with a random string
	    And I fill in birthmonth with a random month
	    And I fill in birthdate with a random number between 1 and 28
	    And I fill in year with a random year between 1950 and 2000
	    And I fill in one of the gender buttons
	    And I press Sign up
	    And I redirected to my home page
	    And I search "testuser 1" and select the first result
	    And I comment on the first post in his feed
	    And I log out
	    And I log in as "test user 1"
	    And I am redirected to my home page
	    Then the comment from the random user shows up as the last comment on the first post on my profile and on my wall
	    
	Scenario: Another user likes the first post on my wall
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in firstname with a random string
	    And I fill in lastname with a random string
	    And I fill in register email with a random string
	    And I fill in reenter email with the same random string
	    And I fill in register password with a random string
	    And I fill in birthmonth with a random month
	    And I fill in birthdate with a random number between 1 and 28
	    And I fill in year with a random year between 1950 and 2000
	    And I fill in one of the gender buttons
	    And I press Sign up
	    And I redirected to my home page
	    And I search "testuser 1" and select the first result
	    And I like the first post in his feed
	    And I log out
	    And I log in as "test user 1"
	    And I am redirected to my profile page
	    Then the like count on the first post on my profile and on my wall gets incremented by one