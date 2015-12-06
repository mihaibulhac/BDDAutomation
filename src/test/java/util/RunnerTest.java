package util;

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "classpath:AUT2", tags = "@Mytag", plugin = {"pretty", "html:target/cucumber"})
//@CucumberOptions(features = "classpath:features/myfeature.feature", tags = "@Mytag", plugin = {"pretty", "html:target/cucumber"})


//@CucumberOptions(plugin = { "html:target/cucumber-html-report",
//        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
//        "usage:target/cucumber-usage.json",
//        "junit:target/cucumber-results.xml"
//},
//        features = { "src/test/resources/AUT2" },
//        glue = { "AUT2" },
//        tags = {"@consistent"})


@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        retryCount = 3,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = false,
        toPDF = false,
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json",
        "junit:target/cucumber-results.xml"
},
        features = { "src/test/resources/AUT2" },
        glue = { "AUT2" })


public class RunnerTest {


}


