$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Megamenu.feature");
formatter.feature({
  "line": 1,
  "name": "Testing Mega menu",
  "description": "",
  "id": "testing-mega-menu",
  "keyword": "Feature"
});
formatter.before({
  "duration": 21303829248,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Testing if Mega menu works by checking Dresses-\u003eSummer dresses",
  "description": "",
  "id": "testing-mega-menu;testing-if-mega-menu-works-by-checking-dresses-\u003esummer-dresses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@CheckMegaMenu"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Customer opens and hovers on the Mega menu Dresses",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Customer should be able to see and select the submenu summer dresses",
  "keyword": "Then "
});
formatter.match({
  "location": "MegaMenuSteps.when_the_customer_hovers_on_the_Mega_menu_Dresses()"
});
formatter.result({
  "duration": 10236490253,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.customer_should_be_able_to_see_and_select_the_submenu_summer_dresses()"
});
formatter.result({
  "duration": 9316351,
  "status": "passed"
});
formatter.after({
  "duration": 1289612262,
  "status": "passed"
});
});