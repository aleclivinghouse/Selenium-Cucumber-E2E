Feature: Logging in
  As a user
  I want to login with my details
  So that I can configure the server 
 
  Scenario: User is not logged in
    Given no current user
    When I access a page
    Then the login form should be shown
    And I should not be authorized
    
  Scenario: User is not registered
  	Given I try to sign in with a random username and a random password string
  	When I fill in "email" with a random string
    And I fill in "password" with a random string
    And I press "Sign in"
    Then I should not be signed in
  	
 
  Scenario: User enters wrong password
    Given a registered user with the email "testuser1@livinghouse.com" with password "password" exists
    When I fill in "email" with "testuser1@livinghouse.com"
    And I fill in "password" with "wrongpassword"
    And I press "Sign in"
    Then I should not be signed in
 
  Scenario: User is registered and enters correct password
    Given a registered user with the email "testuser1@livinghouse.com" with password "password" exists
    When I fill in "email" with "testuser1@livinghouse.com"
    And I fill in "password" with "password"
    And I press "Sign in"
    Then I should be signed in
    