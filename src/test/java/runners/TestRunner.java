package runners;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinitions")
public class TestRunner {
}
