Feature: Test
	Individual test for dev purposes
	
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
	    When I fill in email with "testuser1@livinghouse.com"
	    And I fill in password with "password"
	    And I press Sign in
	    And I click on my name in the nav
	    And I am redirected to my profile page
	    Then the post from the random user shows up as the first post on my profile
    