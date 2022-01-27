package org.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Ezhil Vidya\\git\\CucumberSamples\\CucumberSamples\\FeatureFiles\\wplogin.feature"},
							glue={"org.logindefinition"},
							dryRun=false,
							monochrome = true,
							plugin = {"pretty","html:target/cucumber",
									"rerun:target/rerun.txt"}
							
							)
public class RunnerFile {


}
