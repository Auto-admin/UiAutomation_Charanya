package au.com.uiautomation.Page;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.PageObjects.HomePageObjects;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage extends BaseConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomePage.class);


    public void openHomePage() throws Throwable {
        String baseUrl = BaseConfig.configure_URL();
        LOGGER.info("going to URL: " + baseUrl);
        Thread.sleep(1000);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    public void ClickSignin() throws Throwable {
        HomePageObjects.signin_button().click();
        Thread.sleep(1000);
    }


    public static void enter_emailid(String emailid)
    {
     if (envbrowser.equalsIgnoreCase("Chrome"))
        {
            HomePageObjects.email_box().sendKeys(emailid);
        }
      else if(envbrowser.equalsIgnoreCase("Firefox"))
     {
         JavascriptExecutor myExec = ((JavascriptExecutor)driver);
         myExec.executeScript(setValueForFirefox(emailid),HomePageObjects.email_box());
     }
         HomePageObjects.create_Account().click();

    }


    public static void enter_invalidemailid(String emailid) throws InterruptedException {
        if (envbrowser.equalsIgnoreCase("Chrome"))
        {
            HomePageObjects.email_box().sendKeys(emailid);
        }
        else if(envbrowser.equalsIgnoreCase("Firefox"))
        {
            JavascriptExecutor myExec = ((JavascriptExecutor)driver);
            myExec.executeScript(setValueForFirefox(emailid),HomePageObjects.email_box());
        }
        HomePageObjects.create_Account().click();
        Thread.sleep(3000);
    }

    public static void VerifyErrorMessage() {

        String error_message = HomePageObjects.getErrormessage().getText();

        Assert.assertEquals(error_message, "Invalid email address.");

    }

    public static void hoveroverDresses() throws InterruptedException {

        WebElement ele = HomePageObjects.getDresses();
        if(envbrowser.equalsIgnoreCase("Chrome") ) {
            Actions action = new Actions(driver);
            action.moveToElement(ele).perform();
            Thread.sleep(10000);
        }
        else if(envbrowser.equalsIgnoreCase("Firefox") )
        {
         String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
         ((JavascriptExecutor) driver).executeScript(mouseOverScript,ele);
         Thread.sleep(10000);
    }

    }

    public static void clickonSummerDress() throws InterruptedException{

        //HomePageObjects.getSummerDresses().click();
        //Thread.sleep(6000);
        //Assert.assertEquals(HomePageObjects.getPageSummerDresses().getText(),"Summer Dresses");
    }


}
