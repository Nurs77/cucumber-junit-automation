package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		glue="steps_definitions",
		features = "src/test/resources",
		dryRun = false,
		strict = true,
		tags = "@inventory_manager",
		plugin = {
				"html:target/default-report",
				"json:target/cucumber1.json",
				"rerun:target/rerun.txt"
		}
)

public class CukesRunner {
}
