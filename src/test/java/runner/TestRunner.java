package runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Cucumber Project\\Google_Cucumber\\src\\test\\java\\Feature",
 glue = "StepDefinition",
 dryRun = false,
 monochrome = true,
 tags = "@regrasion",
 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
 //plugin = {"pretty","html:target/cucumber-reports/reports.html"})
           
public class TestRunner extends AbstractTestNGCucumberTests{

}
