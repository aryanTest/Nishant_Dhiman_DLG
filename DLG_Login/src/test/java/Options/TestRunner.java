package Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "./Features/DLGLogin.feature" }, glue = { "stepDefinition" },  plugin = {
        "pretty",
        "json:target/cucumber-json/cucumber.json",
        "html:target/cucumber.html"})

public class TestRunner {
}