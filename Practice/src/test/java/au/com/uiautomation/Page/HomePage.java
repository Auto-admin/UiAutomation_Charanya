package au.com.uiautomation.Page;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.PageObjects.HomePageObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends BaseConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);


    public void openHomePage() throws Throwable {
        String baseUrl = BaseConfig.configure_URL();
        LOGGER.info("going to URL: " + baseUrl);
        Thread.sleep(100);
        driver.get(baseUrl);
        HomePageObjects.signin_button().click();
    }

    public static void enter_emailid(String emailid)
    {
     HomePageObjects.email_box().sendKeys(emailid);
     HomePageObjects.create_Account().click();

    }
}
