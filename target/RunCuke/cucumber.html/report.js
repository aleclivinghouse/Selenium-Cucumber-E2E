$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "Logging in",
  "description": "  As a user\n  I want to login with my details",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is not registered",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with a random string",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_fills_in_email_with_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_fills_in_passsword_with_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_not_be_signed_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User enters wrong password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with wrongpassword",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_uses_incorrect_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not be signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_should_not_be_signed_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User is registered and enters correct password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "SharedSteps.I_should_be_signed_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Profile.feature");
formatter.feature({
  "name": "Profile",
  "description": "\tI want to see if the users profile page functions correctly",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to change my relationship status",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my relationship status",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_change_my_relationship_status()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my relationship status should appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.my_relationship_status_appears_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to change my school",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my school",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_change_my_school()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my school should appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.my_school_appears_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to change my work",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my work",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_change_my_work()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my work should appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.my_work_appears_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I want to change my city",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I change my city",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_change_my_city()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my city should appear on the screen",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.my_city_appears_on_screen()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I enter a post on my profile with just text:",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload a post on my profile with just text",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_upload_a_post_just_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the post I wrote on my profile is displayed as the first post on my profile and my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_post_profile_displayed_as_the_first_profile_on_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I comment on the first post on my profile",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a comment on the first post in my profile",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_enter_comment_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the comment appears as the last comment on the first post on my profile and on my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_comment_appears_as_the_last_comment_on_the_first_post_on_my_profile_and_on_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I like the first post on my profile",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the like button for the first post on my profile",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_clcik_the_like_button_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "from profile the like count goes up by one on my profile and on my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_like_count_goes_up()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I delete the last comment on the first post on my profile",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I delete the last comment on the first post on my profile",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_delete_comment_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "from profile the last comment on the first post in my profile and on my wall disappears",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_comment_disappears()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I enter a post on my profile with text and an image:",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on my name in the nav",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_click_on_my_name_in_the_nav()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my profile page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_am_redirected_to_the_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload a post with text and an image on my profile",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_upload_post_profile_image_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the post I wrote on my profile is displayed as the first post on my profile and my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_post_profile_displayed_as_the_first_profile_on_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Register.feature");
formatter.feature({
  "name": "Registration",
  "description": "\tI want to register as a new user",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User is not logged in username is unique",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in firstname with a random string",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_firstname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in lastname with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_lastname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register email with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_email_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in reenter email with the same random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_reenter_email_with_the_same_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register password with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_password_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthmonth with a random month",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthmonth_with_a_random_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthdate with a random number between 1 and 28",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in year with a random year between 1950 and 2000",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthyear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in one of the gender buttons",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_one_of_the_gender_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign up",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be redirected to my home page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.i_should_be_redirected_to_my_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User is not logged in and username is not unique",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in firstname with a random string",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_firstname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in lastname with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_lastname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register email with the username \"testuser1@livinghouse.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.i_fill_in_email_with_the_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in reenter email with the username \"testuser1@livinghouse.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.i_fill_in_reenter_email_with_the_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register password with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_password_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthmonth with a random month",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthmonth_with_a_random_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthdate with a random number between 1 and 28",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in year with a random year between 1950 and 2000",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthyear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in one of the gender buttons",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_one_of_the_gender_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign up",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.i_should_get_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User is not logged in and username is not reentered correctly",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in firstname with a random string",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_firstname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in lastname with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_lastname_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register email with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_email_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in reenter email with a different random string",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterSteps.i_fill_in_reenter_email_with_a_different_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in register password with a random string",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_password_with_a_random_string()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthmonth with a random month",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthmonth_with_a_random_month()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in birthdate with a random number between 1 and 28",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthdate()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in year with a random year between 1950 and 2000",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_birthdate_with_a_random_birthyear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in one of the gender buttons",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_fill_in_one_of_the_gender_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign up",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should get an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.i_should_get_an_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Wall.feature");
formatter.feature({
  "name": "Wall",
  "description": "\tI want to see if the wall on my home page functions correctly",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I enter a post on my wall with just text:",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I upload a post on my wall with just text",
  "keyword": "And "
});
formatter.match({
  "location": "WallSteps.i_upload_post_wall_just_text()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "from wall the post is displayed as the first post on my profile and my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "WallSteps.the_post_is_displayed_as_the_first_post_on_my_profile_and_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I like the first post on my wall",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the like button for the first post on my wall",
  "keyword": "And "
});
formatter.match({
  "location": "WallSteps.i_click_like_button_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "from wall the like count goes up by one on my profile and on my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "WallSteps.the_like_count_goes_up_by_one_on_my_profile_and_on_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "I comment on the first post on my wall",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the landing page \"https://spbk.herokuapp.com/#/login\" of the website",
  "keyword": "Given "
});
formatter.match({
  "location": "SharedSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to my home page",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.redirected_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter a comment on the first post in my wall",
  "keyword": "And "
});
formatter.match({
  "location": "WallSteps.i_enter_comment_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "from wall the comment appears as the last comment on the first post on my profile and on my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "WallSteps.the_comment_appears_as_the_last_comment_on_the_first_post_on_my_profile_and_on_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});