package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/com.cucumber.features.Etsy/etsy.feature"},
        glue = "StepDefinitions.EtsyStepDefinitions",
        dryRun = false,
        monochrome = true,
        tags = "@search"
)
public class EtsyRunner {
}
