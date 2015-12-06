package AUT2;

import appObjects.TADHLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import selenium.WebDriver;

/**
 * Created by Mihai on 12/5/2015.
 */
public class AUT2LoginStepDef {
    WebDriver webDriver = WebDriver.getInstance();
    @Given("^I open hotel application$")
    public void i_open_hotel_application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I open hotel app");
        webDriver.openNewBrowser();
        webDriver.gotoURL("http://newtours.demoaut.com/");
    }


    @Then("^I close the application$")
    public void i_close_the_application() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        webDriver.closeBrowser();
    }

    @Then("^I sleep (\\d+)$")
    public void i_sleep(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       webDriver.sleep(arg1);
    }



    @Then("^I open hotel application and login with \"([^\"]*)\"$")
    public void i_open_hotel_application_and_login_with(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        webDriver.openNewBrowser();
        webDriver.gotoURL("http://newtours.demoaut.com/");
        TADHLogin.txtUsername.setText(arg1);
        TADHLogin.txtPassword.setText(arg1);
        TADHLogin.btnSignIn.click();
    }
}
