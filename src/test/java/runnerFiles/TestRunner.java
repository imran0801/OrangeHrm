package runnerFiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "Features", // folder name
	    glue = "com.stepDefinition" // package name
	    )
public class TestRunner {
	


}
