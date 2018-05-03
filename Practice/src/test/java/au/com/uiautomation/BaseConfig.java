package au.com.uiautomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Properties;

//import Configuration;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BaseConfig {

    private static String OS = System.getProperty("os.name").toLowerCase();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseConfig.class);
    public static WebDriver driver ;
    public static String envbrowser;
    private static String baseURL;
    private static String email;

    public static void configbrowser() {
        System.out.println("Inside Config browser");

        //Configuration config = new Configuration();
        //config.getconfig();

        File chrome = null;
        File firefox = null;

        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("environment.properties");

            // load a properties file
            prop.load(input);

           // get the property value and print it out
            System.out.println(prop.getProperty("env.browser"));
            System.out.println(prop.getProperty("chrome.driver.path"));

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        chrome = new File(prop.getProperty("chrome.driver.path"));
        System.out.println(chrome.getAbsolutePath());
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        firefox = new File(prop.getProperty("gecko.driver.path"));

        System.setProperty("webdriver.gecko.driver",firefox.getAbsolutePath());
        System.out.println(firefox.getAbsolutePath());

        envbrowser = System.getProperty("mybrowser");

        if (envbrowser == null)
        {
            envbrowser = prop.getProperty("env.browser");
        }

        System.out.println(envbrowser);

        if (envbrowser.equalsIgnoreCase( "Chrome"))
        {
            final ChromeOptions chromeOptions = new ChromeOptions();
            HashMap<String, Object> chromePref = new HashMap<>();
            DesiredCapabilities capability = DesiredCapabilities.chrome();
            chromeOptions.setExperimentalOption("prefs", chromePref);
            chromeOptions.addArguments("--window-size=1920,1080");
            capability.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
            driver = new ChromeDriver(capability);

        }
        else if (envbrowser.equalsIgnoreCase( "Firefox"))
        {

            driver = new FirefoxDriver ();
        }

    }

    public static String configure_URL()
    {
        Properties prop = new Properties();
        InputStream input = null;

        try {

            input = new FileInputStream("environment.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            baseURL = prop.getProperty("url.to.test");
            LOGGER.info("URL of the Automation practice page" +baseURL );

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return baseURL; }

    public static String generate_email()
    {
        Calendar dt1 = Calendar.getInstance();
        long sys_time = System.currentTimeMillis();
        String date1 = Integer.toString(dt1.get(Calendar.DATE));
        if (date1.length() == 1)
            date1 = "0" + date1;

        String month1 = Integer.toString(dt1.get(Calendar.MONTH)+1);
        if (month1.length() == 1)
            month1 = "0" + month1;
        email = "test_practice" + date1 + month1 + sys_time ;


        email += "@mailinator.com";
        LOGGER.info("email address: " + email);
        return email;
    }

    public static String setValueForFirefox(String textValue){
        return  "arguments[0].value = '" + textValue + "';";
    }

    public static void terminatebrowser()
     {
         driver.quit();
     }

}
