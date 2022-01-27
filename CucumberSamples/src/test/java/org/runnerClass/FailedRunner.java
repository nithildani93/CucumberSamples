package org.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@target/rerun.txt"},
							glue={"org.logindefinition"},
							dryRun=false,
							monochrome = true,
							plugin = {"pretty","html:target/cucumber",
									"rerun:target/rerun.txt"}
							
							)
public class FailedRunner {

}
