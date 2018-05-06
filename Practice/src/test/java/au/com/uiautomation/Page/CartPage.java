package au.com.uiautomation.Page;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.PageObjects.SummerDressesPageObjects;
import au.com.uiautomation.ReadTestData;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CartPage extends BaseConfig{
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);
    public static String dressName;
    public static String dressColour = "Blue";
    public static String quantity = "2";



    public static void SelectDressAndChangeColour() throws Throwable {
        LOGGER.info("selecting a dress which has the colour blue");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SummerDressesPageObjects.getAddToCart());
        Thread.sleep(6000);

        if(envbrowser.equalsIgnoreCase("Chrome")) {
            Actions action = new Actions(driver);
            action.moveToElement(SummerDressesPageObjects.getAddToCart()).perform();
        }
        SummerDressesPageObjects.getAddToCart().click();

        Thread.sleep(6000);

        LOGGER.info("Changing dress colour to blue");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SummerDressesPageObjects.getColourBlue());
        Thread.sleep(500);
        SummerDressesPageObjects.getColourBlue().click();
        Thread.sleep(6000);
        quantity = ReadTestData.readTestData("Dress","quantity");
        if(envbrowser.equalsIgnoreCase("Chrome")) {
            SummerDressesPageObjects.getquantity().clear();
            SummerDressesPageObjects.getquantity().sendKeys(quantity);
        }

        else if(envbrowser.equalsIgnoreCase("Firefox"))
        {
            JavascriptExecutor myExec = ((JavascriptExecutor)driver);
            myExec.executeScript(setValueForFirefox(quantity), SummerDressesPageObjects.getquantity());
        }
        Thread.sleep(2000);

        dressName = SummerDressesPageObjects.getDressName().getText();
        dressColour = ReadTestData.readTestData("Dress","colour");
        LOGGER.info("Adding to Cart");
        SummerDressesPageObjects.getAddToCartButton().click();
        Thread.sleep(2000);
    }

    public static void checkCartItems() throws Throwable {

        Assert.assertThat("",SummerDressesPageObjects.getCartDressColour().getText(), CoreMatchers.containsString(dressColour));
        Assert.assertEquals(SummerDressesPageObjects.getCartDressName().getText(),dressName);
        Assert.assertEquals(SummerDressesPageObjects.getCartquantity().getText(),quantity);

    }
    }

