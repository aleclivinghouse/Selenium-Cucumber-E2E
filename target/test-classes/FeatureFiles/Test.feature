Feature: Test
	Individual test for dev purposes
	    
     Scenario: I enter a post on my profile with just an image:
 		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I am redirected to my home page
	    And I click on my name in the nav
	    And I am redirected to my profile page
    	And I upload a post with just an image on my profile
    	Then the post does not display on my profile or my wall
	    