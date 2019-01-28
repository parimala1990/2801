package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="feature1",glue= {"StepDefinition"})
public class TestRunner {

}
