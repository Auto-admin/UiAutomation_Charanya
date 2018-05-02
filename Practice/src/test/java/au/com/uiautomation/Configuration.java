package au.com.uiautomation;

/*import BaseConfig;

import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Properties;

public class Configuration {


    public static Properties getEnvironmentProperties()
    {
        System.out.println("Inside get env properties");
        Properties prop = new Properties();
        InputStream environment_properties = null;
        String environment = null;

        environment_properties = Configuration.class.getClassLoader().getResourceAsStream("Env.properties");
        System.out.println(environment_properties);

        try
        {
            prop.load(environment_properties);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop;
    }

}*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    public void getconfig() {

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

    }
}
