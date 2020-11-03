Feature: Registration
	I want to register as a new user
	
	Scenario: User is not logged in username is unique
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in firstname with a random string
	    And I fill in lastname with a random string
	    And I fill in email with a random string
	    And I fill in reenter email with the same random string
	    And I fill in password with a random string
	    And I fill in birthmonth with a random month
	    And I fill in birthdate with a random number between 1 and 28
	    And I fill in year with a random year between
	    And I fill in one of the gender buttons
	    And I press Sign up
	    Then I should be redirected to my home page
	    
	Scenario: User is not logged in and username is not unique
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in firstname with a random string
	    And I fill in lastname with a random string
	    And I fill in email with the username "testuser1@livinghouse.com
	    And I fill in reenter email with the username "testuser1@livinghouse.com
	    And I fill in password with a random string
	    And I fill in birthmonth with a random month
	    And I fill in birthdate with a random number between 1 and 28
	    And I fill in year with a random year between
	    And I fill in one of the gender buttons
	    And I press Sign up
	    Then I should get an error message
	    
	Scenario: User is not logged in and username is not reentered correctly
		Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
		When I fill in firstname with a random string
	    And I fill in lastname with a random string
	    And I fill in email with a random string
	    And I fill in reenter email with a different random string
	    And I fill in password with a random string
	    And I fill in birthmonth with a random month
	    And I fill in birthdate with a random number between 1 and 28
	    And I fill in year with a random year between
	    And I fill in one of the gender buttons
	    And I press Sign up
	    Then I should get an error message
	    
