package util;

import net.masterthought.cucumber.ReportBuilder;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mihai on 12/6/2015.
 */
public class CreateReport1 {
    public static void main(String [] args)
    {
        File currentDirFile = new File(".");
        String rootFolder = currentDirFile.getAbsolutePath();
        System.setProperty("webdriver.ie.driver", rootFolder + "//src//conf//IEDriverServer_Win32_2.48.0.exe");

        File reportOutputDirectory = new File("target//nice-report");
        List<String> list = new ArrayList<String>();
        list.add(rootFolder + "//target//cucumber.json");
        //list.add("cucumber-report2.json");

        String pluginUrlPath = "";
        String buildNumber = "1";
        String buildProject = "cucumber-jvm";
        boolean skippedFails = true;
        boolean pendingFails = true;
        boolean undefinedFails = true;
        boolean missingFails = true;
        boolean flashCharts = true;
        boolean runWithJenkins = false;
        boolean highCharts = false;
        boolean parallelTesting = false;

        ReportBuilder reportBuilder;
        try {
            reportBuilder = new ReportBuilder(list, reportOutputDirectory, pluginUrlPath, buildNumber,
                    buildProject, skippedFails, pendingFails, undefinedFails, missingFails, flashCharts, runWithJenkins,
                    highCharts, parallelTesting);
            reportBuilder.generateReports();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
