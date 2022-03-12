import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".", tags = "@E2E",
        format = { "pretty","html:html","json:json/cucumber.json","junit:junit/cucumber.xml"}

)
public class TestRunner {

    }
