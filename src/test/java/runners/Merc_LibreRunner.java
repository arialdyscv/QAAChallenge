package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( plugin = {"pretty", "html:./target/report/Merc_LibreReport.html"}, features = "src/test/java/resources/Features", glue = "stepDefinitions", tags = "@Celular", monochrome = true)
public class Merc_LibreRunner {

}
