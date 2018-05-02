package au.com.uiautomation.StepDefinitions;

import au.com.uiautomation.ReadTestData;
import cucumber.api.java.en.Given;
import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseSeleniumTest
{
	//private static final Logger LOGGER = LoggerFactory.getLogger(BaseSeleniumTest.class);
	public void init()	{
	    System.out.println("inside init");
		ReadTestData.populateDataFromCSVFile(); // Read data from TestData csv
	}
	

}
