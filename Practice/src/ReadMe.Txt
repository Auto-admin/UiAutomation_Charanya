Description
-----------
1)This test suite tests the Registration,Menu,price sorting and the shopping cart. The price sorting feature fails as the price sorting
does not work properly in the site, All the other features pass. Please find the tags for all the scenarios below under tags.

2) Page object model is used to write the test suite.

3) The @Before and the @After tags are defined in the FirstandLastSteps file.

4) Test data is stored in the TestData.csv under resources

5) The parallel run is implemented by cucumber-jvm-parallel-plugin, please find the maven commands to run in parallel below under commands.

6) The browsers for the test can be specified in the maven command (please refer commands below)

7) The surefire reports for parallel runs can be found under target -->surefire-reports

8) The cucumber reports can be found under target->cucumber-parallel

9) Logs are writting using Log4j and stored under Practice --> logs


Maven Commands
--------------

To run individual scenarios
----------------------------
mvn test -Dcucumber.options="--tags @RegistrationwithoutError" -Dmybrowser="Chrome"
mvn test -Dcucumber.options="--tags @RegistrationwithError" -Dmybrowser="Firefox"

To run all scenarios in parallel
--------------------------------
mvn verify -Dmybrowser="Firefox"
mvn verify -Dmybrowser="Chrome"

tags
----
 @RegistrationwithoutError - Registration without error
 @RegistrationwithError - Registration With invalid email id
 @CheckPriceSort -  Testing price sorting
 @CheckCart  - Testing shopping cart
 @CheckMegaMenu - Testing Mega menu


