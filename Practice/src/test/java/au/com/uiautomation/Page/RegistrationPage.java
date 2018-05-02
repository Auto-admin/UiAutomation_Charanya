package au.com.uiautomation.Page;

import au.com.uiautomation.PageObjects.Registrationpageobjects;
import org.junit.Assert;

public class RegistrationPage {

    public static void check_ifpageloaded() throws InterruptedException {
       Thread.sleep(3000);
        Assert.assertTrue(Registrationpageobjects.check_accCreationForm().isDisplayed());

    }


}
