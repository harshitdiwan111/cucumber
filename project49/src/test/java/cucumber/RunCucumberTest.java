package cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json",
		                   "html:target/cucumber-html/index.html",
                           "junit:target/junit/junit-report"},
                            features="src/test/resources/cucumber",
                            glue="cucumber")
public class RunCucumberTest {

}
