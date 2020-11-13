$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Test.feature");
formatter.feature({
  "name": "Test",
  "description": "\tIndividual test for dev purposes",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Another user posts on my profile",
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
  "name": "I search \"testuser1\" and select the first result",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.search_user(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am redirected to his page",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.redirected_to_his_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I post on his feed",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_post_on_his_feed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log out",
  "keyword": "And "
});
formatter.match({
  "location": "SharedSteps.i_log_out()"
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
  "name": "the post from the random user shows up as the first post on my profile",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_post_appears_from_the_random_user()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});