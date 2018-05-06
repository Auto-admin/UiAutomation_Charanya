Feature: Testing Mega menu
  @CheckMegaMenu
  Scenario: Testing if Mega menu works by checking Dresses->Summer dresses
    Given Customer opens and hovers on the Mega menu Dresses
    Then Customer should be able to see and select the submenu summer dresses
