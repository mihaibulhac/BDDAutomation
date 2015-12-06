package AUT2;

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;


/**
 * Created by Mihai on 12/5/2015.
 */
public class Hooks {

    @After
    public void afterAll() {
        System.out.println("after all");
        CucumberDetailedResults results = new CucumberDetailedResults();
        results.setOutputDirectory("target/");
        results.setOutputName("cucumber-results-width");
        results.setSourceFile("target/cucumber.json");
        results.setScreenShotLocation("../src/test/resources/");
        results.setScreenShotWidth("200px");
        try {
            results.executeDetailedResultsReport(true, false);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
