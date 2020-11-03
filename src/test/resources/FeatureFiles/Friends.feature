Feature: Friends
	I want to see if the friending feature functions correctly
	
	Scenario: I friend a known user and the user accepts my request
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
	    And I send him a friend request
	    And I log out
	    And I log in as "test user 1"
	    And I open my notifications and accept the friend request
	    And I search for the random user and click on his profile
	    Then his profile says we are friends
	    
		Scenario: I friend a known user and the user rejects my request
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
	    And I send him a friend request
	    And I log out
	    And I log in as "test user 1"
	    And I open my notifications and reject the request
	    And I search for the random user and click on his profile
	    Then his profile does not say we are friends
	    