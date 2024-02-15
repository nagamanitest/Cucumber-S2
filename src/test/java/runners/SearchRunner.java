package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/Search.feature",
glue= {"StepDefinitions"},
tags = "@tag",
plugin= {"html:target/html-report",
        "json:target/json-report/cucumber.json",
        "junit:target/junit-report/cucumber.xml",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/html/ExtentReport.html"}
)

public class SearchRunner {

}
