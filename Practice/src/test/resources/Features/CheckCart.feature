Feature: Testing shopping cart
  @CheckCart
    Scenario: Testing if the items in the shopping cart matches the item which was selected
    Given Customer opens and hovers on the Mega menu Dresses
    Then Customer should be able to see and select the submenu summer dresses
    Given Customer changes dress colour to "<colour>" and quantity to "<quantity>" and adds to cart
    Then The dress in the cart should be match the dress parameters chosen
