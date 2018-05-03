package au.com.uiautomation.StepDefinitions;
import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.Page.RegistrationPage;
import au.com.uiautomation.PageObjects.Registrationpageobjects;
import au.com.uiautomation.ReadTestData;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import au.com.uiautomation.Page.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegistrationSteps extends BaseConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationSteps.class);

//    @Before
//    public void beforeAll() throws Throwable {
//        LOGGER.info("Extracting data from Csv file");
//        ReadTestData.populateDataFromCSVFile();
//        System.out.println("Testing csv "+ReadTestData.readTestData("Registration","password"));
//        LOGGER.info("Opening the automation practice page");
//        BaseConfig.configbrowser();
//        HomePage hm = new HomePage();
//        hm.openHomePage();
//    }
//
//    @After
//    public void afterAll(){
//        LOGGER.info("closing the browser");
//        driver.quit();
//    }

    @Given("^Customer opens the automation practice page and clicks on sign in$")
    public void customer_opens_the_automation_practice_page_and_clicks_on_sign_in() throws Throwable {
        LOGGER.info("Clicking on sign in");
        HomePage hm = new HomePage();
        hm.ClickSignin();
    }

    @Given("^Customer enters email address and clicks on create account$")
    public void customer_enters_email_address_and_clicks_on_create_account() throws Throwable
    {
        LOGGER.info("Entering valid email and clicking on create account");
        String email = BaseConfig.generate_email();
        HomePage.enter_emailid(email);
    }

    @Then("^Customer should be directed to the account creation page$")
    public void customer_should_be_directed_to_the_account_creation_page() throws Throwable {
        LOGGER.info("Check if the account creation page is loaded");
        RegistrationPage.check_ifpageloaded();
    }

    @When("^Customer Enters all the mandatory details in the page and clicks Register$")
    public void customer_Enters_all_the_mandatory_details_in_the_page_and_clicks_Register() throws Throwable {
        LOGGER.info("Entering all the values in the create account page");
        RegistrationPage.Enter_alldetailsInAccountPage();
    }

    @Then("^Customer should get signed in and should be directed to the home page$")
    public void customer_should_get_signed_in_and_should_be_directed_to_the_home_page() throws Throwable {
        LOGGER.info("Customer should be redirected to homepage as signed in customer");
        RegistrationPage.checkHomepageloadAfterSignin();
    }

    @Given("^Customer enters invalid email address and clicks on create account$")
    public void customer_enters_invalid_email_address_and_clicks_on_create_account() throws Throwable {
        LOGGER.info("Entering valid email and clicking on create account");
        String email = "testingwrongemail";
        HomePage.enter_invalidemailid(email);
    }

    @Then("^An error message should be thrown to customer$")
    public void an_error_message_should_be_thrown_to_customer() throws Throwable {
        LOGGER.info("Error Message is thrown");
        HomePage.VerifyErrorMessage();

    }

}
