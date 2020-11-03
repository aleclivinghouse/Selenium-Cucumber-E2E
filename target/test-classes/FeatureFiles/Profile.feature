Feature: Profile
	I want to see if the users profile page functions correctly
	
	Scenario: I want to change my birthday
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I change my birthday
	    Then my birthday should appear on the screen
    
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
    
    Scenario: I want to change my cover photo
	    Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I upload a new cover photo
	    Then my new cover photo should appear on the screen
	    
    Scenario: I want to change my profile picture
	    Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    And I upload a new profile picture
	    Then my new profile picture should appear on the screen
    
 	Scenario: I enter a post with just text:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
    	And I upload a post with just text
    	Then the post is displayed as the first post on my profile
    	
     Scenario: I enter a post with text and an image:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
    	And I upload a post with text and an image
    	Then the post is displayed as the first post on my profile and the text and the image are both included
    	
    Scenario: I enter a post with just an image:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
    	And I upload a post with just an image
    	Then the post does not display on my page
    	
    Scenario: I like the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    I click on the like button for the first post in my profile
	    Then the count next to the like button goes up by one
	    
	Scenario: I comment on the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    I enter a comment on the first post in my profile
	    Then the comment appears as the last comment on the first post in my profile
	    
	Scenario: I delete the comment on the first post on my profile
    	Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    I delete comment on the first post in my profile
	    Then the last comment on the first post in my profile disappears
    	
    
    
    
    
    
    
    
    
    
    
    
    