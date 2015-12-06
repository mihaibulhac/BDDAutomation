package appObjects;

import org.openqa.selenium.By;
import selenium.WebActions;

/**
 * Created by Mihai on 12/5/2015.
 */
public final class TADHLogin {
    public static WebActions txtUsername= new WebActions(By.name("userName"));
    public static WebActions txtPassword= new WebActions(By.name("password"));
    public static WebActions btnSignIn= new WebActions(By.name("login"));

}