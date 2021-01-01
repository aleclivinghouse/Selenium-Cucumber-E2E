$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Test.feature");
formatter.feature({
  "name": "Test",
  "description": "\tIndividual test for dev purposes",
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
  "name": "the post is displayed as the first post on my profile and my wall",
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
  "name": "the like count goes up by one on my profile and on my wall",
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
  "name": "the comment appears as the last comment on the first post on my profile and on my wall",
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