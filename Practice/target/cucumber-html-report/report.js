$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Registration",
  "description": "",
  "id": "testing-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 225848022,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Registration without error",
  "description": "",
  "id": "testing-registration;registration-without-error",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@RegistrationwithoutError"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Customer opens the automation practice page and clicks on sign in",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Customer enters email address and clicks on create account",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Customer should be directed to the account creation page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Customer Enters all the mandatory details in the page and clicks Register",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Customer should get signed in and should be directed to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.customer_opens_the_automation_practice_page_and_clicks_on_sign_in()"
});
formatter.result({
  "duration": 12325368397,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.customer_enters_email_address_and_clicks_on_create_account()"
});
formatter.result({
  "duration": 444842076,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.customer_should_be_directed_to_the_account_creation_page()"
});
formatter.result({
  "duration": 3038468790,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.customer_Enters_all_the_mandatory_details_in_the_page_and_clicks_Register()"
});
formatter.result({
  "duration": 14586,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.customer_should_get_signed_in_and_should_be_directed_to_the_home_page()"
});
formatter.result({
  "duration": 9117,
  "status": "passed"
});
formatter.after({
  "duration": 1601534522,
  "status": "passed"
});
});