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
}
