package au.com.uiautomation.StepDefinitions;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.Page.HomePage;
import au.com.uiautomation.Page.SummerDressesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MegaMenuSteps extends BaseConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(MegaMenuSteps.class);

    @Given("^Customer opens and hovers on the Mega menu Dresses$")
    public void when_the_customer_hovers_on_the_Mega_menu_Dresses() throws Throwable {
        LOGGER.info("Hover over Dresses");
        HomePage.hoveroverDresses();

    }

    @Then("^Customer should be able to see and select the submenu summer dresses$")
    public void customer_should_be_able_to_see_and_select_the_submenu_summer_dresses() throws Throwable {
        LOGGER.info("Click on Summer Dresses");
        HomePage.clickonSummerDress();
    }

    @When("^customer sorts dresses on price lowest to highest$")
    public void customer_sorts_dresses_on_price_lowest_to_highest() throws Throwable {
        LOGGER.info("Click on low to high sort by");
        SummerDressesPage.clickonLowFirst();
        Thread.sleep(6000);
    }

    @Then("^The dresses are sorted in the order of lowest to highest$")
    public void the_dresses_are_sorted_in_the_order_of_lowest_to_highest() throws Throwable {
        LOGGER.info("Checking low to high sort");
        SummerDressesPage.checkingLowtoHighSort();
    }

    @When("^customer sorts dresses on price highest to lowest$")
    public void customer_sorts_dresses_on_price_highest_to_lowest() throws Throwable {
        LOGGER.info("Click on high to low sort by");
        SummerDressesPage.clickonHighFirst();
        Thread.sleep(6000);

    }

    @Then("^The dresses are sorted in the order of highest to lowest$")
    public void the_dresses_are_sorted_in_the_order_of_highest_to_lowest() throws Throwable {
        LOGGER.info("Checking high to low sort");
        SummerDressesPage.checkingHightoLowSort();


    }

}
