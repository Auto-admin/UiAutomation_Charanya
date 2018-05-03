package au.com.uiautomation.Page;

import au.com.uiautomation.BaseConfig;
import au.com.uiautomation.PageObjects.HomePageObjects;
import au.com.uiautomation.PageObjects.Registrationpageobjects;
import au.com.uiautomation.ReadTestData;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;

import java.util.logging.Logger;

public class RegistrationPage extends BaseConfig{

    public static void check_ifpageloaded() throws InterruptedException {
       Thread.sleep(3000);
        Assert.assertTrue(Registrationpageobjects.check_accCreationForm().isDisplayed());

    }

    public static void Enter_alldetailsInAccountPage() throws InterruptedException {
        String custFirstName;
        custFirstName = "testCustomer";
        String custLastName;
        custLastName = "test";

        Registrationpageobjects.getGender().click();


        if (envbrowser.equalsIgnoreCase("Chrome")) {
            Registrationpageobjects.getCustFirstName().sendKeys(custFirstName);
            Registrationpageobjects.geCustLastName().sendKeys(custLastName);
            Registrationpageobjects.getPassword().sendKeys(ReadTestData.readTestData("Registration","password"));
            Registrationpageobjects.getFirstName().sendKeys(custFirstName);
            Registrationpageobjects.getLastname().sendKeys(custLastName);
            Registrationpageobjects.getAddress().sendKeys(ReadTestData.readTestData("Registration","Address"));
            Registrationpageobjects.getCity().sendKeys(ReadTestData.readTestData("Registration","City"));
            Registrationpageobjects.getPostcode().sendKeys(ReadTestData.readTestData("Registration","Zip"));
            Registrationpageobjects.getMobile().sendKeys(ReadTestData.readTestData("Registration","Mobile"));
            Registrationpageobjects.getAliasAddress().sendKeys(ReadTestData.readTestData("Registration","AddressAlias"));

        }
        else if (envbrowser.equalsIgnoreCase("Firefox"))
        {
           JavascriptExecutor myExec = ((JavascriptExecutor)driver);
            myExec.executeScript(setValueForFirefox(custFirstName), Registrationpageobjects.getCustFirstName());
            myExec.executeScript(setValueForFirefox(custLastName), Registrationpageobjects.geCustLastName());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","password")), Registrationpageobjects.getPassword());
            myExec.executeScript(setValueForFirefox(custFirstName), Registrationpageobjects.getFirstName());
            myExec.executeScript(setValueForFirefox(custLastName), Registrationpageobjects.getLastname());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","Address")), Registrationpageobjects.getAddress());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","City")), Registrationpageobjects.getCity());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","Zip")), Registrationpageobjects.getPostcode());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","Mobile")), Registrationpageobjects.getMobile());
            myExec.executeScript(setValueForFirefox(ReadTestData.readTestData("Registration","AddressAlias")), Registrationpageobjects.getAliasAddress());



        }

        Select selDate = new Select(Registrationpageobjects.getDay());
        Select selMonth = new Select(Registrationpageobjects.getMonth());
        Select selYears = new Select(Registrationpageobjects.getYear());
        Select selState = new Select(Registrationpageobjects.getState());
        selDate.selectByValue(ReadTestData.readTestData("Registration","Day"));
        selMonth.selectByValue(ReadTestData.readTestData("Registration","Month"));
        selYears.selectByValue(ReadTestData.readTestData("Registration","Year"));
        selState.selectByVisibleText(ReadTestData.readTestData("Registration","State"));

        Registrationpageobjects.getSubmitButton().click();
        Thread.sleep(40000);
    }


    public static void checkHomepageloadAfterSignin()
    {
        Assert.assertTrue(Registrationpageobjects.getLoggedinPage().isDisplayed());

    }



}
