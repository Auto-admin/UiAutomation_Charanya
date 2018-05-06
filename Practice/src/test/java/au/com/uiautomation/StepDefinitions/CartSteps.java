package au.com.uiautomation.StepDefinitions;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.Page.CartPage;
import au.com.uiautomation.Page.HomePage;
import au.com.uiautomation.Page.SummerDressesPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class CartSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(MegaMenuSteps.class);

    @Given("^Customer changes dress colour to \"(.*?)\" and quantity to \"(.*?)\" and adds to cart$")
    public void customer_changes_dress_colour_to_and_quantity_to_and_adds_to_cart(String arg1, String arg2) throws Throwable
    {
        LOGGER.info("Customer selects dress and changes colour");
        CartPage.SelectDressAndChangeColour();

    }

    @Then("^The dress in the cart should be match the dress parameters chosen$")
    public void the_dress_in_the_cart_should_be_match_the_dress_parameters_chosen() throws Throwable {
        LOGGER.info("Checking items in the cart");

        CartPage.checkCartItems();

    }

}
