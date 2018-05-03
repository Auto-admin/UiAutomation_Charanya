package au.com.uiautomation.PageObjects;

import au.com.uiautomation.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Registrationpageobjects extends BaseConfig {

    public static WebElement element;
    public static WebElement check_accCreationForm()
    {
       element =  driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]"));
       return element;
    }

    public static WebElement getGender()
    {
        element =  driver.findElement(By.id("id_gender1"));
        return element;
    }

    public static WebElement getCustFirstName()
    {
        element =  driver.findElement(By.id("customer_firstname"));
        return element;
    }

    public static WebElement geCustLastName()
    {
        element =  driver.findElement(By.id("customer_lastname"));
        return element;
    }

    public static WebElement getPassword()
    {
        element =  driver.findElement(By.id("passwd"));
        return element;
    }

    public static WebElement getFirstName()
    {
        element =  driver.findElement(By.id("firstname"));
        return element;
    }

    public static WebElement getLastname()
    {
        element =  driver.findElement(By.id("lastname"));
        return element;
    }

    public static WebElement getAddress()
    {
        element =  driver.findElement(By.id("address1"));
        return element;
    }

    public static WebElement getCity()
    {
        element =  driver.findElement(By.id("city"));
        return element;
    }

    public static WebElement getState()
    {
        element =  driver.findElement(By.id("id_state"));
        return element;
    }

    public static WebElement getPostcode()
    {
        element =  driver.findElement(By.id("postcode"));
        return element;
    }

    public static WebElement getMobile()
    {
        element =  driver.findElement(By.id("phone_mobile"));
        return element;
    }

    public static WebElement getAliasAddress()
    {
        element =  driver.findElement(By.id("alias"));
        return element;
    }


    public static WebElement getDay()
    {
        element =  driver.findElement(By.id("days"));
        return element;
    }

    public static WebElement getMonth()
    {
        element =  driver.findElement(By.id("months"));
        return element;
    }

    public static WebElement getYear()
    {
        element =  driver.findElement(By.id("years"));
        return element;
    }


    public static WebElement getSubmitButton()
    {
        element =  driver.findElement(By.id("submitAccount"));
        return element;
    }

    public static WebElement getLoggedinPage()
    {
        element =  driver.findElement(By.id("header"));
        return element;
    }


















}
