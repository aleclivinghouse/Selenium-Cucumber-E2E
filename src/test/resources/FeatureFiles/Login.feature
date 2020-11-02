Feature: Logging in
  As a user
  I want to login with my details
    
  Scenario: User is not registered
    Given I am on the landing page "https://spbk.herokuapp.com/#/login" of the website
  	When I fill in email with a random string
    And I fill in password with a random string
    And I press Sign in
    Then I should not be signed in
  	
 
  Scenario: User enters wrong password
    Given I am on the landing page
    When I fill in email with "testuser1@livinghouse.com"
    And I fill in "password" with "wrongpassword"
    And I press "Sign in"
    Then I should not be signed in
 
  Scenario: User is registered and enters correct password
    Given I am on the landing page
    When I fill in "email" with "testuser1@livinghouse.com"
    And I fill in "password" with "password"
    And I press "Sign in"
    Then I should be signed in
    
    
   