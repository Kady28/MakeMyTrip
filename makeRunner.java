package Runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/make/make.feature",glue = "steps",tags = "@tag1")//name of my package and path of feature file

public class makeRunner {

}
