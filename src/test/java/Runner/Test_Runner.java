package Runner;

import Tests.Test_base;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/Features/Login.feature",
        glue = {"Step_Definition"},
        plugin = {"pretty","html:target/cucumber-html-report"})
public class Test_Runner extends Test_base {
}
