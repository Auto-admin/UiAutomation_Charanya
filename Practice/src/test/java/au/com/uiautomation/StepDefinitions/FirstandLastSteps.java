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

public class FirstandLastSteps extends BaseConfig
{
    private static final Logger LOGGER = LoggerFactory.getLogger(RegistrationSteps.class);

    @Before
    public void beforeAll() throws Throwable {
        LOGGER.info("Extracting data from Csv file");
        ReadTestData.populateDataFromCSVFile();
        System.out.println("Testing csv "+ReadTestData.readTestData("Registration","password"));
        LOGGER.info("Opening the automation practice page");
        BaseConfig.configbrowser();
        HomePage hm = new HomePage();
        hm.openHomePage();
    }

    @After
    public void afterAll(){
        LOGGER.info("closing the browser");
        driver.quit();
    }

}
