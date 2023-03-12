package TestRuner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(features ="src//test//resources//Feature//TestCase1.feature",
            glue = {"StepDefinition"},monochrome = true,
            plugin = {"pretty","html:target/cucumberreport/Testcase1.html"})

    public class TestRunner1 extends AbstractTestNGCucumberTests {

    }

