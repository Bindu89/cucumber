$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/dsp40/eclipse-workspace/maven/src/test/java/features/trainning.feature");
formatter.feature({
  "line": 3,
  "name": "verify the login feature",
  "description": " I want to use this feature file to verify all the login features on required url",
  "id": "verify-the-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "log in to sfdc",
  "description": "",
  "id": "verify-the-login-feature;log-in-to-sfdc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "launch app and pass url for sfdc",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "login page is displayed",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "enter valid usename and password in required fields",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check remember me",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "sfdc page is displayed with username",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "close the page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.launch_app_and_pass_url_for_sfdc()"
});
formatter.result({
  "duration": 10255643300,
  "status": "passed"
});
formatter.match({
  "location": "steps.login_page_is_displayed()"
});
formatter.result({
  "duration": 14747300,
  "status": "passed"
});
formatter.match({
  "location": "steps.enter_valid_usename_and_password_in_required_fields()"
});
formatter.result({
  "duration": 310082900,
  "status": "passed"
});
formatter.match({
  "location": "steps.check_remember_me()"
});
formatter.result({
  "duration": 79429200,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_login_button()"
});
formatter.result({
  "duration": 3299755800,
  "status": "passed"
});
formatter.match({
  "location": "steps.sfdc_page_is_displayed_with_username()"
});
formatter.result({
  "duration": 101900,
  "status": "passed"
});
formatter.match({
  "location": "steps.close_the_page()"
});
formatter.result({
  "duration": 193507100,
  "status": "passed"
});
});