package tickets;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", plugin = {"pretty", "html:target/cucumberRaport"}, monochrome = true)
public class TicketsStarter {

}