package lv.javaguru.tutorials.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@Cars",
        features="src/test/resources",
        glue= "lv/javaguru/tutorials/stepDefinitions")
public class TestRunner {

}