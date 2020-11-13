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
	    
Scenario: I want to change my school
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I change my school
	    Then my school should appear on the screen
    
    Scenario: I want to change my work
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I change my work
	    Then my work should appear on the screen
    
    Scenario: I want to change my city
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I change my city
	    Then my city should appear on the screen

 	Scenario: I enter a post on my profile with just text:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
    	And I upload a post on my profile with just text
    	Then the post I wrote is displayed as the first post on my profile and my wall
    	
 	Scenario: I comment on the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I enter a comment on the first post in my profile
	    Then the comment appears as the last comment on the first post on my profile and on my wall

    Scenario: I like the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I click on the like button for the first post on my profile
	    Then the like count goes up by one on my profile and on my wall
	    
    Scenario: I delete the last comment on the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I delete the last comment on the first post on my profile
	    Then the last comment on the first post in my profile and on my wall disappears
	    
    Scenario: Another user posts on my profile
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
	    And I am redirected to my home page
	    And I search "testuser1" and select the first result
	    And I am redirected to his page
	    And I post on his feed
	    And I log out
	    And I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    Then the post from the random user shows up as the first post on my profile
    