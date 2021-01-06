$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Test.feature");
formatter.feature({
  "name": "Test",
  "description": "\tIndividual test for dev purposes",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I enter a post on my profile with just an image:",
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
  "name": "I upload a post with just an image on my profile",
  "keyword": "And "
});
formatter.match({
  "location": "ProfileSteps.i_upload_a_post_with_just_an_image_on_my_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the post does not display on my profile or my wall",
  "keyword": "Then "
});
formatter.match({
  "location": "ProfileSteps.the_post_does_not_display_on_my_profile_or_my_wall()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});