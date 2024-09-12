package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepDefinition",
publish=true,
monochrome = true)



public class CucumberRunnerWithTestNGAnnotation extends ProjectSpecificMethod {

}
