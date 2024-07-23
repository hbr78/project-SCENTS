package org.sep;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.sep", monochrome = true, dryRun = false )
public class TestRunnerClass {

}
