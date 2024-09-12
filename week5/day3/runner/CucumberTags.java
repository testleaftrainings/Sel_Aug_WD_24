package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepDefinition",
publish=true,
monochrome = true,
tags="@smoke and @dilip and @cucumber"
)



public class CucumberTags extends ProjectSpecificMethod {

}
