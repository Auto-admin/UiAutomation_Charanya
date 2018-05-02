Feature: Testing Registration
  @RegistrationwithoutError
  Scenario: Registration without error
    Given Customer opens the automation practice page and clicks on sign in
    And Customer enters email address and clicks on create account
    Then Customer should be directed to the account creation page
    When Customer Enters all the mandatory details in the page and clicks Register
    Then Customer should get signed in and should be directed to the home page

  @RegistrationwithError
  Scenario: Registration With invalid email id
  Given Customer opens the automation practice page and clicks on sign in
  And Customer enters invalid email address and clicks on create account
  Then An error message should be thrown to customer


