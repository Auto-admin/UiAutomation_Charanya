package au.com.uiautomation.PageObjects;

import au.com.uiautomation.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageObjects extends BaseConfig {

    private static WebElement element = null;


public static WebElement signin_button()
{
     element = driver.findElement(By.xpath("//a[@href = 'http://automationpractice.com/index.php?controller=my-account']"));
     return element;
}

public static WebElement email_box()
{
    element = driver.findElement(By.id("email_create"));
    return element;
}



public static WebElement create_Account()
{
    element = driver.findElement(By.id("SubmitCreate"));
    return element;
}}
