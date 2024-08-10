package support;

import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import org.junit.*;

import static support.TestContext.getDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish = true,
        plugin = {"pretty", "html:target/report.html", "json:target/report.json"},
        features = "src/test/java/features",
        glue = {"definitions", "support"},
        tags = "@test" // same as VM option -Dcucumber.filter.tags="@predefined and not (@predefined1 or @predefined2)"
)
public class TestRunner {


}
