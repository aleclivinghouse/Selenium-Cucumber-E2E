$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Profile.feature");
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
});