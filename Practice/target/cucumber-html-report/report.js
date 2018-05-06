$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Pricesorting.feature");
formatter.feature({
  "line": 1,
  "name": "Testing price sorting",
  "description": "",
  "id": "testing-price-sorting",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15995563537,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Testing if price has been sorted correctly",
  "description": "",
  "id": "testing-price-sorting;testing-if-price-has-been-sorted-correctly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@CheckPriceSort"
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
formatter.step({
  "line": 6,
  "name": "customer sorts dresses on price lowest to highest",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "The dresses are sorted in the order of lowest to highest",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "customer sorts dresses on price highest to lowest",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "The dresses are sorted in the order of highest to lowest",
  "keyword": "Then "
});
formatter.match({
  "location": "MegaMenuSteps.when_the_customer_hovers_on_the_Mega_menu_Dresses()"
});
formatter.result({
  "duration": 10219742935,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.customer_should_be_able_to_see_and_select_the_submenu_summer_dresses()"
});
formatter.result({
  "duration": 9264278213,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.customer_sorts_dresses_on_price_lowest_to_highest()"
});
formatter.result({
  "duration": 6150333273,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.the_dresses_are_sorted_in_the_order_of_lowest_to_highest()"
});
formatter.result({
  "duration": 196539289,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.customer_sorts_dresses_on_price_highest_to_lowest()"
});
formatter.result({
  "duration": 6160652689,
  "status": "passed"
});
formatter.match({
  "location": "MegaMenuSteps.the_dresses_are_sorted_in_the_order_of_highest_to_lowest()"
});
formatter.result({
  "duration": 167046856,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat au.com.uiautomation.Page.SummerDressesPage.checkingHightoLowSort(SummerDressesPage.java:76)\r\n\tat au.com.uiautomation.StepDefinitions.MegaMenuSteps.the_dresses_are_sorted_in_the_order_of_highest_to_lowest(MegaMenuSteps.java:53)\r\n\tat ✽.Then The dresses are sorted in the order of highest to lowest(Pricesorting.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1533192707,
  "status": "passed"
});
});