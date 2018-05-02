package au.com.uiautomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                 glue = {"au.com.uiautomation.StepDefinitions"},
                 tags = {"@RegistrationwithoutError"},
                 format = {"html:target/cucumber-html-report"})


public class RunCucumberTest {};
