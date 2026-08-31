package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Preetish\\IdeaProjects\\cucumberHRM\\src\\main\\java\\features\\Hrm.feature",
        glue = {"stepDefinition","hooksTest"},
        tags = "@Smoke or @Regression or @Sanity",
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json","usage:target/cucumber-usage.json","junit:target/cucumber-result.xml"},
        monochrome = true,
        dryRun = false

)
public class TestRunner {
}
