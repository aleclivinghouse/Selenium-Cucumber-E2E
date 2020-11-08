$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Register.feature");
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
});