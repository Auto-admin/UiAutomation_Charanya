
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreateProperties {

        public static void main(String[] args)
        {
            Properties prop = new Properties();
            OutputStream output = null;

            try {
                output = new FileOutputStream("environment.properties");
                // set the properties value
                prop.setProperty("env.browser", "Chrome");
                prop.setProperty("chrome.driver.path", "src\\config\\chromedriver\\chromedriver.exe");
                prop.setProperty("ie.driver.path", "src\\config\\iedriver\\InternetExplorerDriver.exe");
                prop.setProperty("url.to.test", "http://automationpractice.com/");
                // save properties to project root folder
                prop.store(output, null);

            } catch (IOException io) {
                io.printStackTrace();
            } finally {
                if (output != null) {
                    try {
                        output.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
