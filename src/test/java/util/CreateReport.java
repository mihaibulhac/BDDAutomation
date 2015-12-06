package util;

import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;

/**
 * Created by Mihai on 12/6/2015.
 */
public class CreateReport {

    public static void main(String [] args)
    {
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
