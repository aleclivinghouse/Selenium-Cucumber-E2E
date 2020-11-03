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
  "location": "LoginSteps.user_navigates_to_landing_page(String)"
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
  "location": "LoginSteps.i_press_Sign_in()"
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
  "location": "LoginSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_uses_correct_email(String)"
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
  "location": "LoginSteps.i_press_Sign_in()"
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
  "location": "LoginSteps.user_navigates_to_landing_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in email with \"testuser1@livinghouse.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_uses_correct_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill in password with \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_uses_correct_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press Sign in",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_press_Sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.I_should_be_signed_in()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/main/div/header/div/div[2]/ul[1]/li[2]/a\"}\n  (Session info: chrome\u003d86.0.4240.111)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.8.1\u0027, revision: \u00276e95a6684b\u0027, time: \u00272017-12-01T18:33:54.468Z\u0027\nSystem info: host: \u0027Alecs-MacBook-Pro-2.local\u0027, ip: \u0027fe80:0:0:0:1c63:f51:4f86:58fa%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u002711.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: /var/folders/ct/jqfbbh8j7v3...}, goog:chromeOptions: {debuggerAddress: localhost:50260}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e43e99a38524e283f73cd2aa843a1fe4\n*** Element info: {Using\u003dxpath, value\u003d/html/body/main/div/header/div/div[2]/ul[1]/li[2]/a}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:371)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:473)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy22.getText(Unknown Source)\n\tat pages.actions.LoginActions.UserIsSignedIn(LoginActions.java:45)\n\tat steps.LoginSteps.I_should_be_signed_in(LoginSteps.java:45)\n\tat ✽.I should be signed in(file:src/test/resources/FeatureFiles/Login.feature:25)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});