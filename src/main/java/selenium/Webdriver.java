package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Created by Mihai on 12/5/2015.
 */
public class WebDriver {
    InternetExplorerDriver browser;
    private static WebDriver instance = null;
    protected WebDriver() {
        // Exists only to defeat instantiation.
    }
    public static WebDriver getInstance() {
        if(instance == null) {
            instance = new WebDriver();
        }
        return instance;
    }

    public void openNewBrowser(){
        File currentDirFile = new File(".");
        String rootFolder = currentDirFile.getAbsolutePath();
        System.setProperty("webdriver.ie.driver", rootFolder + "//src//conf//IEDriverServer_Win32_2.48.0.exe");
         browser=new InternetExplorerDriver();
//        browser.manage().window().maximize();
        //IEDriver.get("http://localhost:8888");

    }

    public void gotoURL(String URL){
        browser.get(URL);
    }

    public void closeBrowser(){
        //instance=null;
        browser.close();

    }

    public void sleep(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
