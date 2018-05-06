Feature: Testing price sorting
  @CheckPriceSort
  Scenario: Testing if price has been sorted correctly
    Given Customer opens and hovers on the Mega menu Dresses
    Then Customer should be able to see and select the submenu summer dresses
    When customer sorts dresses on price lowest to highest
    Then The dresses are sorted in the order of lowest to highest
    When customer sorts dresses on price highest to lowest
    Then The dresses are sorted in the order of highest to lowest
