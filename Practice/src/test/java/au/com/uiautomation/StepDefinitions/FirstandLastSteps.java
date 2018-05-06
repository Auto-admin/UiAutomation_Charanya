package au.com.uiautomation.StepDefinitions;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.Page.HomePage;
import au.com.uiautomation.ReadTestData;
import cucumber.api.java.After;
import cucumber.api.java.Before;
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
