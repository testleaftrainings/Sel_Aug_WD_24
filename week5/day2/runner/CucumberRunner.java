package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepDefinition",
publish=true,
monochrome = true)
//generate cucumber basic report -publish
//remove the junk data- monochrome =true



public class CucumberRunner extends AbstractTestNGCucumberTests {

}
