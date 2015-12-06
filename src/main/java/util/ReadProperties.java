package util;

import java.io.*;
import java.util.Properties;

/**
 * Created by Mihai on 12/6/2015.
 */
public class ReadProperties {
    public static String readProperty(String filename, String property) {
        Properties prop = new Properties();
        InputStream input = null;
        File currentDirFile = new File(".");
        String rootFolder = currentDirFile.getAbsolutePath();
        System.setProperty("webdriver.ie.driver", rootFolder + "//src//conf//IEDriverServer_Win32_2.48.0.exe");

        try {

            input = new FileInputStream(rootFolder + "//src//resources//" +  filename);
             // load a properties file
            prop.load(input);
            // get the property value and print it out
            //System.out.println(prop.getProperty("database"));

        } catch (IOException ex) {
            ex.printStackTrace();
         }

        return prop.getProperty(property);
    }
}
