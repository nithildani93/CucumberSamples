package org.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Java\\CucumberSamples\\FeatureFiles\\wplogin.feature",
							glue={"org.logindefinition"},
							dryRun=true,
							monochrome = true,
							plugin = {"pretty","html:target/cucumber"}
							
							)
public class RunnerFile {


}
